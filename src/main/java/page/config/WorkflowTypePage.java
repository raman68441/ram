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

/*
 * This class has the functionality about Workflow Type page
 */
public class WorkflowTypePage extends GlobalFunctions {
	Logger log = LogManager.getLogger(WorkflowTypePage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public WorkflowTypePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Workflow Type']")
	WebElement workflowTypetab;

	@FindBy(xpath = "//*[text()='Workflow Type']")
	List<WebElement> workflowType;

	@FindBy(xpath = "//*[@role='tab' and text()='New Workflow Type']")
	WebElement newWorkflowType;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement workflowTypeTable;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String workflowTypeTableColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String workflowTypeTableData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> workflowTypeLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Cancel']")
	List<WebElement> mapCancelBtn;
	
	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "workflow_type_name")
	WebElement nameField;

	@FindBy(id = "workflow_type_Description")
	WebElement descriptionField;

	@FindBy(id = "workflow_type_delay_num")
	WebElement workflowTypeDelayNumField;

	@FindBy(id = "workflow_type_prefix")
	WebElement prefixield;

	@FindBy(id = "workflow_type_sn_start")
	WebElement serialNumberStartValueField;

	@FindBy(id = "workflow_type_sn_length")
	WebElement serialNumberLengthInDigitField;

	@FindBy(id = "workflow_type_release_conditions")
	WebElement workflowTypeReleaseCondtionOption;

	@FindBy(xpath = "//*[text()='Add Lifecycle State']")
	WebElement addLifeCycleStateBtn;

	@FindBy(xpath = "//*[text()='Added Lifecycle States:']")
	WebElement labelAddedLifecycleStates;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> workflowTypeLabels1;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input css-1m9pwf3']")
	List<WebElement> radioBtns;

	@FindBy(xpath = "//*[@class='MuiSwitch-root MuiSwitch-sizeMedium css-ecvcn9']")
	List<WebElement> togleBtns;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-j5a1ma']")
	List<WebElement> workflowTypeLabels2;

	@FindBy(xpath = "//*[text()='Yes']")
	List<WebElement> yesLabel;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement workflowTypeMessage;

	@FindBy(xpath = "//*[text()= 'Workflow Type Name is required']")
	WebElement workflowTypeNameRequired;

	@FindBy(xpath = "//*[text()='Workflow Type Description is required']")
	WebElement workflowTypeDescriptionRequired;

	@FindBy(xpath = "//*[text()='Prefix is required']")
	WebElement prefixRequired;

	@FindBy(xpath = "//*[text()='Serial Number Start Value is required']")
	WebElement serialNumberStartValueRequired;

	@FindBy(xpath = "//*[text()='Serial Number Length is required']")
	WebElement serialNumberLengthRequired;

	@FindBy(xpath = "//*[text()='Please select workflow release condition']")
	WebElement selectWorkflowReleaseCondtionRequired;

	@FindBy(xpath = "//*[text()='Map']")
	WebElement mapBtn;

	@FindBy(xpath = "//*[text()='Add Lifecycle State']")
	WebElement addLifecycleSateHeader;

	@FindBy(id = "add_lifecycle_state")
	WebElement selectLifeCycleStateOption;

	@FindBy(id = "add_lifecycle_role")
	WebElement selectRoleOption;

	@FindBy(id = "add_lifecycle_department")
	List<WebElement> selectDepartmentAndActionOption;

	@FindBy(id = "add_lifecycle_checklist")
	WebElement selectChecklistOption;

	@FindBy(id = "add_lifecycle_notification_type")
	WebElement addNotificationTypeOption;

	@FindBy(id = "add_lifecycle_print_type")
	WebElement addLifecyclePrintTypeOption;

	@FindBy(id = "add_lifecycle_signature")
	WebElement meaningOfSignatureField;

	@FindBy(id = "add_lifecycle_user_count")
	List<WebElement> minimumUserCountAndSLAField;

	@FindBy(id = "add_lifecycle_increment_type")
	WebElement incrementTypeOption;

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

	@FindBy(xpath = "//*[text()='Edit Workflow Type']")
	WebElement editWorkflowtypeHeader;

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

	@FindBy(xpath = "//*[@class='MuiBox-root css-1km9knq']")
	WebElement scrollPage;

