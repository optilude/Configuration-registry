package com.deloitte.utils.configregistry;

import java.util.Properties;

/**
 * Implementation of the configuration registry which
 * returns values found in a java.util.Properties
 * 
 * @see also {@link PropertiesFileConfigurationRegistry}
 * 
 * @author optilude
 */
public class PropertiesConfigurationRegistry implements ConfigurationRegistry {
	
	/**
	 * File name for the properties file
	 */
	private Properties properties;
	
	public PropertiesConfigurationRegistry(Properties properties) {
		this.properties = properties;
	}
	
	public Properties getProperties() {
		return properties;
	}
	
	// Implementation of ConfigurationRegistry
	
	public String getValue(String key) {
		return properties.getProperty(key);
	}
	
	public String getValue(String key, String defaultValue) {
		return properties.getProperty(key, defaultValue);
	}
	
}
