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
import page.DateSelectionPage;
import page.GlobalFunctions;
import page.PaginationPage;
import utility.Constant;
import utility.DateTimeiFunctions;

/**
 * This page has Role functionality
 */
public class RolePage extends GlobalFunctions {
	Logger log = LogManager.getLogger(RolePage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public RolePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Role List']")
	WebElement roleList;

	@FindBy(xpath = "//*[text()='Role']")
	WebElement roleTab;

	@FindBy(xpath = "//*[@role='tab' and text()='New Role']")
	WebElement newRole;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1grl8tv']")
	List<WebElement> roleTable;

	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	@FindBy(xpath = "//*[@role='dialog']//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> selectUserColumnHeader;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-ieu29w']")
	List<WebElement> privilegeHeader;

	public String roleListTableColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String roleCellData = "//*[@data-colindex='#']/*[@class='MuiDataGrid-cellContent']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newRoleLabels;

	@FindBy(id = "role-name")
	WebElement roleNameField;

	@FindBy(id = "role-access-level")
	WebElement roleAccesslevelField;

	@FindBy(id = "role-description")
	WebElement roleDescriptionField;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-d0vyis']")
	WebElement selectUserBtn;

	@FindBy(xpath = "//*[text()='Selected Users']")
	WebElement selectedUsers;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> confirmDelete;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement roleMessage;

	@FindBy(xpath = "//*[text()='Name is required']")
	WebElement roleNameRequired;

	@FindBy(xpath = "//*[text()='Access Level is required']")
	WebElement accessLevelRequired;

	@FindBy(xpath = "//*[text()='Description is required']")
	WebElement descriptionRequired;

	@FindBy(xpath = "//*[text()='Code must be at most 5 characters long']")
	WebElement roleCodeMustBeFiveCharacters;

	@FindBy(xpath = "//*[text()='Department is required']")
	WebElement departmentRequired;

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

	@FindBy(xpath = "//*[text()='Edit Role']")
	WebElement ediRoleHeader;

	@FindBy(xpath = "//*[text()='Add Users']")
	WebElement addUsersBtn;

	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;

	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedInfo MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedInfo MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation css-113mvty']")
	WebElement clearSelectedUsers;

	@FindBy(xpath = "//*[@type='checkbox']")
	List<WebElement> checkBoxes;

	@FindBy(xpath = "//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedError MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-10uacdu']")
	WebElement resetFilterBtn;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation css-7c3c59']")
	WebElement downloadBtn;

	@FindBy(id = "table-search")
	WebElement tableSearchField;

	@FindBy(id = "role-search-user")
	WebElement searchUserField;

	@FindBy(xpath = "//*[@class='MuiDataGrid-overlay css-11utb8v']")
	WebElement emptyTable;

	@FindBy(xpath = "//*[text()='Role Details']")
	WebElement roleDetails;

	@FindBy(xpath = "//*[text()='Privileges']")
	WebElement privileges;

	@FindBy(xpath = "//*[@class='MuiBox-root css-f0fbul']")
	WebElement scrollPage;

	@FindBy(xpath = "//*[@class='MuiBox-root css-9xl0nh']")
	WebElement selectUserScrollPage;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1v0yh5o']")
	List<WebElement> privilegesTypes;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List<WebElement> privilegesTypeCategories;

	@FindBy(xpath = "//*[@aria-label='Select all rows']")
	WebElement selectAllRowCheckBox;

	@FindBy(xpath = "//*[text()='Cancel']")
	List<WebElement> cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;
	
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextBtn;
	
	@FindBy(xpath = "//*[text()='Back']")
	WebElement backBtn;

	public String optionName = "//*[@role ='option' and text()='#']";

	public String tableData = "//tbody/tr[rowNo]/td[columnNo]";

	public static String roleCreatedTime, roleUpdatedTime, roleDeletedTime, roleName, roleAccessLevel, roleDescription;

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
		case "role tab":
			verifyText(roleTab, name);
			break;
		case "role list":
			waitTillAttributeDisplay(roleList, "role", "tab", Duration.ofSeconds(20));
			verifyText(roleList, name);
			break;
		case "new role":
			verifyText(newRole, name);
			break;
		case "label name field":
		case "label access level":
		case "label description field":
			getTextFromElementInListAndValidate(newRoleLabels, name);
			break;
		case "warning message name required":
			verifyText(roleNameRequired, name);
			break;
		case "warning message description required":
			verifyText(descriptionRequired, name);
			break;
		case "warning message access level required":
			verifyText(accessLevelRequired, name);
			break;
		case "warning message department required":
			verifyText(departmentRequired, name);
			break;
		case "role created successfully message":
		case "role name already exists message":
		case "role updated successfully message":
		case "role deleted successfully message":
		case "no user selected add message":
		case "no role privileges selected message":
			verifyText(roleMessage, name);
			if (fieldName.contains("created")) {
				roleCreatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("updated")) {
				roleUpdatedTime = dateTimeiFunctions.getCurrentTime();
			} else if (fieldName.contains("deleted"))
				roleDeletedTime = dateTimeiFunctions.getCurrentTime();
			break;
		case "confirm you delete":
			text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			compareTwoString(text, name);
			break;
		case "edit role header":
			verifyText(ediRoleHeader, name);
			break;
		case "search option default value":
			verifyText(tableSearchOption, name);
			break;
		case "table filter default value":
			verifyText(tableFilterOption, name);
			break;
		case "no rows":
			verifyText(emptyTable, name);
			break;
		case "download":
			verifyText(downloadBtn, name);
			break;
		case "role details":
			verifyText(roleDetails, name);
			break;
		case "privileges":
			verifyText(privileges, name);
			break;
		case "select user":
			verifyText(selectUserBtn, name);
			break;
		case "label selected users":
			verifyText(selectedUsers, name);
			break;
		case "reset filter":
			verifyText(resetFilterBtn, name);
			break;
		case "add users":
			verifyText(addUsersBtn, name);
			break;
		case "clear selected users":
			verifyText(clearSelectedUsers, name);
			break;
		case "role details header":
			verifyText(roleDetails, name);
			break;
		case "privileges header":
			verifyText(privileges, name);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify role list table column headers name
	 * 
	 * @param columnHeaders -role list table column headers name
	 */
	public void verifyRoleTableColumnHeaders(String expectedColumnHeaders) {
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();

		if (expectedColumnHeaders.equals("role list table column headers")) {
			waitTillAttributeDisplay(roleTable.get(0), "class", "MuiDataGrid-virtualScroller css-1grl8tv",
					Duration.ofSeconds(60));
			for (int i = 0; i < columnHeader.size(); i++) {
				actualColumnHeadersText.add(getText(columnHeader.get(i)));
				scrollScrollBar(roleTable.get(0), 17, Constant.RIGHT);
			}
			scrollScrollBar(roleTable.get(0), 300, Constant.LEFT);

		} else {
			waitTillAttributeDisplay(roleTable.get(1), "class", "MuiDataGrid-virtualScroller css-1grl8tv",
					Duration.ofSeconds(60));
			for (int i = 9; i < columnHeader.size(); i++) {
				actualColumnHeadersText.add(getText(columnHeader.get(i)));
				scrollScrollBar(roleTable.get(1), 20, Constant.RIGHT);
			}
			scrollScrollBar(roleTable.get(1), 300, Constant.LEFT);
		}
		log.info("role table column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("role table column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInRoleTable() {

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
		case "role tab":
			clickElement(roleTab);
			break;
		case "role list":
			clickElement(roleList);
			break;
		case "new role":
			clickElement(newRole);
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
		case "select field type option":
			clickElement(dropdownIcon);
			break;
		case "select all row check box":
			selectAllRowCheckBox.click();
			break;
		case "privileges":
			clickElement(privileges);
			break;
		case "dashboard privilege":
			clickOnPerticularListElement(privilegesTypes, 0);
			break;
		case "admin privilege":
			clickOnPerticularListElement(privilegesTypes, 1);
			break;
		case "config privilege":
			clickOnPerticularListElement(privilegesTypes, 2);
			break;
		case "system privilege":
			clickOnPerticularListElement(privilegesTypes, 3);
			break;
		case "task privilege":
			clickOnPerticularListElement(privilegesTypes, 4);
			break;
		case "workflow privilege":
			clickOnPerticularListElement(privilegesTypes, 5);
			break;
		case "repository privilege":
			clickOnPerticularListElement(privilegesTypes, 6);
			break;
		case "template privilege":
			clickOnPerticularListElement(privilegesTypes, 7);
			break;
		case "document privilege":
			clickOnPerticularListElement(privilegesTypes, 8);
			break;
		case "reports privilege":
			clickOnPerticularListElement(privilegesTypes, 9);
			break;
		case "cancel":
			clickElement(cancelBtn.get(1));
			break;
		case "update":
			clickElement(updateBtn);
			break;
		case "delete":
			clickElement(deleteBtn);
			break;
		case "select user":
			clickElement(selectUserBtn);
			break;
		case "access level":
			clickElement(roleAccesslevelField);
			break;
		case "role details header":
			clickElement(roleDetails);
			break;
		case "add users":
			clickElement(addUsersBtn);
			break;
		case "next":
			clickElement(nextBtn);
			break;
		case "back":
			clickElement(backBtn);
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
			if (roleName == null) {
				roleName = String.format("%s%s", fieldValue, generateRandomString(2));
			}
			roleNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(roleNameField, roleName);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "description":
			roleDescriptionField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(roleDescriptionField, fieldValue);
			roleDescription = fieldValue;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text role name")) {
				enterValue(tableSearchField, roleName);
			} else {
				enterValue(tableSearchField, fieldValue);
			}
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "edit role name":
			roleName = String.format("%s%s", fieldValue, generateRandomString(7));
			roleNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(roleNameField, roleName);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "user search":
			searchUserField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				enterValue(searchUserField, fieldValue);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in role list table
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForRoleListTable(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] roleExpectedData = rowData.split("\\|");
		if (roleExpectedData[0].equals("##")) {
			roleExpectedData[0] = roleName;
		}
		if (roleExpectedData[3].equals("##")) {
			roleExpectedData[3] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (roleExpectedData[5].equals("#")) {
			roleExpectedData[5] = "";
		} else {
			roleExpectedData[5] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (roleExpectedData[6].equals("#")) {
			roleExpectedData[6] = "";
		}
		int columnLength = roleExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@data-colindex='" + Integer.toString(i) + "']/*[@class='MuiDataGrid-cellContent']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			scrollScrollBar(roleTable.get(0), 15, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, roleExpectedData));
		Assert.assertTrue(compareArrayAndList(roleExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromRolePage(String data, String fieldName) {
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
		case "access level":
			clickElement(roleAccesslevelField);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			optionValue = optionName.replace("#", value);
			element = driver.findElement(By.xpath(optionValue));
			clickElement(element);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			roleAccessLevel = value;
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
				scrollScrollBar(roleTable.get(0), 2, Constant.DOWN);
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
				scrollScrollBar(roleTable.get(0), 2, Constant.DOWN);
			}
		}

		scrollScrollBar(roleTable.get(0), 20, Constant.TOP);
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

	/**
	 * verify drop down option from role
	 * 
	 * @param option    - drop down option
	 * @param fieldName - field name
	 */
	public void verifyDropDownOptions(String option, String fieldName) {
		String name = getXmlFilesData(option);
		WebElement element = null;
		String optionValue = optionName.replace("#", name);
		element = driver.findElement(By.xpath(optionValue));
		verifyText(element, name);
	}

	/**
	 * Click on mentioned check boxes in table or all the check boxes in table
	 * 
	 * @param rowNumber    - row number
	 * @param columnNumber -
	 */
	public void clickOnMentionedCheckBoxes(String rowNumber, String columnNumber) {
		if (rowNumber.equals("all rows")) {
			for (int i = 0; i < checkBoxes.size(); i++) {
				clickOnPerticularListElement(checkBoxes, i);
			}
		} else {
			String dataRowNoReplace = tableData.replace("rowNo", rowNumber);
			String dataColumnNoReplace = dataRowNoReplace.replace("columnNo", columnNumber);
			WebElement element = driver.findElement(By.xpath(dataColumnNoReplace));
			clickElement(element);
		}
	}

	/**
	 * verify role list table column headers name
	 * 
	 * @param columnHeaders -role list table column headers name
	 */
	public void verifyPrivilegeTypesAndCategoriesAndHeaders(String fieldType) {
		String data = getXmlFilesData(fieldType);
		String[] ExpectedData = data.split("\\|");
		List<String> actualData = new ArrayList<>();
		if (fieldType.equals("all privileges types")) {
			for (int i = 0; i < privilegesTypes.size(); i++) {
				actualData.add(getText(privilegesTypes.get(i)));
			}
		} else if (fieldType.equals("privileges column headers")) {
			List<WebElement> element = driver.findElements(By.xpath("//tr[1]/td"));
			for (int i = 1; i <= ExpectedData.length; i++) {
				actualData.add(getText(element.get(i)));
			}
		} else {
			for (int i = 1; i < privilegesTypeCategories.size(); i++) {
				actualData.add(getText(privilegesTypeCategories.get(i)));
			}
		}
		log.info("privilege data " + actualData);
		Assert.assertTrue(compareArrayAndList(ExpectedData, actualData));
		log.info("privilege data is displayed");

	}

}