	public String optionName = "//*[@role ='option' and @data-value='#']";

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	public static String workflowTypeCreatedTime, workflowTypeUpdatedTime, workflowTypeDeletedTime, workflowTypeName,
			workflowTypeDescriptionValue, prefixValue, workflowLifeCycleStateValue, workflowRoleValue,
			workflowActionValue, workflowChecklistValue, workflowNotificationValue,
			workflowPrintValue, workflowDepartmentValue, workflowIncrementTypeValue;

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
		case "workflow type":
			getTextFromElementInListAndValidate(workflowType, name);
			break;
		case "workflow type tab":
			waitTillAttributeDisplay(workflowTypetab, "role", "tab", Duration.ofSeconds(20));
			verifyText(workflowTypetab, name);
			break;
		case "new workflow type":
			verifyText(newWorkflowType, name);
			break;
		case "label name":
		case "label description":
		case "label prefix":
		case "label serial number length in digit":
		case "label serial number start value":
		case "label release condtions":
		case "label select lifecycle state":
		case "label select role":
		case "label select action/activity":
		case "label select checklist":
		case "label select notification type":
		case "label select print type":
		case "label select department":
		case "label meaning of signature":
		case "label minimum user count":
		case "label increment type":
		case "label sla/days":
			getTextFromElementInListAndValidate(workflowTypeLabels, name);
			break;
		case "label added lifecycle states":
			verifyText(labelAddedLifecycleStates, name);
			break;	
		case "add life cycle state":
			verifyText(addLifeCycleStateBtn, name);
			break;			
		case "label workflow sequence":
		case "label workflow activation required":
			getTextFromElementInListAndValidate(workflowTypeLabels1, name);
			break;
		case "label associate documents":
		case "label delete draft":
		case "label serial":
		case "label parallel":
		case "label yes":
		case "label no":
			getTextFromElementInListAndValidate(workflowTypeLabels2, name);
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "warning message workflow type name is required":
			verifyText(workflowTypeNameRequired, name);
			break;
		case "warning message workflow type description is required":
			verifyText(workflowTypeDescriptionRequired, name);
			break;
		case "warning message prefix is required":
			verifyText(prefixRequired, name);
			break;
		case "warning message serial number start value is required":
			verifyText(serialNumberStartValueRequired, name);
			break;
		case "warning message serial number length is required":
			verifyText(serialNumberLengthRequired, name);
			break;
		case "warning message please select workflow release condition":
			verifyText(selectWorkflowReleaseCondtionRequired, name);
			break;
		case "workflow type created successfully message":
		case "workflow type already present message":
		case "workflow type updated successfully message":
		case "workflow type delete message":
			verifyText(workflowTypeMessage, name);
			if (fieldName.contains("created")) {
				workflowTypeCreatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				workflowTypeUpdatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("delete")) {
				workflowTypeDeletedTime = dateTimeiFunctions.getCurrentTime();
			}
			break;
		case "confirm you delete":
			text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			compareTwoString(text, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit workflow type header":
			verifyText(editWorkflowtypeHeader, name);
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
		case "map":
			verifyText(mapBtn, name);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify workflow type table column headers name
	 * 
	 * @param columnHeaders - workflow type column headers name
	 */
	public void verifyWorkflowTypeTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(workflowTypeTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			scrollScrollBar(workflowTypeTable, 17, Constant.RIGHT);
		}
		scrollScrollBar(workflowTypeTable, 300, Constant.LEFT);
		// compare expected and actual column headers
		log.info("Workflow type column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("Workflow type column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInWorkflowTypeTable() {
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
		case "workflow type":
			clickOnPerticularListElement(workflowType, 0);
			break;
		case "workflow type tab":
			clickElement(workflowTypetab);
			break;
		case "new workflow type":
			clickElement(newWorkflowType);
			break;
		case "cancel":
			clickElement(cancelBtn);
			break;
		case "add life cycle state cancel":
			clickOnPerticularListElement(mapCancelBtn, 1);
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
		case "map":
			clickElement(mapBtn);
			break;
		case "add life cycle state":
			clickElement(addLifeCycleStateBtn);
			break;
		case "select field type option":
			clickElement(dropdownIcon);
			break;
		case "reset all":
			clickElement(resetFilterBtn);
			break;
		case "serial":
			clickOnPerticularListElement(radioBtns, 0);
			break;
		case "parallel":
			clickOnPerticularListElement(radioBtns, 1);
			break;
		case "activation yes":
			clickOnPerticularListElement(radioBtns, 2);
			break;
		case "activation no":
			clickOnPerticularListElement(radioBtns, 3);
			break;
		case "associate documents":
			clickOnPerticularListElement(togleBtns, 0);
			break;
		case "delete draft":
			clickOnPerticularListElement(togleBtns, 1);
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
		WebElement element = null;
		switch (fieldName) {
		case "name":
			if (workflowTypeName == null) {
				workflowTypeName = String.format("%s%s", fieldValue, generateRandomString(4));
			}
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, workflowTypeName);
			break;
		case "description":
			descriptionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(descriptionField, fieldValue);
			workflowTypeDescriptionValue = fieldValue;
			break;
		case "prefix":
			prefixield.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(prefixield, fieldValue);
			prefixValue = fieldValue;
			break;
		case "serial number start value":
			serialNumberStartValueField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(serialNumberStartValueField, fieldValue);
			break;
		case "serial number length in digit":
			serialNumberLengthInDigitField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(serialNumberLengthInDigitField, fieldValue);
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text workflow type name")) {
				enterValue(tableSearchField, workflowTypeName);
			} else {
				enterValue(tableSearchField, fieldValue);
			}
			break;
		case "edit name":
			workflowTypeName = String.format("%s%s", fieldValue, generateRandomString(7));
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, workflowTypeName);
			break;
		case "minimum user count":
			element = minimumUserCountAndSLAField.get(0);
			element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(element, fieldValue);
			break;
		case "sla/days":
			element = minimumUserCountAndSLAField.get(1);
			element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(element, fieldValue);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in workflow type
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataFromTable(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] workflowTypeExpectedData = rowData.split("\\|");

		if (workflowTypeExpectedData[0].equals("##")) {
			workflowTypeExpectedData[0] = workflowTypeName;
		}
		if (workflowTypeExpectedData[2].equals("##")) {
			workflowTypeExpectedData[2] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (workflowTypeExpectedData[4].equals("##")) {
			workflowTypeExpectedData[4] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		int columnLength = workflowTypeExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber + 1) + "']/..//*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			scrollScrollBar(workflowTypeTable, 15, Constant.RIGHT);
		}
		scrollScrollBar(workflowTypeTable, 200, Constant.LEFT);
		log.info(String.format("mentioned row %s %s", rowNumber, workflowTypeExpectedData));
		Assert.assertTrue(compareArrayAndList(workflowTypeExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromWorkflowTypePage(String data, String fieldName) {
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
		case "work flow release condition":
			clickElement(workflowTypeReleaseCondtionOption);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//*[@role='option' and text()='" + value + "']"));
			clickElement(element);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "select life cycle state":
			clickElement(selectLifeCycleStateOption);
			try {
				Thread.sleep(300);
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
			workflowLifeCycleStateValue = getText(selectLifeCycleStateOption);
			break;
		case "select role":
			clickElement(selectRoleOption);
			try {
				Thread.sleep(300);
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
			workflowRoleValue = getText(selectRoleOption);
			break;
		case "select action/activity":
			clickOnPerticularListElement(selectDepartmentAndActionOption, 1);
			try {
				Thread.sleep(300);
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
			workflowActionValue = getTextFromElementInListInMentionedPosition(selectDepartmentAndActionOption, 1);
			break;
		case "select checklist":
			clickElement(selectChecklistOption);
			try {
				Thread.sleep(300);
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
			workflowChecklistValue = getText(selectChecklistOption);
			break;
		case "select notification type":
			clickElement(addNotificationTypeOption);
			try {
				Thread.sleep(300);
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
			workflowNotificationValue = getText(addNotificationTypeOption);
			break;
		case "select print type":
			clickElement(addLifecyclePrintTypeOption);
			try {
				Thread.sleep(300);
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
			workflowPrintValue = getText(addLifecyclePrintTypeOption);
			break;
		case "increment type":
			clickElement(incrementTypeOption);
			try {
				Thread.sleep(300);
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
			workflowIncrementTypeValue = getText(incrementTypeOption);
			break;
		case "select department":
			clickOnPerticularListElement(selectDepartmentAndActionOption, 0);
			try {
				Thread.sleep(300);
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
			workflowDepartmentValue = getTextFromElementInListInMentionedPosition(selectDepartmentAndActionOption, 0);
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
				scrollScrollBar(workflowTypeTable, 2, Constant.DOWN);
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
				scrollScrollBar(workflowTypeTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(workflowTypeTable, 20, Constant.TOP);
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
		if (data.equals("text workflow type name")) {
			rowData = workflowTypeName;
		} else {
			rowData = getXmlFilesData(data);
		}

		String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber + 1) + "']/..//*[@data-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}

	/**
	 * Select index from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromWorkflowTypePage(int index, String fieldName) {
		switch (fieldName) {
		case "select life cycle state":
			clickElement(selectLifeCycleStateOption);
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
			workflowLifeCycleStateValue = getText(selectLifeCycleStateOption);
			break;
		case "select role":
			clickElement(selectRoleOption);
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
			workflowRoleValue = getText(selectRoleOption);
			break;
		case "select action/activity":
			clickOnPerticularListElement(selectDepartmentAndActionOption, 1);
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
			workflowActionValue = getTextFromElementInListInMentionedPosition(selectDepartmentAndActionOption, 1);
			break;
		case "select checklist":
			clickElement(selectChecklistOption);
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
			workflowChecklistValue = getText(selectChecklistOption);
			break;
		case "select notification type":
			clickElement(addNotificationTypeOption);
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
			workflowNotificationValue = getText(addNotificationTypeOption);
			break;
		case "select print type":
			clickElement(addLifecyclePrintTypeOption);
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
			workflowPrintValue = getText(addLifecyclePrintTypeOption);
			break;
		case "increment type":
			clickElement(incrementTypeOption);
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
			workflowIncrementTypeValue = getText(incrementTypeOption);
			break;
		case "select department":
			clickOnPerticularListElement(selectDepartmentAndActionOption, 0);
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
			workflowDepartmentValue = getTextFromElementInListInMentionedPosition(selectDepartmentAndActionOption, 0);
			break;		
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}

}
