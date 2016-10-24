package com.parse4cn1.operation;


/**
 *  This class defines methods for decoding various Parse operations.
 */
public class ParseOperationDecoder {

	public ParseOperationDecoder() {
	}

	/**
	 *  Registers the 'standard' decoders for all known/supported Parse operations.
	 */
	public static void registerDefaultDecoders() {
	}

	/**
	 *  Decodes the provided Parse operation data based on the {@value ParseConstants#KEYWORD_OP} 
	 *  defined in the {@code encoded} object.
	 *  
	 *  @param encoded A JSON object defining a Parse operation.
	 *  @return The decoded ParseOperation.
	 *  @throws JSONException if any JSON error occurs.
	 */
	public static ParseOperation decode(ca.weblite.codename1.json.JSONObject encoded) {
	}
}
