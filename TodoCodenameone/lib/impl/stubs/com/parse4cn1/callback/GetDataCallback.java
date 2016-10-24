package com.parse4cn1.callback;


public abstract class GetDataCallback extends ParseCallback {

	public GetDataCallback() {
	}

	public abstract void done(byte[] data, com.parse4cn1.ParseException e) {
	}
}
