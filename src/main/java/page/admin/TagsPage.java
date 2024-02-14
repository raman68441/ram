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

/**
 * This class explains about Tag functionality
 */
public class TagsPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(DateSelectionPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public TagsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Tag List']")
	WebElement tagList;

	@FindBy(xpath = "//*[text()='Tags']")
	WebElement tagsTab;

	@FindBy(xpath = "//*[@role='tab' and text()='New Tag ']")
	WebElement newBTag;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1grl8tv']")
	WebElement tagTable;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String tagListTableColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String tagCellData = "//*[@data-colindex='#']/*[@class='MuiDataGrid-cellContent']";
	
	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newTagLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "tName")
	WebElement tagNameField;

	@FindBy(id = "tCode")
	WebElement tagCodeField;

	@FindBy(id = "tDescription")
	WebElement tagDescriptionField;

	@FindBy(id = "Department")
	WebElement departmentField;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement tagMessage;

	@FindBy(xpath = "//*[text()='Name is required']")
	WebElement tagNameRequired;

	@FindBy(xpath = "//*[text()='Code is required']")
	WebElement tagCodeRequired;
	
	@FindBy(xpath = "//*[text()='Only alphanumeric characters are allowed']")
	WebElement onlyAlphaNumerictagCodeRequired;
	
	@FindBy(xpath = "//*[text()='Code must be at most 5 characters long']")
	WebElement tagCodeMustBeFiveCharacters;

	@FindBy(xpath = "//*[text()='Department is required']")
	WebElement departmentRequired;

	@FindBy(xpath = "//*[@role='option']")
	List<WebElement> option;

	@FindBy(xpath = "//*[@data-testid='ArrowDropDownIcon']")
	WebElement dropdownIcon;

	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiSelect-icon MuiSelect-iconOutlined css-1oxzkbe']")
	List<WebElement> dropdownIcons;

	@FindBy(xpath = "//*[@data-colindex='1']")
	List<WebElement> firstColumnData;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary PrivateSwitchBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary css-aqsgr9']")
	WebElement deactiveIcon;

	@FindBy(xpath = "//*[text()='Edit Tag']")
	WebElement ediTagHeader;

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

	public static String tagCreatedTime, tagUpdatedTime, tagDeletedTime, tagName, tagCode, tagDepartment,
			tagDescription;

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
		case "tags tab":
			verifyText(tagsTab, name);
			break;
		case "tag list":
			waitTillAttributeDisplay(tagList, "role", "tab", Duration.ofSeconds(20));
			verifyText(tagList, name);
			break;
		case "new tag":
			verifyText(newBTag, name);
			break;
		case "label tag name":
		case "label tag code":
		case "label tag description":
		case "label department":
			getTextFromElementInListAndValidate(newTagLabels, name);
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "warning message tag name required":
			verifyText(tagNameRequired, name);
			break;
		case "warning message tag code required":
			verifyText(tagCodeRequired, name);
			break;
		case "warning message tag code for special characters":
			verifyText(onlyAlphaNumerictagCodeRequired, name);
			break;
		case "warning message department required":
			verifyText(departmentRequired, name);
			break;
		case "warning message tag code more than 5 characters":
			verifyText(tagCodeMustBeFiveCharacters, name);
			break;
		case "tag created successfully message":
		case "tag name already exists message":
		case "tag updated successfully message":
		case "tag deleted successfully message":
			verifyText(tagMessage, name);
			if (fieldName.contains("created")) {
				tagCreatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				tagUpdatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("deleted"))
				tagDeletedTime = dateTimeiFunctions.getCurrentTime();
			break;
		case "confirm you delete":
			 text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			 compareTwoString(text, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit tag header":
			verifyText(ediTagHeader, name);
			break;
		case "search option default value":
			verifyText(tableSearchOption, name);
			break;
		case "table filter default value":
			verifyText(tableFilterOption, name);
			break;
		case "no rows":
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
	 * verify tag list table column headers name
	 * 
	 * @param columnHeaders -tag list table column headers name
	 */
	public void verifyTagTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(tagTable, "class", "MuiDataGrid-virtualScroller css-1grl8tv", Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			 scrollScrollBar(tagTable, 13, Constant.RIGHT);
		}
		// compare expected and actual column headers
		log.info("tag list table column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("tag list table column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInTagTable() {

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
		case "tags tab":
			clickElement(tagsTab);
			break;
		case "tag list":
			clickElement(tagList);
			break;
		case "new tag":
			clickElement(newBTag);
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
		case "tag name":
			if (tagName == null) {
				tagName = String.format("%s%s", fieldValue, generateRandomString(4));
			}
			tagNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(tagNameField, tagName);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "tag code":
			tagCodeField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(tagCodeField, fieldValue);
			tagCode = fieldValue;
			break;
		case "tag description":
			tagDescriptionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(tagDescriptionField, fieldValue);
			tagDescription = fieldValue;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text tag name")) {
				enterValue(tableSearchField, tagName);
			} else {
				enterValue(tableSearchField, fieldValue);
			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "edit tag name":
			tagName = String.format("%s%s", fieldValue, generateRandomString(7));
			tagNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(tagNameField, tagName);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in tag list table
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForTagListTable(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] tagExpectedData = rowData.split("\\|");
		if (tagExpectedData[0].equals("##")) {
			tagExpectedData[0] = tagName;
		}
		if (tagExpectedData[4].equals("##")) {
			tagExpectedData[4] = dateTimeiFunctions.getCurrentDateMonthNameYear();

		}
		if (tagExpectedData[6].equals("#")) {
			tagExpectedData[6] = "";
		}
		else {
			tagExpectedData[6] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (tagExpectedData[7].equals("#")) {
			tagExpectedData[7] = "";
		}
		int columnLength = tagExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@data-colindex='" + Integer.toString(i) + "']/*[@class='MuiDataGrid-cellContent']";		
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			scrollScrollBar(tagTable, 15, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, tagExpectedData));
		Assert.assertTrue(compareArrayAndList(tagExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromTagPage(String data, String fieldName) {
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
		case "department":
			clickElement(departmentField);
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
			tagDepartment = value;
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
				scrollScrollBar(tagTable, 2, Constant.DOWN);
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
				scrollScrollBar(tagTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(tagTable, 20, Constant.TOP);
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
