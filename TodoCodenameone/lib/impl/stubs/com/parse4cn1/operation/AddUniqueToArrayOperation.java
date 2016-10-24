package com.parse4cn1.operation;


/**
 *  This class defines an operation to 'atomically' add unique objects to an array field 
 *  of a ParseObject.
 */
public class AddUniqueToArrayOperation implements ParseOperation {

	protected java.util.Set objects;

	public AddUniqueToArrayOperation(java.util.Collection coll) {
	}

	public AddUniqueToArrayOperation(Object o) {
	}

	@java.lang.Override
	public Object apply(Object oldValue, com.parse4cn1.ParseObject parseObject, String key) {
	}

	@java.lang.Override
	public Object encode(com.parse4cn1.encode.IParseObjectEncodingStrategy objectEncoder) {
	}
}
