package com.parse4cn1;


/**
 *  The ParseQuery class defines a query that is used to fetch ParseObjects.
 * 
 *  @param <T> The type of the class associated with this query.
 */
public class ParseQuery {

	/**
	 *  Creates a ParseQuery for the specified sub-class. For this approach to
	 *  work, {@code subclass} needs to have been registered via
	 *  {@link ParseRegistry#registerSubclass(java.lang.Class, java.lang.String)}.
	 * 
	 *  @param <T> The type of the class to be associated with the newly created
	 *  query.
	 *  @param subclass The ParseObject subclass type.
	 *  @return The newly created ParseQuery.
	 */
	public static ParseQuery getQuery(Class subclass) {
	}

	/**
	 *  Creates a ParseQuery for the ParseObject sub-class with the specified
	 *  name..
	 * 
	 *  @param <T> The type of the class to be associated with the newly created
	 *  query.
	 *  @param className The ParseObject subclass name.
	 *  @return The newly created ParseQuery.
	 */
	public static ParseQuery getQuery(String className) {
	}

	/**
	 *  Create a ParseQuery whose where-clause is the disjunction of the 
	 *  where-clauses of the provided {@code queries}.
	 *  
	 *  @param <T> The type of the class to be associated with the newly created
	 *  query.
	 *  @param queries A collection of at least two queries to be combined. Each 
	 *  of these queries must have a non-empty 'where' clause and have the same class.
	 *  @return The newly created ParseQuery.
	 *  @throws ParseException if the {@code queries} are not at least two, any 
	 *  of them is missing a where-clause, or the target class is different.
	 */
	public static ParseQuery getOrQuery(java.util.Collection queries) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value to
	 *  be equal to the provided value.
	 * 
	 *  @param key The key to check.
	 *  @param value The value that the ParseObject must contain.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereEqualTo(String key, Object value) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value to
	 *  be less than the provided value.
	 * 
	 *  @param key The key to check.
	 *  @param value The value that provides an upper bound.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereLessThan(String key, Object value) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value to
	 *  be not equal to the provided value.
	 * 
	 *  @param key The key to check.
	 *  @param value The value that must not be equalled.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereNotEqualTo(String key, Object value) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value to
	 *  be greater than the provided value.
	 * 
	 *  @param key The key to check.
	 *  @param value The value that provides a lower bound.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereGreaterThan(String key, Object value) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value to
	 *  be less than or equal to the provided value.
	 * 
	 *  @param key The key to check.
	 *  @param value The value that provides an upper bound.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereLessThanOrEqualTo(String key, Object value) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value to
	 *  be greater than or equal to the provided value.
	 * 
	 *  @param key The key to check.
	 *  @param value The value that provides a lower bound.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereGreaterThanOrEqualTo(String key, Object value) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value to
	 *  be contained in the provided list of values.
	 * 
	 *  @param key The key to check.
	 *  @param values The values that will match.
	 *  @return {@code this} object so that calls can be chained.
	 */
	@java.lang.SuppressWarnings({"unchecked", "rawtypes"})
	public ParseQuery whereContainedIn(String key, java.util.Collection values) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value not
	 *  to be contained in the provided list of values.
	 * 
	 *  @param key The key to check.
	 *  @param values The values that will not match.
	 *  @return {@code this} object so that calls can be chained.
	 */
	@java.lang.SuppressWarnings({"unchecked", "rawtypes"})
	public ParseQuery whereNotContainedIn(String key, java.util.Collection values) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value to
	 *  contain every one of the provided list of values.
	 *  <p>
	 *  This only works on keys whose values are of array type.
	 * 
	 *  @param key The key to check. This key's value must be an array.
	 *  @param values The values that will match.
	 *  @return {@code this} object so that calls can be chained.
	 */
	@java.lang.SuppressWarnings({"unchecked", "rawtypes"})
	public ParseQuery whereContainsAll(String key, java.util.Collection values) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value
	 *  match another ParseQuery.
	 *  <p>
	 *  This only works on keys whose values are ParseObjects or lists of
	 *  ParseObjects.
	 * 
	 *  @param key The key to check.
	 *  @param query The query that the value should match.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereMatchesQuery(String key, ParseQuery query) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value does
	 *  not match another ParseQuery.
	 *  <p>
	 *  This only works on keys whose values are ParseObjects or lists of
	 *  ParseObjects.
	 * 
	 *  @param key The key to check.
	 *  @param query The query that the value should not match
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereDoesNotMatchQuery(String key, ParseQuery query) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value
	 *  matches a value for a key in the results of another ParseQuery.
	 * 
	 *  @param key The key whose value is being checked.
	 *  @param keyInQuery The key in the objects from the sub query to look in.
	 *  @param query The nested query to run.
	 *  @return {@code this} object so that calls can be chained.
	 *  @throws ParseException if something goes wrong with creating the
	 *  constraint.
	 */
	public ParseQuery whereMatchesKeyInQuery(String key, String keyInQuery, ParseQuery query) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's value does
	 *  not match any value for a key in the results of another ParseQuery.
	 * 
	 *  @param key The key whose value is being checked and excluded.
	 *  @param keyInQuery The key in the objects from the sub query to look in.
	 *  @param query The nested query to run.
	 *  @return {@code this} object so that calls can be chained.
	 *  @throws ParseException if something goes wrong with creating the
	 *  constraint.
	 */
	public ParseQuery whereDoesNotMatchKeyInQuery(String key, String keyInQuery, ParseQuery query) {
	}

