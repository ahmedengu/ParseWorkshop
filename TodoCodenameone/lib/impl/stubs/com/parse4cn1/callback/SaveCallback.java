package com.parse4cn1.callback;


public abstract class SaveCallback extends ParseCallback {

	public SaveCallback() {
	}

	public abstract void done(com.parse4cn1.ParseException parseException) {
	}
}
