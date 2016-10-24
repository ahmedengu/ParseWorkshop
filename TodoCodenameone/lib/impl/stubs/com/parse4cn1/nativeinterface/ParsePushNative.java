package com.parse4cn1.nativeinterface;


/**
 *  Provides access to native functionality related to Parse push notifications.
 *  This functionality is to be provided by native Parse SDKs.
 *  
 *  <p>As a rule-of-thumb, functionality implemented here should be impossible in 
 *  a cross-platform manner using the REST API.
 *  
 */
public interface ParsePushNative extends com.codename1.system.NativeInterface {

	/**
	 *  Sets the value of the icon badge for iOS apps.
	 *  <p>The implementation should also update the badge field of the current 
	 *  installation in the Parse backend.
	 *  @param value The new badge value.
	 */
	public void setBadge(int value);
}