	/**
	 *  Add a proximity based constraint for finding objects with key point
	 *  values near the point given.
	 * 
	 *  @param key The key that the ParseGeoPoint is stored in.
	 *  @param point The reference ParseGeoPoint that is used.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereNear(String key, ParseGeoPoint point) {
	}

	/**
	 *  Add a proximity-based constraint for finding objects with key point
	 *  values near the point given and within the maximum distance given.
	 *  <p>
	 *  Radius of earth used is 3958.8 miles.
	 * 
	 *  @param key The key that the ParseGeoPoint is stored in.
	 *  @param point The reference ParseGeoPoint that is used.
	 *  @param maxDistance Maximum distance (in miles) of results to return.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereWithinMiles(String key, ParseGeoPoint point, double maxDistance) {
	}

	/**
	 *  Add a proximity-based constraint for finding objects with key point
	 *  values near the point given and within the maximum distance given.
	 *  <p>
	 *  Radius of earth used is 6371.0 kilometers.
	 * 
	 *  @param key The key that the ParseGeoPoint is stored in.
	 *  @param point The reference ParseGeoPoint that is used.
	 *  @param maxDistance Maximum distance (in kilometers) of results to return.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereWithinKilometers(String key, ParseGeoPoint point, double maxDistance) {
	}

	/**
	 *  Add a proximity based constraint for finding objects with key point
	 *  values near the point given and within the maximum distance given.
	 * 
	 *  @param key The key that the ParseGeoPoint is stored in.
	 *  @param point The reference ParseGeoPoint that is used.
	 *  @param maxDistance Maximum distance (in radians) of results to return.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereWithinRadians(String key, ParseGeoPoint point, double maxDistance) {
	}

	/**
	 *  Add a constraint to the query that requires a particular key's
	 *  coordinates be contained within a given rectangular geographic bounding
	 *  box.
	 * 
	 *  @param key The key to be constrained.
	 *  @param southwest The lower-left inclusive corner of the box.
	 *  @param northeast The upper-right inclusive corner of the box.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereWithinGeoBox(String key, ParseGeoPoint southwest, ParseGeoPoint northeast) {
	}

	/**
	 *  Add a regular expression constraint for finding string values that match
	 *  the provided regular expression.
	 *  <p>
	 *  This may be slow for large datasets.
	 * 
	 *  @param key The key that the string to match is stored in.
	 *  @param regex The regular expression pattern to match.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereMatches(String key, String regex) {
	}

	/**
	 *  Add a regular expression constraint for finding string values that match
	 *  the provided regular expression.
	 *  <p>
	 *  This may be slow for large datasets.
	 * 
	 *  @param key The key that the string to match is stored in.
	 *  @param regex The regular expression pattern to match.
	 *  @param modifiers Any of the following supported PCRE modifiers:
	 *  <br>i - Case insensitive search
	 *  <br>m - Search across multiple lines of input
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereMatches(String key, String regex, String modifiers) {
	}

	/**
	 *  Add a constraint for finding string values that contain a provided
	 *  string. A case-sensitive comparison is performed by default. Use
	 *  {@link #setCaseSensitive(boolean)} to change that before calling this
	 *  method.
	 *  <p>
	 *  This will be slow for large datasets.
	 * 
	 *  @param key The key that the string to match is stored in.
	 *  @param substring The substring that the value must contain.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereContains(String key, String substring) {
	}

	/**
	 *  Add a constraint for finding string values that start with a provided
	 *  string. A case-sensitive comparison is performed by default. Use
	 *  {@link #setCaseSensitive(boolean)} to change that before calling this
	 *  method.
	 *  <p>
	 *  This query will use the backend index, so it will be fast even for large
	 *  datasets.
	 * 
	 *  @param key The key that the string to match is stored in.
	 *  @param prefix The substring that the value must start with.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereStartsWith(String key, String prefix) {
	}

	/**
	 *  Add a constraint for finding string values that end with a provided
	 *  string. A case-sensitive comparison is performed by default. Use
	 *  {@link #setCaseSensitive(boolean)} to change that before calling this
	 *  method.
	 *  <p>
	 *  This will be slow for large datasets.
	 * 
	 *  @param key The key that the string to match is stored in.
	 *  @param suffix The substring that the value must end with.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereEndsWith(String key, String suffix) {
	}

	/**
	 *  Add a constraint for finding objects that contain the given key.
	 * 
	 *  @param key The key that should exist.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereExists(String key) {
	}

	/**
	 *  Add a constraint for finding objects that do not contain a given key.
	 * 
	 *  @param key The key that should not exist.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereDoesNotExist(String key) {
	}

	/**
	 *  Add a constraint for finding objects that are related to {@code parent}
	 *  by the given {@code key}.
	 * 
	 *  @param parent The ParseObject to be used in the relation.
	 *  @param key The key that should be used in the relation.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery whereRelatedTo(ParseObject parent, String key) {
	}

	/**
	 *  Include nested ParseObjects for the provided key.
	 *  <p>
	 *  Use dot notation to specify which fields in the included object that are
	 *  also fetched.
	 * 
	 *  @param key The key that should be included.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery include(String key) {
	}

	/**
	 *  Sorts the results in ascending order by the given key.
	 *  <p>
	 *  <b>Note:</b> {@code key} overrides any previous ordering criteria!
	 *  Use {@link #addAscendingOrder(java.lang.String)} or 
	 *  {@link #addDescendingOrder(java.lang.String)} to concatenate ordering criteria.
	 * 
	 *  @param key The key to order by.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery orderByAscending(String key) {
	}

	/**
	 *  Also sorts the results in ascending order by the given key.
	 *  <p>
	 *  The previous sort keys have precedence over this key.
	 * 
	 *  @param key The key to order by.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery addAscendingOrder(String key) {
	}

	/**
	 *  Sorts the results in descending order by the given key.
	 *  <p>
	 *  <b>Note:</b> {@code key} overrides any previous ordering criteria!
	 *  Use {@link #addAscendingOrder(java.lang.String)} or 
	 *  {@link #addDescendingOrder(java.lang.String)} to concatenate ordering criteria.
	 * 
	 *  @param key The key to order by.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery orderByDescending(String key) {
	}

	/**
	 *  Also sorts the results in descending order by the given key.
	 *  <p>
	 *  The previous sort keys have precedence over this key.
	 * 
	 *  @param key The key to order by.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery addDescendingOrder(String key) {
	}

	/**
	 *  Controls the maximum number of results that are returned.
	 *  <p>
	 *  Setting a negative limit denotes retrieval without a limit. The default
	 *  limit is 100, with a maximum of 1000 results being returned at a time.
	 * 
	 *  @param newLimit The new limit.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery setLimit(int newLimit) {
	}

	/**
	 *  Determines whether string constraints should be case-sensitive (default)
	 *  or case-insensitive.
	 * 
	 *  @param caseSensitive The new case sensitivity.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery setCaseSensitive(boolean caseSensitive) {
	}

	/**
	 *  Accessor for the limit.
	 * 
	 *  @return The limit value.
	 */
	public int getLimit() {
	}

