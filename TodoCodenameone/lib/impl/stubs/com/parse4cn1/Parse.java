package com.parse4cn1;


/**
 *  The Parse class contains static functions, classes and interfaces that handle
 *  global configuration for the Parse library.
 */
public class Parse {

	public Parse() {
	}

	/**
	 *  Retrieves the current platform
	 * 
	 *  @return A literal matching the current platform or
	 *  {@link EPlatform#UNKNOWN}
	 */
	public static Parse.EPlatform getPlatform() {
	}

	/**
	 *  Authenticates this client as belonging to your application.
	 *  <p>
	 *  It also initializes internal state required for the library to function
	 *  properly, e.g., enabling persistence to CN1 storage.
	 *  <p>
	 *  This method must be called before your application can use the Parse
	 *  library. The recommended way is to put a call to Parse.initialize in your
	 *  CN1 Application's state machine as follows:
	 *  <pre>
	 *  <code>
	 *  public class StateMachine extends StateMachineBase {
	 *    protected void initVars(Resources res) {
	 *      Parse.initialize(API_ENDPOINT, APP_ID, APP_REST_API_ID);
	 *    }
	 *  }
	 *  </code>
	 *  </pre>
	 * 
	 *  @param apiEndpoint The path to the Parse backend, e.g.
	 *  "your_parse_backend_website_url"/parse.
	 *  @param applicationId The application id of your parse backend.
	 *  @param clientKey The client key of your parse backend if applicable. If not,
	 *  pass null and it will be ignored.
	 *  <p>
	 *  <b>Note:</b> Developers are advised to use the CLIENT KEY instead of
	 *  using the REST API in production code (cf.
	 *  <a href='https://parse.com/docs/rest#general-callfromclient'>https://parse.com/docs/rest#general-callfromclient</a>).
	 *  Hence, the latter is not exposed via this library. The same security
	 *  consideration explains why the MASTER KEY is not exposed either.
	 */
	public static void initialize(String apiEndpoint, String applicationId, String clientKey) {
	}

	/**
	 *  Retrieves the Parse API endpoint without a trailing '/'.
	 *  @return The Parse backend API endpoint if one has been set or null.
	 *  @see #initialize(java.lang.String, java.lang.String, java.lang.String) 
	 */
	public static String getApiEndpoint() {
	}

	/**
	 *  @return The application ID if one has been set or null.
	 *  @see #initialize(java.lang.String, java.lang.String, java.lang.String) 
	 */
	public static String getApplicationId() {
	}

	/**
	 *  @return The client key if one has been set or null.
	 *  @see #initialize(java.lang.String, java.lang.String, java.lang.String) 
	 */
	public static String getClientKey() {
	}

	/**
	 *  Checks if the library has been initialized.
	 *  <p>
	 *  <em>Note:</em> The optional client key (cf. {@link #getClientKey()}) 
	 *  is no longer taken into account.
	 *  @return {@code true} if the library has been initialized; otherwise,
	 *  returns {@code false}.
	 *  @see #initialize(java.lang.String, java.lang.String, java.lang.String) 
	 */
	public static boolean isInitialized() {
	}

	/**
	 *  Creates a valid Parse REST API URL using the predefined
	 *  {@code apiEndpoint} provided in {@link #initialize(java.lang.String, java.lang.String, java.lang.String)}.
	 * 
	 *  @param endPoint The target endpoint/class name.
	 *  @return The created URL.
	 */
	public static String getParseAPIUrl(String endPoint) {
	}

	/**
	 *  Encodes the provided date in the format required by Parse.
	 * 
	 *  @param date The date to be encoded.
	 *  @return {@code date} expressed in the format required by Parse.
	 *  @see <a href='https://www.parse.com/docs/rest#objects-types'>Parse date
	 *  type</a>.
	 */
	public static synchronized String encodeDate(java.util.Date date) {
	}

	/**
	 *  Converts a Parse date string value into a Date object.
	 * 
	 *  @param dateString A string matching the Parse date type.
	 *  @return The date object corresponding to {@code dateString}.
	 *  @see <a href='https://www.parse.com/docs/rest#objects-types'>Parse date
	 *  type</a>.
	 */
	public static synchronized java.util.Date parseDate(String dateString) {
	}

