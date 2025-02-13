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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
import page.GlobalFunctions;
import page.PaginationPage;
import utility.Constant;
import utility.DateTimeiFunctions;

/**
 * This class has department functionality
 */
public class DepartmentPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(DepartmentPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();


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

	public String departmentColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String departmentData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[contains(@class,'MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css')]")
	List<WebElement> newDepartmentFieldLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Create']")
	WebElement createBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "edit_dept_name")
	WebElement editDepartment;

	@FindBy(id = "dept_code")
	WebElement departmentCode;

	@FindBy(xpath = "//*[@placeholder='Name']")
	WebElement departmentName;

	@FindBy(xpath = "//input[@id='business_unit']")
	WebElement site;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h5 css-tv5qfu']")
	WebElement editDepartmentHeader;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	List <WebElement> confirmDelete;
	
	@FindBy(xpath = "//*[@role='row' and @aria-rowindex='1']")
	WebElement firstRow;
	
	@FindBy(xpath ="//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;
	
	@FindBy(xpath = "//*[@role='grid']/div[1]/div[2]")
	WebElement departmentListTable;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//div[contains(@class,'MuiAlert-message css')]")
	WebElement departmentMessage;

	@FindBy(xpath = "//*[text()='Department Name is required']")
	WebElement departmentNameRequired;

	@FindBy(xpath = "//*[text()='Department Code is required']")
	WebElement departmentCodeRequired;

	@FindBy(xpath = "//*[text()='Please select a Site']")
	WebElement pleaseSelectsite;

	@FindBy(xpath = "//*[@name='departmentDescription']")
	WebElement deptDescription;

	@FindBy(xpath = "//*[@data-colindex='1']")
	List<WebElement> firstColumnData;
	
	@FindBy(xpath ="//button[text()='Reset Filter']")
	WebElement resetFilterBtn;
  
	@FindBy(xpath = "//*[text()='Download']")
	WebElement downloadBtn;
	
	@FindBy(xpath = "//*[@id='root']/div[1]/div[3]/div/div[2]/div[3]/div[2]/div/button[3]/span[1]")
	WebElement downloadBtnEnable;
	
	@FindBy(xpath = "//*[@data-testid='VisibilityIcon']")
	List<WebElement> viewIcon;
	
	@FindBy(id = "table-search")
	WebElement tableSearchField;
	
	@FindBy(id = "activity_name")
	WebElement nameField;
	
	@FindBy(id = "table-search-option")
	WebElement tableSearchOption;
	

	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h5 css-tv5qfu']")
	WebElement viewDepartmentHeader;
	public static String activityCreatedTime, activityUpdatedTime, activityDeletedTime, activityName,
	activityDescription, activitySignature;
	public static String deptName, deptCode;

	/**
	 * verify the field name
	 * 
	 * @param fieldName
	 */
	public void verifyFieldName(String fieldName) {
		String name = getXmlFilesData(fieldName);
		String text = null;
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
		case "label site":
		case "label site Tab":
		case "label department description":
		case "label edit site Tab":
		case "label view site Tab":
			getTextFromElementInListAndValidate(newDepartmentFieldLabels, name);
			break;
			
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "create button":
			verifyText(createBtn, name);
			break;
		case "warning message department name required":
			verifyText(departmentNameRequired, name);
			break;
		case "warning message department code required":
			verifyText(departmentCodeRequired, name);
			break;
		case "warning message please select site":
			verifyText(pleaseSelectsite, name);
			break;
		case "department create message":
		case "department is allready present":
		case "department updated successfully message":
		case "department delete message":
		case "department can not be deleted message":
			verifyText(departmentMessage, name);
			break;
		case "confirm your delete":
			text = getTextFromElementInListInMentionedPosition(confirmDelete, 1);
			compareTwoString(text, name);
			break;
		case "delete":
			waitForElementToBeClickable(deleteBtn);
			verifyText(deleteBtn, name);
			break;
		case "edit department header":
			verifyText(editDepartmentHeader, name);
			break;
		case "reset filter":
			verifyText(resetFilterBtn, name);
			break;
		case "download":
			verifyText(downloadBtn, name);
			break;
		case "label download department":
			verifyTextContent(downloadBtn, "textContent", name);
			break;
		case "view department header":
			verifyText(viewDepartmentHeader, name);
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
		String columnHeaderValue = getXmlFilesData(columnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		waitTillAttributeDisplay(firstRow, "aria-rowindex", "1",
				Duration.ofSeconds(60));
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < ExpectedColumnHeader.length; i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));
			 scrollScrollBar(departmentListTable, 30, Constant.RIGHT);
		}
		scrollScrollBar(departmentListTable, 400, Constant.LEFT);
		// compare expected and actual column headers
		log.info("department column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
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
		case "create":
			clickElement(createBtn);
			break;
		case "update":
			clickElement(updateBtn);
			break;
		case "delete":
			waitForElementToBeClickable(deleteBtn);
			clickElement(deleteBtn);
			break;
		case "edit":
			clickOnPerticularListElement(editIcon,0);
			break;
		case "delete icon":
			//waitForListElementsToBeVisible(deleteIcon);
			waitForListElementsToBeVisible(deleteIcon);
			//waitForElementToBeClickable(deleteBtn);
			clickOnPerticularListElement(deleteIcon, 0);
			break;
		case "reset filter":
			clickElement(resetFilterBtn);
			break;
		case "download":
			clickElement(downloadBtn);
			break;
		case "view":
			clickOnPerticularListElement(viewIcon, 0);
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
		case "department description":
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
			if (deptCode==null) {
				deptCode = String.format("%s%s", fieldValue, generateRandomString(2));
			}
			departmentCode.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(departmentCode, deptCode);
			break;
		case "description":
			deptDescription.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(deptDescription, fieldValue);
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			if (text.equals("text department description")) {
				enterValue(tableSearchField, fieldValue);
			} else if(text.equals("text department name")) {
			
				enterValue(tableSearchField, fieldValue);
			}
			else {
				enterValue(tableSearchField, deptName);
			}
			break;
		case "edit name":
			deptName = String.format("%s%s", fieldValue, generateRandomString(7));
			nameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(nameField, deptName);
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
		if (departmentExpectedData[0].equals("##")) {
			departmentExpectedData[0] = deptName;
		}
		if (departmentExpectedData[1].equals("##")) {
			departmentExpectedData[1] = deptCode;
		}
		
		if (departmentExpectedData[4].equals("##")) {
			departmentExpectedData[4] = dateTimeiFunctions.getCurrentDateMonthNameYear("-");

		}
		if (departmentExpectedData[6].equals("##")) {
			departmentExpectedData[6] = dateTimeiFunctions.getCurrentDateMonthNameYear("-");

		}
		int columnLength = departmentExpectedData.length;
		rowNumber = rowNumber-1;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = "//*[@data-rowindex='" + Integer.toString(rowNumber) + "']/*[@data-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			 scrollScrollBar(departmentListTable, 25, Constant.RIGHT);
		}
		 scrollScrollBar(departmentListTable, 300, Constant.LEFT);

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
		case "site":
			clickElement(site);////span[normalize-space()='"+value +"']
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickArrowAndEnter();
			//waitForElementToBeClickable(driver.findElement(By.xpath("//*[text()='"+value +"']")));
			//element = driver.findElement(By.xpath("//*[text()='"+value +"']"));
			
			//clickElement(element);
			break;
		case "search option":
			clickElement(tableSearchOption);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element = driver.findElement(By.xpath("//*[@role='option']/..//*[text()='Department Name']"));
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
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}
	
	public void verifyMentionedCellDataInTable(String data, int rowNumber, int columnNumber) {
		String rowData = null;
		if(data.equals("text department name")) {
			rowData = deptName;
		} else {
		  rowData = getXmlFilesData(data);
		}
		if(data.equals("text description")) {
			rowData = deptName;
		} else {
		  rowData = getXmlFilesData(data);
		}
		
		String rowItem = "//*[@aria-rowindex='" + Integer.toString(rowNumber) + "']/..//*[@aria-colindex='"
				+ Integer.toString(columnNumber) + "']";
		WebElement element = driver.findElement(By.xpath(rowItem));
		compareTwoString(rowData, getText(element));
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromDepartmentPage1(String data, String fieldName) {
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
			element = driver.findElement(By.xpath("//*[@role='option']/..//*[text()='Department Name']"));
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
			
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}
	
}