	/**
	 *  Controls the number of results to setSkip before returning any results.
	 *  <p>
	 *  This is useful for pagination. Default is to setSkip zero results.
	 * 
	 *  @param newSkip The new setSkip.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery setSkip(int newSkip) {
	}

	/**
	 *  Accessor for the setSkip.
	 * 
	 *  @return The setSkip value.
	 */
	public int getSkip() {
	}

	/**
	 *  Accessor for the class name.
	 * 
	 *  @return The class name.
	 */
	public String getClassName() {
	}

	/**
	 *  Accessor for the included nested ParseObjects.
	 * 
	 *  @return The keys of the included nested ParseObjects.
	 */
	public java.util.List getIncludes() {
	}

	/**
	 *  Restrict the fields of returned ParseObjects to only include the provided
	 *  keys.
	 *  <p>
	 *  If this is called multiple times, then all of the keys specified in each
	 *  of the calls will be included.
	 * 
	 *  @param keys The set of keys to include in the result.
	 *  @return {@code this} object so that calls can be chained.
	 */
	public ParseQuery selectKeys(java.util.Collection keys) {
	}

	/**
	 *  Constructs a ParseObject whose id is already known by fetching data from
	 *  the source.
	 *  <p>
	 *  <b>Note:</b> This mutates the ParseQuery.
	 * 
	 *  @param objectId Object id of the ParseObject to fetch.
	 *  @return The first object returned found with {@code objectId} or
	 *  {@code null} if none is found. <b>Note that this deviates from the 
	 *  corresponding Parse Android API method where an exception is thrown when  
	 *  there is no such object.</b>
	 *  @throws ParseException if anything goes wrong.
	 *  @see <a href="http://www.parse.com/docs/android/api/com/parse/ParseQuery.html#get(java.lang.String)">Parse Android API get() method</a>
	 */
	public ParseObject get(String objectId) {
	}

