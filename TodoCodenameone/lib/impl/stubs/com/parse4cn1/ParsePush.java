package com.parse4cn1;


/**
 *  The ParsePush is a local representation of data that can be sent as a push notification.
 *  <p>
 *  The typical workflow for sending a push notification from the client is to construct a new ParsePush, 
 *  use the setter functions to fill it with data, and then use ParsePush.send() to send it.
 *  <p>
 *  <b>Notes:</b>
 *  <br> 
 *  1. In order to use send push notifications, Client Push should be enabled in the
 *  Parse App settings. Bear in mind, however, that it is recommended not to enable 
 *  client push in production apps.
 *  <br>
 *  2. Unlike the corresponding
 *  <a href="https://parse.com/docs/android/api/com/parse/ParsePush.html">ParsePush</a> 
 *  class from the Parse Android SDK, methods for channel subscription and 
 *  unsubscription are available in this library via the 
 *  {@link ParseInstallation} where they arguably more naturally belong.
 */
public class ParsePush {

	/**
	 *  Creates a new push notification.
	 *  <p>
	 *  The default channel is the empty string, also known as the global broadcast channel,
	 *  but this value can be overridden using {@link #setChannel(java.lang.String)},
	 *  {@link #setChannels(java.util.Collection)} or {@link #setQuery(com.parse4cn1.ParseQuery)}. 
	 *  Before sending the push notification you must call either {@link #setMessage(java.lang.String)} 
	 *  or {@link #setData(org.json.JSONObject)}.
	 *  
	 *  @return The newly created Push notification.
	 */
	public static ParsePush create() {
	}

	/**
	 *  Checks whether the app is being opened via a push notification, e.g., by 
	 *  clicking the notification in the 'status bar'.
	 *  <p>
	 *  This call will return {@code false} if the app was in the foreground 
	 *  when it received the app opened push payload because in that case, the payload
	 *  would be consumed directly by invoking {@link IPushCallback#onAppOpenedViaPush(ca.weblite.codename1.json.JSONObject)}.
	 *  <p>
	 *  <b>Note that the result returned by this method is
	 *  guaranteed to be correct if the app is correctly managing the data,
	 *  i.e., checking every time the app is opened (typically in the start() method 
	 *  of the app's main class) and resetting the data after processing.</b>
	 *  
	 *  @return {@code true} if app open push data is found; otherwise returns {@code false}.
	 */
	public static boolean isAppOpenedViaPushNotification() {
	}

	/**
	 *  Checks whether there is pending unprocessed push data.
	 *  <p>
	 *  Generally, this is data from push notifications that the app did not handle but could 
	 *  not be scheduled as status bar notifications. A good example is a hidden 
	 *  push message which has no 'alert' or 'title' data and is thus never shown
	 *  scheduled as a status bar notification. However, like everything else with 
	 *  native Push, the actual semantics are dependent on the native implementation 
	 *  which may vary from app to app.
	 *  <p>
	 *  <b>Note that the result returned by this method is
	 *  guaranteed to be correct <u>if and only if</u> the app is correctly managing the data,
	 *  i.e., checking every time the app is opened (typically in the start() method 
	 *  of the app's main class) and resetting the data after processing.</b>
	 *  
	 *  @return {@code true} if unprocessed push data is found; otherwise returns {@code false}.
	 */
	public static boolean isUnprocessedPushDataAvailable() {
	}

	/**
	 *  Retrieves app open push data, if present.
	 *  <p>
	 *  This data must be set by the native push implementations via 
	 *  {@link ParsePush#handlePushOpen(java.lang.String, boolean)}.
	 *  <p>
	 *  This call will return {@code null} if the app was in the foreground 
	 *  when it received the app opened push payload because in that case, the payload
	 *  would be consumed directly by invoking {@link IPushCallback#onAppOpenedViaPush(ca.weblite.codename1.json.JSONObject)}.
	 *  <p>
	 *  <b>Note that the result returned by this method is
	 *  guaranteed to be correct <u>if and only if</u> the app is correctly managing the data,
	 *  i.e., checking every time the app is opened (typically in the start() method 
	 *  of the app's main class) and resetting the data after processing.</b>
	 *  
	 *  @return The app open push data or null if none is found
	 *  
	 *  @throws ParseException If anything goes wrong with parsing the JSON data.
	 *  
	 *  @see #resetPushDataUsedToOpenApp() 
	 */
	public static ca.weblite.codename1.json.JSONObject getPushDataUsedToOpenApp() {
	}

