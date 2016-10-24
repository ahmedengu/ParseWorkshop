package com.parse4cn1;


/**
 *  An exception class for the library. 
 */
public class ParseException extends Exception {

	public static final int OTHER_CAUSE = -1;

	public static final int PARSE4CN1_NOT_INITIALIZED = -2;

	public static final int PARSE4CN1_NATIVE_INTERFACE_LOOKUP_FAILED = -3;

	public static final int PARSE4CN1_INSTALLATION_ID_NOT_RETRIEVED_FROM_NATIVE_SDK = -101;

	public static final int PARSE4CN1_MULTIPLE_INSTALLATIONS_FOUND = -102;

	public static final int PARSE4CN1_INSTALLATION_NOT_FOUND = -103;

	public static final int PARSE4CN1_PUSH_REGISTRATION_FAILED = -104;

	public static final int PARSE4CN1_PUSH_REGISTRATION_FAILED_MISSING_PARAMS = -105;

	public static final int PARSE4CN1_PUSH_REGISTRATION_FAILED_INSTALLATION_UPDATE_ERROR = -106;

	public static final int INTERNAL_SERVER_ERROR = 1;

	public static final int CONNECTION_FAILED = 100;

	public static final int OBJECT_NOT_FOUND = 101;

	public static final int INVALID_QUERY = 102;

	public static final int INVALID_CLASS_NAME = 103;

	public static final int MISSING_OBJECT_ID = 104;

	public static final int INVALID_KEY_NAME = 105;

	public static final int INVALID_POINTER = 106;

	public static final int INVALID_JSON = 107;

	public static final int COMMAND_UNAVAILABLE = 108;

	public static final int NOT_INITIALIZED = 109;

	public static final int INCORRECT_TYPE = 111;

	public static final int INVALID_CHANNEL_NAME = 112;

	public static final int PUSH_MISCONFIGURED = 115;

	public static final int OBJECT_TOO_LARGE = 116;

	public static final int OPERATION_FORBIDDEN = 119;

	public static final int CACHE_MISS = 120;

	public static final int INVALID_NESTED_KEY = 121;

	public static final int INVALID_FILE_NAME = 122;

	public static final int INVALID_ACL = 123;

	public static final int TIMEOUT = 124;

	public static final int INVALID_EMAIL_ADDRESS = 125;

	public static final int MISSING_MANDATORY_FIELD = 135;

	public static final int DUPLICATE_VALUE = 137;

	public static final int INVALID_ROLE_NAME = 139;

	public static final int EXCEEDED_QUOTA = 140;

	public static final int CLOUD_ERROR = 141;

	public static final int TOO_MANY_COMMANDS_IN_BATCH_REQUEST = 154;

	public static final int USERNAME_MISSING = 200;

	public static final int PASSWORD_MISSING = 201;

	public static final int USERNAME_TAKEN = 202;

	public static final int EMAIL_TAKEN = 203;

	public static final int EMAIL_MISSING = 204;

	public static final int EMAIL_NOT_FOUND = 205;

	public static final int SESSION_MISSING = 206;

	public static final int MUST_CREATE_USER_THROUGH_SIGNUP = 207;

	public static final int ACCOUNT_ALREADY_LINKED = 208;

	public static final int LINKED_ID_MISSING = 250;

	public static final int INVALID_LINKED_SESSION = 251;

	public static final int UNSUPPORTED_SERVICE = 252;

	public static final String ERR_PROCESSING_RESPONSE = "An error occurred while processing response from server.";

	public static final String ERR_PREPARING_REQUEST = "An error occurred while preparing request to server.";

	public static final String ERR_INVALID_RESPONSE = "Invalid response from backend.";

	public static final String ERR_INTERNAL = "An internal error occurred.";

	public static final String ERR_NETWORK = "A network error occurred.";

	/**
	 *  Creates an exception with the specified error code, message and cause.
	 *  
	 *  @param code The error code associated with this exception.
	 *  @param message The <em>end-user directed, human-readable</em> error message.
	 *  @param cause The cause of the exception.
	 */
	public ParseException(int code, String message, Throwable cause) {
	}

	/**
	 *  Creates an exception with the specified error code and message.
	 *  
	 *  @param code The error code associated with this exception.
	 *  @param message The <em>end-user directed, human-readable</em> error message.
	 */
	public ParseException(int code, String message) {
	}

	/**
	 *  Creates an exception with the specified message and cause.
	 *  
	 *  @param message The <em>end-user directed, human-readable</em> error message.
	 *  @param cause The cause of the exception.
	 */
	public ParseException(String message, Throwable cause) {
	}

	/**
	 *  
	 *  @return The error code associated with this exception 
	 *  (defaults to -1 if none is specified).
	 */
	public int getCode() {
	}

	/**
	 *  
	 *  @return The cause of the exception if specified; otherwise null.
	 */
	public Throwable getCause() {
	}

	@java.lang.Override
	public String toString() {
	}
}
