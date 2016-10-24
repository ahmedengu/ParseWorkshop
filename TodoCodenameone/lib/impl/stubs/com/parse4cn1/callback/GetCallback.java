package com.parse4cn1.callback;


public abstract class GetCallback extends ParseCallback {

	public GetCallback() {
	}

	public abstract void done(com.parse4cn1.ParseObject t, com.parse4cn1.ParseException parseException) {
	}
}
