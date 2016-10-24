package com.parse4cn1;


/**
 *  The ParseObject is a local representation of data that can be saved and
 *  retrieved from the Parse cloud.
 *  <p>
 *  The basic workflow for creating new data is to construct a new ParseObject,
 *  use {@link #put(java.lang.String, java.lang.Object)} to fill it with data,
 *  and then use {@link #save()} to persist to the cloud.
 *  <p>
 *  The basic workflow for accessing existing data is to use a {@link ParseQuery}
 *  to specify which existing data to retrieve.
 *  <p>
 *  ParseObjects are {@link com.codename1.io.Externalizable}, i.e., they 
 *  can be converted to an externalizable form via {@link #asExternalizable()}.
 *  <p>
 *  <em>Note</em>: The Parse backend always stores and returns UTC dates 
 *  so the time zone information in any {@link Date} objects should be ignored
 *  and all dates retrived from Parse or sent to Parse should be in UTC.
 */
public class ParseObject implements Parse.IPersistable {

	protected ParseObject(String className) {
	}

	/**
	 *  Creates a parse object for the specified class.
	 * 
	 *  @param <T> The type of ParseObject to be created.
	 *  @param className The name of the class associated with this Parse object.
	 *  @return The newly created Parse object.
	 */
	public static ParseObject create(String className) {
	}

	/**
	 *  Setter for the object id. In general you do not need to use this.
	 *  However, in some cases this can be convenient. For example, if you are
	 *  serializing a ParseObject yourself and wish to recreate it, you can use
	 *  this to recreate the ParseObject exactly.
	 * 
	 *  @param objectId The object ID to set.
	 */
	public void setObjectId(String objectId) {
	}

	/**
	 *  Accessor to the object id. An object id is assigned as soon as an object
	 *  is saved to the server. The combination of a className and an objectId
	 *  uniquely identifies an object in your application.
	 * 
	 *  @return This Parse object's Id.
	 */
	public String getObjectId() {
	}

	/**
	 *  @return The last time this object was updated on the server.
	 */
	public java.util.Date getUpdatedAt() {
	}

	/**
	 *  @return The first time this object was saved on the server.
	 */
	public java.util.Date getCreatedAt() {
	}

	/**
	 *  @return The name of the class associated with this Parse object.
	 */
	public String getClassName() {
	}

	/**
	 *  Retrieves the end point associated with this ParseObject. For classes,
	 *  the endpoint is {@code classes/<className>}.
	 * 
	 *  @return The endpoint associated with this object.
	 */
	public String getEndPoint() {
	}

	/**
	 *  Returns a set view of the keys contained in this object. This does not
	 *  reserved keys like createdAt, updatedAt or objectId.
	 * 
	 *  @return The keys contained in this object.
	 */
	public java.util.Set keySet() {
	}

	/**
	 *  Retrieves the {@link ParseFile} value associated with {@code key}.
	 *  <p>
	 *  This function will not perform a network request. Unless the ParseFile
	 *  has been downloaded (e.g. by calling {@link ParseFile#getData()}),
	 *  {@link ParseFile#isDataAvailable()} will return {@code false}.
	 * 
	 *  @param key The key associated with the file.
	 *  @return The retrieved file or null if there is no such {@code key} or if
	 *  it is not associated with a ParseFile.
	 */
	public ParseFile getParseFile(String key) {
	}

	/**
	 *  Retrieves the {@link ParseGeoPoint} value associated with {@code key}.
	 * 
	 * 
	 *  @param key The key associated with the geo point.
	 *  @return The retrieved point or null if there is no such {@code key} or if
	 *  it is not associated with a ParseGeoPoint.
	 */
	public ParseGeoPoint getParseGeoPoint(String key) {
	}

	/**
	 *  Retrieves the {@link Date} value associated with {@code key}.
	 * 
	 * 
	 *  @param key The key associated with the date value.
	 *  @return The retrieved date or null if there is no such {@code key} or if
	 *  it is not associated with a Date.
	 */
	public java.util.Date getDate(String key) {
	}

	/**
	 *  Retrieves the {@link Boolean} value associated with {@code key}.
	 * 
	 * 
	 *  @param key The key associated with the boolean value.
	 *  @return The retrieved boolean value or null if there is no such
	 *  {@code key} or if it is not associated with a Boolean.
	 */
	public Boolean getBoolean(String key) {
	}

