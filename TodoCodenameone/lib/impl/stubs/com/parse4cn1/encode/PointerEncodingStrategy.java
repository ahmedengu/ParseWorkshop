package com.parse4cn1.encode;


/**
 *  This class defines a Parse object encoding strategy based on pointers.
 *  @see <a href="https://www.parse.com/docs/rest#objects-types">The Parse REST API Pointer data type</a>.
 */
public class PointerEncodingStrategy extends PointerOrLocalIdEncodingStrategy {

	public PointerEncodingStrategy() {
	}

	/**
	 *  @return The singleton instance of this class.
	 */
	public static PointerEncodingStrategy get() {
	}

	@java.lang.Override
	public ca.weblite.codename1.json.JSONObject encodeRelatedObject(com.parse4cn1.ParseObject object) {
	}
}
