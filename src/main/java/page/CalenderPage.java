package page;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DateTimeiFunctions;

public class CalenderPage extends GlobalFunctions {

	Logger log = LogManager.getLogger(CalenderPage.class);
	private WebDriver driver;
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public CalenderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='MuiPickersCalendarHeader-label css-1v994a0']")
	WebElement monthYearField;

	@FindBy(xpath = "//*[@title='Previous month']")
	WebElement previousMonthArrow;

	@FindBy(xpath = "//*[@title='Next month']")
	WebElement nextMonthArrow;

	public String year = "//*[text()='#']";

	public String date = "//*[text()='#']";

	public static String selectedDate, selectedMonth, monthYear, selectedYear;

	/**
	 * Verify field name
	 * 
	 * @param fieldName - expected name
	 */
	public void verifyFieldName(String fieldName) {
		String name = getXmlFilesData(fieldName);
		switch (fieldName) {
		case "current month year":
			String monthYear = dateTimeiFunctions.getCurrentMonthAndYear();
			verifyText(monthYearField, monthYear);
			break;
		case "month year":
			verifyText(monthYearField, name);
			break;
		default:
			log.info("***failed***");
			log.error("***error***");
			Assert.fail("invalid name");
			break;
		}
	}

	/**
	 * verify previous or next month arrow status
	 * 
	 * @param isEnabled - is in enabled state
	 * @param fieldName - previous or next month
	 */
	public void verifyPreviousAndNextMonthArrowState(String isEnabled, String fieldName) {
		switch (fieldName) {
		case "previous month":
			if (isEnabled.equals("disabled")) {
				Assert.assertTrue(
						String.format("previous month arrow status %s ", getAttribute(previousMonthArrow, "disabled")),
						"true".equals(getAttribute(previousMonthArrow, "disabled")));
			}
		case "next month":
			if (isEnabled.equals("disabled")) {
				Assert.assertTrue(
						String.format("next month arrow status %s ", getAttribute(nextMonthArrow, "disabled")),
						"true".equals(getAttribute(nextMonthArrow, "disabled")));
			}
		}

	}

	/**
	 * select Year, month and date from calender
	 * 
	 * @param fieldName - year, month, date
	 * @param value     - year value, month value date value
	 */
	public void selectYearDateMonth(String fieldName, String value) {
		String name = getXmlFilesData(value);
		switch (fieldName) {
		case "year":
			monthYear = getText(monthYearField);
			clickElement(monthYearField);
			String yearElement = year.replace("#", name);
			clickElement(driver.findElement(By.xpath(yearElement)));
			selectedYear = name;
			break;
		case "date":
			if (name.equals("current date")) {
				name = dateTimeiFunctions.getCurrentDate();
			}
			String dateElement = date.replace("#", name);
			clickElement(driver.findElement(By.xpath(dateElement)));
			selectedDate = name;
			break;
		case "month":
			monthYear = getText(monthYearField);
			String monYear[] = splitString(monthYear, " ");
			String month = monYear[0];
			int monthValue = dateTimeiFunctions.convertMonthStringToInteger(month);
			int expectedMonth = dateTimeiFunctions.convertMonthStringToInteger(name);
			int numberOfTimesClick = expectedMonth - monthValue;
			if (numberOfTimesClick < 0) {
				for (int i = numberOfTimesClick; i >= 0; i--) {
					clickElement(previousMonthArrow);
				}
			} else if (numberOfTimesClick > 0) {
				for (int i = 0; i < numberOfTimesClick; i++) {
					clickElement(nextMonthArrow);
				}
			}
			monthYear = getText(monthYearField);
			selectedMonth = name;
			break;
		}
	}

}
