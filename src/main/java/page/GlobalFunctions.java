package page;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseClass;
import utility.Constant;
import utility.ReadXml;

public class GlobalFunctions {

	WebDriver driver = BaseClass.getDriver();
	Logger log = LogManager.getLogger(GlobalFunctions.class);
	ReadXml readxml = new ReadXml();

	/**
	 * Click on element
	 * 
	 * @param element
	 */
	public void clickElement(WebElement element) {
		if (isExists(element)) {
			element.click();
		} else {
			Assert.fail(String.format("%s WebElement is not present", element));
		}
	}

	/**
	 * Verify element exists or not
	 * 
	 * @param element
	 * @return true or false
	 */
	public boolean isExists(WebElement element) {
		if (element.isDisplayed()) {
			log.info(String.format("Element is displayed %s", element));
			return true;
		} else {
			log.info(String.format("Element is not displayed %s", element));
			return false;
		}
	}

	/**
	 * Clear field value
	 * 
	 * @param element
	 */
	public void clearFieldData(WebElement element) {
		element.clear();
		log.info(String.format("Text in the field is cleard %s", element));
	}

	/**
	 * Enter value in a text field
	 * 
	 * @param element
	 * @param value
	 */
	public void enterValue(WebElement element, String value) {
		if (isExists(element)) {
			clearFieldData(element);
			element.sendKeys(value);
			log.info(String.format("Enter the value %s", value));
		} else {
			Assert.fail(String.format("Element is not displayed %s", element));
			log.error(String.format("Element is not displayed %s", element));
		}
	}

	/**
	 * Verify field name
	 * 
	 * @param element
	 * @param expectedText
	 */
	public void verifyText(WebElement element, String expectedText) {
		String actualText = element.getText();
		System.out.println("actualText " + actualText + " expectedText " + expectedText);
		log.info("actualText " + actualText + "|expectedText " + expectedText + "|");
		Assert.assertTrue(String.format("field text value actual text: %s expected text: %s", actualText, expectedText),
				actualText.equals(expectedText));
	}

	/**
	 * Get data from xml files if it is not there then keep the same data.
	 * 
	 * @param textValue - text which need to be search in xml files
	 * @return data - return if matched data from xml files otherwise feature file
	 *         text
	 */
	public String getXmlFilesData(String textValue) {
		String data = readxml.getFieldName(textValue);
		if (data == null) {
			data = readxml.getTestData(textValue);
		}
		if (data == null) {
			data = textValue;
		}
		log.info(String.format("text value is  %s", data));
		return data;
	}

