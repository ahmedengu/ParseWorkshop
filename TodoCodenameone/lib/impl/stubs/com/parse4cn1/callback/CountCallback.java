package com.parse4cn1.callback;


public abstract class CountCallback extends ParseCallback {

	public CountCallback() {
	}

	public abstract void done(Integer count, com.parse4cn1.ParseException parseException) {
	}
}
