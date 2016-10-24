package com.parse4cn1.callback;


public abstract class SignUpCallback extends ParseCallback {

	public SignUpCallback() {
	}

	public abstract void done(com.parse4cn1.ParseException parseException) {
	}
}
