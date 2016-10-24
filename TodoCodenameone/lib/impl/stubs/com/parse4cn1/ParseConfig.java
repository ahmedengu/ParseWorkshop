package com.parse4cn1;


/**
 *  ParseConfig is a way to configure your applications remotely by storing a 
 *  single configuration object on Parse. It enables you to add things like 
 *  feature gating or a simple "Message of the day". 
 *  <p>
 *  Parse configuration items are read-only
 * 
 *  @author sidiabale
 */
public class ParseConfig {

	/**
	 *  Retrieves the parse configuration singleton object.
	 *  
	 *  @return The singleton ParseConfig instance.
	 *  @throws ParseException if the ParseConfig object creation fails.
	 */
	public static ParseConfig getInstance() {
	}

	/**
	 *  Forces fresh retrieval of the Parse configuration from the server.
	 *  This is only useful if configuration items can change at runtime.
	 *  
	 *  @return The new ParseConfig instance.
	 *  @throws ParseException if the ParseConfig data retrieval fails.
	 */
	public ParseConfig refresh() {
	}

	/**
	 *  @see ParseObject#getParseFile(java.lang.String) 
	 */
	public ParseFile getParseFile(String key) {
	}

	/**
	 *  @see ParseObject#getParseGeoPoint(java.lang.String) 
	 */
	public ParseGeoPoint getParseGeoPoint(String key) {
	}

	/**
	 *  @see ParseObject#getDate(java.lang.String) 
	 */
	public java.util.Date getDate(String key) {
	}

	/**
	 *  @see ParseObject#getBoolean(java.lang.String) 
	 */
	public Boolean getBoolean(String key) {
	}

	/**
	 *  @see ParseObject#getInt(java.lang.String) 
	 */
	public Integer getInt(String key) {
	}

	/**
	 *  @see ParseObject#getDouble(java.lang.String) 
	 */
	public Double getDouble(String key) {
	}

	/**
	 *  @see ParseObject#getLong(java.lang.String) 
	 */
	public Long getLong(String key) {
	}

	/**
	 *  @see ParseObject#getString(java.lang.String) 
	 */
	public String getString(String key) {
	}

	/**
	 *  @see ParseObject#getList(java.lang.String) 
	 */
	public java.util.List getList(String key) {
	}

	/**
	 *  @see ParseObject#ParseObject(java.lang.String) 
	 */
	public ParseObject getParseObject(String key) {
	}

	/**
	 *  @see ParseObject#get(java.lang.String) 
	 */
	public Object get(String key) {
	}
}
