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
 * This class has functionality for Document Type/ Template Type
 */
public class DocumentTypeOrTemplateTypePage extends GlobalFunctions {
	Logger log = LogManager.getLogger(DocumentTypeOrTemplateTypePage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public DocumentTypeOrTemplateTypePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Document/Template Type List']")
	WebElement documentTemplateTypetab;

	@FindBy(xpath = "//*[text()='Document Type/ Template Type']")
	List<WebElement> documentTemplateType;

	@FindBy(xpath = "//*[@role='tab' and text()='New Document/Template Type']")
	WebElement newdocumentTemplateType;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement documentTemplateTypeTable;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;
	
	@FindBy(xpath = "//*[@role='tab']")
	List<WebElement> tabs;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> systemDataFieldTableData;

	public String documentTemplateTypeTableColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String documentTemplateTypeTableData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='VisibilityIcon']")
	List<WebElement> viewIcon;
		
	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;
	
	@FindBy(xpath = "//*[@data-testid='ArrowBackIcon']")
	WebElement backArrow;
	
	@FindBy(xpath="//span[text()='Template Type']")
	WebElement templateTypeRadioBtn;
	
	@FindBy(xpath="//span[text()='Document Type']")
	WebElement documentTypeRadioBtn;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> documentTemplateTypeLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Cancel']")
	List<WebElement> mapCancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "doc-type-name")
	WebElement nameField;

	@FindBy(id = "doc-type-description")
	WebElement descriptionField;

	@FindBy(id = "doc-type-numbering-system")
	WebElement docTypeNumberingSystemOption;

	@FindBy(id = "doc-type-retention-schedule")
	WebElement retentionScheduleField;

	@FindBy(id = "systemDataField")
	WebElement systemDataFieldOption;
	
	@FindBy(id = "workflow_type")
	WebElement workflowTypeOption;
	
	@FindBy(xpath="//*[@name='reviewPeriodDuration']")
	WebElement reviewPerioDurationField;
	
	@FindBy(id = "doc-type-schedule-in-Daily")
	WebElement reminderScheduleDailyField;
	
	@FindBy(id = "doc-type-notify-users-list")
	WebElement notificationUserListOption;
	
	@FindBy(id = "doc-type-notify-department-list")
	WebElement notificationDepartmentListOption;
		
	@FindBy(id = "doc-type-notify-group-list")
	WebElement notificationGroupListOption;
	
	@FindBy(id = "doc-type-notify-role-list")
	WebElement notificationRoleListOption;
	
	@FindBy(xpath="//*[@name='priorReminderStartOn']")
	WebElement priorReminderStartOnField;	
	
	@FindBy(id = "doc-type-initial-ver")
	WebElement docTypeInitialVersionField;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom css-ahae4e']")
	List<WebElement> documentTemplateTypeLabels1;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-j5a1ma']")
	List<WebElement> radioBtnsAndCheckBoxes;

	@FindBy(xpath = "//*[@class='MuiSwitch-root MuiSwitch-sizeMedium css-ecvcn9']")
	List<WebElement> togleBtns;

	@FindBy(xpath = "//*[text()='Add']")
	WebElement addBtn;
	
	@FindBy(xpath = "//*[text()='Back']")
	WebElement backBtn;
	
	@FindBy(xpath = "//button[text()='Yes']|//button[text()='YES']")
	WebElement yesOption;
	
	@FindBy(xpath = "//button[text()='YES']")
	WebElement yesBTn;
	
	@FindBy(xpath = "//button[text()='NO']")
	WebElement noBtn;
	
	@FindBy(xpath = "//button[text()='No']|//button[text()='NO']")
	WebElement noOption;
	
	@FindBy(xpath = "//*[text()='Active']")
	WebElement activeOption;
	
	@FindBy(xpath = "//*[text()='Inactive']")
	WebElement inactiveOption;
	
	@FindBy(xpath = "//*[text()='Manual']")
	WebElement manualBtn;
	
	@FindBy(xpath = "//*[text()='Auto']")
	WebElement autoBtn;
	
	@FindBy(xpath = "//*[@name='content']")
	List<WebElement> contents;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement documentTypeMessage;

	@FindBy(xpath = "//*[text()= 'Document Type Name is required']")
	WebElement documentTypeNameRequired;

	@FindBy(xpath = "//*[text()='Document Type Description is required']")
	WebElement documentTypeDescriptionRequired;
	
	@FindBy(xpath = "//*[text()= 'Template Type Name is required']")
	WebElement templateTypeNameRequired;

	@FindBy(xpath = "//*[text()='Template Type Description is required']")
	WebElement templateTypeDescriptionRequired;

	@FindBy(xpath = "//*[text()='Please select Numbering System']")
	WebElement numberSystemRequired;

	@FindBy(xpath = "//*[text()='Retention Schedule is required']")
	WebElement retentionScheduleRequired;

	@FindBy(xpath = "//*[text()='Initial version is required']")
	WebElement initialVersionRequired;
	
	@FindBy(xpath = "//*[text()='Review Period Duration is required']")
	WebElement reviewPeriodDurationRequired;
	
	@FindBy(xpath = "//*[text()='Please add atleast one system data field']")
	WebElement systemDataFieldRequired;
	
	@FindBy(xpath = "//*[text()='Please add at least one workflow type']")
	WebElement workflowFieldRequired;
	
	@FindBy(xpath = "//*[text()='Prior Reminder is required']")
	WebElement priorReminderRequired;
	
	@FindBy(xpath = "//*[text()='Reminder Recurrence Schedule is required']")
	WebElement reminderRecurrenceScheduleRequired;

	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextBtn;

	@FindBy(xpath = "//button[text()='Days']")
	List<WebElement> daysOption;
	
	@FindBy(xpath = "//button[text()='Months']")
	WebElement monthsOption;
	
	@FindBy(xpath = "//button[text()='Weeks']")
	WebElement weeksOption;
	
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
	WebElement editDocumentTypeHeader;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h5 css-tv5qfu']")
	WebElement viewDocumentTypeHeader;

	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;

	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;

	@FindBy(xpath = "//*[text()='Reset Filter']")
	WebElement resetFilterBtn;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-7c3c59']")
	WebElement downloadBtn;

	@FindBy(id = "table-search")
	WebElement tableSearchField;

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-14349d1']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[@class='MuiBox-root css-25g08g']")
	WebElement scrollPage;

	public String optionName = "//*[@role ='option' and @data-value='#']";

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	public static String documentTypeTemplateTypeCreatedTime,documentTypeTemplateTypeUpdatedTime, documentTypeTemplateTypeDeletedTime, documentTypeTemplateTypeName,
			documemntTypeTemplateTypeDescription, documemntTypeTemplateTypeNumberingSystem, retentionScheduleInDays, documenTypeSystemDataTypeFieldValue, documenTypeWorkflowTypeValue,
			documenTypeNotificationUserList, documenTypeNotificationDepartmentValue, documentTypeNotificationGroupValue, workflowPrintValue,
			documentTypeNotificationRolesListValue;

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
		case "document type/template type":
			getTextFromElementInListAndValidate(documentTemplateType, name);
			break;
		case "document type/template type list tab":
			waitTillAttributeDisplay(documentTemplateTypetab, "role", "tab", Duration.ofSeconds(20));
			verifyText(documentTemplateTypetab, name);
			break;
		case "new document type/template type":
			verifyText(newdocumentTemplateType, name);
			break;
		case "label document type name":
		case "label template type name":
		case "label description":
		case "label numbering system":
		case "label default retention schedule":
		case "label initial version":
		case "label select system data field":
		case "label workflow type":
		case "label review period duration":
		case "label prior reminder starts from in days":
		case "label reminder recurrence schedule in daily":
		case "label notification users list":
		case "label notification departments list":
		case "label notification groups list":
		case "label notification roles list":			
			getTextFromElementInListAndValidate(documentTemplateTypeLabels, name);
			break;
		case "manual radio button":
		case "auto radio button":
		case "daily":
		case "weekly":
		case "monthly":
			getTextFromElementInListAndValidate(radioBtnsAndCheckBoxes, name);
			break;
		case "label selected content default format":
		case "label selected content template":
		case "label selected content external document":
		case "label select location type":
		case "label select status active":
		case "label select status inactive":
		case "label delete draft no":
		case "label delete draft yes":
		case "label selected location type manual":
		case "label selected location type auto":
		case "label review period applicable yes":
		case "label review period duration days":
		case "label prior reminder starts from days":
		case "label reminder recurrence schedule":
				getTextFromElementInListAndValidate(documentTemplateTypeLabels1, name);
			break;				
		case "yes":
			verifyText(yesOption, name);
			break;
		case "no":
			verifyText(noOption, name);
			break;
		case "active":
			verifyText(activeOption, name);
			break;
		case "inactive":
			verifyText(inactiveOption, name);
			break;
		case "manual":
			verifyText(manualBtn, name);
			break;
		case "auto":
			verifyText(autoBtn, name);
			break;
		case "default format":
		case "template":
		case "external document":
			getTextFromElementInListAndValidate(contents, name);
			break;	
		case "days":
			getTextFromElementInListAndValidate(daysOption, name);
			break;
		case "months":
			verifyText(monthsOption, name);
			break;	
		case "weeks":
			verifyText(weeksOption, name);
			break;	
		case "cancel":
			verifyText(cancelBtn, name);
			break;		
		case "warning message document type name is required":
			verifyText(documentTypeNameRequired, name);
			break;
		case "warning message document type description is required":
			verifyText(documentTypeDescriptionRequired, name);
			break;
		case "warning message please select numbering system":
			verifyText(numberSystemRequired, name);
			break;
		case "warning message retention schedule is required":
			verifyText(retentionScheduleRequired, name);
			break;
		case "warning message initial version is required":
			verifyText(initialVersionRequired, name);
			break;
		case "warning message template type name is required":
			verifyText(templateTypeNameRequired, name);
			break;	
		case "warning message template type description is required":
			verifyText(templateTypeDescriptionRequired, name);
			break;	
		case "warning message review period duration is required":
			verifyText(reviewPeriodDurationRequired, name);
			break;
		case "warning message please add atleast one system data field":
			verifyText(systemDataFieldRequired, name);
			break;
		case "warning message please add atleast one workflow type":
			verifyText(workflowFieldRequired, name);
			break;
		case "warning message prior reminder is required":
			verifyText(priorReminderRequired, name);
			break;
		case "warning message reminder recurrence schedule is required":
			verifyText(reminderRecurrenceScheduleRequired, name);
			break;
		case "document type created successfully message":
		case "document type already present message":
		case "document type updated successfully message":
		case "document type deleted successfully message":
			verifyText(documentTypeMessage, name);
			if (fieldName.contains("created")) {
				documentTypeTemplateTypeCreatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				documentTypeTemplateTypeUpdatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("delete")) {
				documentTypeTemplateTypeDeletedTime = dateTimeiFunctions.getCurrentTime();
			}
			break;
		case "confirm you delete":
			text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			compareTwoString(text, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit docuement type/template type header":
			verifyText(editDocumentTypeHeader, name);
			break;
		case "view docuement type/template type header":
			verifyText(viewDocumentTypeHeader, name);
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
		case "add":
			verifyText(addBtn, name);
			break;
		case "next":
			verifyText(nextBtn, name);
			break;
		case "back":
			verifyText(backBtn, name);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify document/template type table column headers name
	 * 
	 * @param columnHeaders - document/template type column headers name
	 */
	public void verifyDocumentTemplateTypeTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(documentTemplateTypeTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			scrollScrollBar(documentTemplateTypeTable, 17, Constant.RIGHT);
		}
		scrollScrollBar(documentTemplateTypeTable, 300, Constant.LEFT);
		// compare expected and actual column headers
		log.info("document/template type column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("document/template type column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInDocumentTemplateTypeTable() {
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
		case "document type/template type":
			clickOnPerticularListElement(documentTemplateType, 0);
			break;
		case "document type/template type list tab":
			clickElement(documentTemplateTypetab);
			break;
		case "new document type/template type":
			clickElement(newdocumentTemplateType);
			break;
		case "template type":
			clickElement(templateTypeRadioBtn);
			break;
		case "document type":
			clickElement(documentTypeRadioBtn);
			break;			
		case "default format":
			clickOnPerticularListElement(contents, 0);
			break;
		case "template":
			clickOnPerticularListElement(contents, 1);
			break;
		case "external document":
			clickOnPerticularListElement(contents, 2);
			break;				
		case "yes":
			clickElement(yesOption);
			break;
		case "no":
			clickElement(noOption);
			break;
		case "active":
			clickElement(activeOption);
			break;
		case "inactive":
			clickElement(inactiveOption);
			break;
		case "manual":
			clickElement(manualBtn);
			break;
		case "auto":
			clickElement(autoBtn);
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
		case "view":
			clickOnPerticularListElement(viewIcon, 0);
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
		case "back arrow":
			clickElement(backArrow);
			break;		
		case "save":
			clickElement(saveBtn);
			break;
		case "add":
			clickElement(addBtn);
			break;
		case "next":
			clickElement(nextBtn);
			break;
		case "select field type option":
			clickElement(dropdownIcon);
			break;
		case "reset all":
			clickElement(resetFilterBtn);
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
			if (documentTypeTemplateTypeName == null) {
				documentTypeTemplateTypeName = String.format("%s%s", fieldValue, generateRandomString(3));
			}
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, documentTypeTemplateTypeName);
			break;
		case "description":
			descriptionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(descriptionField, fieldValue);
			documemntTypeTemplateTypeDescription = fieldValue;
			break;
		case "retention schedule":
			retentionScheduleField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(retentionScheduleField, fieldValue);
			retentionScheduleInDays = fieldValue;
			break;
		case "initial version":
			docTypeInitialVersionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(docTypeInitialVersionField, fieldValue);
			break;
		case "review period duration":
			reviewPerioDurationField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(reviewPerioDurationField, fieldValue);
			break;
		case "reminder recurrence schedule":
			reminderScheduleDailyField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(reminderScheduleDailyField, fieldValue);
			break;	
		case "prior reminder starts from":
			priorReminderStartOnField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(priorReminderStartOnField, fieldValue);
			break;	
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text document type name")) {
				enterValue(tableSearchField, documentTypeTemplateTypeName);
			} else {
				enterValue(tableSearchField, fieldValue);
			}
			break;
		case "edit name":
			documentTypeTemplateTypeName = String.format("%s%s", fieldValue, generateRandomString(7));
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, documentTypeTemplateTypeName);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in document/template type
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataFromTable(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] documentTemplateTypeExpectedData = rowData.split("\\|");

		if (documentTemplateTypeExpectedData[0].equals("##")) {
			documentTemplateTypeExpectedData[0] = documentTypeTemplateTypeName;
		}
		if (documentTemplateTypeExpectedData[2].equals("##")) {
			documentTemplateTypeExpectedData[2] = documemntTypeTemplateTypeNumberingSystem;
		}		
		if (documentTemplateTypeExpectedData[3].equals("##")) {
			documentTemplateTypeExpectedData[3] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (documentTemplateTypeExpectedData[5].equals("##")) {
			documentTemplateTypeExpectedData[5] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		int columnLength = documentTemplateTypeExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber + 1) + "']/..//*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			scrollScrollBar(documentTemplateTypeTable, 15, Constant.RIGHT);
		}
		scrollScrollBar(documentTemplateTypeTable, 200, Constant.LEFT);
		log.info(String.format("mentioned row %s %s", rowNumber, documentTemplateTypeExpectedData));
		Assert.assertTrue(compareArrayAndList(documentTemplateTypeExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromDocumentTemplateTypePage(String data, String fieldName) {
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
		case "numbering system":
			clickElement(docTypeNumberingSystemOption);
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
		case "select systen data field":
			clickElement(systemDataFieldOption);
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
			documenTypeSystemDataTypeFieldValue = getText(systemDataFieldOption);
			break;
		case "workflow type":
			clickElement(workflowTypeOption);
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
			documenTypeWorkflowTypeValue = getText(workflowTypeOption);
			break;
		case "notification users list":
			clickElement(notificationUserListOption);
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
			documenTypeNotificationUserList = getText(notificationUserListOption);
			break;
		case "notification department list":
			clickElement(notificationDepartmentListOption);
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
			documenTypeNotificationDepartmentValue = getText(notificationDepartmentListOption);
			break;
		case "notification groups list":
			clickElement(notificationGroupListOption);
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
			documentTypeNotificationGroupValue = getText(notificationGroupListOption);
			break;
		case "notification roles list":
			clickElement(notificationRoleListOption);
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
			documentTypeNotificationRolesListValue = getText(notificationRoleListOption);
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
				scrollScrollBar(documentTemplateTypeTable, 2, Constant.DOWN);
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
				scrollScrollBar(documentTemplateTypeTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(documentTemplateTypeTable, 20, Constant.TOP);
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
		if (data.equals("text document type name")) {
			rowData = documentTypeTemplateTypeName;
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
	public void selectDropDownfromDocuementTypePage(int index, String fieldName) {
		switch (fieldName) {
		case "select numbering system":
			clickElement(docTypeNumberingSystemOption);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickOnPerticularListElement(option, index);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			documemntTypeTemplateTypeNumberingSystem = getText(docTypeNumberingSystemOption);
			break;
		case "select system data field":
			clickElement(systemDataFieldOption);
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
			documenTypeSystemDataTypeFieldValue = getText(systemDataFieldOption);
			break;
		case "select workflow type field":
			clickElement(workflowTypeOption);
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
			documenTypeWorkflowTypeValue = getText(workflowTypeOption);
			break;
		case "notification users list":
			clickElement(notificationUserListOption);
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
			documenTypeNotificationUserList = getText(notificationUserListOption);
			break;
		case "notification departments list":
			clickElement(notificationDepartmentListOption);
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
			documenTypeNotificationDepartmentValue = getText(notificationDepartmentListOption);
			break;
		case "notification groups list":
			clickElement(notificationGroupListOption);
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
			documentTypeNotificationGroupValue = getText(notificationGroupListOption);
			break;
		case "notification roles list":
			clickElement(notificationRoleListOption);
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
			documentTypeNotificationRolesListValue = getText(notificationRoleListOption);
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}
	
	/**
	 * verify document/template type tabs
	 * 
	 * @param tabNames - document/template type tabs
	 */
	public void verifyDocumentTemplateTypeTabs(String tabNames) {
		// wait for element to load
		String names = getXmlFilesData(tabNames);
		String[] ExpectedTabNames = names.split("\\|");
		List<String> actualTabNames = new ArrayList<>();
		for (int i = 2; i < tabs.size(); i++) {
			actualTabNames.add(getText(tabs.get(i)));
		}
		// compare expected and actual column headers
		log.info("document/template type tabs " + actualTabNames);
		Assert.assertTrue(compareArrayAndList(ExpectedTabNames, actualTabNames));
		log.info("document/template type tabs displayed");
	}

}
