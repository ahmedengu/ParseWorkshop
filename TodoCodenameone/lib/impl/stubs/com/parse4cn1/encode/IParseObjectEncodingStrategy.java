package com.parse4cn1.encode;


/**
 *  An interface that specifies a strategy for encoding ParseObject
 *  relationships.
 */
public interface IParseObjectEncodingStrategy {

	/**
	 *  Encodes a relationship with the provided ParseObject.
	 *  @param parseObject The related object whose relationship is to be encoded.
	 *  @return The encoded Parse object relationship.
	 *  @throws ParseException if anything goes wrong.
	 */
	public ca.weblite.codename1.json.JSONObject encodeRelatedObject(com.parse4cn1.ParseObject parseObject);
}
