package page;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DateSelectionPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(DateSelectionPage.class);
	private WebDriver driver;

	public DateSelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='MuiPickersCalendarHeader-label css-1v994a0']")
	WebElement yearSelectionDropDown;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h4 MuiTypography-alignLeft MuiDatePickerToolbar-title css-l7p3qe']")
	WebElement dayMonthdateDisplay;
	
	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-overline css-1bzq5ag']")
	WebElement selectDateField;
	
	@FindBy(xpath = "//*[@data-testid='ArrowRightIcon']")
	WebElement rightArrow;

	@FindBy(xpath = "//*[@data-testid='ArrowRightIcon']")
	WebElement leftArrow;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='OK']")
	WebElement okBtn;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-caption MuiDayCalendar-weekDayLabel css-10qkmc3']")
	List<WebElement> calenderHeaders;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-4hx9aw']")
	List<WebElement> calenderDates;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin MuiPickersDay-today css-1s6sr8r']")
	WebElement todayDate;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiPickersDay-root Mui-selected MuiPickersDay-dayWithMargin css-4hx9aw']")
	WebElement selectedDate;

	public String selectYear = "//*[text()='#']";

	public String selectDate = "//*[text()='#']";

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		switch (fieldName) {
		case "cancel":
			clickElement(cancelBtn);
			break;
		case "ok":
			clickElement(okBtn);
			break;
		case "year":
			clickElement(yearSelectionDropDown);
			break;
		default:
			Assert.fail("failed");
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * select mentioned date month and year
	 * 
	 * @param dateMonthYear - date month year
	 */
	public void selectDateMonthYear(String dateMonthYear) {
		String[] data = splitString(dateMonthYear, " ");
		clickElement(yearSelectionDropDown);
		selectYear(data[2]);
		Integer selectMonth = Integer.valueOf(data[1]);
		String monthYear = getText(yearSelectionDropDown);
		String[] monthYears = splitString(monthYear, " ");
		String month = monthYears[0];
		int monthIndex = 0;
		switch (month) {
		case "January":
			monthIndex = 1;
			break;
		case "February":
			monthIndex = 2;
			break;
		case "March":
			monthIndex = 3;
			break;
		case "April":
			monthIndex = 4;
			break;
		case "May":
			monthIndex = 5;
			break;
		case "June":
			monthIndex = 6;
			break;
		case "July":
			monthIndex = 7;
			break;
		case "August":
			monthIndex = 8;
			break;
		case "September":
			monthIndex = 9;
			break;
		case "October":
			monthIndex = 10;
			break;
		case "November":
			monthIndex = 12;
			break;
		case "December":
			monthIndex = 12;
			break;
		}
		int monthDifference = selectMonth - monthIndex;
		if (monthDifference < 0) {
			for (int j = monthDifference; j == 0; j--) {
				clickElement(leftArrow);
			}
		} else if (monthDifference > 0) {
			for (int i = 0; i < monthDifference; i++) {
				clickElement(rightArrow);
			}
		}
		selectDate(data[0]);
	}

	/**
	 * select year
	 * 
	 * @param year
	 */
	public void selectYear(String year) {
		String expectedYear = selectYear.replace("#", year);
		WebElement element = driver.findElement(By.xpath(expectedYear));
		clickElement(element);
	}

	/**
	 * select date
	 * 
	 * @param date
	 */
	public void selectDate(String date) {
		String expectedDate = selectDate.replace("#", date);
		WebElement element = driver.findElement(By.xpath(expectedDate));
		clickElement(element);
	}

	/**
	 * Verify field name
	 * 
	 * @param fieldName - expected name
	 */
	public void verifyFieldName(String fieldName) {
		String name = getXmlFilesData(fieldName);
		switch (fieldName) {
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "ok":
			verifyText(okBtn, name);
			break;
		case "select date":
			verifyText(selectDateField, name);
			break;
		case "date":
			String text = getText(dayMonthdateDisplay);
			Assert.assertTrue(text.equals(name));
		}
	}
}