	/**
	 *  Checks if the provided {@code key} is a key with a special meaning in
	 *  Parse, for example {@code objectId}.
	 * 
	 *  @param key The key to be checked.
	 *  @return {@code true} if and only if {@code key} is a reserved key.
	 */
	public static boolean isReservedKey(String key) {
	}

	/**
	 *  Checks if the provided {@code endPoint} is the name of an in-built Parse
	 *  end point, for examples (users and /classes/_User).
	 * 
	 *  @param endPoint The endpoint to be checked.
	 *  @return {@code true} if {@code endPoint} is a reserved class end point.
	 */
	public static boolean isReservedEndPoint(String endPoint) {
	}

	/**
	 *  Checks if the provided type is a valid type for a Parse Object or any one
	 *  of its fields.
	 * 
	 *  @param value The object to be checked
	 *  @return {@code true} if {@code value} is valid as per the data types
	 *  supported by ParseObjects and their child fields.
	 */
	public static boolean isValidType(Object value) {
	}

	/**
	 *  Utility to concatenate the strings in {@code items} using the provided
	 *  {@code delimieter}.
	 * 
	 *  @param items The strings to be concatenated.
	 *  @param delimiter The delimiter.
	 *  @return The concatenated string.
	 */
	public static String join(java.util.Collection items, String delimiter) {
	}

	public static boolean isEmpty(String str) {
	}

	/**
	 *  Retrieves the default ID to be used for serialization of objects.
	 * 
	 *  @return A default serialization id (=1).
	 *  @see com.codename1.io.Externalizable#getVersion()
	 */
	public static int getSerializationVersion() {
	}

	public static final class EPlatform {


		public static final Parse.EPlatform IOS;

		public static final Parse.EPlatform ANDROID;

		public static final Parse.EPlatform WINDOWS_PHONE;

		public static final Parse.EPlatform BLACKBERRY;

		public static final Parse.EPlatform JAVA_ME;

		public static final Parse.EPlatform UNKNOWN;

		public static Parse.EPlatform[] values() {
		}

		public static Parse.EPlatform valueOf(String name) {
		}
	}

	/**
	 *  An interface for a persistable entity.
	 */
	public static interface class IPersistable {


		/**
		 *  An object is dirty if a change has been made to it that requires it
		 *  to be persisted.
		 * 
		 *  @return {@code true} if the object is dirty; otherwise {@code false}.
		 */
		public boolean isDirty() {
		}

		/**
		 *  Sets the dirty flag.
		 * 
		 *  @param dirty {@code true} if the object should be marked as dirty;
		 *  otherwise {@code false}.
		 */
		public void setDirty(boolean dirty) {
		}

		/**
		 *  Checks whether this persistable object has any data. This data may
		 *  (isDirty() = true) or may not (isDirty() = false) need to be
		 *  persisted.
		 * 
		 *  @return {@code true} if this object has data.
		 */
		public boolean isDataAvailable() {
		}

		/**
		 *  Saves the object. Calling this method on an object that is not dirty
		 *  should have no side effects.
		 * 
		 *  @throws ParseException if anything goes wrong during the save
		 *  operation.
		 */
		public void save() {
		}
	}

	/**
	 *  A factory for instantiating ParseObjects of various concrete types
	 */
	public static interface class IParseObjectFactory {


		/**
		 *  Creates a Parse object of the type matching the provided class name.
		 *  Defaults to the base ParseObject, i.e., call must always return a
		 *  non-null object.
		 * 
		 *  @param <T> The type of ParseObject to be instantiated
		 *  @param className The class name associated with type T
		 *  @return The newly created Parse object.
		 */
		public ParseObject create(String className) {
		}
	}

	/**
	 *  A factory for instantiating reserved Parse Object classes such as users,
	 *  roles, installations and sessions. Such a factory is used to instantiate
	 *  the correct type upon retrieval of data, for example, via a query.
	 */
	public static class DefaultParseObjectFactory {


		public DefaultParseObjectFactory() {
		}

		public ParseObject create(String className) {
		}
	}
}
