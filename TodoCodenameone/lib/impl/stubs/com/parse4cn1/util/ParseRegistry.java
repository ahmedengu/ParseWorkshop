package com.parse4cn1.util;


/**
 *  Defines a registry for ParseObject (sub-)classes to facilitate their 
 *  instantiation at runtime. 
 *  <p>
 *  Note that since CN1 does not support Java Reflection, 
 *  custom ParseObject sub-classes need to be manually registered here using
 *  {@link #registerParseFactory(java.lang.String, com.parse4cn1.Parse.IParseObjectFactory)}
 *  and {@link #registerSubclass(java.lang.Class, java.lang.String)}.
 */
public class ParseRegistry {

	public ParseRegistry() {
	}

	/**
	 *  Resets all registered class mappings.
	 *  <p>Note that registered externalizable classes are not deregistered as that 
	 *  is not supported.
	 */
	public static void reset() {
	}

	/**
	 *  Registers predefined Parse classes like _User and _Role so that they 
	 *  can be instantiated when needed.
	 */
	public static void registerDefaultSubClasses() {
	}

	/**
	 *  Registers all externalizable classes defined in the parse4cn1 library.
	 *  <p>
	 *  <b>Note: User-defined externalizable custom types stored in {@link ParseObject} or
	 *  any of its sub-classes <em>must</em> be 
	 *  {@link com.codename1.io.Util#register(java.lang.String, java.lang.Class) registered} 
	 *  by the user otherwise persistence of any ParseObject containing such custom types will fail.</b>
	 */
	public static void registerExternalizableClasses() {
	}

	/**
	 *  Registers the factory to be used to instantiate object of {@code className}.
	 *  @param className The name of the ParseObject sub-class to be associated with {@code factory}.
	 *  @param factory The factory to be used to instantiate objects of class {@code className}.
	 */
	public static void registerParseFactory(String className, com.parse4cn1.Parse.IParseObjectFactory factory) {
	}

	/**
	 *  Registers the ParseObject subclass associated with a given class name.
	 *  @param subclass The ParseObject subclass.
	 *  @param className The class name associated with {@code subClass}.
	 */
	public static void registerSubclass(Class subclass, String className) {
	}

	/**
	 *  Retrieves the class name associated with the provided ParseObject sub-class.
	 *  @param clazz A ParseObject sub-class.
	 *  @return The class name associated with {@code clazz} or null if none is defined.
	 */
	public static String getClassName(Class clazz) {
	}

	/**
	 *  Retrieves the object factory for instantiating objects of the class with 
	 *  the specified name.
	 *  
	 *  @param className The class name whose object factory is required.
	 *  @return The object factory for {@code className}. If none has been defined, the 
	 *  {@link DefaultParseObjectFactory} is returned.
	 */
	public static com.parse4cn1.Parse.IParseObjectFactory getObjectFactory(String className) {
	}
}