	/**
	 * Wait until element attribute value display in mentioned time
	 * 
	 * @param element
	 * @param attribute
	 * @param attributeValue
	 * @param waitTime
	 * @return boolean value true or false
	 */
	public Boolean waitTillAttributeDisplay(WebElement element, String attribute, String attributeValue,
			Duration waitTime) {
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		try {
			log.info(
					String.format("wait for %s time of element %s attribute %s to load", waitTime, element, attribute));
			return wait.until(ExpectedConditions.attributeContains(element, attribute, attributeValue));
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Take screen shot and send it
	 * 
	 * @return in byte
	 * @throws IOException
	 */
	public byte[] getByteScreenshot() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = null;
		try {
			log.info("Taking screen shot....");
			fileContent = FileUtils.readFileToByteArray(src);
		} catch (IOException e) {
		}
		return fileContent;
	}

	/**
	 * Select from Drop down
	 * 
	 * @param element - drop down element
	 * @param value
	 * @param index
	 * @param text
	 */
	public void selectDropDownByValueIndexAndText(WebElement element, String value, String index, String text) {

		Select dropdown = new Select(element);
		if (value != null) {
			dropdown.selectByValue(value);
			log.info(String.format("Select drop down by value %s", value));
		} else if (text != null) {
			dropdown.selectByVisibleText(text);
			log.info(String.format("Select drop down by text %s", text));
		} else if (index != null) {
			dropdown.selectByIndex(Integer.valueOf(index));
			log.info(String.format("Select drop down by index %s", index));
		} else {
			log.error("Please select drop down by sending proper value or index or text");
			Assert.fail("invalid drop down option");
		}
	}

	/**
	 * Split the string using delimiter and store it in array
	 * 
	 * @param inputString
	 * @param delemiter
	 * @return
	 */
	public String[] splitString(String inputString, String delimiter) {
		String[] splitArray = inputString.split(delimiter);
		log.info("Splitting the string and storing in an array");
		return splitArray;
	}

	/**
	 * Get Text value
	 * 
	 * @param element
	 * @param expectedText
	 */
	public String getText(WebElement element) {
		String actualText = null;
		if (element != null) {
			actualText = element.getText();
			log.info("text value " + actualText);
		} else {
			log.error("invalid element " + element);
			Assert.fail("element not found " + element);
		}
		return actualText;
	}

	/**
	 * compare two string arraylist
	 * 
	 * @param expectedArrayList - first arraylist
	 * @param actualArrayList   - second arraylist
	 * @return true or false
	 */
	public boolean compareArrayList(List<String> expectedArrayList, List<String> actualArrayList) {
		boolean bool = false;
		if (expectedArrayList.size() != actualArrayList.size()) {
			log.info("Array list size is not equal");
			return bool;
		} else {
			return bool = expectedArrayList.equals(actualArrayList);
		}
	}

	/**
	 * compare array and arraylist data
	 * 
	 * @param expectedData - expected data in array format
	 * @param actualData   - actual data
	 * @return
	 */
	public boolean compareArrayAndList(String[] expectedData, List<String> actualData) {
		boolean elementsEqual = true;

		if (actualData.size() == expectedData.length) {
			for (int i = 0; i < actualData.size(); i++) {
				if (!actualData.get(i).equals(expectedData[i])) {
					log.info(String.format("actual data %s *** expected data ", actualData.get(i), expectedData[i]));
					elementsEqual = false;
					break;
				}
			}
		} else {
			log.info("Array and Array list size not equal");
			elementsEqual = false;
		}
		return elementsEqual;
	}

	/**
	 * Click mention arrow key
	 * 
	 * @param element  - webElement
	 * @param ArrowKey - Arrow key(Left, right, up or down)
	 */
	public void clickArrowKey(WebElement element, String ArrowKey) {
		Actions actions = new Actions(driver);
		if (ArrowKey.equals(Constant.RIGHT_ARROW)) {
			actions.sendKeys(element, Keys.ARROW_RIGHT).perform();
			log.info("moved toward right");
		}
	}

	/**
	 * Scroll scroll bar to mentioned direction
	 * 
	 * @param element   - WebElement
	 * @param pixel     - number pixel
	 * @param direction - direction
	 */
	public void scrollScrollBar(WebElement element, int pixel, String direction) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (direction.equals(Constant.RIGHT)) {
			js.executeScript("arguments[0].scrollBy(" + pixel + ", 0);", element);
			log.info(String.format("moved toward right for %s pixels ", pixel));
		} else if (direction.equals(Constant.DOWN)) {
			js.executeScript("arguments[0].scrollTop+=" + pixel + ";", element);
			log.info(String.format("moved toward down for %s pixels ", pixel));
		} else if (direction.equals(Constant.TOP)) {
			js.executeScript("arguments[0].scrollTop = 0;", element);
			log.info("moved to top of the element");
		} else if (direction.equals(Constant.LEFT)) {
			js.executeScript("arguments[0].scrollLeft -=" + pixel + ";", element);
			log.info(String.format("moved toward down for %s pixels ", pixel));
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Click on all the elements in list
	 * 
	 * @param elements
	 */
	public void clickOnAllElementsInList(List<WebElement> elements) {
		int elementsCount = elements.size();
		for (int x = 0; x < elementsCount; x++) {
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.info("Clicked on all the element in list");
		}
	}

	/**
	 * Click on mentioned number element in a list
	 * 
	 * @param elements
	 */
	public void clickOnPerticularListElement(List<WebElement> elements, int number) {
		WebElement element = elements.get(number);
		element.click();
		log.info("clicked on mentioned number element in list");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Generate random string
	 * 
	 * @param length - random string length
	 * @return String
	 */
	public String generateRandomString(int length) {
		log.info("Generating random string");
		// Create a Random object
		Random random = new Random();
		// Initialize a StringBuilder to store the random string
		StringBuilder stringBuilder = new StringBuilder(length);
		// Generate random characters and append them to the StringBuilder
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(Constant.CHARACTERS.length());
			char randomChar = Constant.CHARACTERS.charAt(randomIndex);
			stringBuilder.append(randomChar);
		}
		log.info("Generated random string");
		// Convert the StringBuilder to a String
		return stringBuilder.toString();

	}

	/**
	 * Click on element
	 * 
	 * @param element
	 */
	public void clickOnSearchElement(WebElement element) {
		element.click();
		log.info(String.format("%s Clicked on element ", element));
	}

	/**
	 * Scroll windows up or down
	 * 
	 * @param pixel - positive number for scroll down and negative number for scroll
	 *              up
	 */
	public void scrollUpOrDownWindows(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, " + pixel + ");");
		log.info(String.format("%s srolled the windows  ", pixel));
	}

	/**
	 * Click on element using javascript executor
	 * 
	 * @param element - element
	 */
	public void clickElementUsingJavascript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		log.info(String.format("%s clicked on element ", element));
	}