	/**
	 *  Clears the app open push data.
	 */
	public static void resetPushDataUsedToOpenApp() {
	}

	/**
	 *  Retrieves unprocessed push data, if present.
	 *  <p>
	 *  This data must be set by the native push implementations via 
	 *  {@link ParsePush#handleUnprocessedPushReceived(java.lang.String)}.
	 *  <p>
	 *  <b>Note that the result returned by this method is
	 *  guaranteed to be correct <u>if and only if</u> the app is correctly managing the data,
	 *  i.e., checking every time the app is opened (typically in the start() method 
	 *  of the app's main class) and resetting the data after processing.</b>
	 *  
	 *  @return The pending push data in the same order as they were received
	 *  or null if none is found.
	 *  
	 *  @throws ParseException If anything goes wrong with parsing the JSON data.
	 *  
	 *  @see #resetUnprocessedPushData() 
	 */
	public static ca.weblite.codename1.json.JSONArray getUnprocessedPushData() {
	}

	/**
	 *  Clears all unprocessed push data.
	 */
	public static void resetUnprocessedPushData() {
	}

	/**
	 *  Sets the push callback.
	 *  <p>This call removes any previously set callback since 
	 *  there can be at most one callback per app.
	 *  <p>If there's a push registration failure notification from the native 
	 *  code, {@link IPushCallback#onPushRegistrationFailed(com.parse4cn1.ParseException)} 
	 *  will be invoked immediately.
	 *  @param callback The Push callback to be set or null to remove the current callback.
	 */
	public static void setPushCallback(ParsePush.IPushCallback callback) {
	}

	/**
	 *  This method should be called by the native push implementation when a push 
	 *  message is received and the app is judged to be in the foreground (as must be 
	 *  determined in native code).
	 *  <p>
	 *  The provided data is forward to the {@link IPushCallback push callback} if any 
	 *  by calling {@link IPushCallback#onPushReceivedForeground(ca.weblite.codename1.json.JSONObject)}.
	 *  @param jsonPushPayload The push data.
	 *  @return {@code true} if the app has processed the push message and no further 
	 *  scheduling is needed; otherwise returns {@code false}.
	 */
	public static boolean handlePushReceivedForeground(String jsonPushPayload) {
	}

	/**
	 *  This method should be called by the native push implementation when a push 
	 *  message is received and the app is judged to be running but not in the foreground 
	 *  (as must be determined in native code).
	 *  <p>
	 *  The provided data is forward to the {@link IPushCallback push callback} if any 
	 *  by calling {@link IPushCallback#onPushReceivedBackground(ca.weblite.codename1.json.JSONObject)}.
	 *  
	 *  @param jsonPushPayload The push data.
	 *  
	 *  @return {@code true} if the app has processed the push message and no further 
	 *  scheduling is needed; otherwise returns {@code false}.
	 */
	public static boolean handlePushReceivedBackground(String jsonPushPayload) {
	}

	/**
	 *  This method should be called by the native push implementation whenever there 
	 *  is a push message that was not scheduled for 'status bar' notification, 
	 *  e.g. so-called 'hidden' push message. It is up to the native implementation 
	 *  to decide what is hidden.
	 *  <p>
	 *  The provided data is added in FIFO order to the collection of unprocessed push messages.
	 *  The app can retrieve this data by calling {@link ParsePush#getUnprocessedPushData()} 
	 *  after optionally establishing availability via {@link ParsePush#isUnprocessedPushDataAvailable()}.
	 *  
	 *  @param jsonPushPayload The push data.
	 */
	public static void handleUnprocessedPushReceived(String jsonPushPayload) {
	}

