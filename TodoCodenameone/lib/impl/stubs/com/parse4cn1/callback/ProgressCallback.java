package com.parse4cn1.callback;


public abstract class ProgressCallback extends ParseCallback {

	public ProgressCallback() {
	}

	public abstract void done(Integer percentDone) {
	}
}
