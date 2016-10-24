package com.parse4cn1.command;


/**
 *  This class encapsulates a response to a ParseCommand issued to the Parse
 *  server.
 */
public class ParseResponse {

	public ParseResponse() {
	}

	/**
	 *  If {@code true}, the associated ParseCommand failed.
	 * 
	 *  @return
	 */
	public boolean isFailed() {
	}

	/**
	 *  @return An exception that encapsulates the failure associated with this
	 *  ParseResponse.
	 */
	public com.parse4cn1.ParseException getException() {
	}

	/**
	 *  Converts the provided raw response into the corresponding ParseException.
	 * 
	 *  @param response The response received from the Parse server.
	 *  @return The exception corresponding to {@code response}.
	 */
	public static com.parse4cn1.ParseException getParseError(ca.weblite.codename1.json.JSONObject response) {
	}

	/**
	 *  @return The raw response data received from the Parse server.
	 */
	public byte[] getResponseData() {
	}

	/**
	 *  @return The response received from the Parse server encoded in a
	 *  JSONObject.
	 *  @throws ParseException if anything goes wrong with converting the
	 *  response to JSON.
	 */
	public ca.weblite.codename1.json.JSONObject getJsonObject() {
	}

	/**
	 *  Extracts the response from the provided {@code request}.
	 * 
	 *  @param request The (executed) network request.
	 */
	protected void extractResponseData(com.codename1.io.ConnectionRequest request) {
	}

	/**
	 *  @return The HTTP status code. This should not be confused with the "code"
	 *  field returned by the Parse server when a request fails. The latter can
	 *  be retrieved via the {@link ParseException#getCode()} of the exception
	 *  returned by {@link #getException()}.
	 */
	protected int getStatusCode() {
	}

	/**
	 *  Sets the backend error.
	 * 
	 *  @param statusCode The HTTP status code.
	 *  @param message The HTTP error message.
	 */
	protected void setConnectionError(int statusCode, String message) {
	}

	protected void setConnectionError(com.parse4cn1.ParseException error) {
	}
}
