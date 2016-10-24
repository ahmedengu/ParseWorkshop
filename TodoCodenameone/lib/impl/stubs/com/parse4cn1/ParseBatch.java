package com.parse4cn1;


/**
 *  This class enables issuing of batch requests.
 *  <p>
 *  Batching of requests helps reduce the amount of network round trips
 *  performed.
 */
public class ParseBatch {

	/**
	 *  Creates a new ParseBatch instance.
	 * 
	 *  @return The newly created object.
	 */
	public static ParseBatch create() {
	}

	/**
	 *  Adds an object to the batch to be {@link #execute() executed}.
	 * 
	 *  @param object The object to be added to the batch.
	 *  @param opType The type of operation to be performed on {@code object}.
	 *  @return {@code this} to enable chaining.
	 *  @throws ParseException if the object does not meet the constraints for
	 *  {@code opType}, for example, an objectId is required for
	 *  {@link EBatchOpType#UPDATE} and {@link EBatchOpType#DELETE} but should
	 *  not exist for {@link EBatchOpType#CREATE}. because it already has an
	 *  objectId.
	 */
	public ParseBatch addObject(ParseObject object, ParseBatch.EBatchOpType opType) {
	}

	/**
	 *  Adds multiple objects to the batch to be {@link #execute() executed}.
	 * 
	 *  @param objects The objects to be added to the batch.
	 *  @param opType The type of operation to be performed on ALL
	 *  {@code objects}.
	 *  @return {@code this} to enable chaining.
	 *  @throws ParseException if any of the objects does not meet the
	 *  constraints for {@code opType}, for example, an objectId is required for
	 *  {@link EBatchOpType#UPDATE} and {@link EBatchOpType#DELETE} but should
	 *  not exist for {@link EBatchOpType#CREATE}. because it already has an
	 *  objectId.
	 */
	public ParseBatch addObjects(java.util.Collection objects, ParseBatch.EBatchOpType opType) {
	}

	/**
	 *  Executes the batch operation. 
	 *  <p>
	 *  All ParseObjects in the batch for which the 
	 *  requested operation was successful will also be updated with the response 
	 *  received from the server.
	 * 
	 *  @return {@code true} if the all the operations in the batch are
	 *  successfully executed. This is the same value returned by
	 *  {@link #isSucceeded()}.
	 *  @throws ParseException if executing the batch operation itself fails, for
	 *  example due to batch size exceeding limit.
	 */
	public boolean execute() {
	}

	/**
	 *  Indicates the status of the batch operation.
	 * 
	 *  @return {@code true} if the requested command is successfully performed
	 *  on each object in the batch; otherwise returns {@code false}.
	 */
	public boolean isSucceeded() {
	}

	/**
	 *  Retrieves the error returned per ParseObject by the Parse server when the
	 *  batch was executed.
	 * 
	 *  @return A read-only map of all ParseObjects in the batch to result returned 
	 *  by the server. A null value indicates that the operation was successful 
	 *  for that key (ParseObject).
	 *  @throws ParseException if this method is invoked before {@link #execute()}.
	 */
	public java.util.Map getErrors() {
	}

	/**
	 *  An enumeration of batch operation types.
	 */
	public static final class EBatchOpType {


		public static final ParseBatch.EBatchOpType CREATE;

		public static final ParseBatch.EBatchOpType UPDATE;

		public static final ParseBatch.EBatchOpType DELETE;

		public static ParseBatch.EBatchOpType[] values() {
		}

		public static ParseBatch.EBatchOpType valueOf(String name) {
		}
	}
}