	/**
	 *  This method should be called by the native push implementation whenever the 
	 *  app is about to be opened as a result of clicking a 'status bar' notification.
	 *  <p>
	 *  If the app is already running and in the foreground, i.e., {@code isAppInForeground=true}, 
	 *  the push data will directly be deliver to the app via 
	 *  {@link IPushCallback#onAppOpenedViaPush(ca.weblite.codename1.json.JSONObject)} or 
	 *  simply ignored if there's no callback set. Conversely, if the app is not 
	 *  yet running , i.e., {@code isAppInForeground=false}, the data will be 
	 *  stored until the app requests for it via {@link ParsePush#getPushDataUsedToOpenApp()} 
	 *  possibly after first checking 
	 *  for availability via {@link ParsePush#isAppOpenedViaPushNotification()}.
	 *  
	 *  @param jsonPushPayload The push data.
	 *  @param isAppInForeground The foreground status of the app that determines 
	 *  when and how {@code jsonPushPayload} is made available to the app.
	 */
	public static void handlePushOpen(String jsonPushPayload, boolean isAppInForeground) {
	}

	/**
	 *  This method should be called by the native push implementation to report 
	 *  the push notification registration status.
	 *  
	 *  @param error A description of what went wrong or null if registration was successful.
	 *  @param type A parameter to distinguish the kind of problem. The values currently 
	 *  supported are:
	 *  <br>0 - Registration succeeded
	 *  <br>1 - Generic failure
	 *  <br>2 - Failure due to missing parameters or configuration
	 *  <br>3 - Error while saving/updating installation to backend
	 */
	public static void handlePushRegistrationStatus(String error, int type) {
	}

	/**
	 *  Sets the channel on which this push notification will be sent.
	 *  <p>
	 *  A push can either have channels or a query so setting this will unset the query.
	 *  <p>
	 *  Note that only devices subscribed to this channel will receive the push
	 *  notification. Subscription to channels is handled via the {@link ParseInstallation} class.
	 *  @param channel The channel to be set. Replaces any previously set channel(s).
	 */
	public void setChannel(String channel) {
	}

	/**
	 *  Sets the collection of channels on which this push notification will be sent.
	 *  <p>
	 *  A push can either have channels or a query so setting this will unset the query.
	 *  <p>
	 *  Note that only devices subscribed to at least one of these channel will receive the push
	 *  notification. Subscription to channels is handled via the {@link ParseInstallation} class.
	 *  @param channels The channels to be set (possibly null). Replace any previously set channels. 
	 */
	public void setChannels(java.util.Collection channels) {
	}

	/**
	 *  Schedules this push message for the specified time.
	 *  @param pushTime The time at which the push message should be delivered.
	 */
	public void setPushTime(java.util.Date pushTime) {
	}

	/**
	 *  Sets a UNIX epoch timestamp at which this notification should expire, in seconds (UTC).
	 *  <p>
	 *  A push can either have an expiration time or an expiration time interval so
	 *  calling this method overrules any previously set 
	 *  {@link #setExpirationTimeInterval(long) (java.util.Date) expiration time interval}.
	 *  
	 *  @param time The expiration time of this push message in seconds (UTC).
	 */
	public void setExpirationTime(java.util.Date time) {
	}

	/**
	 *  Sets the time interval after which this notification should expire, in seconds.
	 *  <p>
	 *  A push can either have an expiration time or an expiration time interval so
	 *  calling this method overrules any previously set {@link #setExpirationTime(java.util.Date) expiration time}.
	 *  
	 *  @param timeInterval The expiration time interval in seconds.
	 */
	public void setExpirationTimeInterval(long timeInterval) {
	}

