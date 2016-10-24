package com.parse4cn1.operation;


/**
 *  This class defines an operation to 'atomically' remove objects from an array field 
 *  of a ParseObject.
 */
public class RemoveFromArrayOperation implements ParseOperation {

	protected java.util.Set objects;

	public RemoveFromArrayOperation(java.util.Collection coll) {
	}

	public RemoveFromArrayOperation(Object o) {
	}

	@java.lang.Override
	public Object apply(Object oldValue, com.parse4cn1.ParseObject parseObject, String key) {
	}

	@java.lang.Override
	public Object encode(com.parse4cn1.encode.IParseObjectEncodingStrategy objectEncoder) {
	}
}
