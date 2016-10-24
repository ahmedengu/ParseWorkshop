package com.parse4cn1;


/**
 *  The ParseCloud class defines provides methods for interacting with Parse
 *  Cloud Functions. and triggering Cloud Jobs.
 *  <p>
 *  <b>Note:</b> Since triggering Cloud Jobs requires the Master Key which is
 *  deliberately not exposed via this client-side library for security
 *  considerations, the only way to trigger jobs using this library is to write a
 *  wrapper Cloud Function, that does the necessary authentication and forwards
 *  the request to the Job API.
 */
public class ParseCloud {

	public ParseCloud() {
	}

	/**
	 *  Calls a cloud function.
	 *  
	 *  @param <T> The type of result expected by this function call.
	 *  @param name The name of the function to call.
	 *  @param params The parameters to pass to the function. These parameters 
	 *  are sent as JSON data in the body of the resulting POST request.
	 *  @return The result returned by the function call.
	 *  @throws ParseException if anything goes wrong, for example with JSON parsing.
	 */
	public static Object callFunction(String name, java.util.Map params) {
	}
}