	/**
	 *  Retrieves the {@link Integer} value associated with {@code key}.
	 * 
	 *  @param key The key associated with the integer value.
	 *  @return The retrieved integer value or null if there is no such
	 *  {@code key} or if it cannot be converted to an Integer because it is not of 
	 *  a supported number type.
	 */
	public Integer getInt(String key) {
	}

	/**
	 *  Retrieves the {@link Double} value associated with {@code key}.
	 * 
	 * 
	 *  @param key The key associated with the double value.
	 *  @return The retrieved boolean value or null if there is no such
	 *  {@code key} or if it cannot be converted to a Double because it is not of 
	 *  a supported number type.
	 */
	public Double getDouble(String key) {
	}

	/**
	 *  Retrieves the {@link Long} value associated with {@code key}.
	 * 
	 * 
	 *  @param key The key associated with the long value.
	 *  @return The retrieved boolean value or null if there is no such
	 *  {@code key} or if it cannot be converted to a Long because it is not of 
	 *  a supported number type.
	 */
	public Long getLong(String key) {
	}

	/**
	 *  Retrieves the {@link String} value associated with {@code key}.
	 * 
	 * 
	 *  @param key The key associated with the string value.
	 *  @return The retrieved boolean value or null if there is no such
	 *  {@code key} or if it is not associated with a String.
	 */
	public String getString(String key) {
	}

	/**
	 *  Retrieves the list or JSONArray value associated with {@code key}.
	 * 
	 *  @param <T> The type of the list elements.
	 *  @param key The key associated with the list value.
	 *  @return The retrieved list or null if there is no such {@code key} or if
	 *  the value cannot be converted to a list.
	 */
	public java.util.List getList(String key) {
	}

	/**
	 *  Retrieves the {@link ParseObject} value associated with {@code key}.
	 *  <p>
	 *  This function will not perform a network request. Unless the ParseObject
	 *  has been downloaded (e.g. by a
	 *  {@link ParseQuery#include(java.lang.String)} or by calling
	 *  {@link #fetchIfNeeded()}), {@link #isDataAvailable()} will return false.
	 * 
	 *  @param key The key associated with the Parse object.
	 *  @return The retrieved Parse object or null if there is no such
	 *  {@code key} or if it is not associated with a ParseObject.
	 */
	public ParseObject getParseObject(String key) {
	}

	/**
	 *  Retrieves the object value associated with {@code key}.
	 * 
	 * 
	 *  @param key The key associated with the object.
	 *  @return The retrieved object or null if there is no such {@code key}.
	 */
	public Object get(String key) {
	}

	/**
	 *  Creates a ParseRelation object for defining/updating relations associated
	 *  with {@code key}.
	 * 
	 *  <p>
	 *  <b>Note:</b> Relations defined via the returned object will override any
	 *  existing relations previously defined for the same {@code key}!</p>
	 * 
	 *  @param <T> A {@link ParseObject} or its sub-type.
	 *  @param key The key associated with this relation.
	 *  @return The newly created object.
	 */
	public ParseRelation getRelation(String key) {
	}

	/**
	 *  Checks if the specified {@code key} is defined for this Parse object.
	 * 
	 *  @param key The key to be checked.
	 *  @return {@code true} if {@code key} is defined for this object.
	 */
	public boolean has(String key) {
	}

	/**
	 *  @see #has(java.lang.String)
	 */
	public boolean containsKey(String key) {
	}

	/**
	 *  Checks if this ParseObject has the same class name and objectId as this
	 *  one.
	 * 
	 *  @param other The ParseObject to compare this one to.
	 *  @return {@code true} if the {@code other} is the same as this Parse
	 *  object.
	 */
	public boolean hasSameId(ParseObject other) {
	}

	/**
	 *  Atomically adds an object to the end of the array associated with a given
	 *  {@code key}.
	 *  <p>
	 *  <b>Note:</b> The corresponding method in the Parse Java SDK is called
	 *  <a href='http://www.parse.com/docs/android/api/com/parse/ParseObject.html#add(java.lang.String,%20java.lang.Object)'>add</a>.
	 * 
	 *  @param key The array field key.
	 *  @param value The object to add.
	 */
	public void addToArrayField(String key, Object value) {
	}

