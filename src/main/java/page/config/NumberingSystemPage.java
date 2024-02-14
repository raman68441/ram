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
 * This test case have Numbering System Functionality
 */
public class NumberingSystemPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(NumberingSystemPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public NumberingSystemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Numbering System']")
	WebElement numberingSystem;

	@FindBy(xpath = "//*[@role='tab'and text()='New Numbering System']")
	WebElement newNumberingSystem;

	@FindBy(xpath = "//*[@role='tab'and text()='Numbering System List']")
	WebElement numberingSystemList;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1grl8tv']")
	WebElement numberingSystemTable;

	@FindBy(xpath = "//*[@class='MuiBox-root css-hnbbyq']")
	WebElement scrollPage;

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> numberingSystemLabels;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary PrivateSwitchBase-root MuiSwitch-switchBase MuiSwitch-colorPrimary css-aqsgr9']")
	WebElement deactiveIcon;
	
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Generate']")
	WebElement generateBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(xpath = "//*[text()='Edit Numbering System']")
	WebElement editNumberingSystemHeader;

	@FindBy(xpath = "//*[@data-colindex='0']")
	List<WebElement> firstColumnData;

	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;

	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-10uacdu']")
	WebElement resetFilterBtn;

	@FindBy(id = "table-search")
	WebElement tableSearchField;

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-11utb8v']")
	WebElement emptyTable;

	@FindBy(id = "num_sys_description")
	WebElement descriptionField;

	@FindBy(xpath = "//*[@placeholder='Name']")
	WebElement nameField;

	@FindBy(xpath = "//*[@placeholder='Starting Value']")
	WebElement stringValueField;

	@FindBy(id = "num_sys_maximum_digit")
	WebElement maximumDigitField;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-j5a1ma']")
	WebElement displayLeadingZeroLabel;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input css-1m9pwf3']")
	WebElement checkBox;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-d0vyis']")
	WebElement addFieldType;

	@FindBy(xpath = "//*[text()='Selected Numbering System:']")
	WebElement selectedNumberSystemLabel;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> addedFieldNumberingFormat;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1w985am']")
	WebElement numberingFormatData;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h6 MuiDialogTitle-root css-1jhhc83']")
	WebElement addFieldTypeHeader;

	@FindBy(xpath = "//*[@data-testid='DragIndicatorIcon']")
	List<WebElement> dragDropIcon;

	String addFieldData = "//*[text()='#']";

	@FindBy(id = "add_field_type_select")
	WebElement selectAddFieldType;

	@FindBy(id = "sub_field_type_value")
	WebElement addSubFieldTypeValue;

	@FindBy(xpath = "//*[text()='Add']")
	WebElement addBtn;

	@FindBy(xpath = "//*[text()='Confirm Your Delete: ']")
	WebElement confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement numberingSystemMessage;

	@FindBy(xpath = "//*[text()='System Name is required']")
	WebElement nameRequired;

	@FindBy(xpath = "//*[text()='Description is required']")
	WebElement descriptionRequired;

	@FindBy(xpath = "//*[text()='Starting Values is required']")
	WebElement statingValueRequired;

	@FindBy(xpath = "//*[text()='At least one field type is required']")
	WebElement fieldTypeRequired;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-7c3c59']")
	WebElement downloadBtn;

	@FindBy(xpath = "//*[@alt='fileName']")
	WebElement image;

	@FindBy(xpath = "//*[text()='Select Field Type']")
	WebElement selectFieldType;

	@FindBy(xpath = "//*[text()='System Data Fields Types']")
	WebElement systemDataTypeOption;

	@FindBy(xpath = "//*[text()='List Manager']")
	WebElement selectListManagerOption;

	@FindBy(xpath = "//*[text()='Document Type']")
	WebElement selectDocumentTypeOption;

	@FindBy(xpath = "//*[text()='Constant String']")
	WebElement constatneStringOption;

	@FindBy(xpath = "//*[text()='Year']")
	WebElement yearOption;

	@FindBy(xpath = "//*[@role='option']")
	List<WebElement> option;

	@FindBy(xpath = "//*[text()='Maximun Digit is required']")
	WebElement maximumDigitRequired;

	@FindBy(xpath = "//*[@data-testid='ArrowDropDownIcon']")
	WebElement dropdownIcon;

	@FindBy(xpath = "//*[@data-testid='ArrowDropDownIcon']")
	List<WebElement> dropdownIcons;

	public String numberingSystemTableHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String numberingSystemCellData = "//*[@data-colindex='#']";

	public String rowCellData = "//*[@data-rowindex='#']/..//*[@data-colindex='#']";

	public static String numberingSystemName, numberingSystemDescription, numberingSystemFieldOption,
			numberingSystemSubOption, numberingSystemCreatedTime, numberingSystemUpdatedTime,
			numberingSystemDeletedTime;

	public static List<String> numberingSystemSubValue = new ArrayList<>();
	public static List<String> numberingSystemFieldValue = new ArrayList<>();

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
		case "numbering system tab":
			verifyText(numberingSystem, name);
			break;
		case "numbering system list":
			waitTillAttributeDisplay(numberingSystemList, "role", "tab", Duration.ofSeconds(20));
			verifyText(numberingSystemList, name);
			break;
		case "new numbering system":
			verifyText(newNumberingSystem, name);
			break;
		case "label name field":
		case "label description field":
		case "label string value":
		case "label maximum digit":
		case "label select system data field Type":
			getTextFromElementInListAndValidate(numberingSystemLabels, name);
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "warning message system name required":
			verifyText(nameRequired, name);
			break;
		case "warning message description required":
			verifyText(descriptionRequired, name);
			break;
		case "warning message starting value required":
			verifyText(statingValueRequired, name);
			break;
		case "warning message maximum digit required":
			verifyText(maximumDigitRequired, name);
			break;
		case "warning message at least one field type is required":
			verifyText(fieldTypeRequired, name);
			break;
		case "numbering system added message":
		case "numbering system already exist message":
		case "numbering system updated message":
		case "numbering system deleted message":
			verifyText(numberingSystemMessage, name);
			if(fieldName.contains("added")) {
				numberingSystemCreatedTime= dateTimeiFunctions.getCurrentTime();
			}
			else if(fieldName.contains("updated")) {
				numberingSystemUpdatedTime= dateTimeiFunctions.getCurrentTime();
			}
			else if(fieldName.contains("deleted"))
				numberingSystemDeletedTime= dateTimeiFunctions.getCurrentTime();
			break;
		case "confirm you delete":
			verifyText(confirmDelete, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit numbering system header":
			verifyText(editNumberingSystemHeader, name);
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
		case "label display leading zero":
			verifyText(displayLeadingZeroLabel, name);
			break;
		case "add field type":
			verifyText(addFieldType, name);
			break;
		case "add field type button":
			verifyText(addFieldType, name);
			break;
		case "label selected numbering system":
			verifyText(selectedNumberSystemLabel, name);
			break;
		case "no field type added":
		case "numbering format":
			getTextFromElementInListAndValidate(addedFieldNumberingFormat, name);
			break;
		case "generate":
			verifyText(generateBtn, name);
			break;
		case "add field type header":
			verifyText(addFieldTypeHeader, name);
			break;
		case "label select feild type":
			verifyText(selectFieldType, name);
			break;
		case "system data field Type option":
			verifyText(systemDataTypeOption, name);
			break;
		case "list manager option":
			verifyText(selectListManagerOption, name);
			break;
		case "document type option":
			verifyText(selectDocumentTypeOption, name);
			break;
		case "constant string option":
			verifyText(constatneStringOption, name);
			break;
		case "year option":
			verifyText(yearOption, name);
			break;

		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify numbering system table column headers name
	 * 
	 * @param columnHeaders -numbering system column headers name
	 */
	public void verifyNumberingSystemTableColumnHeaders(String columnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(numberingSystemTable, "class", "MuiDataGrid-virtualScroller css-1grl8tv",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(columnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> columnHeadersText = new ArrayList<>();
		for (int i = 2; i <= ExpectedColumnHeader.length + 1; i++) {
			String columnHeader = numberingSystemTableHeader.replace("#", Integer.toString(i));
			WebElement element = driver.findElement(By.xpath(columnHeader));
			columnHeadersText.add(getText(element));
		}
		// compare expected and actual column headers
		log.info("numbering system column headers " + columnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, columnHeadersText));
		log.info("numbering system column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInNumberingSystemTable() {

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
		case "numbering system tab":
			clickElement(numberingSystem);
			break;
		case "numbering system list":
			clickElement(numberingSystemList);
			break;
		case "new numbering system":
			clickElement(newNumberingSystem);
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
		case "generate":
			clickElement(generateBtn);
			break;
		case "add field type":
			clickElement(addFieldType);
			break;
		case "select field type option":
			clickElement(dropdownIcon);
			break;
		case "add":
			clickElement(addBtn);
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
		case "name":
			if (numberingSystemName == null) {
				numberingSystemName = String.format("%s%s", fieldValue, generateRandomString(7));
			}
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, numberingSystemName);
			break;
		case "description":
			descriptionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(descriptionField, fieldValue);
			break;
		case "maximum digit":
			maximumDigitField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(maximumDigitField, fieldValue);
			break;
		case "string value":
			stringValueField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(stringValueField, fieldValue);
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text numbering system description")) {
				enterValue(tableSearchField, fieldValue);
			} else {
				enterValue(tableSearchField, numberingSystemName);
			}
			break;
		case "edit name":
			numberingSystemName = String.format("%s%s", fieldValue, generateRandomString(7));
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, numberingSystemName);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in numbering system
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForNumberingSystem(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] numberingSystemExpectedData = rowData.split("\\|");
		if (numberingSystemExpectedData[0].equals("##")) {
			numberingSystemExpectedData[0] = Integer.toString(rowNumber);
		}
		if (numberingSystemExpectedData[1].equals("##")) {
			numberingSystemExpectedData[1] = numberingSystemName;
		}
		if (numberingSystemExpectedData[3].equals("#")) {
			numberingSystemExpectedData[3] = "";
		}
		if (numberingSystemExpectedData[4].equals("##")) {
			numberingSystemExpectedData[4] = dateTimeiFunctions.getCurrentDateMonthNameYear();

		}
		int columnLength = numberingSystemExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@data-rowindex='" + Integer.toString(rowNumber) + "']/..//*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			// scrollScrollBar(numberingSystemTable, 10, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, numberingSystemExpectedData));
		Assert.assertTrue(compareArrayAndList(numberingSystemExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromNumberingSystemPage(String data, String fieldName) {
		String value = getXmlFilesData(data);
		WebElement element = null;
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
				scrollScrollBar(numberingSystemTable, 2, Constant.DOWN);
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
				scrollScrollBar(numberingSystemTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(numberingSystemTable, 20, Constant.TOP);
	}

	/**
	 * drag and drop the element from source to destination
	 * 
	 * @param position1
	 * @param position2
	 */
	public void dragAndDropElement(int position1, int position2) {
		dragAndDropElementFromToPlace(dragDropIcon.get(position1), dragDropIcon.get(position2));
	}

	/**
	 * 
	 */
	public void verifyNumberingFormatDataOrder() {
		String data = null;
		int numberOfAddedData = addedFieldNumberingFormat.size();
		for (int i = 0; i < numberOfAddedData; i++) {
			data = data + getText(addedFieldNumberingFormat.get(i));
		}

		Assert.assertTrue(getText(numberingFormatData).equals(data));

	}

	/**
	 * Select index from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromNumberingSystemPage(int index, String fieldName) {
		switch (fieldName) {
		case "select field type":
			clickElement(dropdownIcon);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickOnPerticularListElement(option, index);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			numberingSystemFieldOption = getText(addSubFieldTypeValue);
			numberingSystemFieldValue.add(numberingSystemFieldOption);
			break;
		case "select sub field value":
			clickElement(addSubFieldTypeValue);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickOnPerticularListElement(option, index);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (numberingSystemSubOption != null) {
				numberingSystemSubOption = String.format("%s%s", numberingSystemSubOption,
						getText(addSubFieldTypeValue));
			} else {
				numberingSystemSubOption = getText(addSubFieldTypeValue);
			}
			numberingSystemSubValue.add(getText(addSubFieldTypeValue));
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}

	/**
	 * verify added data in new numbering system
	 * 
	 * @param fieldName
	 */

	public void verifySelectedNumberingSystemAndNumberingData(String fieldName) {
		scrollScrollBar(scrollPage, 3000, Constant.DOWN);
		switch (fieldName) {
		case "selected numbering system data":
			int selectedNumberingData = addedFieldNumberingFormat.size();
			for (int i = 1; i < selectedNumberingData - 1; i++) {
				getTextFromElementInListInMentionedPositionAndValidate(addedFieldNumberingFormat,
						numberingSystemSubValue.get(i - 1), i);
			}
			break;
		case "numbering format data":
			String data = getText(numberingFormatData);
			Assert.assertTrue(numberingSystemSubOption.equals(data));
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
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
