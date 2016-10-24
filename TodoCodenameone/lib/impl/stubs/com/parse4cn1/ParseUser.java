package com.parse4cn1;


/**
 *  The ParseUser is a local representation of user data that can be saved and 
 *  retrieved from the Parse cloud.
 */
public class ParseUser extends ParseObject {

	protected ParseUser() {
	}

	public static ParseUser getCurrent() {
	}

	@java.lang.Override
	public void remove(String key) {
	}

	@java.lang.Override
	public void delete() {
	}

	/**
	 *  Sets the username. Usernames cannot be null or blank.
	 *  @param username The username to be set.
	 */
	public void setUsername(String username) {
	}

	public String getUsername() {
	}

	public void setPassword(String password) {
	}

	public void setEmail(String email) {
	}

	public String getEmail() {
	}

	/**
	 *  Retrieves the email verification status of this user.
	 *  @return null if the field is not present or otherwise a boolean value representing
	 *  the verification status.
	 */
	public Boolean getEmailVerified() {
	}

	/**
	 *  Retrieves the session token associated with this user. Only logged in 
	 *  users have a valid session.
	 *  
	 *  @return The session token associated with this user.
	 */
	public String getSessionToken() {
	}

	public static ParseUser create(String username, String password) {
	}

	/**
	 *  Retrieves the user associated with {@code sessionToken}.
	 *  
	 *  @param sessionToken A session token associated with a ParseUser.
	 *  @return The ParseUsser associated with {@code sessionToken}.
	 *  @throws ParseException if anything goes wrong.
	 */
	public static ParseUser fetchBySession(String sessionToken) {
	}

	/**
	 *  Requests a password reset email to be sent to the specified email address 
	 *  associated with the user account. This email allows the user to securely 
	 *  reset their password on the Parse site.
	 *  
	 *  @param email The email address associated with the user that forgot their password.
	 *  @throws ParseException if anything goes wrong.
	 */
	public static void requestPasswordReset(String email) {
	}

	/**
	 *  Checks whether the ParseUser has been authenticated on this device. 
	 *  This will be true if the ParseUser was obtained via a logIn or signUp method. 
	 *  Only an authenticated ParseUser can be saved (with altered attributes) and deleted.
	 *  
	 *  @return {@code true} if this user is authenticated.
	 */
	public boolean isAuthenticated() {
	}

	/**
	 *  Signs up a new user. You should call this instead of {@link ParseObject#save()} 
	 *  for new ParseUsers.
	 *  <p>
	 *  A username and password must be set before calling signUp.
	 *  
	 *  @throws ParseException if anything goes wrong
	 */
	public void signUp() {
	}

	/**
	 *  Logs the current user in. If successful, a session is created for this 
	 *  user which can be retrieved via {@link #getSessionToken()}.
	 *  
	 *  @throws ParseException if anything goes wrong.
	 */
	public void login() {
	}

	/**
	 *  Logs this user out if they were previously logged in, for example, 
	 *  via a {@link #signUp()} or {@link #login()} call.
	 *  
	 *  @throws ParseException if anything goes wrong.
	 */
	public void logout() {
	}

	/**
	 *  Serializes ParseUser-specific data in addition to regular ParseObject data.
	 * 
	 *  @param out The data stream to serialize to.
	 *  @throws IOException if any IO error occurs
	 *  @throws ParseException if the object is {@link #isDirty() dirty}
	 *  @see ParseObject#externalize(java.io.DataOutputStream) 
	 */
	@java.lang.Override
	public void externalize(java.io.DataOutputStream out) {
	}

	/**
	 *  Deserializes ParseUser-specific data in addition to regular ParseObject data.
	 *  
	 *  @param version The version of the previously serialized object (defaults to {@link ParseConstants#API_VERSION}).
	 *  @param in The data input stream to deserialize from.
	 *  @throws IOException if any IO error occurs
	 *  @see ParseObject#internalize(int, java.io.DataInputStream) 
	 */
	@java.lang.Override
	public void internalize(int version, java.io.DataInputStream in) {
	}

	@java.lang.Override
	public void setData(ca.weblite.codename1.json.JSONObject jsonObject) {
	}

	@java.lang.Override
	protected void validateSave() {
	}

	@java.lang.Override
	protected void performSave(command.ParseCommand command) {
	}

	protected void setSessionToken(String sessionToken) {
	}
}
