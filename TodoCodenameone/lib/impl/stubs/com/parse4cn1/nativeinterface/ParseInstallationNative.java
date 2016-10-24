package com.parse4cn1.nativeinterface;


/**
 *  Provides access to native functionality related to Parse installations.
 *  This functionality is to be provided by native Parse SDKs.
 */
public interface ParseInstallationNative extends com.codename1.system.NativeInterface {

	/**
	 *  Initializes the Parse SDK.
	 *  <p>This method may raise an exception, e.g., if the Parse SDK is already 
	 *  initialized and it is the responsibility of the caller to handle any such exceptions.
	 *  
	 *  @param apiEndpoint The path to the Parse backend, e.g. "your_parse_backend_website_url"/parse.
	 *  @param applicationId The Parse application ID.
	 *  @param clientKey The Parse client key.
	 */
	public void initialize(String apiEndpoint, String applicationId, String clientKey);

	/**
	 *  Retrieves the installation ID of the current installation. An installation 
	 *  should be created on the fly and persisted to Parse if one does not exist.
	 *  
	 *  <p>It is recommended to perform the save operation in a background thread
	 *  to prevent blocking. It is up to the caller to retry if an immediate attempt 
	 *  to retrieve the installation using the ID returned by this method fails.
	 *  
	 *  @return The current installation's ID.
	 */
	public String getInstallationId();
}
