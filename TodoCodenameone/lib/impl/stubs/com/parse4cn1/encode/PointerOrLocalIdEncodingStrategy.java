package com.parse4cn1.encode;


/**
 *  This class defines a Parse object encoding strategy based on pointers. It may
 *  be used to define relations to both existing and newly created (i.e., objects
 *  having no {@link ParseObject#objectId}) Parse objects.
 */
public class PointerOrLocalIdEncodingStrategy implements IParseObjectEncodingStrategy {

	public PointerOrLocalIdEncodingStrategy() {
	}

	@java.lang.Override
	public ca.weblite.codename1.json.JSONObject encodeRelatedObject(com.parse4cn1.ParseObject parseObject) {
	}
}
