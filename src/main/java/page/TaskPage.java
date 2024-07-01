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
	
	@FindBy(xpath="//*[text()='Complete Task']")
	WebElement completeTaskBtn;
	
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
	
	@FindBy(xpath = "//*[text()='Update']")
	List <WebElement> updateBtns;
	
	@FindBy(xpath = "//*[text()='General']")
	List<WebElement> labelGeneral;
	
	@FindBy(xpath = "//*[text()='Document']")
	List<WebElement> labelDocument;
	
	@FindBy(xpath = "//*[text()='Transfer Task']")
	WebElement transferTaskBtn;
	
	@FindBy(xpath = "//*[text()='Reject']")
	List<WebElement> rejectBtn;
	
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

	@FindBy(xpath = "//*[text()= 'Task Type is required']")
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

	@FindBy(xpath="//*[@id='simple-tabpanel-1']//p[2]")
	WebElement historyContent;
		
	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;

	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;
	
	@FindBy(id ="remarks")
	WebElement remarks;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	@FindBy(xpath = "//button[text()='Reset Filter']")
	WebElement resetFilterBtn;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-7c3c59']")
	WebElement downloadBtn;

	@FindBy(id = "table-search")
	WebElement tableSearchField;

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-14349d1']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[@class='MuiBox-root css-dcaojr']")
	WebElement scrollPage;
	
	@FindBy(xpath="//*[@class='MuiDataGrid-root MuiDataGrid-root--densityStandard MuiDataGrid-withBorderColor css-vqhi2a']")
	WebElement girdData;

	public String optionName = "//*[@role ='option' and @data-value='#']";
	
	String taskIdInNextUp = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-s18byi']//*[text()='Next Up']/../../../..//*[text()='#']";
	String taskIdInInProgress = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-s18byi']//*[text()='In Progress']/../../../..//*[text()='#']";
	String taskIdInInComplete = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-s18byi']//*[text()='Completed']/../../../..//*[text()='#']";
	String taskTypeInNextUp = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-s18byi']//*[text()='Next Up']/../../../..//*[text()='#']";
	String taskTypeInProgress = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-s18byi']//*[text()='In Progress']/../../../..//*[text()='#']";
	String taskTypeInComplete = "//*[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-s18byi']//*[text()='Completed']/../../../..//*[text()='#']";
	
	public static String taskAssignTime, taskUpdatedTime, taskDeletedTime, taskId, taskType,
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
		case "transfer task":
			verifyText(transferTaskBtn, name);
			break;
		case "reject":
			text = getTextFromElementInListInMentionedPosition(rejectBtn, 0);
			compareTwoString(text, name);
			break;
		case "accept":
			verifyText(acceptBtn, name);
			break;
		case "task id in next up section":
			String taskIdNextUpText = taskIdInNextUp.replace("#", taskId);
			List <WebElement> nexUpTaskId = driver.findElements(By.xpath(taskIdNextUpText));
			verifyText(nexUpTaskId.get((nexUpTaskId.size()-1)), taskId);
			break;
		case "task type in next up section":
			String taskTypeNextUpText = taskTypeInNextUp.replace("#", taskType);
			List <WebElement> nexUpTaskType = driver.findElements(By.xpath(taskTypeNextUpText));
			verifyText(nexUpTaskType.get(nexUpTaskType.size()-1), taskType);
			break;
		case "task id in inprogress section":
			String taskIdInProgressText = taskIdInInProgress.replace("#", taskId);
			List<WebElement> inProgressTaskId = driver.findElements(By.xpath(taskIdInProgressText));
			verifyText(inProgressTaskId.get(inProgressTaskId.size()-1), taskId);
			break;
		case "task type in inprogress section":
			taskType = "General";
			String taskTypeInProgressText = taskTypeInProgress.replace("#", taskType);
			List <WebElement> inProgressTaskType = driver.findElements(By.xpath(taskTypeInProgressText));
			verifyText(inProgressTaskType.get(inProgressTaskType.size()-1), taskType);
			break;
		case "task id in complete section":
			String taskIdComplete = taskIdInInComplete.replace("#", taskId);
			List <WebElement> completeTaskId = driver.findElements(By.xpath(taskIdComplete));
			verifyText(completeTaskId.get(completeTaskId.size()-1), taskId);
			break;
		case "task type in complete section":
			String taskTypeComplete = taskTypeInComplete.replace("#", taskType);
			List <WebElement> completeTaskType = driver.findElements(By.xpath(taskTypeComplete));
			verifyText(completeTaskType.get(completeTaskType.size()-1), taskType);
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
		case "assign new task tab":
			verifyText(assignNewTaskTab, name);
			break;			
		case "label task type":
		case "label assignee":
		case "label target date":
		case "label description field":
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
		case "label drag and drop files here or click to select files":
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
		case "warning message task type required":
			verifyText(taskTypeRequired, name);
			break;
		case "warning message description required":
			verifyText(descriptionRequired, name);
			break;
		case "warning message assignee required":
			verifyText(assigneeRequired, name);
			break;
		case "task assigned successfully message":
		case "task updated successfully message":
		case "task deleted Successfully message":			
		case "task accepted successfully message":
		case "task completed successfully message":
		case "task rejected successfully message":
		case "task transfer successfully message":
			if (fieldName.contains("assign")) {
				taskAssignTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				taskUpdatedTime = dateTimeiFunctions.getCurrentTime();
			}
			else {
				taskDeletedTime = dateTimeiFunctions.getCurrentTime();
			}
			verifyText(taskMessage, name);
			if (fieldName.contains("assign")) {
				String taskElement = "//*[@aria-rowindex='2']//*[@data-colindex='1']";
				WebElement id = driver.findElement(By.xpath(taskElement));
				taskId = getText(id);
			}
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
			String editTaskHeaderText = getText(editTaskHeader);
			Assert.assertTrue("Edit header displayed", editTaskHeaderText.contains(name));
			break;
		case "task assign history text":
			String historyText = getText(historyContent);
			Assert.assertTrue("Edit header displayed", historyText.contains(name));
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
			//taskId = "TSK-000008";
			break;
		case "save button":
			verifyText(saveBtn, name);
			break;
		case "update":
			verifyText(updateBtn, name);
			break;
		case "clear":
			verifyText(clearBtn, name);
			break;	
		case "assign":
			verifyText(assignBtn, name);
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
	public void verifyAssignTaskTableColumnHeaders(String expectedColumnHeaders) {
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
	public void verifyNumberOfRowsInTaskTable() {

		scrollScrollBar(scrollPage, 5000, Constant.DOWN);
		int rowsInPage = Integer.valueOf(getText(paginationPage.rowsPerPage));
		int totalRecords = Integer.valueOf(paginationPage.totalNumberOfRecords);
		if (rowsInPage > totalRecords) {
			rowsInPage = totalRecords;
		}
		int NumberOfRowsINTable = (Integer.parseInt(getAttribute(girdData, "aria-rowcount")))-1;
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
		case "history tab":
			clickElement(historyTab);
			break;	
		case "assign by me tab":
			clickElement(assignedByMeTab);
			break;
		case "task type":
			clickElement(taskTypeField);
			break;
		case "assign":
			clickElement(assignBtn);
			break;
		case "completed task tab":
			clickElement(completedTaskTab);
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
		case "update button":
			int length = (updateBtns.size())-1;
			clickOnPerticularListElement(updateBtns,length);
			break;
		case "delete":
			clickElement(deleteBtn);
			break;
		case "complete task":
			clickElement(completeTaskBtn);
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
		case "transfer task":
			clickElement(transferTaskBtn);
			break;
		case "reject":
			clickOnPerticularListElement(rejectBtn,0);
			break;
		case "reject button":
			clickOnPerticularListElement(rejectBtn,1);
			break;
		case "accept":
			clickElement(acceptBtn);
			break;
		case "cancelled task":
			clickElement(cancelledTaskTab);
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
			if (text.equals("task id")) {
				enterValue(tableSearchField, taskId);
			} else {
				enterValue(tableSearchField, fieldValue);
			}
			break;
		case "remarks":
			remarks.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				enterValue(remarks, fieldValue);
			break;				
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in Task page
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataFromTable(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] taskTableExpectedData = rowData.split("\\|");
		rowNumber= rowNumber+1;

		if (taskTableExpectedData[0].equals("##")) {
			taskTableExpectedData[0] = taskId;
		}
		if (taskTableExpectedData[2].equals("##")) {
			taskTableExpectedData[2] = dateTimeiFunctions.getCurrentDateMonthNameYear("-");
		}	
		int columnLength = taskTableExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber) + "']//*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			 scrollScrollBar(taskTable, 15, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, taskTableExpectedData));
		Assert.assertTrue(compareArrayAndList(taskTableExpectedData, actualData));
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
		case "select task type":
			clickElement(taskTypeField);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//li[text()='" + value + "']"));
			clickElement(element);
			taskType = value;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "assignee":
			clickElement(assigneeField);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//li[text()='" + value + "']"));
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
		String expectedText = null;
		rowNumber = rowNumber+1;
		if(data.equals("task id")) {
			expectedText = taskId;
		} else {
			expectedText = getXmlFilesData(data);
		}
		
		String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber) + "']//*[@data-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(expectedText, getText(element));
	}
	
	/**
	 * verify drop down option from Task Page
	 * 
	 * @param option    - drop down option
	 * @param fieldName - field name
	 */
	public void verifyDropDownOptions(String option, String fieldName) {
		String name = getXmlFilesData(option);
		WebElement element = null;
		element = driver.findElement(By.xpath("//*[text()='" + name + "']"));
		verifyText(element, name);
	}

}

