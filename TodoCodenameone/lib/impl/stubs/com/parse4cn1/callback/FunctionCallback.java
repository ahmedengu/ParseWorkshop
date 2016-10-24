package com.parse4cn1.callback;


public abstract class FunctionCallback extends ParseCallback {

	public FunctionCallback() {
	}

	public abstract void done(Object result, com.parse4cn1.ParseException parseException) {
	}
}