	/**
	 *  Atomically adds the objects contained in {@code values} to the end of the
	 *  array associated with a given {@code key}.
	 *  <p>
	 *  <b>Note:</b> The corresponding method in the Parse Java SDK is called
	 *  <a href='http://www.parse.com/docs/android/api/com/parse/ParseObject.html#addAll(java.lang.String,%20java.util.Collection)'>addAll</a>.
	 * 
	 *  @param key The array field key.
	 *  @param values The objects to add.
	 */
	public void addAllToArrayField(String key, java.util.Collection values) {
	}

	/**
	 *  Atomically adds an object to the array associated with a given key, only
	 *  if it is not already present in the array. The position of the insert is
	 *  not guaranteed.
	 *  <p>
	 *  <b>Note:</b> The corresponding method in the Parse Java SDK is called
	 *  <a href='http://www.parse.com/docs/android/api/com/parse/ParseObject.html#addUnique(java.lang.String,%20java.lang.Object)'>addUnique</a>.
	 * 
	 *  @param key The array field key.
	 *  @param value The object to add.
	 */
	public void addUniqueToArrayField(String key, Object value) {
	}

	/**
	 *  Atomically adds the objects contained in {@code values} to the array
	 *  associated with a given key, only if it is not already present in the
	 *  array. The position of the insert is not guaranteed.
	 *  <p>
	 *  <b>Note:</b> The corresponding method in the Parse Java SDK is called
	 *  <a href='http://www.parse.com/docs/android/api/com/parse/ParseObject.html#addAllUnique(java.lang.String,%20java.util.Collection)'>addAllUnique</a>.
	 * 
	 *  @param key The array field key.
	 *  @param values The objects to add.
	 */
	public void addAllUniqueToArrayField(String key, java.util.Collection values) {
	}

	/**
	 *  Atomically removes an object to the end of the array associated with a
	 *  given {@code key}.
	 * 
	 *  @param key The array field key.
	 *  @param value The object to remove.
	 */
	public void removeFromArrayField(String key, Object value) {
	}

	/**
	 *  Atomically removes all instances of the objects contained in
	 *  {@code values} from the array associated with a given key.
	 *  <p>
	 *  <b>Note:</b> The corresponding method in the Parse Java SDK is called
	 *  <a href='http://www.parse.com/docs/android/api/com/parse/ParseObject.html#removeAll(java.lang.String,%20java.util.Collection)'>removeAll</a>.
	 * 
	 *  @param key The array field key.
	 *  @param values The objects to remove.
	 */
	public void removeAllFromArrayField(String key, java.util.Collection values) {
	}

	public void put(String key, Object value) {
	}

	/**
	 *  {@inheritDoc}
	 * 
	 *  @return {@code true} if any key-value pair in this object (or its
	 *  children) has been added/updated/removed and not saved yet.
	 */
	@java.lang.Override
	public boolean isDirty() {
	}

	@java.lang.Override
	public void setDirty(boolean dirty) {
	}

	@java.lang.Override
	public boolean isDataAvailable() {
	}

	@java.lang.Override
	public void save() {
	}

	/**
	 *  Removes a key from this object's data if it exists.
	 *  
	 *  @param key The key to be removed.
	 */
	public void remove(String key) {
	}

	/**
	 *  Atomically decrements the number field associated with {@code key} by 1.
	 *  
	 *  @param key The key of the number field to decrement.
	 */
	public void decrement(String key) {
	}

	/**
	 *  Atomically increments the number field associated with {@code key} by 1.
	 *  
	 *  @param key The key of the number field to increment.
	 */
	public void increment(String key) {
	}

	/**
	 *  Atomically increments the number field associated with {@code key} by the 
	 *  stated {@code amount}.
	 *  
	 *  @param key The key of the number field to increment.
	 *  @param amount The amount to increment the key's value.
	 */
	public void increment(String key, Object amount) {
	}

	/**
	 *  Deletes this object on the server. If successful, the object is 
	 *  also {@link #reset()}.
	 * 
	 *  @throws ParseException if anything goes wrong.
	 */
	public void delete() {
	}

	/**
	 *  Encodes the data present in this object in a JSONObject that complies to 
	 *  the Parse API specification. 
	 *  
	 *  @return The JSON equivalent of this object as expected by Parse.
	 *  @throws ParseException If anything goes wrong.
	 */
	public ca.weblite.codename1.json.JSONObject getParseData() {
	}

