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
/**
 * This class has User 
 */
public class UserCreationPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(UserCreationPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public UserCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='User List']")
	WebElement userListtab;

	@FindBy(xpath = "//*[text()='User Creation']")
	WebElement userCreation;

	@FindBy(xpath = "//*[@role='tab' and text()='Create New User']")
	WebElement newUserCreation;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement userListTable;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;
	
	@FindBy(xpath = "//*[@data-colindex='1']")
	List<WebElement> firstColumnData;

	public String userListTableColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String userListTableData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;
	
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorInfo MuiIconButton-sizeSmall css-tab6b8']")
	List<WebElement> viewIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	WebElement deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> userCreationLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;
	
	@FindBy(xpath = "//*[text()='View/Edit Added Privileges']")
	WebElement viewEditAddedPrivileges;
	
	@FindBy(xpath = "//*[text()='View/Edit Privileges']")
	WebElement viewEditPrivilegesHeader;
	
	@FindBy(xpath = "//*[text()='Close']")
	WebElement closeBtn;
	
	@FindBy(xpath = "//*[text()='Add Privileges']")
	WebElement addPrevileges;

	@FindBy(xpath = "//*[text()='Cancel']")
	List<WebElement> previligeCancelBtn;
	
	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "user-login-id")
	WebElement loginIdField;

	@FindBy(id = "user-name")
	WebElement userNameField;

	@FindBy(id = "user-email")
	WebElement userEmailField;

	@FindBy(id = "user-employee-number")
	WebElement userEmployeeNumberField;

	@FindBy(id = "user-domain")
	WebElement userDomainField;

	@FindBy(id = "user-job-title")
	WebElement UserJobTitleField;

	@FindBy(id = "user-type")
	WebElement userTypeOption;
	
	@FindBy(id = "user-authentication-type")
	WebElement userOthenticationTypeOption;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom css-ahae4e']")
	List<WebElement> userCreationLabels1;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h6 css-1ef12w5']")
	WebElement editViewUserCreationHeader;

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

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-14349d1']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[@class='MuiBox-root css-1km9knq']")
	WebElement scrollPage;

	public String optionName = "//*[@role ='option' and @data-value='#']";
	
	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;
	
	@FindBy(xpath = "//*[text()='Add']")
	WebElement addBtn;
	
	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;
	
	@FindBy(id = "privileges-organisation-label")
	WebElement previligeOrganizationField;
	
	@FindBy(id = "privileges-businessUnit-label")
	WebElement previligeBusinessUnitOption;
	
	@FindBy(id = "privileges-department-label")
	WebElement previligeDepartmentOption;
	
	@FindBy(id = "privileges-role-label")
	WebElement previligeRoleOption;
	
	@FindBy(id = "privileges-user-group-label")
	WebElement previligeUserGroupOption;
	
	@FindBy(id = "privileges-view-access-label")
	WebElement previligeDepartmentViewOption;
	
	@FindBy(id = "privileges-create-access-label")
	WebElement previligeDepartmentCreateOption;
	
	@FindBy(xpath="//*[text()= 'Primary Business Unit is required']")
	WebElement primaryBusinessUnitRequired;
	
	@FindBy(xpath="//*[text()= 'Primary Department is required']")
	WebElement primaryDepartmentRequired;
	
	@FindBy(xpath="//*[text()= 'Role is required']")
	WebElement primaryRoleRequired;
	
	@FindBy(xpath="//*[text()= 'User Group is required']")
	WebElement primaryUserGroupRequired;
	
	
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
		case "user creation":
			verifyText(userCreation, name);
			break;
		case "user list tab":
			waitTillAttributeDisplay(userListtab, "role", "tab", Duration.ofSeconds(20));
			verifyText(userListtab, name);
			break;
		case "create new user":
			verifyText(newUserCreation, name);
			break;
		case "label name":
		case "label login id":
		case "label empoloyee number":
		case "label user type":
		case "label domain":
		case "label authentication type":
		case "label email address":
		case "label job title":
			getTextFromElementInListAndValidate(userCreationLabels, name);
			break;				
		case "label account status":
		case "label is system admin":
		case "label login status":
			getTextFromElementInListAndValidate(userCreationLabels1, name);
			break;
		case "add privileges":
			verifyText(addPrevileges, name);
			break;	
		case "select organisation option":
			verifyText(previligeOrganizationField, name);
			break;	
		case "select business unit option":
			verifyText(previligeBusinessUnitOption, name);
			break;
		case "select department option":
			verifyText(previligeDepartmentOption, name);
			break;
		case "select roles option":
			verifyText(previligeRoleOption, name);
			break;
		case "select user group option":
			verifyText(previligeUserGroupOption, name);
			break;
		case "select department view option":
			verifyText(previligeDepartmentViewOption, name);
			break;
		case "select department create option":
			verifyText(previligeDepartmentCreateOption, name);
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit user creation header":
			verifyText(editViewUserCreationHeader, name);
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
		case "warning message primary business unit is required":
			verifyText(primaryBusinessUnitRequired, name);
			break;
		case "warning message primary department is required":
			verifyText(primaryDepartmentRequired, name);
			break;
		case "warning message role is required":
			verifyText(primaryRoleRequired, name);
			break;
		case "warning message user group is required":
			verifyText(primaryUserGroupRequired, name);
			break;
		case "delete icon does not displayed":
			Assert.assertFalse(isElementPresent(deleteIcon));
			break;	
		case "download":
			verifyText(downloadBtn, name);
			break;
		case "reset filter":
			verifyText(resetFilterBtn, name);
			break;	
		case "view user creation header":
			verifyText(editViewUserCreationHeader, name);
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
		case "view edit added privileges":
			verifyText(viewEditAddedPrivileges, name);
			break;
		case "view edit previleges header":
			verifyText(viewEditPrivilegesHeader, name);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify user list table column headers name
	 * 
	 * @param columnHeaders - User List column headers name
	 */
	public void verifyUserListTableColumnHeaders(String expectedColumnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(userListTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			scrollScrollBar(userListTable, 21, Constant.RIGHT);
		}
		scrollScrollBar(userListTable, 300, Constant.LEFT);
		// compare expected and actual column headers
		log.info("User list column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("User list column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInUserListTable() {
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
		case "user creation":
			clickElement(userCreation);
			break;
		case "user list tab":
			clickElement(userListtab);
			break;
		case "create new user":
			clickElement(newUserCreation);
			break;
		case "cancel":
			clickElement(cancelBtn);
			break;
		case "add privileges":
			clickElement(addPrevileges);
			break;		
		case "add privileges cancel":
			clickOnPerticularListElement(previligeCancelBtn, 1);
			break;	
		case "update":
			clickElement(updateBtn);
			break;
		case "add":
			clickElement(addBtn);
			break;				
		case "delete":
			clickElement(deleteBtn);
			break;
		case "edit":
			clickOnPerticularListElement(editIcon, 0);
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
		case "close":
			clickElement(closeBtn);
			break;
		case "reset all":
			clickElement(resetFilterBtn);
			break;
		case "view":
			clickOnPerticularListElement(viewIcon, 0);
			break;
		case "view edit added privileges":
			clickElement(viewEditAddedPrivileges);
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
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(tableSearchField, fieldValue);
			try {
				Thread.sleep(1000);
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
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromUserCreationPage(String data, String fieldName) {
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
				Thread.sleep(1000);
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
				scrollScrollBar(userListTable, 2, Constant.DOWN);
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
				scrollScrollBar(userListTable, 2, Constant.DOWN);
			}
		}

		scrollScrollBar(userListTable, 20, Constant.TOP);
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
			rowData = getXmlFilesData(data);
		String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber + 1) + "']/..//*[@data-colindex='"
				+ Integer.toString(columnNumber) + "']";
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}

}
