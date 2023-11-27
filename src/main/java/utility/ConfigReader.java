package utility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class is for Configuration reader
 */
public class ConfigReader {
	private Properties prop;
	
	/**
	 * initializing the config.properties 
	 * @return properties
	 */
public Properties init_prop() {
	prop = new Properties();
	try {
		FileInputStream ip = new FileInputStream("./src/test/resources/Config/Config.properties");
		prop.load(ip);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return prop;
}
	
}
