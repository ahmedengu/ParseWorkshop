package com.parse4cn1.util;


/**
 *  A wrapper around relevant JSON classes to make them
 *  externalizable.
 *  @see ca.weblite.codename1.json.JSONArray
 *  @see ca.weblite.codename1.json.JSONObject
 *  @see ca.weblite.codename1.json.JSONObject#NULL
 */
public class ExternalizableJsonEntity implements com.codename1.io.Externalizable {

	public ExternalizableJsonEntity() {
	}

	public ExternalizableJsonEntity(Object jsonEntity) {
	}

	public static boolean isExternalizableJsonEntity(Object obj) {
	}

	/**
	 *  @return A unique class name.
	 */
	public static String getClassName() {
	}

	/**
	 *  @return The {@link java.util.Date} wrapped by this object.
	 */
	public Object getJsonEntity() {
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
