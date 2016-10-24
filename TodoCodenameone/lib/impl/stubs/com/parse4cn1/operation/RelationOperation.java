package com.parse4cn1.operation;


/**
 *  This class defines an operation to create or remove a relation between ParseObjects.
 *  @param <T> The type of ParseObject for which the relation operation is to be defined.
 */
public class RelationOperation implements ParseOperation {

	public RelationOperation(java.util.Set relations, RelationOperation.ERelationType relationType) {
	}

	public String getTargetClass() {
	}

	@java.lang.SuppressWarnings("unchecked")
	@java.lang.Override
	public Object apply(Object oldValue, com.parse4cn1.ParseObject parseObject, String key) {
	}

	@java.lang.Override
	public ca.weblite.codename1.json.JSONObject encode(com.parse4cn1.encode.IParseObjectEncodingStrategy objectEncoder) {
	}

	public static final class ERelationType {


		public static final RelationOperation.ERelationType AddRelation;

		public static final RelationOperation.ERelationType RemoveRelation;

		public static RelationOperation.ERelationType[] values() {
		}

		public static RelationOperation.ERelationType valueOf(String name) {
		}
	}
}
