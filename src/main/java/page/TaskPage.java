package page;

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
 * This class explains about Task screen functionality
 */
public class TaskPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(TaskPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public TaskPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Assigned By Me']")
	WebElement assignedByMeTab;

	@FindBy(xpath = "//*[@role='tab' and text()='Comments']")
	WebElement commentsTab;
	
	@FindBy(xpath = "//*[@role='tab' and text()='History']")
	WebElement historyTab;
	
	@FindBy(xpath = "//*[text()='My Task']")
	WebElement myTaskTab;
	
	@FindBy(xpath = "//*[text()='Assign Task']")
	WebElement assignTaskTab;
	
	@FindBy(xpath = "//*[text()='Completed Task']")
	WebElement completedTaskTab;
	
	@FindBy(xpath = "//*[text()='Cancelled Task']")
	WebElement cancelledTaskTab;
	
	@FindBy(xpath = "//*[text()='Next Up']")
	WebElement labelTaskNextUP;
	
	@FindBy(xpath = "//*[text()='In Progress']")
	WebElement labelTaskInProgress;
	
	@FindBy(xpath = "//*[text()='Completed']")
	WebElement labelCompleted;
	
	@FindBy(xpath = "//*[text()='No Records Found']")
	WebElement noRecordsFound;	
	
	@FindBy(xpath = "//*[@role='tab' and text()='Assign New Task']")
	WebElement assignNewTaskTab;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement taskTable;
	
	@FindBy(id="comment")
	WebElement commentField;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String taskColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String taskTableData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> assignNewTaskLabels;

	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> commentsText;		
	
	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> myTaskLabels;	
	
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath = "//*[text()='Clear']")
	WebElement clearBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;
	
	@FindBy(xpath = "//*[text()='General']")
	List<WebElement> labelGeneral;
	
	@FindBy(xpath = "//*[text()='Document']")
	List<WebElement> labelDocument;
	
	@FindBy(xpath = "//*[text()='Transfer Task']")
	WebElement transferTaskBtn;
	
	@FindBy(xpath = "//*[text()='Reject']")
	WebElement rejectBtn;
	
	@FindBy(xpath = "//*[text()='Accept']")
	WebElement acceptBtn;	
	
	@FindBy(xpath = "//*[text()='View Details']")
	List<WebElement> viewDetailsLink;

	@FindBy(xpath = "//*[text()='Assign']")
	WebElement assignBtn;
	
	@FindBy(xpath = "//*[text()='Attached File']")
	WebElement labelAttachedFile;

	@FindBy(id = "task_type")
	WebElement taskTypeField;

	@FindBy(id = "assignee")
	WebElement assigneeField;
	
	@FindBy(id = "description")
	WebElement descriptionField;
	
	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body css-1pn8tem']")
	WebElement selectFile;
	
	@FindBy(xpath="//*[text()='Drag & Drop files here, OR Click to select files.']")
	WebElement selectFileText;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;
	
	@FindBy(xpath = "//*[text()='View Task']")
	WebElement viewTaskBtn;
	
	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement taskMessage;

	@FindBy(xpath = "//*[text()= Task Type is required']")
	WebElement taskTypeRequired;

	@FindBy(xpath = "//*[text()='Assignee is required']")
	WebElement assigneeRequired;

	@FindBy(xpath = "//*[text()='Description is required']")
	WebElement descriptionRequired;

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

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h5 css-tv5qfu']")
	WebElement editTaskHeader;

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

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-14349d1']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[@class='MuiBox-root css-f0fbul']")
	WebElement scrollPage;

	public String optionName = "//*[@role ='option' and @data-value='#']";

	public static String taskAssignTime, taskUpdatedTime, taskDeletedTime, taskId,
			taskDescription;

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
		case "my task tab":
			verifyText(myTaskTab, name);
			break;
		case "assign task tab":
			verifyText(assignTaskTab, name);
			break;
		case "completed task tab":
			verifyText(completedTaskTab, name);
			break;
		case "cancelled task tab":
			verifyText(cancelledTaskTab, name);
			break;
		case "assigned by me tab":
			waitTillAttributeDisplay(assignedByMeTab, "role", "tab", Duration.ofSeconds(20));
			verifyText(assignedByMeTab, name);
			break;	
		case "history tab":
			verifyText(historyTab, name);
			break;	
		case "comments tab":
			verifyText(commentsTab, name);
			break;
		case "assign new task":
			verifyText(assignNewTaskTab, name);
			break;
		case "label task type":
		case "label assignee":
		case "label target date":
		case "label description":
		case "label comment":
			getTextFromElementInListAndValidate(assignNewTaskLabels, name);
			break;
		case "label next up":
		case "label in progress":
		case "label completed":
			getTextFromElementInListAndValidate(myTaskLabels, name);
			break;	
		case "label attached file":
			verifyText(labelAttachedFile, name);
			break;
		case "label drag and drop":
			verifyText(selectFileText, name);
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "view task":
			verifyText(viewTaskBtn, name);
			break;
		case "view details link":
			text = getTextFromElementInListInMentionedPosition(viewDetailsLink, 0);
			compareTwoString(text, name);
			break;
		case "warning message task type is required":
			verifyText(taskTypeRequired, name);
			break;
		case "warning message description required":
			verifyText(descriptionRequired, name);
			break;
		case "warning message assignee is required":
			verifyText(assigneeRequired, name);
			break;
		case "task assigned successfully message":
		case "task updated successfully message":
		case "task deleted Successfully message":
			if (fieldName.contains("created")) {
				taskAssignTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				taskUpdatedTime = dateTimeiFunctions.getCurrentTime();
			}
			else {
				taskDeletedTime = dateTimeiFunctions.getCurrentTime();
			}
			verifyText(taskMessage, name);
			break;
		case "confirm you delete":
			text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			compareTwoString(text, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "View Task":
			verifyText(deleteBtn, name);
			break;				
		case "no records found":
			verifyText(noRecordsFound, name);
			break;		
		case "edit task header":
			verifyText(editTaskHeader, name);
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
		case "transfer task":
			verifyText(transferTaskBtn, name);
			break;
		case "reject":
			verifyText(rejectBtn, name);
			break;
		case "accept":
			verifyText(acceptBtn, name);
			break;
		case "update":
			verifyText(updateBtn, name);
			break;
		case "clear":
			verifyText(clearBtn, name);
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
	 * verify task table column headers name
	 * 
	 * @param columnHeaders -task table column headers name
	 */
	public void verifyActivitesListTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(taskTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			 scrollScrollBar(taskTable, 17, Constant.RIGHT);
		}
		scrollScrollBar(taskTable, 300, Constant.LEFT);
		// compare expected and actual column headers
		log.info("task table column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("task table column headers displayed");
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
		case "my task tab":
			clickElement(myTaskTab);
			break;
		case "assign task tab":
			clickElement(assignTaskTab);
			break;
		case "assign by me tab":
			clickElement(assignedByMeTab);
			break;
		case "assign new task tab":
			clickElement(assignNewTaskTab);
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
//		case "electronic signature yes":
//			clickOnPerticularListElement(radioBtns,0);
//			break;	
//		case "comments yes":
//			clickOnPerticularListElement(radioBtns,2);
//			break;	
//		case "electronic signature no":
//			clickOnPerticularListElement(radioBtns,1);
//			break;	
//		case "comments no":
//			clickOnPerticularListElement(radioBtns,3);
//			break;	
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
		case "description":
			descriptionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			descriptionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(descriptionField, fieldValue);	
			break;
		case "comment":
			commentField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			commentField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(commentField, fieldValue);	
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text task description")) {
				enterValue(tableSearchField, fieldValue);
			} else if(text.equals("text meaning of signature")) {
				enterValue(tableSearchField, fieldValue);
			}
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
			ActivitiesExpectedData[0] = "";
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
			 scrollScrollBar(taskTable, 15, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, ActivitiesExpectedData));
		Assert.assertTrue(compareArrayAndList(ActivitiesExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromTaskPage(String data, String fieldName) {
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
				scrollScrollBar(taskTable, 2, Constant.DOWN);
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
				scrollScrollBar(taskTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(taskTable, 20, Constant.TOP);
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
		if(data.equals("text task name")) {
			rowData = taskId;
		} else {
		  rowData = getXmlFilesData(data);
		}
		
		String rowItem = "//*[@data-id='" + Integer.toString(rowNumber) + "']/..//*[@data-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}

}