	/**
	 *  Clears both expiration values, indicating that the notification should never expire.
	 *  
	 *  @see #setExpirationTime(java.util.Date) 
	 *  @see #setExpirationTimeInterval(long) 
	 */
	public void clearExpiration() {
	}

	/**
	 *  Sets the message that will be shown in the notification. This corresponds to 
	 *  the "alert" field.
	 *  
	 *  @param message The push message.
	 *  @throws com.parse4cn1.ParseException if anything goes wrong.
	 *  @see #setData(org.json.JSONObject) 
	 */
	public void setMessage(String message) {
	}

	/**
	 *  (iOS only) Sets the value indicated in the top right corner of the app icon.
	 *  <p>
	 *  This can be set to a value or to 'Increment' in order to increment the current value by 1.
	 *  <p>
	 *  Note that local badge management (e.g., resetting) without sending a push 
	 *  notification can be realized via {@link ParseInstallation#setBadge(int)}.
	 *  @param badge The badge to bet set.
	 *  @throws com.parse4cn1.ParseException if anything goes wrong.
	 */
	public void setBadge(String badge) {
	}

	/**
	 *  (iOS only) Sets the name of a sound file in the application bundle.
	 *  @param sound The name of the sound file.
	 *  @throws com.parse4cn1.ParseException if anything goes wrong.
	 */
	public void setSound(String sound) {
	}

	/**
	 *  (iOS only) If you are a writing a Newsstand app, or an app using the 
	 *  Remote Notification Background Mode introduced in iOS7 (a.k.a. "Background Push"), 
	 *  set this value to {@code true} to trigger a background download.
	 *  
	 *  @param contentAvailable If {@code true} background downloading will be triggered.
	 *  @throws com.parse4cn1.ParseException if anything goes wrong.
	 */
	public void setContentAvailable(boolean contentAvailable) {
	}

	/**
	 *  (iOS only) Sets the identifier of the UIUserNotificationCategory for this push notification.
	 *  
	 *  @param category The category to be set.
	 *  @throws com.parse4cn1.ParseException if anything goes wrong.
	 */
	public void setCategory(String category) {
	}

	/**
	 *  (Android only) Sets an optional field that contains a URI. 
	 *  <p>When the notification is opened, an Activity associated with opening the URI is launched.
	 *  @param uri The URI to be set. 
	 *  @throws com.parse4cn1.ParseException if anything goes wrong.
	 */
	public void setUri(String uri) {
	}

	/**
	 *  (Android only) Sets the value displayed in the Android system tray notification.
	 *  @param title The push notification title.
	 *  @throws com.parse4cn1.ParseException if anything goes wrong.
	 */
	public void setTitle(String title) {
	}

	/**
	 *  Sets the entire data of the push message. This is useful for sending 
	 *  custom messages with 'raw' JSON payloads. 
	 *  <p>Note that calling this method replaces any data that was previously set.
	 *  Use {@link #setData(java.lang.String, java.lang.String)} instead to 
	 *  add/modify a specific field in the payload.
	 *  
	 *  @param data The JSON push message to be set.
	 *  @see #setMessage(java.lang.String) 
	 */
	public void setData(ca.weblite.codename1.json.JSONObject data) {
	}

	/**
	 *  Sets a data field in the push message.
	 *  
	 *  @param key The key to be set.
	 *  @param value The value to be set.
	 *  @throws com.parse4cn1.ParseException if anything goes wrong.
	 */
	public void setData(String key, String value) {
	}

	/**
	 *  Sets the query for this push for which this push notification will be sent.
	 *  <p>
	 *  This query will be executed in the Parse cloud; this push notification 
	 *  will be sent to Installations which this query yields. 
	 *  A push can either have channels or a query. Setting this will unset the channels.
	 *  @param query A query to which this push should target. This must be a ParseInstallation query. 
	 */
	public void setQuery(ParseQuery query) {
	}

	/**
	 *  Sends this push notification while blocking this thread until the
	 *  push notification has successfully reached the Parse servers.
	 *  
	 *  @throws ParseException if anything goes wrong.
	 */
	public void send() {
	}