	/**
	 *  Retrieves a list of ParseObjects that satisfy this query.
	 * 
	 *  @return A list of the ParseObjects matching the query or an empty list if
	 *  none is found. <b>Note that this deviates from the 
	 *  corresponding Parse Android API method where an exception is thrown when 
	 *  the query returns no results.</b>
	 *  @throws ParseException if anything goes wrong.
	 *  @see <a href="http://www.parse.com/docs/android/api/com/parse/ParseQuery.html#find()">Parse Android API find() method</a>
	 */
	public java.util.List find() {
	}

	/**
	 *  Encodes this query as a JSON object.
	 * 
	 *  @return The JSONObject corresponding to this query.
	 *  @throws ParseException if anything goes wrong with the conversion to
	 *  JSON.
	 */
	public ca.weblite.codename1.json.JSONObject encode() {
	}

	/**
	 *  Counts the number of objects that match this query.
	 * 
	 *  @return The number of objects matching this query.
	 *  @throws ParseException if anything goes wrong.
	 */
	public int count() {
	}

	/**
	 *  Returns a literal pattern String for the specified String.
	 *  <p>
	 *  This method produces a String that can be used to getQuery a Pattern that
	 *  would match the string s as if it were a literal pattern.
	 *  <p>
	 *  Metacharacters or escape sequences in the input sequence will be given no
	 *  special meaning.
	 *  <p>
	 *  <b>Note:</b> CN1 does not support {@link java.util.regex} and the
	 *  substitute CN1 regex class does not have this
	 *  method. Hence this replacement from <a
	 *  href="http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/regex/Pattern.java#Pattern.quote%28java.lang.String%29">openjdk</a>.
	 * 
	 *  @param s The string to be literalized.
	 *  @return A literal string replacement.
	 */
	public static String quote(String s) {
	}

	/**
	 *  This class defines a relation constraint that is used when specifying
	 *  many-to-many relations.
	 */
	public class RelationConstraint {


		/**
		 *  Constructors a relation constraint with the provided {@code key} and
		 *  {@code object}.
		 * 
		 *  @param key The key associated with this relation.
		 *  @param object The ParseObject associated with this relation.
		 */
		public RelationConstraint(String key, ParseObject object) {
		}

		/**
		 *  Accessor for the relation's key.
		 * 
		 *  @return The key.
		 */
		public String getKey() {
		}

		/**
		 *  Accessor for the relation's object.
		 * 
		 *  @return The object.
		 */
		public ParseObject getObject() {
		}

		/**
		 *  Accessor for the ParseRelation associated with this relation
		 *  constraint.
		 * 
		 *  @return The ParseRelation.
		 */
		public ParseRelation getRelation() {
		}

		/**
		 *  Encodes this relation constraint in JSON.
		 * 
		 *  @param objectEncoder The encoder to be used for the encoding.
		 *  @return This relation constraint encoded as a JSON object.
		 *  @throws ParseException if anything goes wrong.
		 */
		public ca.weblite.codename1.json.JSONObject encode(encode.IParseObjectEncodingStrategy objectEncoder) {
		}
	}
}
