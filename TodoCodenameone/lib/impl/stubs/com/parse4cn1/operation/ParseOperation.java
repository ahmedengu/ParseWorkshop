package com.parse4cn1.operation;


/**
 *  A parse operation is an operation that can be performed on a parse object
 *  to change its state, e.g., add, delete or modify fields, or create relations 
 *  with other objects.
 */
public interface ParseOperation {

	/**
	 *  Applies the operation to the specified object.
	 *  @param oldValue The old value of the field referenced by key.
	 *  @param parseObject The parse object on which the operation is to be applied.
	 *  @param key The field on which the operation is to be applied.
	 *  @return The new value of key or null if the value is to be removed.
	 *  @throws ParseException 
	 */
	public Object apply(Object oldValue, com.parse4cn1.ParseObject parseObject, String key);

	/**
	 *  Encodes this parse operation in a form that is understood by the Parse REST API.
	 *  @param objectEncoder The encoder to be used for encoding.
	 *  @return The encoded parse operation
	 *  @throws ParseException 
	 */
	public Object encode(com.parse4cn1.encode.IParseObjectEncodingStrategy objectEncoder);
}
