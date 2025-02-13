package page.config;

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

/*
 * This class explains about Activities screen functionality
 */
public class ActivitiesPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(ActivitiesPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public ActivitiesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Activities List']")
	WebElement activitiesList;

	@FindBy(xpath = "//*[text()='Activities']")
	WebElement activitiesTab;

	@FindBy(xpath = "//*[@role='tab' and text()='New Activity']")
	WebElement newActivity;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement activitiesTable;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String activitiesColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String activitiesData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newActivityLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Create']")
	WebElement createBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "activity_name")
	WebElement nameField;

	@FindBy(id = "activity_description")
	List<WebElement> descriptionAndSignatureField;

	@FindBy(xpath = "//*[text()='Electronic Signature:']")
	WebElement labelElectronicSignature;


	@FindBy(xpath = "//*[text()='Comments:']")
	WebElement labelComments;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input css-1m9pwf3']")
	List<WebElement> radioBtns;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-j5a1ma']")
	List<WebElement> labelYesNoLabel;

	@FindBy(xpath = "//*[text()='Yes']")
	List<WebElement> yesLabel;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	
	@FindBy(xpath = "//div[@class='MuiAlert-icon css-1l54tgj']/following-sibling::div[1]")
	WebElement activitiesMessage;

	@FindBy(xpath="//div[@class='MuiAlert-icon css-1l54tgj']/following-sibling::div[2]")
	WebElement activityMessageCloseIcon;

	@FindBy(xpath = "//*[text()='Name is required']")
	WebElement nameRequired;

	@FindBy(xpath = "//*[text()='Description is required']")
	WebElement descriptioneRequired;

	@FindBy(xpath = "//*[text()='Meaning of Signature is required']")
	WebElement meaningOfSignatureRequired;

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

	@FindBy(xpath = "//*[@id='root']/div[1]/div[3]/div/div[2]/div/div[1]/div/div[2]/p")
	WebElement editActivityHeader;

	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;

	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	@FindBy(xpath ="//button[text()='Reset Filter']")
	WebElement resetFilterBtn;
	
	@FindBy(xpath = "//*[@id='simple-tabpanel-0']/div/div[1]/div/div[5]/button")
	WebElement downloadBtn;

	@FindBy(id = "table-search")
	WebElement tableSearchField;

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-14349d1']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[@id='root']/div/div[3]")
	WebElement scrollPage;
	
	

	public String optionName = "//*[@role ='option' and @data-value='#']";

	public static String activityCreatedTime, activityUpdatedTime, activityDeletedTime, activityName,
			activityDescription, activitySignature;

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
		case "activities tab":
			verifyText(activitiesTab, name);
			break;
		case "activities list":
			waitTillAttributeDisplay(activitiesList, "role", "tab", Duration.ofSeconds(20));
			verifyText(activitiesList, name);
			break;
		case "new activity":
			verifyText(newActivity, name);
			break;
		case "label name":
		case "label description":
		case "label meaning of signature":
			getTextFromElementInListAndValidate(newActivityLabels, name);
			break;
		case "label electronic signature":
			verifyText(labelElectronicSignature, name);
			break;
		case "label comments":
			verifyText(labelComments, name);
			break;
		case "label yes in electronic signature":
			text = getTextFromElementInListInMentionedPosition(labelYesNoLabel, 0);
			compareTwoString(text, "Yes");
			break;
		case "label no in electronic signature":
			text = getTextFromElementInListInMentionedPosition(labelYesNoLabel, 1);
			compareTwoString(text, "No");
			break;
		case "label yes in comments":
			text = getTextFromElementInListInMentionedPosition(labelYesNoLabel, 2);
			compareTwoString(text, "Yes");
			break;
		case "label no in comments":
			text = getTextFromElementInListInMentionedPosition(labelYesNoLabel, 3);
			compareTwoString(text, "No");
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;		
		case "warning message name required":
			verifyText(nameRequired, name);
			break;
		case "warning message description required":
			verifyText(descriptioneRequired, name);
			break;
		case "warning message meaning of signature required":
			verifyText(meaningOfSignatureRequired, name);
			break;
		case "activity created successfully message":
		case "activity name is allready present message":
		case "activity updated successfully message":
			
			if (fieldName.contains("created")) {
				activityCreatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				activityUpdatedTime = dateTimeiFunctions.getCurrentTime();
			}
			verifyText(activitiesMessage, name);
			activityMessageCloseIcon.click();
			break;
		case "activities deleted message":
			text = name.replace("#", activityName);
			activityDeletedTime = dateTimeiFunctions.getCurrentTime();
			verifyText(activitiesMessage, text);
			break;
		case "confirm your delete":
			text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			compareTwoString(text, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit activities header":
			verifyText(editActivityHeader, name);
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
		case "create button":
			verifyText(createBtn, name);
			break;
		case "update":
			verifyText(updateBtn, name);
			break;
		case "no rows":
			verifyText(emptyTable, name);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify activities table column headers name
	 * 
	 * @param columnHeaders -activities column headers name
	 */
	public void verifyActivitesListTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(activitiesTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			 scrollScrollBar(activitiesTable, 17, Constant.RIGHT);
		}
		scrollScrollBar(activitiesTable, 300, Constant.LEFT);
		// compare expected and actual column headers
		log.info("activities column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("activities column headers displayed");
	
//		List<String> actualHeaders = getTableColumnHeaders(); // Method to retrieve column headers
//		System.out.println("Actual headers: " + actualHeaders);
//		List<String> expectedHeaders = Arrays.asList("Header1", "Header2", "Header3"); // Update as per your table
//
//	Assert.assertTrue("Header mismatch. Expected: " + expectedHeaders + " but was: " + actualHeaders,
//               actualHeaders.equals(expectedHeaders));

//	
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInActivitesTable() {

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
		case "activities tab":
			clickElement(activitiesTab);
			break;
		case "activities list":
			clickElement(activitiesList);
			break;
		case "new activity":
			clickElement(newActivity);
			break;
		case "cancel":
			//waitForElementToBeClickable(cancelBtn);
		
			waitTillAttributeDisplay(cancelBtn, "text", "Cancel", Duration.ofSeconds(30));
			clickElement(cancelBtn);
			break;
		
		case "update":
			clickElement(updateBtn);
			break;
		case "delete":
			clickElement(deleteBtn);
			break;
//		case "edit":
//			clickElement(editBtn);
//			break;
		case "edit":
			//waitForListElementsToBeVisible(editIcon);
		waitForElementToBeInisible(activitiesMessage);
			clickOnPerticularListElement(editIcon, 2);
			System.out.println("Edit list element is found.....");
			break;
		case "delete icon":
			//waitTillAttributeDisplay(deleteIcon, "data-testid", "DeleteOutlineOutlinedIcon", Duration.ofSeconds(30));
			//Thread.sleep(3000);
			waitForElementToBeInisible(activitiesMessage);
			clickOnPerticularListElement(deleteIcon, 2);
			break;
		case "reset filter":
			clickElement(resetFilterBtn);
			break;
		case "download":
			clickElement(downloadBtn);
			break;
		case "create":
			clickElement(createBtn);
			break;
		case "select field type option":
			clickElement(dropdownIcon);
			break;
		case "reset all":
			clickElement(resetFilterBtn);
			break;
		case "electronic signature yes":
			clickOnPerticularListElement(radioBtns,0);
			break;	
		case "comments yes":
			clickOnPerticularListElement(radioBtns,2);
			break;	
		case "electronic signature no":
			clickOnPerticularListElement(radioBtns,1);
			break;	
		case "comments no":
			clickOnPerticularListElement(radioBtns,3);
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
		case "name":
			if (activityName == null) {
				activityName = String.format("%s%s", fieldValue, generateRandomString(4));
			}
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, activityName);
			break;
		case "description":
			descriptionAndSignatureField.get(0).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterDataOnPerticularListElement(descriptionAndSignatureField, 0, fieldValue);
			activityDescription = fieldValue;
			break;
		case "meaning of signature":
			descriptionAndSignatureField.get(1).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterDataOnPerticularListElement(descriptionAndSignatureField, 1, fieldValue);
			activitySignature = fieldValue;
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text activity description")) {
				enterValue(tableSearchField, fieldValue);
			} else if(text.equals("text meaning of signature")) {
				enterValue(tableSearchField, fieldValue);
			}
			else {
				enterValue(tableSearchField, activityName);
			}
			break;
		case "edit name":
			activityName = String.format("%s%s", fieldValue, generateRandomString(7));
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, activityName);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in activities
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataFromTable(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] ActivitiesExpectedData = rowData.split("\\|");

		if (ActivitiesExpectedData[0].equals("##")) {
			ActivitiesExpectedData[0] = activityName;
		}
		if (ActivitiesExpectedData[4].equals("##")) {
			ActivitiesExpectedData[4] = dateTimeiFunctions.getCurrentMonthDateYear("-");
		}
		if (ActivitiesExpectedData[6].equals("#")) {
			ActivitiesExpectedData[6] = "";
		} else {
			ActivitiesExpectedData[6] = dateTimeiFunctions.getCurrentMonthDateYear("-");
		}
		if (ActivitiesExpectedData[7].equals("#")) {
			ActivitiesExpectedData[7] = "";
		}
		int columnLength = ActivitiesExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@data-rowindex='" + Integer.toString(rowNumber) + "']/..//*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			 scrollScrollBar(activitiesTable, 15, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, ActivitiesExpectedData));
		Assert.assertTrue(compareArrayAndList(ActivitiesExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromActivityPage(String data, String fieldName) {
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
			element = driver.findElement(By.xpath("//*[@role='option']/..//*[text()='Meaning of Signature']"));
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
				scrollScrollBar(activitiesTable, 2, Constant.DOWN);
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
				scrollScrollBar(activitiesTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(activitiesTable, 20, Constant.TOP);
	}

	/**
	 * Verify cell data in table
	 * 
	 * @param rowNumber
	 * @param columnNumber
	 * @param data
	 */
	public void verifyMentionedCellDataInTable(String data, int rowNumber, int columnNumber) {
		String rowData = null;
		if(data.equals("text activity name")) {
			rowData = activityName;
		} else {
		  rowData = getXmlFilesData(data);
		}
		
		String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber) + "']/..//*[@aria-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}

}
