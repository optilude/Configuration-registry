package com.deloitte.utils.configregistry;

/**
 * A place where configuration values may be looked up
 * from.
 */
public interface ConfigurationRegistry {

	/**
	 * Get a value from the registry
	 * @param key The string key of the configuration value.
	 * @return The value, or null if not found.
	 */
	public String getValue(String key);
	
	/**
	 * Get a value from the registry with a default value
	 * @param key The string key of the configuration value.
	 * @param defaultValue The value to return if the key is not found 
	 * @return The value, or defaultValue if not found
	 */
	public String getValue(String key, String defaultValue);
	
}
