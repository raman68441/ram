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
import page.CommonPage;
import page.DateSelectionPage;
import page.GlobalFunctions;
import page.PaginationPage;
import utility.Constant;

/**
 * This class has department functionality
 */
public class DepartmentPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(DateSelectionPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());

	public DepartmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Department List']")
	WebElement departmentList;

	@FindBy(xpath = "//*[text()='Department']")
	WebElement department;

	@FindBy(xpath = "//*[@role='tab' and text()='New Department '] ")
	WebElement newDepartment;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1grl8tv']")
	WebElement departmentListTable;

	public String departmentColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String departmentData = "//*[@data-colindex='#']";

	public String deptName;

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newDepartmentFieldLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "edit_dept_name")
	WebElement editDepartment;

	@FindBy(id = "dept_code")
	WebElement departmentCode;

	@FindBy(xpath = "//*[@placeholder='Name']")
	WebElement departmentName;

	@FindBy(id = "business_unit")
	WebElement businessUnit;

	@FindBy(xpath = "//*[text()='Edit Department']")
	WebElement editDepartmentHeader;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	WebElement confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement departmentMessage;

	@FindBy(xpath = "//*[text()='Department Name is required']")
	WebElement departmentNameRequired;

	@FindBy(xpath = "//*[text()='Department Code is required']")
	WebElement departmentCodeRequired;

	@FindBy(xpath = "//*[text()='Please select a business unit']")
	WebElement pleaseSelectBusineeUnit;

	@FindBy(xpath = "//*[@name='departmentDescription']")
	WebElement deptDescription;

	@FindBy(xpath = "//*[@data-colindex='1']")
	List<WebElement> firstColumnData;

	/**
	 * verify the field name
	 * 
	 * @param fieldName
	 */
	public void verifyFieldName(String fieldName) {
		String name = getXmlFilesData(fieldName);
		switch (fieldName) {
		case "department tab":
			verifyText(department, name);
			break;
		case "department list":
			waitTillAttributeDisplay(departmentList, "role", "tab", Duration.ofSeconds(20));
			verifyText(departmentList, name);
			break;
		case "new department":
			verifyText(newDepartment, name);
			break;
		case "label department name":
		case "label department code":
		case "label business unit":
		case "label department description":
		case "label edit business unit":
			getTextFromElementInListAndValidate(newDepartmentFieldLabels, name);
			break;
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "save button":
			verifyText(saveBtn, name);
			break;
		case "warning message department name required":
			verifyText(departmentNameRequired, name);
			break;
		case "warning message department code required":
			verifyText(departmentCodeRequired, name);
			break;
		case "warning message please select business unit":
			verifyText(pleaseSelectBusineeUnit, name);
			break;
		case "department create message":
		case "department is allready present":
		case "department updated successfully message":
		case "department delete message":
			verifyText(departmentMessage, name);
			break;
		case "confirm you delete":
			verifyText(confirmDelete, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit department header":
			verifyText(editDepartmentHeader, name);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify department table column headers name
	 * 
	 * @param columnHeaders -department column headers name
	 */
	public void verifydepartmentTableColumnHeaders(String columnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(departmentListTable, "class", "MuiDataGrid-virtualScroller css-1grl8tv",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(columnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> columnHeadersText = new ArrayList<>();
		for (int i = 2; i <= ExpectedColumnHeader.length + 1; i++) {
			String columnHeader = departmentColumnHeader.replace("#", Integer.toString(i));
			WebElement element = driver.findElement(By.xpath(columnHeader));
			columnHeadersText.add(getText(element));
		}
		// compare expected and actual column headers
		log.info("department column headers " + columnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, columnHeadersText));
		log.info("department column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsIndepartmentTable() {
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
				scrollScrollBar(departmentListTable, 40, Constant.DOWN);
			} else {
				scrollScrollBar(departmentListTable, 20, Constant.DOWN);

			}

		}

		Assert.assertTrue(rowsInPage == rowData.size());
		scrollScrollBar(departmentListTable, 20, Constant.TOP);
	}

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		String name = fieldName.toLowerCase();
		switch (name) {
		case "department tab":
			clickElement(department);
			break;
		case "new department":
			clickElement(newDepartment);
			break;
		case "cancel":
			clickElement(cancelBtn);
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
		case "department name":
			if (deptName==null) {
				deptName = String.format("%s%s", fieldValue, generateRandomString(4));
			}
			departmentName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(departmentName, deptName);
			break;
		case "edit department name":
			deptName = String.format("%s%s", fieldValue, generateRandomString(4));
			departmentName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(departmentName, deptName);
			break;
		case "department code":
			departmentCode.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(departmentCode, fieldValue);
			break;
		case "description":
			deptDescription.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(deptDescription, fieldValue);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in department
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataFordepartment(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] departmentExpectedData = rowData.split("\\|");
		if (departmentExpectedData[1].equals("##")) {
			departmentExpectedData[1] = deptName;
		}
		
		int columnLength = departmentExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = departmentData.replace("#", Integer.toString(i));
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			// scrollScrollBar(auditTrailTable, 90, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, departmentExpectedData));
		Assert.assertTrue(compareArrayAndList(departmentExpectedData, actualData));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromDepartmentPage(String data, String fieldName) {
		String value = getXmlFilesData(data);
		WebElement element = null;
		switch (fieldName) {
		case "business unit":
			clickElement(businessUnit);
//			WebElement l = driver.findElement(By.tagName("body"));
//			String p = l.getText();
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}

}
