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
import page.GlobalFunctions;
import page.PaginationPage;
import utility.Constant;
import utility.DateTimeiFunctions;

/**
 * This class has System data fields types functionality
 */
public class SystemDataFieldsTypesPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(SystemDataFieldsTypesPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public SystemDataFieldsTypesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='System Data Fields Type List']")
	WebElement systemDataFieldsTypeList;

	@FindBy(xpath = "//*[text()='System Data Fields Types']")
	WebElement systemDataFieldsTypesTab;

	@FindBy(xpath = "//*[@role='tab' and text()='New System Data Field Types']")
	WebElement newsystemDataFieldsType;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement systemDataFieldsTypesTable;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String systemDataFieldsTypesTableColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String systemDataFieldsTypesTableData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newsystemDataFieldsTypesLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

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

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement systemDataFieldsTypeMessage;

	@FindBy(xpath = "//*[text()= Name is required']")
	WebElement nameRequired;

	@FindBy(xpath = "//*[text()='Description is required']")
	WebElement descriptioneRequired;

	@FindBy(xpath = "//*[text()='Meaning OfS ignature is Required']")
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

	@FindBy(xpath = "//*[text()='Edit System Data Fields Types']")
	WebElement editSystemDataFieldsTypesHeader;

	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;

	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-10uacdu']")
	WebElement resetFilterBtn;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-7c3c59']")
	WebElement downloadBtn;

	@FindBy(id = "table-search")
	WebElement tableSearchField;

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-14349d1']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[@class='MuiBox-root css-f0fbul']")
	WebElement scrollPage;

	public String optionName = "//*[@role ='option' and @data-value='#']";
	
	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	public static String systemDataFieldsTypeCreatedTime, systemDataFieldsTypeUpdatedTime, systemDataFieldsTypeDeletedTime, systemDataFieldsTypeName,
	systemDataFieldsTypeDescription;
	

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
		case "system data fields types tab":
			verifyText(systemDataFieldsTypesTab, name);
			break;
		case "system data fields type list":
			waitTillAttributeDisplay(systemDataFieldsTypeList, "role", "tab", Duration.ofSeconds(20));
			verifyText(systemDataFieldsTypeList, name);
			break;
		case "new system data fields type":
			verifyText(newsystemDataFieldsType, name);
			break;
		case "label name":
		case "label description":
		case "label meaning of signature":
			getTextFromElementInListAndValidate(newsystemDataFieldsTypesLabels, name);
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
		case "system data field type created successfully message":
		case "system data field type is allready present message":
		case "system data field type updated successfully message":
		case "system data field type deleted message":		
			if (fieldName.contains("created")) {
				systemDataFieldsTypeCreatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				systemDataFieldsTypeUpdatedTime = dateTimeiFunctions.getCurrentTime();
			}else if (fieldName.contains("delete")) {
				systemDataFieldsTypeDeletedTime = dateTimeiFunctions.getCurrentTime();
			}
			break;
		case "confirm you delete":
			text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			compareTwoString(text, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit system data fields types header":
			verifyText(editSystemDataFieldsTypesHeader, name);
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
	 * verify system data field type table column headers name
	 * 
	 * @param columnHeaders -System data fields types column headers name
	 */
	public void verifySystemDataFieldsTypeListTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(systemDataFieldsTypesTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			 scrollScrollBar(systemDataFieldsTypesTable, 17, Constant.RIGHT);
		}
		scrollScrollBar(systemDataFieldsTypesTable, 300, Constant.LEFT);
		// compare expected and actual column headers
		log.info("System data fields types column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("System data fields types column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInSystemDataFieldsTypesTable() {

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
		case "system data fields types tab":
			clickElement(systemDataFieldsTypesTab);
			break;
		case "system data fields type list":
			clickElement(systemDataFieldsTypeList);
			break;
		case "new system data fields type":
			clickElement(newsystemDataFieldsType);
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
			if ( systemDataFieldsTypeName == null) {
				systemDataFieldsTypeName = String.format("%s%s", fieldValue, generateRandomString(4));
			}
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, systemDataFieldsTypeName);
			break;
		case "description":
			descriptionAndSignatureField.get(0).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterDataOnPerticularListElement(descriptionAndSignatureField, 0, fieldValue);
			systemDataFieldsTypeDescription = fieldValue;
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text system data fields types description")) {
				enterValue(tableSearchField, fieldValue);
			} else if(text.equals("text meaning of signature")) {
				enterValue(tableSearchField, fieldValue);
			}
			else {
				enterValue(tableSearchField, systemDataFieldsTypeName);
			}
			break;
		case "edit name":
			systemDataFieldsTypeName = String.format("%s%s", fieldValue, generateRandomString(7));
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, systemDataFieldsTypeName);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in system data field type
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataFromTable(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] systemDataFieldsTypesExpectedData = rowData.split("\\|");

		if (systemDataFieldsTypesExpectedData[0].equals("##")) {
			systemDataFieldsTypesExpectedData[0] = systemDataFieldsTypeName;
		}
		if (systemDataFieldsTypesExpectedData[4].equals("##")) {
			systemDataFieldsTypesExpectedData[4] = dateTimeiFunctions.getCurrentMonthDateYear("-");
		}
		if (systemDataFieldsTypesExpectedData[6].equals("#")) {
			systemDataFieldsTypesExpectedData[6] = "";
		} else {
			systemDataFieldsTypesExpectedData[6] = dateTimeiFunctions.getCurrentMonthDateYear("-");
		}
		if (systemDataFieldsTypesExpectedData[7].equals("#")) {
			systemDataFieldsTypesExpectedData[7] = "";
		}
		int columnLength = systemDataFieldsTypesExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@data-rowindex='" + Integer.toString(rowNumber) + "']/..//*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			 scrollScrollBar(systemDataFieldsTypesTable, 15, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, systemDataFieldsTypesExpectedData));
		Assert.assertTrue(compareArrayAndList(systemDataFieldsTypesExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromSystemDataFieldsTypesPage(String data, String fieldName) {
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
				scrollScrollBar(systemDataFieldsTypesTable, 2, Constant.DOWN);
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
				scrollScrollBar(systemDataFieldsTypesTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(systemDataFieldsTypesTable, 20, Constant.TOP);
	}

	/**
	 * Verify cell data in table
	 * 
	 * @param rowNumber
	 * @param columnNumber
	 * @param data
	 */
	public void verifyMentionedRowCellDataInTable(String data, int rowNumber, int columnNumber) {
		String rowData = null;
		if(data.equals("text system data fields types name")) {
			rowData = systemDataFieldsTypeName;
		} else {
		  rowData = getXmlFilesData(data);
		}
		
		String rowItem = "//*[@data-id='" + Integer.toString(rowNumber) + "']/..//*[@data-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}
	
}
