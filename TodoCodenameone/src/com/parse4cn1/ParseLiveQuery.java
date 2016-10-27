//package com.parse4cn1;
//
//import ca.weblite.codename1.json.JSONException;
//import ca.weblite.codename1.json.JSONObject;
//import com.codename1.io.websocket.WebSocket;
//import com.codename1.io.websocket.WebSocketState;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Created by ahmedengu.
// */
//public abstract class ParseLiveQuery {
//    private final static String OP = "op";
//
//    private JSONObject query;
//    private String subscribeData;
//    private int requestId;
//
//    // LiveQuery subscription id
//    private static int requestIds = 0;
//    private static String liveQueryServerURL;
//    private static WebSocket webSocket;
//    private static Map<Integer, ParseLiveQuery> lQuerys = new HashMap<>();
//
//    // optional to handle the websocket events and errors that not related to a specific query
//    private static WsCallback wsCallback = new WsCallback() {
//        @Override
//        public void error(String op, int code, String error, boolean reconnect) {
//            System.out.println(op + ", code:" + code + ", error:" + error);
//        }
//    };
//
//    // query callback event
//    public abstract void event(String op, int requestId, ParseObject object);
//
//    // subscribe to a ParseQuery
//    public ParseLiveQuery(ParseQuery query) throws JSONException, ParseException {
//        this(query.encode());
//    }
//
//    // subscribe to a JSONObject query
//    // you should provide classname , where , fields [optional]
//    private ParseLiveQuery(JSONObject query) throws JSONException, ParseException {
//        this.query = query;
//        requestIds++;
//        requestId = requestIds;
//        subscribe();
//    }
//
//    // initialzie the websocket connection to the liveQury server
//    // when it's open its gonna send the connect message
//    // when it's connected it gonna subscribe to all the available queries [in case there was a disconnection]
//    //onClose: if it not triggered using .close() it gonna try to reconnect 5 times
//    private static void init() {
//        webSocket = new WebSocket(getLiveQueryServerURL()) {
//            @Override
//            protected void onOpen() {
//                this.send(getConnect());
//                wsCallback.onOpen();
//            }
//
//            @Override
//            protected void onClose(int i, String s) {
//                for (int j = 0; s != null && j < 5; j++)
//                    try {
//                        Thread.sleep(3000);
//                        init();
//                        Thread.sleep(1000);
//                        return;
//                    } catch (Exception e1) {
//                        e1.printStackTrace();
//                    }
//
//                wsCallback.onClose(i, s);
//            }
//
//            @Override
//            protected void onMessage(String s) {
//                try {
//                    JSONObject json = new JSONObject(s);
//                    String operation = json.getString(OP);
//
//                    switch (operation) {
//                        case "connected":
//                            for (Map.Entry<Integer, ParseLiveQuery> entry : lQuerys.entrySet())
//                                webSocket.send(entry.getValue().getSubscribe());
//                            break;
//                        case "subscribed":
//                            break;
//                        case "unsubscribed":
//                            break;
//                        case "error":
//                            wsCallback.error(json.getString(OP), json.getInt("code"), json.getString("error"), json.getBoolean("reconnect"));
//                            break;
//                        default:
//                            JSONObject data = json.getJSONObject("object");
//                            ParseObject parseObject = ParseObject.create(data.getString("className"));
//                            parseObject.setData(data);
//                            int requestId = json.getInt("requestId");
//                            lQuerys.get(requestId).event(json.getString(OP), requestId, parseObject);
//                            break;
//                    }
//                } catch (JSONException e) {
//                    onError(e);
//                }
//                wsCallback.onMessage(s);
//            }
//
//            @Override
//            protected void onMessage(byte[] bytes) {
//                wsCallback.onMessage(bytes);
//            }
//
//            @Override
//            protected void onError(Exception e) {
//                e.printStackTrace();
//                wsCallback.onError(e);
//            }
//        };
//
//        webSocket.connect();
//    }
//
//    //liveQuery connect message
//    private static String getConnect() {
//        JSONObject output = new JSONObject();
//        try {
//            output.put(OP, "connect");
//            if (ParseUser.getCurrent() != null)
//                output.put("sessionToken", ParseUser.getCurrent().getSessionToken());
//            output.put("clientKey", Parse.getClientKey());
//            output.put("applicationId", Parse.getApplicationId());
//        } catch (JSONException ex) {
//            ex.printStackTrace();
//        }
//        return output.toString();
//    }
//
//    //liveQuery subscribe message
//    private String getSubscribe() throws JSONException {
//        if (subscribeData == null) {
//            JSONObject output = new JSONObject();
//            output.put(OP, "subscribe");
//            output.put("requestId", this.requestId);
//
//            JSONObject q = new JSONObject();
//            q.put("className", query.getString("className"));
//            q.put("where", query.get("where"));
//            if (query.has("keys"))
//                q.put("fields", query.get("keys"));
//            if (query.has("fields"))
//                q.put("fields", query.get("fields"));
//
//            output.put("query", q);
//            if (ParseUser.getCurrent() != null)
//                output.put("sessionToken", ParseUser.getCurrent().getSessionToken());
//            subscribeData = output.toString();
//        }
//        return subscribeData;
//    }
//
//    //liveQuery unsubscribe message
//    public void unsubscribe() throws JSONException {
//        lQuerys.remove(requestId);
//        JSONObject output = new JSONObject();
//        output.put(OP, "unsubscribe");
//        output.put("requestId", requestId);
//        webSocket.send(output.toString());
//    }
//
//    //subscribe action .. gonna be called in the constructor , but it's public in case there was a disconnection and you want to resubscribe
//    public void subscribe() throws ParseException, JSONException {
//        lQuerys.put(requestId, this);
//
//        if (webSocket == null)
//            init();
//        else if (webSocket.getReadyState() != WebSocketState.OPEN)
//            webSocket.connect();
//        else
//            webSocket.send(getSubscribe());
//    }
//
//    //unsubscribe from all then close the websocket
//    public static void close() throws JSONException {
//        for (Map.Entry<Integer, ParseLiveQuery> entry : lQuerys.entrySet())
//            entry.getValue().unsubscribe();
//        lQuerys.clear();
//        requestIds = 0;
//        webSocket.close();
//        webSocket = null;
//    }
//
//    // LiveQuery server URL from the parse server URL
//    public static String getLiveQueryServerURL() {
//        if (liveQueryServerURL == null) {
//            String endpoint = Parse.getApiEndpoint();
//            String portcol = (endpoint.indexOf("https") == 0) ? "wss" : "ws";
//            liveQueryServerURL = portcol + ((endpoint.indexOf("https") == 0) ? endpoint.substring(5) : endpoint.substring(4));
//        }
//        return liveQueryServerURL;
//    }
//
//    public int getRequestId() {
//        return requestId;
//    }
//
//    public JSONObject getQuery() {
//        return query;
//    }
//
//    public static WsCallback getWsCallback() {
//        return wsCallback;
//    }
//
//    // optional to handle the websocket events and errors that not related to a specific query
//    public static void setWsCallback(WsCallback wsCallback) {
//        ParseLiveQuery.wsCallback = wsCallback;
//    }
//
//    public static abstract class WsCallback {
//        public abstract void error(String op, int code, String error, boolean reconnect);
//
//        public void onOpen() {
//        }
//
//        ;
//
//        public void onClose(int var1, String var2) {
//        }
//
//        ;
//
//        public void onMessage(String var1) {
//        }
//
//        ;
//
//        public void onMessage(byte[] var1) {
//        }
//
//        ;
//
//        public void onError(Exception var1) {
//        }
//
//        ;
//    }
//}