	/**
	 *  An interface for receiving push notification callbacks.
	 *  <p>
	 *  <b>Note that since these are synchronous calls, it is important that they 
	 *  are handled fast to avoid making the app unresponsive. Intensive operations 
	 *  should be offloaded to a worker thread. Moreoever, any UI-related 
	 *  operations performed in the callbacks <u>must be asynchronously executed</u> on the 
	 *  EDT thread as follows to avoid creating a deadlock:</b>
	 *  <pre>
	 *  {@code
	 *  Display.getInstance().callSerially(new Runnable() {
	 *         public void run() {
	 *             Dialog.show("Push received (foreground)",
	 *                 (pushPayload == null ? "<Null payload>" : pushPayload.toString()),
	 *                        "OK",
	 *                         null);
	 *         }
	 * 
	 *        });}
	 *  </pre>
	 *  <p>
	 *  Since registration for push should 'automatically' occur in the native 
	 *  implementation, there's no interface method to explicitly trigger push
	 *  notification registration.
	 */
	public static interface class IPushCallback {


		/**
		 *  Called when a push notification is received and the CN1 app is currently 
		 *  running and in the foreground.
		 *  
		 *  @param pushPayload The push data.
		 *  
		 *  @return {@code true} if the notification has been handled/consumed 
		 *  and further action such as scheduling a status bar notification is 
		 *  not needed. Returns {@code false} otherwise. Notice that the exact response
		 *  to the return value is dependent on the underlying native implementation 
		 *  which may change from app to app based on the requirements and 
		 *  implementation choices of the app developer.
		 */
		public boolean onPushReceivedForeground(ca.weblite.codename1.json.JSONObject pushPayload) {
		}

		/**
		 *  Called when a push notification is received and the CN1 app is currently 
		 *  running but <em>not</em> in the foreground.
		 *  
		 *  @param pushPayload The push data.
		 *  
		 *  @return {@code true} if the notification has been handled/consumed 
		 *  and further action such as scheduling a status bar notification is 
		 *  not needed. Returns {@code false} otherwise. Notice that the exact response
		 *  to the return value is dependent on the underlying native implementation 
		 *  which may change from app to app based on the requirements and 
		 *  implementation choices of the app developer.
		 */
		public boolean onPushReceivedBackground(ca.weblite.codename1.json.JSONObject pushPayload) {
		}

		/**
		 *  Called when a 'status bar' push notification opened and the CN1 app is 
		 *  currently running in the foreground. 
		 *  <p>See related methods {@link ParsePush#isAppOpenedViaPushNotification()}
		 *  and {@link ParsePush#getPushDataUsedToOpenApp()} for the case where 
		 *  the app was not fully in the foreground with the callback was received.
		 *  
		 *  @param pushPayload The push data.
		 *  @see ParsePush#isAppOpenedViaPushNotification()
		 *  @see ParsePush#getPushDataUsedToOpenApp() 
		 */
		public void onAppOpenedViaPush(ca.weblite.codename1.json.JSONObject pushPayload) {
		}

		/**
		 *  Called when registering for push notifications fails.
		 *  <p>It is up to the underlying native implementation to detect when
		 *  registration for push fails.
		 *  <p>This callback should be invoked immediately if there's already a pending
		 *  notification failure message.
		 *  @param error The error wrapped in a ParseException. The {@link ParseException#getMessage() ()}
		 *  and {@link ParseException#getCode()} should always be filled with meaningful values.
		 *  
		 *  @see ParseException#PARSE4CN1_PUSH_REGISTRATION_FAILED
		 *  @see ParseException#PARSE4CN1_PUSH_REGISTRATION_FAILED_INSTALLATION_UPDATE_ERROR
		 *  @see ParseException#PARSE4CN1_PUSH_REGISTRATION_FAILED_MISSING_PARAMS
		 */
		public void onPushRegistrationFailed(ParseException error) {
		}
	}
}
