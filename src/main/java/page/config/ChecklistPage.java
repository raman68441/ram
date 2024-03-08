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
 * This class has functionality about checklist page
 */
public class ChecklistPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(ChecklistPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();


	
	public ChecklistPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='MuiGrid-root MuiGrid-item css-1wxaqej']/..//*[text()='Checklist']")
	WebElement checklist;
	
	@FindBy(xpath="//*[@role='tab'and text()='New Checklist']")
	WebElement newChecklist;
	
	@FindBy(xpath="//*[@role='tab'and text()='Checklist']")
	WebElement checklistTab;
	
	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement checkListTable;
	
	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String checklistTableHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String checklistCellData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newChecklistLabels;
	
	@FindBy(xpath="//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	@FindBy(xpath = "//*[text()='Cancel']")
	List<WebElement> cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;
	
	@FindBy(xpath = "//*[text()='Depended On:']")
	WebElement labeldependent;
	
	@FindBy(xpath = "//*[text()='Add Checkpoint']")
	WebElement addCheckBtn;
	
	@FindBy(xpath = "//*[text()='Checkpoints & String/Picklist Categories:']")
	WebElement labelCheckpointPicklistCategories;
	
	@FindBy(xpath = "//*[text()='ID']")
	WebElement columnHeaderId;
	
	@FindBy(xpath = "//*[text()='Checkpoint Name']")
	WebElement columnHeaderCheckpointName;
	
	@FindBy(xpath = "//*[text()='Add Table Column']")
	WebElement addTableColumnBtn;
	
	@FindBy(id="menu-selectionValue")
	WebElement menuSelection;
	
	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> addedColumnCount;
	
	@FindBy(xpath = "//*[@data-field='id']")
	List<WebElement> idColumnData;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedInfo MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedInfo MuiButton-sizeMedium MuiButton-outlinedSizeMedium css-owqdl3']")
	WebElement browseBtn;
	
	@FindBy(xpath = "//*[text()='Add']")
	WebElement addBtn;
	
	@FindBy(xpath = "//*[text()='Remove']")
	WebElement removeBtn;
	
	@FindBy(xpath = "//*[text()='Apply']")
	WebElement applyBtn;
	
	@FindBy(xpath="//*[text()='Locked State:']")
	WebElement lockedStateLabel;
	
	@FindBy(xpath="//*[@value='yes']")
	WebElement yesRadioBtn;
	
	@FindBy(xpath="//*[@value='no']")
	WebElement noRadioBtn;
	
	@FindBy(xpath="//*[@class='css-hyxlzm']")
	List<WebElement> radioBtns;
	
	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-h2 css-zai361']")
	List<WebElement> tableColumnHeaders;
	
	@FindBy(xpath="//*[text()='No']")
	WebElement noLabel;
	
	@FindBy(xpath="//*[text()='Yes']")
	WebElement yesLabel;

	@FindBy(id = "checkpoint_text-helper-text")
	WebElement checkpointNameRequired;

	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body1 css-1xs3fgb']")
	WebElement atleastOneColumnAdd;
	
	@FindBy(id = "checklist_name")
	WebElement nameField;
	
	@FindBy(id = "checkpoint_text")
	WebElement checkpointNameField;	
	
	@FindBy(id = "checkpoint_header_name")
	WebElement checkpointHeaderNameField;
	
	@FindBy(id = "checkpoint_string_name")
	WebElement checkpointStringNameField;
		
	@FindBy(id = "checklist_description")
	WebElement descriptionField;
	
	@FindBy(xpath = "//*[text()='Edit Checklist']")
	WebElement editChecklistHeader;

	@FindBy(xpath = "//*[text()='Confirm Your Delete: ']")
	WebElement confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement checklistMessage;

	@FindBy(id = "checklist_name-helper-text")
	WebElement checklistNameRequired;

	@FindBy(id = "checklist_description-helper-text")
	WebElement checklistDescriptionRequired;

	@FindBy(xpath = "//*[@data-colindex='1']")
	List<WebElement> firstColumnData;
	
	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;
	
	@FindBy(id = "checkpoint_type")
	WebElement selectTypeOption;
	
	@FindBy(id = "checkpoint_select")
	WebElement selectionValueOption;
	
	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-10uacdu']")
	WebElement resetAllBtn;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-7c3c59']")
	WebElement downloadBtn;
	
	@FindBy(id="table-search")
	WebElement tableSearchField;
	
	@FindBy(xpath="//*[@alt='fileName']")
	WebElement image;
	
	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-14349d1']")
	WebElement emptyTable;
	
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-10uacdu']")
	WebElement resetFilterBtn;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1xs3fgb']")
	WebElement checkpointRequiredMessage;	
	
	String fileName = "//*[text()='#']";
	
	public static String checklistName, checklistCreatedTime, checklistUpdatedTime, checklistDeletedTime,
			checkpointName, checkPointHeaderName, checkPointStringName, checkPointIdValue;
	
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
		case "checklist":
			verifyText(checklist, name);
			break;
		case "checklist tab":
			waitTillAttributeDisplay(checklistTab, "role", "tab", Duration.ofSeconds(20));
			verifyText(checklistTab, name);
			break;
		case "new checklist":
			verifyText(newChecklist, name);
			break;
		case "label name":
		case "label description":
		case "label enter checkpoint":
		case "label select type":
		case "label header name":
		case "label enter string name":
		case "label enter selection value":			    
			getTextFromElementInListAndValidate(newChecklistLabels, name);
			break;
		case "label yes":
			verifyText(yesLabel, name);
			break;
		case "label no":
			verifyText(noLabel, name);
			break;	
		case "cancel":
			getTextFromElementInListAndValidate(cancelBtn, name);
			break;
		case "save button":
			verifyText(saveBtn, name);
			break;
		case "warning message checklist name is a required field":
			verifyText(checklistNameRequired, name);
			break;
		case "warning message checklist description is a required field":
			verifyText(checklistDescriptionRequired, name);
			break;
		case "warning message at least one checkpoint is required":
			verifyText(checkpointRequiredMessage, name);
			break;
		case "checklist has been added message":
		case "checklist name is allready present message":
		case "checklist updated message":
		case "checklist deleted message":
			verifyText(checklistMessage, name);
			if(fieldName.contains("create")) {
				checklistCreatedTime= dateTimeiFunctions.getCurrentTime();
			}
			else if(fieldName.contains("update")) {
				checklistUpdatedTime= dateTimeiFunctions.getCurrentTime();
			}
			else if(fieldName.contains("delete"))
				checklistDeletedTime= dateTimeiFunctions.getCurrentTime();
			break;
		case "confirm you delete":
			verifyText(confirmDelete, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit checklist header":
			verifyText(editChecklistHeader, name);
			break;
		case "search option default value":
			verifyText(tableSearchOption, name);
			break;	
		case "table filter default value":
			verifyText(tableFilterOption, name);
			break;
		case "image exists":
			Assert.assertTrue(isExists(image));
			break;	
		case "txt jpg image file name":
			text = fileName.replace("#", name);
			element = driver.findElement(By.xpath(text));
			verifyText(element, name);
			break;
		case "no rows":
			verifyText(emptyTable, name);
			break;
		case "reset filter":
			verifyText(resetFilterBtn, name);
			break;
		case "download":
			verifyText(downloadBtn, name);
			break;	
		case "label dependent on":
			verifyText(labeldependent, name);
			break;
		case "label add checkpoint":
			verifyText(addCheckBtn, name);
			break;
		case "label checkpoint and picklist categories":
			verifyText(labelCheckpointPicklistCategories, name);
			break;
		case "column header id":
			verifyText(columnHeaderId, name);
			break;	
		case "column header checkpoint name":
			verifyText(columnHeaderCheckpointName, name);
			break;
		case "add table column button":
			verifyText(addTableColumnBtn, name);		
			break;
		case "added columns":
			getTextFromElementInListAndValidate(addedColumnCount, name);	
			break;
		case "add":
			verifyText(addBtn, name);	
			break;	
		case "warning message checkpoint name is a required field":
			verifyText(checkpointNameRequired, name);	
			break;
		case "warning message atleast 1 column should be added":
			verifyText(atleastOneColumnAdd, name);	
			break;
		case "table column 1":
		case "table column 2":
			getTextFromElementInListAndValidate(tableColumnHeaders, name);	
			break;	
		case "remove":
			verifyText(removeBtn, name);	
			break;		
		case "apply":
			verifyText(applyBtn, name);	
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
	 * verify audit trail column headers name
	 * 
	 * @param columnHeaders - audit trail table column headers name
	 */
	public void verifyChecklistTableColumnHeaders(String columnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(checkListTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(columnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> columnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {	
			columnHeadersText.add(getText(columnHeader.get(i)));
			 scrollScrollBar(checkListTable, 19, Constant.RIGHT);
		}	
		// compare expected and actual column headers
		log.info("checklist states table column headers " + columnHeadersText);
		 scrollScrollBar(checkListTable, 300, Constant.LEFT);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, columnHeadersText));
		log.info("checklist table column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInChecklistTable() {
		scrollUpOrDownWindows(500);
		int rowsInPage = Integer.valueOf(getText(paginationPage.rowsPerPage));
		int totalRecords = Integer.valueOf(paginationPage.totalNumberOfRecords);
		if (rowsInPage > totalRecords) {
			rowsInPage = totalRecords;
		}
		// *[@data-colindex='1']
		List<String> rowData = new ArrayList<>();
		for (int i = 0; i < rowsInPage; i++) {
			WebElement data = firstColumnData.get(i);
			rowData.add(getText(data));
			if (i > 31) {
				scrollScrollBar(checkListTable, 40, Constant.DOWN);
			} else {
				scrollScrollBar(checkListTable, 20, Constant.DOWN);
			}
		}
		Assert.assertTrue(rowsInPage == rowData.size());
		scrollScrollBar(checkListTable, 20, Constant.TOP);
	}

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		String name = fieldName.toLowerCase();
		switch (name) {
		case "checklist":
			clickElement(checklist);
			break;
		case "checklist tab":
			clickElement(checklistTab);
			break;
		case "new checklist":
			clickElement(newChecklist);
			break;
		case "lock state no":
			clickElement(noLabel);
			break;	
		case "lock state yes":
			clickElement(yesLabel);
			break;		
		case "cancel":
			clickOnPerticularListElement(cancelBtn, 0);
			break;
		case "add checkpoint cancel":
			clickOnPerticularListElement(cancelBtn, 1);
			break;
		case "save":
			clickElement(saveBtn);
			break;
		case "update":
			clickElement(updateBtn);
			break;
		case "delete":
			clickElement(deleteBtn);
			break;
		case "edit":
			clickOnPerticularListElement(editIcon,0);
			break;
		case "delete icon":
			clickOnPerticularListElement(deleteIcon, 0);
			break;
		case "reset all":
			clickElement(resetAllBtn);
			break;
		case "download":
			clickElement(downloadBtn);
			break;
		case "add checkpoint":
			clickElement(addCheckBtn);
			break;
		case "add":
			clickElement(addBtn);	
			break;
		case "add table column button":
			clickElement(addTableColumnBtn);	
			break;
		case "remove":
			clickElement(removeBtn);	
			break;		
		case "apply":
			clickElement(applyBtn);	
			break;		
		case "reset filter":
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
			if (checklistName==null) {
				checklistName = String.format("%s%s", fieldValue, generateRandomString(4));
			}
			nameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(nameField, checklistName);
			break;
		case "description":
			descriptionField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(descriptionField, fieldValue);
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(tableSearchField, checklistName);
			break;
		case "edit name":
			checklistName = String.format("%s%s", fieldValue, generateRandomString(3));
			nameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(nameField, checklistName);
			break;
		case "checkpoint name":
			checkpointName = fieldValue;
			checkpointNameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(checkpointNameField, checkpointName);
			break;				
		case "header name":
			checkPointHeaderName = fieldValue;
			checkpointHeaderNameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(checkpointHeaderNameField, checkPointHeaderName);
			break;	
		case "enter string name":
			checkPointStringName = fieldValue;
			checkpointStringNameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(checkpointStringNameField, checkPointStringName);
			break;	
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in checklist
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForChecklist(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] checklistExpectedData = rowData.split("\\|");
		if (checklistExpectedData[0].equals("##")) {
			checklistExpectedData[0] = checklistName;
		}
		checklistExpectedData[2] = dateTimeiFunctions.getCurrentMonthDateYear("-");
		if (checklistExpectedData[4].equals("#")) {
			checklistExpectedData[4] = "";
		}
		else if (checklistExpectedData[4].equals("##")) {
			checklistExpectedData[4] = dateTimeiFunctions.getCurrentMonthDateYear("-");
			
		}
		if (checklistExpectedData[5].equals("#")) {
			checklistExpectedData[5] = "";
		}	
		int columnLength = checklistExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = checklistCellData.replace("#", Integer.toString(i));
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			 scrollScrollBar(checkListTable, 15, Constant.RIGHT);
		}
		 scrollScrollBar(checkListTable, 200, Constant.LEFT);
		log.info(String.format("mentioned row %s %s", rowNumber, checklistExpectedData));
		Assert.assertTrue(compareArrayAndList(checklistExpectedData, actualData));
	}
	
	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromChecklistPage(String data, String fieldName) {
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
			element = driver.findElement(By.xpath("//*[@role='option' and text()='" + value + "']"));
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
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//*[@data-value='" + value + "']"));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "select type":
			clickElement(selectTypeOption);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;	
		case "enter selection value":
			clickElement(selectionValueOption);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement(menuSelection);
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
		if(activeOrInactiveRecords.equals("inactive")) {
			status ="false";
		}
		scrollUpOrDownWindows(500);
		int totalRows = Integer.valueOf(getText(paginationPage.rowsPerPage));
		String nextPagestatus = (paginationPage.nextPageArrowField).getDomProperty("disabled");
		if(nextPagestatus.equals("false")) {
			for (int i = 1; i < totalRows; i++) {
				System.out.println("i= "+i);
				actualStatus = (activeInactiveTogleIcon.get(i)).getDomProperty("defaultChecked");
				Assert.assertTrue(actualStatus.equals(status));			
				scrollScrollBar(checkListTable, 2, Constant.DOWN);
			}
		}
		else {
			for (int i = 0; i < (paginationPage.getNumberRecordsInPage()-2); i++) {
				System.out.println("i= "+i);
				actualStatus = (activeInactiveTogleIcon.get(i)).getDomProperty("defaultChecked");
				Assert.assertTrue(actualStatus.equals(status));	
				scrollScrollBar(checkListTable, 10, Constant.DOWN);
			}			
		}	
		
		scrollScrollBar(checkListTable, 200, Constant.TOP);
	}
	
	/**
	 * Verify cell data in table
	 * 
	 * @param rowNumber
	 * @param columnNumber
	 * @param data
	 */
	public void verifyMentionedCellDataInTable(String data, int rowNumber, int columnNumber) {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String rowData = null;
		if(data.equals("text checklist name")) {
			rowData = checklistName;
		} else {
		  rowData = getXmlFilesData(data);
		}
		
		String rowItem = "//*[@data-rowindex='" + Integer.toString(rowNumber) + "']/..//*[@data-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}
	
	/**
	 * Save mentioned row data in checklist table
	 * @param data
	 * @param rowNumber
	 */
	public void saveMentionedRowDataInChecklistTable(String fieldName, int rowNumber) {
		String fieldValue = getXmlFilesData(fieldName);
		switch (fieldName) {
		case "id column":
			checkPointIdValue = getTextFromElementInListInMentionedPosition(idColumnData, 1);
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}		
	}
	
}
