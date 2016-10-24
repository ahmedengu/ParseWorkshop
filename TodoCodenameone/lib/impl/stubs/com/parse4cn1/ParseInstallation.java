package com.parse4cn1;


/**
 *  {@code ParseInstallation} represents an instance of an app that has been installed 
 *  on a specific device.
 *  <p>
 *  ParseInstallation objects are simply ParseObjects extended with specific 
 *  installation data as required by the different platforms. 
 *  Some of these fields are readonly as explained in 
 *  <a href="https://parse.com/docs/rest/guide#push-notifications-installations">the REST API documentation</a>.
 *  <p>
 *  Creation of ParseInstallation objects is not exposed via this library as it 
 *  requires specific fields and logic already present in the official Parse SDKs
 *  and difficult to realize in CN1 (e.g. generating unique device IDs that fit Parse 
 *  requirements which are not crystal clear).
 *  <p>
 *  Thus, creation is delegated to the respective Parse SDK for each platform, 
 *  access via the CN1 native interface mechanism. However, since the Windows 
 *  Phone port does not support native interfaces, creation is the responsibility
 *  of the user who should make the corresponding installation id available via 
 *  {@link ParseInstallation#setInstallationObjectId(java.lang.String)}.
 *  
 */
public class ParseInstallation extends ParseObject {

	/**
	 *  Creates a new ParseInstallation.
	 */
	protected ParseInstallation() {
	}

	/**
	 *  Retrieves the current installation. On Android and iOS, a new installation 
	 *  is created, persisted to the Parse backend and returned, if one is not present.
	 *  On Windows Phone and any other platform, the installation is retrieved from the backend if its
	 *  objectId has been specified via {@link #setInstallationObjectId(java.lang.String)}.
	 *  <p>
	 *  <em>Note</em>Windows Phone is a special case because native interfaces are not (yet) 
	 *  supported so creating the installation via the .net native Parse SDK is not feasible.
	 *  
	 *  @return The current installation if one exists (all platforms), could be 
	 *  created (Android and iOS) or could be retrieved (Windows Phone).
	 *  
	 *  @throws com.parse4cn1.ParseException if any error occurs while 
	 *  trying to retrieve the current installation.
	 */
	public static ParseInstallation getCurrentInstallation() {
	}

	/**
	 *  Sets the current installation to null.
	 */
	public static void resetCurrentInstallation() {
	}

	/**
	 *  Sets the object ID of the current installation.
	 *  <p>This method is intended for use on platforms where parse4cn1 cannot 
	 *  retrieve the installation object ID e.g. because native interfaces are not supported.
	 *  It can also be used in unit tests for initializing the installation ID
	 *  <p><em>Note:</em> It is assumed that at the time this method is invoked,
	 *  the corresponding ParseInstallation already exists in the Parse backend.
	 *  @param objectId The current installation's ID to be set. 
	 */
	public static void setInstallationObjectId(String objectId) {
	}

	/**
	 *  Constructs a query for {@code ParseInstallation}.
	 *  <p>
	 *  <strong>Note:</strong> Parse only allows the following types of queries
	 *  for installations:
	 *  <pre>
	 *  query.get(objectId)
	 *  query.whereEqualTo("installationId", value)
	 *  query.whereMatchesKeyInQuery("installationId", keyInQuery, query)
	 *  </pre>
	 *  <p>
	 *  You can add additional query clauses, but one of the above must appear as
	 *  a top-level {@code AND} clause in the query.
	 * 
	 *  @return The newly created ParseInstallation query.
	 *  @see ParseQuery#getQuery(java.lang.Class)
	 */
	public static ParseQuery getQuery() {
	}

	/**
	 *  Returns the unique ID of this installation object as contained in the
	 *  {@code ParseInstallation} object.
	 * 
	 *  @return A UUID that represents this device or null if one is not
	 *  specified.
	 *  @throws com.parse4cn1.ParseException if the installation Id cannot be retrieved.
	 */
	public String getInstallationId() {
	}

	/**
	 *  (iOS only) Sets the app batch that is shown on the app icon to the specified
	 *  count for this installation.
	 *  <p>If invoked on other platforms, the badge will still be set via the REST API
	 *  but will not have the desired effect of badging the app icon.
	 *  @param count The badge count to be set
	 *  @throws ParseException if anything goes wrong.
	 */
	public void setBadge(int count) {
	}

	/**
	 *  Retrieves the current application badge count.
	 *  @return The app badge count if any or null.
	 */
	public Integer getBadge() {
	}

	/**
	 *  Retrieves all the channels to which this device is currently subscribed
	 *  to.
	 * 
	 *  @return A read-only list of subscribed push notification channels.
	 *  @throws com.parse4cn1.ParseException if anything goes wrong while retrieving 
	 *  subscriptions.
	 */
	public java.util.List getSubscribedChannels() {
	}

	/**
	 *  Subscribes this device to the specified {@code channel}.
	 *  <p>
	 *  This method has no effect if the channel is already subscribed to.
	 *  
	 *  @param channel The channel this device is to be subscribed to.
	 *  @throws com.parse4cn1.ParseException if subscription fails.
	 */
	public void subscribeToChannel(String channel) {
	}

	/**
	 *  Subscribes this device to the specified {@code channels}.
	 *  
	 *  @param channels The channels this device is to be subscribed to.
	 *  @throws com.parse4cn1.ParseException if subscription fails.
	 */
	public void subscribeToChannels(java.util.List channels) {
	}

	/**
	 *  Unsubscribes this device from the specified {@code channel}.
	 *  <p>
	 *  This method has no effect if the channel is not currently subscribed to.
	 *  
	 *  @param channel The channel this device is to be unsubscribed from.
	 *  @throws com.parse4cn1.ParseException if desubscription fails.
	 */
	public void unsubscribeFromChannel(String channel) {
	}

	/**
	 *  Unsubscribes this device from the specified {@code channels} excluding 
	 *  non-existing channels.
	 *  
	 *  @param channels The channels this device is to be unsubscribed from.
	 *  @throws com.parse4cn1.ParseException if desubscription fails.
	 */
	public void unsubscribeFromChannels(java.util.List channels) {
	}

	/**
	 *  Unsubscribes this device from all previously subscribed channels.
	 *  
	 *  @throws com.parse4cn1.ParseException if desubscription fails.
	 */
	public void unsubscribeFromAllChannels() {
	}
}
