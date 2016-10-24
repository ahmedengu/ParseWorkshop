package com.parse4cn1;


/**
 *  A class that is used to define, modify and/or access all of the children of a
 *  many-to-many relationship. Each instance of ParseRelation is associated with
 *  a particular parent object and key.
 * 
 *  @param <T> The type of {@link ParseObject}
 */
public class ParseRelation implements com.codename1.io.Externalizable {

	public ParseRelation() {
	}

	/**
	 *  Creates a ParseRelation object from JSON data, for example, retrieved
	 *  from a Parse API call.
	 * 
	 *  @param jsonObject The JSON data that defines the ParseRelation. It must
	 *  contains at least a {@value ParseConstants#FIELD_CLASSNAME} field for the
	 *  target class and optionally an "objects" array field.
	 */
	public ParseRelation(ca.weblite.codename1.json.JSONObject jsonObject) {
	}

	/**
	 *  Creates a ParseRelation between the {@code parent} and
	 *  {@code targetClass} using the specified {@code key} in the parent.
	 * 
	 *  @param parent The ParseObject on which this ParseRelation is defined.
	 *  @param key The key in {@code parent} on which the relation is defined.
	 *  @param targetClass The name of the ParseObject class whose objects are
	 *  involved in relation.
	 * 
	 *  @throws IllegalArgumentException if the {@code targetClass} is null or
	 *  the provided {@code parent} and/or {@code key} do not match those
	 */
	public ParseRelation(ParseObject parent, String key, String targetClass) {
	}

	/**
	 *  @return A unique class name.
	 */
	public static String getClassName() {
	}

	/**
	 *  @return The target class for this relation.
	 */
	public final String getTargetClass() {
	}

	/**
	 *  Adds an object to this relation.
	 * 
	 *  @param object The object to be added.
	 *  @throws IllegalArgumentException if {@code object} is null.
	 *  @throws IllegalStateException if any of the members required to getQuery
	 *  the relation is uninitialized or mismatching.
	 */
	public void add(ParseObject object) {
	}

	/**
	 *  Removes an object from this relation.
	 * 
	 *  @param object The object to be removed.
	 *  @throws IllegalArgumentException if {@code object} is null.
	 *  @throws IllegalStateException if any of the members required to remove
	 *  the relation is uninitialized or mismatching.
	 */
	public void remove(ParseObject object) {
	}

	/**
	 *  Gets a query that can be used to query the objects in this relation.
	 * 
	 *  @return the query.
	 */
	public ParseQuery getQuery() {
	}

	/**
	 *  Converts the objects in this relation to JSON.
	 * 
	 *  @param objectEncoder The encoder to be used to encode the objects.
	 *  @return The objects in this relation encoded as a Parse "Relation".
	 *  @throws JSONException if anything goes wrong with JSON encoding.
	 */
	public ca.weblite.codename1.json.JSONObject encode(encode.IParseObjectEncodingStrategy objectEncoder) {
	}

	/**
	 *  @see com.codename1.io.Externalizable
	 */
	public int getVersion() {
	}

	/**
	 *  @see com.codename1.io.Externalizable
	 */
	public void externalize(java.io.DataOutputStream out) {
	}

	/**
	 *  @see com.codename1.io.Externalizable
	 */
	public void internalize(int version, java.io.DataInputStream in) {
	}

	/**
	 *  @see com.codename1.io.Externalizable
	 */
	public String getObjectId() {
	}
}
