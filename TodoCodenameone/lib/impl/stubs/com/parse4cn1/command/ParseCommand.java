package com.parse4cn1.command;


/**
 *  This class encapsulates a network request to be made to the Parse REST API 
 *  using any of the supported HTTP verbs.
 */
public abstract class ParseCommand {

	public ParseCommand() {
	}

	/**
	 *  Performs this ParseCommand by issuing a synchronous network request.
	 *  @return The response received if the request was successful.
	 *  
	 *  @throws ParseException if anything goes wrong.
	 */
	public ParseResponse perform() {
	}

	/**
	 *  Add the HTTP header field associated with the provided key and value.
	 *  
	 *  @param key The header's key.
	 *  @param value The header's value.
	 *  @throws ParseException if anything goes wrong.
	 */
	public void addHeader(String key, String value) {
	}

	/**
	 *  Creates and initializes a network connection request.
	 *  
	 *  @param response The response associated with the request. This response 
	 *  object will be updated with the error information if the request fails.
	 *  
	 *  @return The created connection request.
	 */
	protected com.codename1.io.ConnectionRequest createConnectionRequest(ParseResponse response) {
	}

	/**
	 *  Adds the default headers (e.g., {@link ParseConstants#HEADER_APPLICATION_ID}
	 *  and {@link ParseConstants#HEADER_CLIENT_KEY}) associated with Parse REST API calls.
	 *  The content type is also set to {@link ParseConstants#CONTENT_TYPE_JSON} by default
	 *  and can be overruled in {@link #setUpRequest(com.codename1.io.ConnectionRequest)}.
	 *  @throws ParseException if anything goes wrong.
	 */
	protected void setupDefaultHeaders() {
	}

	/**
	 *  Create a Parse API URL using the provided data.
	 *  
	 *  @param endPoint The end point
	 *  @param objectId The optional objectId
	 *  @return The Parse API URL of the format {@code https://api.parse.com/<endpoint>[/<objectId>]}.
	 */
	protected static String getUrl(String endPoint, String objectId) {
	}

	/**
	 *  Sets the message body data for the HTTP request.
	 *  
	 *  @param data The message body to be set.
	 *  @throws ParseException if anything goes wrong.
	 */
	public void setMessageBody(ca.weblite.codename1.json.JSONObject data) {
	}

	/**
	 *  Adds the specified key-value pair as an argument to the HTTP request.
	 *  
	 *  @param key The key of the argument.
	 *  @param value The value for {@code key}.
	 *  @throws ParseException if anything goes wrong.
	 */
	public void addArgument(String key, String value) {
	}

	/**
	 *  Sets a callback to be notified of the progress of this command when it 
	 *  is performed.
	 *  
	 *  @param progressCallback The callback to be set. It will replace any previously 
	 *  set callback.
	 */
	public void setProgressCallback(com.parse4cn1.callback.ProgressCallback progressCallback) {
	}
}
