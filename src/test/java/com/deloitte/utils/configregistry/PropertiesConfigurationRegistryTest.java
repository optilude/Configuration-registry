package com.deloitte.utils.configregistry;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class PropertiesConfigurationRegistryTest {
	
	@Test
	public void testGetValue() {
		Properties props = new Properties();
		props.setProperty("foo", "bar");
		
		PropertiesConfigurationRegistry registry = new PropertiesConfigurationRegistry(props);
		
		Assert.assertEquals("bar", registry.getValue("foo"));
	}
	
	@Test
	public void testGetValueNotFound() {
		Properties props = new Properties();
		props.setProperty("foo", "bar");
		
		PropertiesConfigurationRegistry registry = new PropertiesConfigurationRegistry(props);
		
		Assert.assertNull(registry.getValue("bar"));
	}
	
	@Test
	public void testGetValueDefault() {
		Properties props = new Properties();
		props.setProperty("foo", "bar");
		
		PropertiesConfigurationRegistry registry = new PropertiesConfigurationRegistry(props);
		
		Assert.assertEquals("bar", registry.getValue("foo", "baz"));
	}
	
	@Test
	public void testGetValueDefaultNotFound() {
		Properties props = new Properties();
		props.setProperty("foo", "bar");
		
		PropertiesConfigurationRegistry registry = new PropertiesConfigurationRegistry(props);
		
		Assert.assertEquals("baz", registry.getValue("bar", "baz"));
	}
	
}
