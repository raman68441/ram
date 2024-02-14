package page.admin;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
import page.DateSelectionPage;
import page.GlobalFunctions;
import page.PaginationPage;
import utility.Constant;
import utility.DateTimeiFunctions;

public class BusinessUnitPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(DateSelectionPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public BusinessUnitPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Business Unit List']")
	WebElement businessUnitList;

	@FindBy(xpath = "//*[text()='Business Unit']")
	WebElement businessUnitTab;

	@FindBy(xpath = "//*[@role='tab' and text()='New Business Unit']")
	WebElement newBusinessUnit;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1grl8tv']")
	WebElement businessUnitTable;
	
	@FindBy(xpath ="//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String businessUnitColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String businessUnitData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newBusinessUnitLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(xpath = "//*[@name='businessUnitName']")
	WebElement businessUnitNameField;

	@FindBy(xpath = "//*[@name='businessUnitCode']")
	WebElement businessUnitCodeField;

	@FindBy(id = "organisation")
	WebElement organizationField;

	@FindBy(xpath = "//*[@name='address']")
	WebElement addressField;

	@FindBy(id = "location")
	WebElement countryField;

	@FindBy(id = "timezone")
	WebElement timeZoneField;

	@FindBy(id = "date")
	WebElement dateFormatField;

	@FindBy(id = "business_unit")
	WebElement businessUnit;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	WebElement confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement businessUnitMessage;

	@FindBy(xpath = "//*[text()='BusinessUnit Name is required']")
	WebElement businessUnitNameRequired;

	@FindBy(xpath = "//*[text()='BusinessUnit Code is required']")
	WebElement businessUnitCodeRequired;

	@FindBy(xpath = "//*[text()='Please select an organisation']")
	WebElement organisationRequired;

	@FindBy(xpath = "//*[text()='Please select a Location']")
	WebElement pleaseSelectLocation;

	@FindBy(xpath = "//*[text()='Please select a Time Zone']")
	WebElement pleaseSelectTimeZone;

	@FindBy(xpath = "//*[text()='Date Format is required']")
	WebElement dateFormatRequired;

	@FindBy(xpath = "//*[@role='option']")
	List<WebElement> option;

	@FindBy(xpath = "//*[@data-testid='ArrowDropDownIcon']")
	WebElement dropdownIcon;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiSelect-icon MuiSelect-iconOutlined css-1oxzkbe']")
	List<WebElement> dropdownIcons;
	
	@FindBy(id="organisation")
	WebElement organisationField;
	
	@FindBy(id="location")
	WebElement locationField;
	
	@FindBy(id="timezone")
	WebElement timezoneField;
	
	@FindBy(id="date")
	WebElement dateField;
	
	@FindBy(xpath = "//*[@data-colindex='1']")
	List<WebElement> firstColumnData;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary PrivateSwitchBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary css-aqsgr9']")
	WebElement deactiveIcon;

	@FindBy(xpath = "//*[text()='Edit Business Unit']")
	WebElement editBusinessUnitHeader;

	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;

	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-10uacdu']")
	WebElement resetFilterBtn;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-7c3c59']")
	WebElement downloadBtn;

	@FindBy(id = "table-search")
	WebElement tableSearchField;

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-11utb8v']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[@class='MuiBox-root css-hnbbyq']")
	WebElement scrollPage;

	public String optionName = "//*[@role ='option' and @data-value='#']";

	public static String businessUnitCreatedTime, businessUnitUpdatedTime, businessUnitDeletedTime, businessUnitName,
			businessUnitCode, organisationName, businessLocation, businessTimezone, businessDateFormat, businessAddress;

	/**
	 * verify the field name
	 * 
	 * @param fieldName
	 */
	public void verifyFieldName(String fieldName) {
		String name = getXmlFilesData(fieldName);
		WebElement element = null;
		String text = null;
		switch (fieldName) {
		case "business unit tab":
			verifyText(businessUnitTab, name);
			break;
		case "business unit list":
			waitTillAttributeDisplay(businessUnitList, "role", "tab", Duration.ofSeconds(20));
			verifyText(businessUnitList, name);
			break;
		case "new business unit":
			verifyText(newBusinessUnit, name);
			break;
		case "label business unit name":
		case "label business unit code":
		case "label organisation":
		case "label address":
		case "label country":
		case "label time zone":
		case "label date format":
			getTextFromElementInListAndValidate(newBusinessUnitLabels, name);
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "warning message business unit name required":
			verifyText(businessUnitNameRequired, name);
			break;
		case "warning message business unit code required":
			verifyText(businessUnitCodeRequired, name);
			break;
		case "warning message please select organisation":
			verifyText(organisationRequired, name);
			break;
		case "warning message please select location":
			verifyText(pleaseSelectLocation, name);
			break;
		case "warning message please select time zone":
			verifyText(pleaseSelectTimeZone, name);
			break;
		case "warning message date format required":
			verifyText(dateFormatRequired, name);
			break;
		case "Business Unit Created Successfully message":
		case "business unit already exist message":
		case "Business Unit updated message":
		case "Business Unit deleted message":
			verifyText(businessUnitMessage, name);
			if (fieldName.contains("created")) {
				businessUnitCreatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				businessUnitUpdatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("deleted"))
				businessUnitDeletedTime = dateTimeiFunctions.getCurrentTime();
			break;
		case "confirm you delete":
			verifyText(confirmDelete, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit business unit header":
			verifyText(editBusinessUnitHeader, name);
			break;
		case "search option default value":
			verifyText(tableSearchOption, name);
			break;
		case "table filter default value":
			verifyText(tableFilterOption, name);
			break;
		case "now rows":
			verifyText(emptyTable, name);
			break;
		case "download":
			verifyText(downloadBtn, name);
			break;
		case "reset filter":
			verifyText(resetFilterBtn, name);
			break;
		case "save button":
			verifyText(saveBtn, name);
			break;
		case "update":
			verifyText(updateBtn, name);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify business unit table column headers name
	 * 
	 * @param columnHeaders -business unit column headers name
	 */
	public void verifyBusinessUnitTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(businessUnitTable, "class", "MuiDataGrid-virtualScroller css-1grl8tv",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
		}
		// compare expected and actual column headers
		log.info("business unit column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("business unit column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInBusinessUnitTable() {

		scrollScrollBar(scrollPage, 5000, Constant.DOWN);
		int rowsInPage = Integer.valueOf(getText(paginationPage.rowsPerPage));
		int totalRecords = Integer.valueOf(paginationPage.totalNumberOfRecords);
		if (rowsInPage > totalRecords) {
			rowsInPage = totalRecords;
		}
		int NumberOfRowsINTable = firstColumnData.size();

		Assert.assertTrue(rowsInPage == NumberOfRowsINTable);
		scrollScrollBar(scrollPage, 5000, Constant.TOP);
	}

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		String name = fieldName.toLowerCase();
		switch (name) {
		case "business unit tab":
			clickElement(businessUnitTab);
			break;
		case "business unit list":
			clickElement(businessUnitList);
			break;
		case "new business unit":
			clickElement(newBusinessUnit);
			break;
		case "cancel":
			clickElement(cancelBtn);
			break;
		case "update":
			clickElement(updateBtn);
			break;
		case "delete":
			clickElement(deleteBtn);
			break;
		case "edit":
			clickOnPerticularListElement(editIcon, 0);
			break;
		case "delete icon":
			clickOnPerticularListElement(deleteIcon, 0);
			break;
		case "reset filter":
			clickElement(resetFilterBtn);
			break;
		case "download":
			clickElement(downloadBtn);
			break;
		case "save":
			clickElement(saveBtn);
			break;
		case "select field type option":
			clickElement(dropdownIcon);
			break;
		case "reset all":
			clickElement(resetFilterBtn);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * Enter value in field
	 * 
	 * @param value - value to be enter in text box
	 */
	public void enterValue(String text, String fieldName) {
		String fieldValue = getXmlFilesData(text);
		switch (fieldName) {
		case "business unit name":
			if (businessUnitName == null) {
				businessUnitName = String.format("%s%s", fieldValue, generateRandomString(4));
			}
			businessUnitNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(businessUnitNameField, businessUnitName);
			break;
		case "business unit code":
			businessUnitCodeField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(businessUnitCodeField, fieldValue);
			businessUnitCode = fieldValue;
			break;
		case "address":
			addressField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(addressField, fieldValue);
			businessAddress = fieldValue;
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text business unit description")) {
				enterValue(tableSearchField, fieldValue);
			} else {
				enterValue(tableSearchField, businessUnitName);
			}
			break;
		case "edit business name":
			businessUnitName = String.format("%s%s", fieldValue, generateRandomString(7));
			businessUnitNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(businessUnitNameField, businessUnitName);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in business unit
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForBusinessUnit(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] businessUnitExpectedData = rowData.split("\\|");
		if (businessUnitExpectedData[0].equals("##")) {
			businessUnitExpectedData[0] = Integer.toString(rowNumber);
		}
		if (businessUnitExpectedData[1].equals("##")) {
			businessUnitExpectedData[1] = businessUnitName;
		}
		if (businessUnitExpectedData[3].equals("#")) {
			businessUnitExpectedData[3] = "";
		}
		if (businessUnitExpectedData[4].equals("##")) {
			businessUnitExpectedData[4] = dateTimeiFunctions.getCurrentDateMonthNameYear();

		}
		int columnLength = businessUnitExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@data-rowindex='" + Integer.toString(rowNumber) + "']/..//*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			// scrollScrollBar(businessUnitTable, 10, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, businessUnitExpectedData));
		Assert.assertTrue(compareArrayAndList(businessUnitExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromBusinessUnitPage(String data, String fieldName) {
		String value = getXmlFilesData(data);
		WebElement element = null;
		String optionValue = null;
		switch (fieldName) {
		case "search option":
			clickElement(tableSearchOption);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//*[@role='option']/..//*[text()='" + value + "']"));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "table filter":
			clickElement(tableFilterOption);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//*[@data-value='" + value + "']"));
			clickElement(element);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			break;
		case "organization":
			clickElement(organisationField);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			optionValue = optionName.replace("#", value);
			element = driver.findElement(By.xpath(optionValue));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			organisationName = value;
			break;
		case "country":
			clickElement(locationField);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			optionValue = optionName.replace("#", value);
			element = driver.findElement(By.xpath(optionValue));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			businessLocation = value;
			break;
		case "time zone":
			clickElement(timezoneField);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			optionValue = optionName.replace("#", value);
			element = driver.findElement(By.xpath(optionValue));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			businessTimezone = value;
			break;
		case "date format":
			clickElement(dateField);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			optionValue = optionName.replace("#", value);
			element = driver.findElement(By.xpath(optionValue));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			businessTimezone = value;
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyActiveInactiveState(String activeOrInactiveRecords) {
		String status = "true";
		String actualStatus = null;
		if (activeOrInactiveRecords.equals("inactive")) {
			status = "false";
		}
		int totalRows = Integer.valueOf(getText(paginationPage.rowsPerPage));
		String nextPagestatus = (paginationPage.nextPageArrowField).getDomProperty("disabled");
		if (nextPagestatus.equals("false")) {
			for (int i = 1; i < totalRows; i++) {
				System.out.println("i= " + i);
				actualStatus = (activeInactiveTogleIcon.get(i)).getDomProperty("defaultChecked");
				Assert.assertTrue(actualStatus.equals(status));
				scrollScrollBar(businessUnitTable, 2, Constant.DOWN);
			}
		} else {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 1; i < paginationPage.getNumberRecordsInPage(); i++) {
				actualStatus = (activeInactiveTogleIcon.get(i)).getDomProperty("defaultChecked");
				System.out.println(actualStatus);
				Assert.assertTrue(actualStatus.equals(status));
				scrollScrollBar(businessUnitTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(businessUnitTable, 20, Constant.TOP);
	}

	/**
	 * Verify cell data in table
	 * 
	 * @param rowNumber
	 * @param columnNumber
	 * @param data
	 */
	public void verifyMentionedCellDataInTable(String data, int rowNumber, int columnNumber) {
		String rowData = getXmlFilesData(data);
		String rowItem = "//*[@data-rowindex='" + Integer.toString(rowNumber) + "']/..//*[@data-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}

}
