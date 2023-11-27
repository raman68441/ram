package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * This class has the functionality for reading XML file data
 */
public class ReadXml {
	Logger log = LogManager.getLogger(ReadXml.class);
	public static String projectDirectory = System.getProperty("user.dir");

	/**
	 * Get the data from TestData.xml file
	 * 
	 * @param stringName - String name which has xml key
	 * @return testData - Key-> value
	 */
	public String getTestData(String stringName) {
		String testDataFilePath = String.format("%s/src/test/resources/data/TestData.xml", projectDirectory);
		String testData = getXmlFileData(testDataFilePath, stringName);
		log.info(String.format("Key:%s value: %s", stringName, testData));
		return testData;
	}

	/**
	 * Get the data from FieldName.xml file
	 * 
	 * @param stringName - String name which has xml key
	 * @return testData - Key-value
	 */
	public String getFieldName(String stringName) {
		String fieldNameFilePath = String.format("%s/src/test/resources/data/FieldName.xml", projectDirectory);
		System.out.println(fieldNameFilePath);
		String testData = getXmlFileData(fieldNameFilePath, stringName);
		log.info(String.format("Key:%s value: %s", stringName, testData));
		return testData;
	}

	/**
	 * Get XML File Data
	 * 
	 * @param fileName - file name
	 * @param keyName  - Key name
	 * @return text - key ->value
	 */
	public static String getXmlFileData(String fileName, String keyName) {
		String text = null;
		try {
			// Load the XML file
			File xmlFile = new File(fileName);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(xmlFile);
			Element rootElement = document.getDocumentElement();
			NodeList stringList = rootElement.getElementsByTagName("string");

			// Iterate through the <string> elements and extract the name and text content
			for (int i = 0; i < stringList.getLength(); i++) {
				Element stringElement = (Element) stringList.item(i);
				String name = stringElement.getAttribute("name");
				if (keyName.equals(name)) {
					text = stringElement.getTextContent();
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
}
