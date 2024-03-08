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
import page.ConfigurationPage;
import page.DateSelectionPage;
import page.GlobalFunctions;
import page.PaginationPage;
import utility.Constant;
import utility.DateTimeiFunctions;

public class LifeCycleStatesPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(LifeCycleStatesPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();


	
	public LifeCycleStatesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Life Cycle States']")
	WebElement lifeCycleStates;
	
	@FindBy(xpath="//*[@role='tab'and text()='New Life Cycle States']")
	WebElement newLifeCycleStates;
	
	@FindBy(xpath="//*[@role='tab'and text()='Life Cycle States List']")
	WebElement lifeCycleStatesList;
	
	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement lifeCycleStatesListTable;
	
	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;

	public String lifeCycleListTableHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String lifeCycleStatesCellData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newLifeCycleStatesLabels;
	
	@FindBy(xpath="//*[@class='PrivateSwitchBase-input MuiSwitch-input css-1m9pwf3']")
	List<WebElement> activeInactiveTogleIcon;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedInfo MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedInfo MuiButton-sizeMedium MuiButton-outlinedSizeMedium css-owqdl3']")
	WebElement browseBtn;
	
	@FindBy(xpath="//*[text()='Locked State:']")
	WebElement lockedStateLabel;
	
	@FindBy(xpath="//*[@value='yes']")
	WebElement yesRadioBtn;
	
	@FindBy(xpath="//*[@value='no']")
	WebElement noRadioBtn;
	
	@FindBy(xpath="//*[@class='css-hyxlzm']")
	List<WebElement> radioBtns;
	
	@FindBy(xpath="//*[text()='No']")
	WebElement noLabel;
	
	@FindBy(xpath="//*[text()='Yes']")
	WebElement yesLabel;

	@FindBy(id = "life_cycle_state_description")
	WebElement descriptionField;

	@FindBy(xpath = "//*[@placeholder='Enter Name']")
	WebElement nameField;

	@FindBy(xpath = "//*[text()='Edit Life Cycle States']")
	WebElement editLifeCycleStatesHeader;

	@FindBy(xpath = "//*[text()='Confirm Your Delete: ']")
	WebElement confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement lifeCycleStateMessage;

	@FindBy(xpath = "//*[text()='Name is required']")
	WebElement nameRequired;

	@FindBy(xpath = "//*[text()='Description is required']")
	WebElement descriptionRequired;

	@FindBy(xpath = "//*[@data-colindex='1']")
	List<WebElement> firstColumnData;
	
	@FindBy(id = "table-filter-option")
	WebElement tableFilterOption;
	
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
	
	String fileName = "//*[text()='#']";
	
	public static String lifeCycleName, lifeCycleStateCreatedTime, lifeCycleStateUpdatedTime, lifeCycleStateDeletedTime;
	
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
		case "life cycle states tab":
			verifyText(lifeCycleStates, name);
			break;
		case "life cycle states list":
			waitTillAttributeDisplay(lifeCycleStatesList, "role", "tab", Duration.ofSeconds(20));
			verifyText(lifeCycleStatesList, name);
			break;
		case "new life cycle states":
			verifyText(newLifeCycleStates, name);
			break;
		case "label name":
		case "label description":
		case "label select icon":
			getTextFromElementInListAndValidate(newLifeCycleStatesLabels, name);
			break;
		case "label locked state":
			verifyText(lockedStateLabel, name);
			break;
		case "label yes":
			verifyText(yesLabel, name);
			break;
		case "label no":
			verifyText(noLabel, name);
			break;	
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "save button":
			verifyText(saveBtn, name);
			break;
		case "warning message name required":
			verifyText(nameRequired, name);
			break;
		case "warning message description required":
			verifyText(descriptionRequired, name);
			break;
		case "life cycle state create message":
		case "life cycle state is allready present":
		case "life cycle state updated successfully message":
		case "life cycle state delete message":
			verifyText(lifeCycleStateMessage, name);
			if(fieldName.contains("create")) {
				lifeCycleStateCreatedTime= dateTimeiFunctions.getCurrentTime();
			}
			else if(fieldName.contains("update")) {
				lifeCycleStateUpdatedTime= dateTimeiFunctions.getCurrentTime();
			}
			else if(fieldName.contains("delete"))
				lifeCycleStateDeletedTime= dateTimeiFunctions.getCurrentTime();
			break;
		case "confirm you delete":
			verifyText(confirmDelete, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit life cycle states header":
			verifyText(editLifeCycleStatesHeader, name);
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
	public void verifyLifeCycleStatesTableColumnHeaders(String columnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(lifeCycleStatesListTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(columnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> columnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {	
			columnHeadersText.add(getText(columnHeader.get(i)));
			 scrollScrollBar(lifeCycleStatesListTable, 19, Constant.RIGHT);
		}	
		// compare expected and actual column headers
		log.info("life cycle states table column headers " + columnHeadersText);
		 scrollScrollBar(lifeCycleStatesListTable, 300, Constant.LEFT);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, columnHeadersText));
		log.info("audit trail table column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInLifeCycleStatesTable() {
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
				scrollScrollBar(lifeCycleStatesListTable, 40, Constant.DOWN);
			} else {
				scrollScrollBar(lifeCycleStatesListTable, 20, Constant.DOWN);

			}

		}

		Assert.assertTrue(rowsInPage == rowData.size());
		scrollScrollBar(lifeCycleStatesListTable, 20, Constant.TOP);
	}

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		String name = fieldName.toLowerCase();
		switch (name) {
		case "life cycle states tab":
			clickElement(lifeCycleStates);
			break;
		case "life cycle states list":
			clickElement(lifeCycleStatesList);
			break;
		case "new life cycle states":
			clickElement(newLifeCycleStates);
			break;
		case "lock state no":
			clickElement(noLabel);
			break;	
		case "lock state yes":
			clickElement(yesLabel);
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
		case "reset all":
			clickElement(resetAllBtn);
			break;
		case "download":
			clickElement(downloadBtn);
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
			if (lifeCycleName==null) {
				lifeCycleName = String.format("%s%s", fieldValue, generateRandomString(7));
			}
			nameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(nameField, lifeCycleName);
			break;
		case "description":
			descriptionField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(descriptionField, fieldValue);
			break;
		case "search":
			tableSearchField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(tableSearchField, lifeCycleName);
			break;
		case "edit name":
			lifeCycleName = String.format("%s%s", fieldValue, generateRandomString(7));
			nameField.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			enterValue(nameField, lifeCycleName);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in life cycle states
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForLifeCycleStates(String data, int rowNumber) {
		String rowData = getXmlFilesData(data);
		String[] lifeCycleStatesExpectedData = rowData.split("\\|");
		if (lifeCycleStatesExpectedData[0].equals("##")) {
			lifeCycleStatesExpectedData[0] = lifeCycleName;
		}
		if (lifeCycleStatesExpectedData[5].equals("#")) {
			lifeCycleStatesExpectedData[5] = "";
		}
		else if (lifeCycleStatesExpectedData[5].equals("##")) {
			lifeCycleStatesExpectedData[5] = dateTimeiFunctions.getCurrentMonthDateYear("-");
			
		}
		if (lifeCycleStatesExpectedData[6].equals("#")) {
			lifeCycleStatesExpectedData[6] = "";
		}
		lifeCycleStatesExpectedData[3] = dateTimeiFunctions.getCurrentMonthDateYear("-");
		int columnLength = lifeCycleStatesExpectedData.length;
		List<String> actualData = new ArrayList<>();
		for (int i = 1; i <= columnLength; i++) {
			String rowItem = lifeCycleStatesCellData.replace("#", Integer.toString(i));
			WebElement element = driver.findElement(By.xpath(rowItem));
			actualData.add(getText(element));
			 scrollScrollBar(lifeCycleStatesListTable, 15, Constant.RIGHT);
		}
		 scrollScrollBar(lifeCycleStatesListTable, 200, Constant.LEFT);
		log.info(String.format("mentioned row %s %s", rowNumber, lifeCycleStatesExpectedData));
		Assert.assertTrue(compareArrayAndList(lifeCycleStatesExpectedData, actualData));
	}
	
	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromLifeCycleStatesPage(String data, String fieldName) {
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
			element = driver.findElement(By.xpath("//*[@data-value='" + value + "']"));
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
				scrollScrollBar(lifeCycleStatesListTable, 2, Constant.DOWN);
			}
		}
		else {
			for (int i = 1; i <= paginationPage.getNumberRecordsInPage(); i++) {
				actualStatus = (activeInactiveTogleIcon.get(i)).getDomProperty("defaultChecked");
				Assert.assertTrue(actualStatus.equals(status));	
				scrollScrollBar(lifeCycleStatesListTable, 2, Constant.DOWN);
			}			
		}	
		
		scrollScrollBar(lifeCycleStatesListTable, 20, Constant.TOP);
	}
	
	
}