	/**
	 * Click on all the elements in list
	 * 
	 * @param elements
	 */
	public void getTextFromElementInListAndValidate(List<WebElement> elements, String text) {
		boolean found = false;
		int elementsCount = elements.size();
		for (int x = 0; x < elementsCount; x++) {
			System.out.println(x);
			WebElement element = elements.get(x);
			String textContent = element.getAttribute("textContent");
			System.out.println(textContent);
			System.out.println(text);
			if (textContent.equals(text)) {
				found = true;
				break;
			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		log.info("checked all the element in list");
		if (found == false) {
			Assert.fail(String.format("%s is not displaying", text));
		}
	}

	/**
	 * open new window(new tab)
	 */
	public void openNewWindow() {
		((JavascriptExecutor) driver).executeScript("window.open()");
		log.info("Open new window");
	}

	/**
	 * switch to mentioned number window
	 * 
	 * @param windowNumber
	 */
	public void switchWindow(int windowNumber) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(windowNumber));
	}

	/**
	 * Get the attribute value
	 * 
	 * @param element
	 * @param attribute
	 * @return
	 */
	public String getAttribute(WebElement element, String attribute) {
		String value = null;
		value = element.getAttribute(attribute);
		log.info(String.format("attribute value is %s", value));
		return value;

	}

	/**
	 * Sort the List in Ascending or Descending order
	 * 
	 * @param data     -> List
	 * @param sortType -> Ascending or Descending
	 * @return List
	 */
	public List<String> sortList(List<String> data, String sortType) {
		if (sortType.equals(Constant.ASCENDING)) {
			Collections.sort(data);
		} else {
			Collections.sort(data, Collections.reverseOrder());
		}
		return data;
	}

	/**
	 * Get the css property of the element
	 * 
	 * @param element      - WebElement
	 * @param propertyName -> Css property name
	 * @return
	 */
	public String getCssValue(WebElement element, String propertyName) {
		String value = null;
		if (isExists(element)) {
			value = element.getCssValue(propertyName);
		} else {
			Assert.fail(String.format("%s WebElement is not present", element));
		}
		return value;
	}

	/**
	 * compare two strings
	 * 
	 * @param actualText
	 * @param expectedText
	 */
	public void compareTwoString(String actualText, String expectedText) {
		Assert.assertTrue(
				String.format("actual text value: %s and expected text value is: %s", actualText, expectedText),
				actualText.equals(expectedText));
	}

