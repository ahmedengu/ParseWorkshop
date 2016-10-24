package com.parse4cn1.operation;


/**
 *  This class defines general utilities related to Parse operations.
 */
public class ParseOperationUtil {

	public ParseOperationUtil() {
	}

	/**
	 *  Check is the provided object is of a supported number type. 
	 *  <p>
	 *  This approach is needed since at the time of writing, CN1 does not support 
	 *  the Number Java class.
	 *  
	 *  @param o The object whose type is to be checked.
	 *  @return {@code true} if o is of type Double, Float, Long, Integer, Short or Byte.
	 */
	public static boolean isSupportedNumberType(Object o) {
	}
}
