package com.parse4cn1.util;


/**
 *  A wrapper around the {@link com.parse4cn1.ParseObject} class to make it
 *  externalizable.
 */
public class ExternalizableParseObject implements com.codename1.io.Externalizable {

	public ExternalizableParseObject() {
	}

	public ExternalizableParseObject(com.parse4cn1.ParseObject parseObject) {
	}

	/**
	 *  @return A unique class name.
	 */
	public static String getClassName() {
	}

	/**
	 *  @return The {@link java.util.Date} wrapped by this object.
	 */
	public com.parse4cn1.ParseObject getParseObject() {
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
