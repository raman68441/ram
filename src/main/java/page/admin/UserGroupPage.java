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
import page.GlobalFunctions;
import page.PaginationPage;
import utility.Constant;
import utility.DateTimeiFunctions;

/*
 * This class has the User Group functionality 
 */
public class UserGroupPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(UserGroupPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public UserGroupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='User Group List']")
	WebElement userGroupTab;

	@FindBy(xpath = "//*[text()='User Group']")
	WebElement userGroup;

	@FindBy(xpath = "//*[@role='tab' and text()='New User Group']")
	WebElement newUserGroup;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement usergroupTable;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String userGroupTableColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String userGroupTableData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> userGroupLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Cancel']")
	List<WebElement> cancelBtn1;
	
	@FindBy(xpath = "//*[text()='Save ']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "role-name")
	WebElement nameField;

	@FindBy(id = "role-description")
	WebElement descriptionField;

	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-d0vyis']")
	List<WebElement> addEditViewUserGroupPrivileges;
	
	@FindBy(xpath = "//*[text()='Add Users']")
	List<WebElement> addUsers;
	
	@FindBy(xpath = "//*[text()='Add User Group']")
	List<WebElement> addUserGroup;
	
	@FindBy(xpath = "//*[text()='Add Privileges']")
	List<WebElement> addPrivileges;
	
	@FindBy(xpath = "//*[text()='Clear']")
	WebElement clearBtn;
	
	@FindBy(xpath = "//*[@aria-label='Select all rows']")
	WebElement selectAllRowCheckBox;
	
	@FindBy(xpath = "//*[text()='Add Users']")
	List<WebElement> addUserBtn;

	@FindBy(xpath = "//*[text()='Add User Groups']")
	List<WebElement> addUserGroupBtn;
	
	@FindBy(xpath = "//*[text()='Add Privileges']")
	List<WebElement> addPrivilegesBtn;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement userGroupMessage;

	@FindBy(id="role-name-helper-text")
	WebElement nameRequired;
	
	@FindBy(id="role-description-helper-text")
	WebElement descriptionRequired;
		
	@FindBy(xpath = "//*[text()= 'At least one user group is required']")
	WebElement userGroupRequired;

	@FindBy(xpath = "//*[text()='At least one privilege is required']")
	WebElement privilegeRequired;

	@FindBy(xpath = "//*[text()='At least one user is required']")
	WebElement oneUserRequired;

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
	WebElement editUserGroupHeader;
	
	@FindBy(xpath = "//*[text()='View User Group']")
	WebElement viewUserGroupHeader;

	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;

	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-1hrzbqz']")
	WebElement resetFilterBtn;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-7c3c59']")
	WebElement downloadBtn;

	@FindBy(id = "table-search")
	WebElement tableSearchField;
	
	@FindBy(id = "search-user")
	WebElement tableSearchUserField;
	
	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-14349d1']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[@class='MuiBox-root css-1km9knq']")
	WebElement scrollPage;
	
	@FindBy(xpath = "//*[@type='checkbox']")
	List<WebElement> checkBoxes;

	public String optionName = "//*[@role ='option' and @data-value='#']";

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;
	
	public String tableCheckBox = "//*[@data-rowindex='rowNo']/*[@data-colindex='columnNo']/..//*[@type='checkbox']";

	public static String userGroupCreatedTime, userGroupUpdatedTime, userGroupDeletedTime, userGroupName,
			userGroupDescriptionValue;    

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
		case "user group":
			verifyText(userGroup, name);
			break;
		case "user group list tab":
			waitTillAttributeDisplay(userGroupTab, "role", "tab", Duration.ofSeconds(20));
			verifyText(userGroupTab, name);
			break;
		case "new user group":
			verifyText(newUserGroup, name);
			break;
		case "label name":
		case "label description":
			getTextFromElementInListAndValidate(userGroupLabels, name);
			break;
		case "add users link":
		case "add user group link":
		case "add privileges link":
		case "view/edit users link":
		case "view/edit user group link":
		case "view/edit privileges link":	
			getTextFromElementInListAndValidate(addEditViewUserGroupPrivileges, name);
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;			
		case "warning message name is required field":
			verifyText(nameRequired, name);
			break;
		case "warning message description is required field":
			verifyText(descriptionRequired, name);
			break;
		case "warning message at least one user is required":
			verifyText(oneUserRequired, name);
			break;
		case "warning message at least one user group is required":
			verifyText(userGroupRequired, name);
			break;
		case "warning message at least one privilege is required":
			verifyText(privilegeRequired, name);
			break;
		case "user group created successfully message":
		case "user group already present message":
		case "user group updated successfully message":
		case "user group delete message":
			verifyText(userGroupMessage, name);
			if (fieldName.contains("created")) {
				userGroupCreatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				userGroupUpdatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("delete")) {
				userGroupDeletedTime = dateTimeiFunctions.getCurrentTime();
			}
			break;
		case "confirm you delete":
			text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			compareTwoString(text, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit user group header":
			verifyText(editUserGroupHeader, name);
			break;
		case "view user group header":
			verifyText(viewUserGroupHeader, name);
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
		case "clear":
			verifyText(clearBtn, name);
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
		case "add users":
			text = getTextFromElementInListInMentionedPosition(addUserBtn, 2);
			compareTwoString(text, name);
			break;	
		case "add user group":
			text = getTextFromElementInListInMentionedPosition(addUserGroupBtn, 1);
			compareTwoString(text, name);
			break;	
		case "add privileges":
			text = getTextFromElementInListInMentionedPosition(addPrivilegesBtn, 2);
			compareTwoString(text, name);
			break;				
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify user group table column headers name
	 * 
	 * @param columnHeaders - user group column headers name
	 */
	public void verifyUserGroupTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(usergroupTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			scrollScrollBar(usergroupTable, 20, Constant.RIGHT);
		}
		scrollScrollBar(usergroupTable, 300, Constant.LEFT);
		// compare expected and actual column headers
		log.info("User Group column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("User Group column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInUserGroupTable() {
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
		case "user group":
			clickElement(userGroup);
			break;
		case "user group tab":
			clickElement(userGroupTab);
			break;
		case "new user group":
			clickElement(newUserGroup);
			break;
		case "cancel":
			clickElement(cancelBtn);
			break;
		case "add users link":
		case "view/edit users link":
			clickOnPerticularListElement(addEditViewUserGroupPrivileges, 0);
			break;
		case "add user group link":
		case "view/edit user group link":
			clickOnPerticularListElement(addEditViewUserGroupPrivileges, 1);
			break;
		case "add privileges link":
		case "view/edit privileges link":
			clickOnPerticularListElement(addEditViewUserGroupPrivileges, 2);
			break;
		case "add users":
			clickOnPerticularListElement(addUserBtn, 2);
			break;	
		case "add user group":
			clickOnPerticularListElement(addUserGroupBtn, 1);
			break;	
		case "add privileges":
			clickOnPerticularListElement(addPrivilegesBtn, 1);
			break;		
		case "add user cancel":
		case "add user group cancel":
		case "add privileges cancel":
			clickOnPerticularListElement(cancelBtn1, 1);
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
		case "clear":
			clickElement(clearBtn);
			break;
		case "select all row check box":
			selectAllRowCheckBox.click();
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
			if (userGroupName == null) {
				userGroupName = String.format("%s%s", fieldValue, generateRandomString(4));
			}
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, userGroupName);
			break;
		case "description":
			descriptionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(descriptionField, fieldValue);
			userGroupDescriptionValue = fieldValue;
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text user group name")) {
				enterValue(tableSearchField, userGroupName);
			} else {
				enterValue(tableSearchField, fieldValue);
			}
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "edit name":
			userGroupName = String.format("%s%s", fieldValue, generateRandomString(7));
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, userGroupName);
			break;
		case "search user":
			tableSearchUserField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(tableSearchUserField, fieldValue);
			break;	
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in user group
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataFromTable(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] userGroupExpectedData = rowData.split("\\|");

		if (userGroupExpectedData[0].equals("##")) {
			userGroupExpectedData[0] = userGroupName;
		}
		if (userGroupExpectedData[3].equals("##")) {
			userGroupExpectedData[3] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (userGroupExpectedData[5].equals("##")) {
			userGroupExpectedData[5] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		int columnLength = userGroupExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber + 1) + "']/..//*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			scrollScrollBar(usergroupTable, 15, Constant.RIGHT);
		}
		scrollScrollBar(usergroupTable, 200, Constant.LEFT);
		log.info(String.format("mentioned row %s %s", rowNumber, userGroupExpectedData));
		Assert.assertTrue(compareArrayAndList(userGroupExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromUserGroupPage(String data, String fieldName) {
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
				scrollScrollBar(usergroupTable, 2, Constant.DOWN);
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
				scrollScrollBar(usergroupTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(usergroupTable, 20, Constant.TOP);
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
		if (data.equals("text user group name")) {
			rowData = userGroupName;
		} else {
			rowData = getXmlFilesData(data);
		}

		String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber + 1) + "']/..//*[@data-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}
	
	/**
	 * Click on mentioned check boxes in table or all the check boxes in table
	 * 
	 * @param rowNumber    - row number
	 * @param columnNumber -
	 */
	public void clickOnMentionedCheckBoxes(String rowNumber, String columnNumber) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rowNumber.equals("all rows")) {
			for (int i = 0; i < checkBoxes.size(); i++) {
				clickOnPerticularListElement(checkBoxes, i);
			}
		} else {
			String dataRowNoReplace = tableCheckBox.replace("rowNo", rowNumber);
			String dataColumnNoReplace = dataRowNoReplace.replace("columnNo", columnNumber);
			WebElement element = driver.findElement(By.xpath(dataColumnNoReplace));
			element.click();
		}
	}

}
