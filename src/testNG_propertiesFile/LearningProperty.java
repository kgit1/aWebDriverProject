package testNG_propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class LearningProperty {

	// The Properties class represents a persistent set of properties. The
	// Properties can be saved to a stream or loaded from a stream. Each key and
	// its corresponding value in the property list is a string.
	Properties properties;

	@Test
	public void testProperties() throws IOException {
		// create stream to file with properties
		FileInputStream inStream = new FileInputStream(System.getProperty("user.dir") + "/testData/config.properties");
		// initialize properties object
		properties = new Properties();
		// load properties object with data from stream
		properties.load(inStream);

		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("version"));
	}
}