	/**
	 * Verify field name
	 * 
	 * @param element
	 * @param expectedText
	 */
	public void verifyTextContent(WebElement element, String attribute, String expectedText) {
		String actualText = element.getAttribute(attribute);
		System.out.println("actualText " + actualText + " expectedText " + expectedText);
		log.info("actualText " + actualText + " expectedText " + expectedText);
		Assert.assertTrue(String.format("field text value actual text: %s expected text: %s", actualText, expectedText),
				actualText.equals(expectedText));
	}

	/**
	 * click on key board keys
	 * 
	 * @param element - Name of the element action take place
	 * @param keyName - keyboard keys
	 */
	public void clickOnKeyBoardKeys(WebElement element, String keyName) {
		if (keyName.equalsIgnoreCase(Constant.ENTER)) {
			element.sendKeys(Keys.ENTER);
			log.info("clicked on return key");
		}

	}

	/**
	 * get all the text from drop down list element
	 * 
	 * @param element
	 * @return list text
	 */
	public List<String> getAllTextFromListDropDown(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		List<String> rowData = new ArrayList<>();
		for (WebElement we : options) {
			rowData.add(getText(we));
		}
		return rowData;

	}

	/**
	 * verify element displayed or not
	 * 
	 * @param element
	 * @return
	 */
	public boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * Click on all the elements in list
	 * 
	 * @param elements
	 */
	public void getTextFromElementInListInMentionedPositionAndValidate(List<WebElement> elements, String text,
			int position) {
		boolean found = false;
		int elementsCount = elements.size();
		for (int x = 0; x < elementsCount; x++) {
			WebElement element = elements.get(x);
			String textContent = element.getAttribute("textContent");
			System.out.println(textContent);
			System.out.println(text);
			if (position == x) {
				if (element.getAttribute("textContent").equals(text)) {
					found = true;
					break;
				}
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		log.info("checked all the element in list");
		Assert.assertTrue(String.format("%s is not displaying", found), found);
	}

	/**
	 * Drag the element from source place to destination place
	 * 
	 * @param WebElement - fromElement
	 * @param WebElement - toElement
	 */
	public void dragAndDropElementFromToPlace(WebElement fromElement, WebElement toElement) {
		Actions builder = new Actions(driver);
		builder.dragAndDrop(fromElement, toElement).build().perform();
	}

	/**
	 * Click on all the elements in list
	 * 
	 * @param elements
	 */
	public String getTextFromElementInListInMentionedPosition(List<WebElement> elements, int position) {
		String textContent = null;
		int elementsCount = elements.size();
		for (int x = 0; x < elementsCount; x++) {
			WebElement element = elements.get(x);
			textContent = getText(element);
			System.out.println(textContent);
			if (position == x) {
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		log.info("checked all the element in list");
		return textContent;
	}

	/**
	 * get value from DOM property for element in a list and validate
	 * 
	 * @param elements
	 */
	public void getDomPropertyFromElementInListAndValidate(List<WebElement> elements, String property, String text) {
		boolean found = false;
		int elementsCount = elements.size();
		for (int x = 0; x < elementsCount; x++) {
			System.out.println(x);
			WebElement element = elements.get(x);
			String value = element.getDomProperty(property);
			System.out.println(value);
			System.out.println(text);
			if (value.equals(text)) {
				found = true;
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		log.info("checked all the element in list");
		if (found == false) {
			Assert.fail(String.format("%s is not displaying", text));
		}
	}

	/**
	 * enter data in mentioned number element in a list
	 * 
	 * @param elements -> elements in list
	 * @param number -> index
	 * @param value -> value
	 */
	public void enterDataOnPerticularListElement(List<WebElement> elements, int number, String value) {
		WebElement element = elements.get(number);
		if (isExists(element)) {
			clearFieldData(element);
			element.sendKeys(value);
			log.info(String.format("Enter the value %s", value));
		} else {
			Assert.fail(String.format("Element is not displayed %s", element));
			log.error(String.format("Element is not displayed %s", element));
		}
	}

}