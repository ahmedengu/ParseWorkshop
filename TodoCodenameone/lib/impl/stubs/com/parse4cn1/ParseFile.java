package com.parse4cn1;


/**
 *  ParseFile is a local representation of a file that is saved to the Parse cloud.
 */
public class ParseFile implements Parse.IPersistable, com.codename1.io.Externalizable {

	/**
	 *  Creates a new file from a byte array, file name, and content type.
	 * 
	 *  @param name The local file name.
	 *  @param data The file data.
	 *  @param contentType The file content type specified as a MIME type.
	 */
	public ParseFile(String name, byte[] data, String contentType) {
	}

	/**
	 *  Creates a new file from a byte array. The content type will be inferred
	 *  from the file name extension if one is set or default to
	 *  application/octet-stream.
	 * 
	 *  @param data The file data.
	 */
	public ParseFile(byte[] data) {
	}

	/**
	 *  Creates a new file from a byte array and a name. The content type will be
	 *  inferred from the file name extension if one is set or default to
	 *  application/octet-stream.
	 * 
	 *  @param name The local file name.
	 *  @param data The file data.
	 */
	public ParseFile(String name, byte[] data) {
	}

	/**
	 *  Creates a new file from a byte array, and content type.
	 * 
	 *  @param data The file data.
	 *  @param contentType The file content type specified as a MIME type.
	 */
	public ParseFile(byte[] data, String contentType) {
	}

	/**
	 *  Creates a file without data.
	 * 
	 *  @param name The file name.
	 *  @param url The URL from which the file data can be retrieved.
	 */
	public ParseFile(String name, String url) {
	}

	/**
	 *  Creates a file with all null fields.
	 */
	public ParseFile() {
	}

	/**
	 *  @return A unique class name.
	 */
	public static String getClassName() {
	}

	public String getName() {
	}

	/**
	 *  Sets the file's name. Before save is called, this is just the filename 
	 *  given by the user (if any). After save is called, that name gets prefixed 
	 *  with a unique identifier.
	 *  
	 *  @param name The file name.
	 */
	public void setName(String name) {
	}

	public String getUrl() {
	}

	/**
	 *  Sets the URL of the uploaded Parse file. This URL will be used to retrieve 
	 *  the file's data.
	 *  
	 *  @param url The URL of the Parse file's data.
	 *  @see #getData() 
	 */
	public void setUrl(String url) {
	}

	public String getContentType() {
	}

	/**
	 *  Sets the content type associated with this file.
	 *  
	 *  @param contentType The content type to be set.
	 *  @see MimeType#getMimeType(java.lang.String)
	 */
	public void setContentType(String contentType) {
	}

	/**
	 *  Sets the data associated with this object which also causes the object to
	 *  become dirty.
	 *  
	 *  @param data The data to be set.
	 *  @see #isDirty() 
	 */
	public void setData(byte[] data) {
	}

	protected String getEndPoint() {
	}

	@java.lang.Override
	public boolean isDirty() {
	}

	@java.lang.Override
	public final void setDirty(boolean dirty) {
	}

	@java.lang.Override
	public boolean isDataAvailable() {
	}

	@java.lang.Override
	public void save() {
	}

	/**
	 *  Synchronously saves the file to the Parse cloud with 
	 *  progress notifications sent to the provided {@code progressCallback}.
	 *  
	 *  @param progressCallback The callback to retrieve progress notifications.
	 *  @throws ParseException if anything goes wrong while saving the file.
	 */
	public void save(callback.ProgressCallback progressCallback) {
	}

	/**
	 *  Synchronously gets the data for this object if no file data is present;
	 *  otherwise returns the data available for this object.
	 *  
	 *  @return The data associated with this object.
	 *  @throws ParseException if retrieving file data from the Parse cloud fails.
	 */
	public byte[] getData() {
	}

	/**
	 *  @see com.codename1.io.Externalizable
	 */
	public int getVersion() {
	}

	/**
	 *  @see com.codename1.io.Externalizable
	 */
	public void externalize(java.io.DataOutputStream out) {
	}

	/**
	 *  @see com.codename1.io.Externalizable
	 */
	public void internalize(int version, java.io.DataInputStream in) {
	}

	/**
	 *  @see com.codename1.io.Externalizable
	 */
	public String getObjectId() {
	}
}