	/**
	 *  Checks the validity of this object's state just before a save operation 
	 *  is performed. Sub-classes should override this method to implement class-
	 *  specific validation.
	 *  
	 *  @throws ParseException if anything goes wrong.
	 */
	protected void validateSave() {
	}

	/**
	 *  Saves this object.
	 *  
	 *  @param command The ParseCommand to be used to issue the save request.
	 *  @throws ParseException if anything goes wrong.
	 */
	protected void performSave(command.ParseCommand command) {
	}

	/**
	 *  Fetches this object with the data from the server. 
	 *  Call this whenever you want the state of the object to reflect exactly
	 *  what is on the server.
	 *  
	 *  @param <T> The concrete type of ParseObject to be fetched.
	 *  @param className The name of the class associated with this Parse object.
	 *  @param objectId The id of the object to be fetched. This is the same id 
	 *  that was returned from the server when the object was created.
	 *  @return The ParseObject that was fetched. 
	 *  
	 *  @throws ParseException if anything goes wrong.
	 */
	public static ParseObject fetch(String className, String objectId) {
	}

	/**
	 *  Fetches this object's data from the server if it has not been fetched 
	 *  (i.e. {@link #isDataAvailable()} and {@link #isDirty()} both return false).
	 *  
	 *  @param <T> The concrete type of ParseObject to be fetched.
	 *  @return The ParseObject that was fetched or this object if the criteria 
	 *  for fetching are not met.
	 *  
	 *  @throws ParseException if anything goes wrong.
	 */
	public ParseObject fetchIfNeeded() {
	}

	/**
	 *  Same as {@link #fetchIfNeeded()} with the option to get notified when 
	 *  the fetch is completed. 
	 *  
	 *  @param callback The objects whose {@link GetCallback#done(com.parse4cn1.ParseObject, com.parse4cn1.ParseException)}
	 *  method is invoked when the fetch operation is completed.
	 */
	public final void fetchIfNeeded(callback.GetCallback callback) {
	}

	/**
	 *  Sets the data for this ParseObject. This method is typically invoked after 
	 *  this object's data is retrieved from the server.
	 *  
	 *  @param jsonObject The JSON object containing the data to be set.
	 */
	public void setData(ca.weblite.codename1.json.JSONObject jsonObject) {
	}

	/**
	 *  Serializes the contents of the ParseObject in a manner that complies with
	 *  the {@link com.codename1.io.Externalizable} interface.
	 * 
	 *  @param out The data stream to serialize to.
	 *  @throws IOException if any IO error occurs
	 *  @throws ParseException if the object is {@link #isDirty() dirty}
	 */
	public void externalize(java.io.DataOutputStream out) {
	}

	/**
	 *  Deserializes the contents of the ParseObject in a manner that complies with 
	 *  the {@link com.codename1.io.Externalizable} interface.
	 *  
	 *  @param version The version of the previously serialized object (defaults to {@link ParseConstants#API_VERSION}).
	 *  @param in The data input stream to deserialize from.
	 *  @throws IOException if any IO error occurs
	 *  @throws ParseException if the object is {@link #isDirty() dirty}
	 */
	public void internalize(int version, java.io.DataInputStream in) {
	}

	/**
	 *  Wraps this ParseObject in a form that can be persisted to storage.
	 *  <p>
	 *  Note that {@link ParseObject} does not directly implement {@link com.codename1.io.Externalizable}
	 *  because of a name conflict between {@link com.codename1.io.Externalizable#getObjectId()} 
	 *  (unique serialization id for the <em>class</em>
	 *  and {@link #getObjectId()} (unique object id).
	 *  @return 
	 */
	public util.ExternalizableParseObject asExternalizable() {
	}

	/**
	 *  Resets this ParseObject's state. After invoking this method, the ParseObject 
	 *  state is comparable to a newly constructed ParseObject 
	 *  (see: {@link ParseObject#create(java.lang.String)}).
	 */
	protected void reset() {
	}

	protected void setCreatedAt(java.util.Date createdAt) {
	}

	protected void setUpdatedAt(java.util.Date updatedAt) {
	}

	protected final void setEndPoint(String endPoint) {
	}

	protected void setReservedKey(String key, Object value) {
	}
}
