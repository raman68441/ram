package page;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
import page.admin.TagsPage;
import page.config.LifeCycleStatesPage;
import page.config.NumberingSystemPage;
import utility.Constant;
import utility.DateTimeiFunctions;

/**
 * This class has Audit Trail functionality details
 */

public class AuditTrailPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(AuditTrailPage.class);
	private WebDriver driver;
	CalenderPage calenderPage;
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	LoginPage loginPage;

	public AuditTrailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@data-testid='BusinessIcon']")
	WebElement aduitTrailIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-52qjy2']")
	WebElement aduitTrail;

	@FindBy(xpath = "//*[@placeholder='mm/dd/yyyy']")
	List<WebElement> dateFeild;

	@FindBy(id = ":r4:")
	WebElement selectDate;

	@FindBy(id = ":r5:")
	WebElement endDate;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> auditTralFieldLabels;

	@FindBy(xpath = "//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1 css-tuxzvu']//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> auditTralAddNewEventFieldLabels;

	@FindBy(id = "audit_trail_category")
	WebElement auditTrailCategory;

	@FindBy(id = "audit_trail_event")
	WebElement auditTrailEvent;

	@FindBy(xpath = "//*[@data-testid='CalendarIcon']")
	List<WebElement> calenderIcons;

	@FindBy(xpath = "//*[text()='Or']")
	WebElement orField;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-j5a1ma']")
	List<WebElement> checkBoxFields;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedInherit MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorInherit MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedInherit MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorInherit MuiButton-disableElevation css-jx524e']")
	WebElement cancelBtnRemoveCategory;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation css-1eqqfr2']")
	WebElement removeBtn;

	@FindBy(id = "audit_trail_user")
	WebElement selectUser;

	@FindBy(id = "audit_trail_Condition")
	WebElement selectCondition;

	@FindBy(id = "audit_trail_enter_name")
	WebElement enterName;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium Mui-disabled MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium css-7s49xk']")
	WebElement addNewEventCategory;

	@FindBy(xpath = "//*[text()='Add New Event Category']")
	WebElement addNewEventBtn;

	@FindBy(xpath = "//*[text()='Generate']")
	WebElement generateBtn;

	@FindBy(xpath = "//*[text()='Generate']")
	List<WebElement> generateBtns;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-yzgz6o']")
	WebElement enableGenerateBtn;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInfo MuiButton-sizeMedium MuiButton-textSizeMedium Mui-disabled MuiButton-root MuiButton-text MuiButton-textInfo MuiButton-sizeMedium MuiButton-textSizeMedium css-1ub7g1i']")
	List<WebElement> resetAllFiltersAndRemoveAddedEventCategory;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInfo MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textInfo MuiButton-sizeMedium MuiButton-textSizeMedium css-1ub7g1i']")
	List<WebElement> enableResetAllFiltersAndRemoveAddedEventCategory;

	@FindBy(xpath = "//*[text()='Remove Added Event Category']")
	WebElement removeAddedEventCategory;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textSecondary MuiButton-sizeMedium MuiButton-textSizeMedium Mui-disabled MuiButton-root MuiButton-text MuiButton-textSecondary MuiButton-sizeMedium MuiButton-textSizeMedium css-7s49xk']")
	WebElement downloadBtn;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textSecondary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textSecondary MuiButton-sizeMedium MuiButton-textSizeMedium css-7s49xk']")
	WebElement downloadBtnEnable;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-disableElevation css-x7si5o']")
	WebElement addEventCategoryGenerateBtn;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h6 MuiDialogTitle-root css-1jhhc83']")
	WebElement addNewEventCategoryHeader;

	@FindBy(id = "nec_category")
	WebElement selectEveentCategoryInNewEvent;

	@FindBy(id = "nec_event")
	WebElement selectEventInNewEvent;

	@FindBy(id = "nec_trail_user")
	WebElement selectUserInNewEvent;

	@FindBy(id = "nec_Condition")
	WebElement selectConditionInNewEvent;

	@FindBy(id = "audit_trail_enter_name")
	List<WebElement> enterNameInNewEvent;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1grl8tv']")
	WebElement auditTrailTable;

	@FindBy(xpath = "//*[@role='tab' and text()='Login']")
	WebElement loginTab;

	@FindBy(xpath = "//*[@role='tab' and text()='Life Cycle States']")
	WebElement lifeCycleStatesTab;
	
	@FindBy(xpath = "//*[@role='tab' and text()='Numbering System']")
	WebElement numberingSystemTab;
	
	@FindBy(xpath = "//*[@role='tab' and text()='Tag']")
	WebElement tagTab;


	@FindBy(xpath = "//*[@class ='MuiTypography-root MuiTypography-h6 MuiDialogTitle-root css-1jhhc83']")
	WebElement removeEventCategoryHeader;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 MuiTypography-gutterBottom css-ahae4e']")
	WebElement selectCategoryHeader;

	@FindBy(xpath = "//*[@class='MuiDataGrid-row']")
	List<WebElement> totalNumberOfRows;

	public String auditTrailColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public static String categoryName, event, auditStartDate, auditEndDate, aduitUser, auditCondition, auditName;

	public void verifyDate(String expecteddate, String fieldName) {
		String date = getXmlFilesData(expecteddate);

		if (date.equals("current date")) {
			date = dateTimeiFunctions.getCurrentMonthDateYear();
		}
		if (fieldName.equals("start date")) {
			String test = dateFeild.get(0).getAttribute("value");
			Assert.assertTrue(String.format("Actual start date and expected date %s %s",
					dateFeild.get(0).getAttribute("value"), date),
					(dateFeild.get(0).getAttribute("value")).equals(date));
			auditStartDate = dateFeild.get(0).getAttribute("value");
		} else if (fieldName.equals("end date")) {
			Assert.assertTrue(String.format("Actual end date and expected date %s %s",
					dateFeild.get(1).getAttribute("value"), date),
					(dateFeild.get(1).getAttribute("value")).equals(date));
			auditEndDate = dateFeild.get(1).getAttribute("value");
		} else if (fieldName.equals("add new event start date")) {
			Assert.assertTrue(String.format("Actual end date and expected date %s %s",
					dateFeild.get(2).getAttribute("value"), date),
					(dateFeild.get(2).getAttribute("value")).equals(date));
			auditEndDate = dateFeild.get(1).getAttribute("value");
		} else if (fieldName.equals("add new event end date")) {
			Assert.assertTrue(String.format("Actual end date and expected date %s %s",
					dateFeild.get(3).getAttribute("value"), date),
					(dateFeild.get(3).getAttribute("value")).equals(date));
			auditEndDate = dateFeild.get(1).getAttribute("value");
		}

	}

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		String name = fieldName.toLowerCase();
		switch (name) {
		case "select category name":
			clickElement(auditTrailCategory);
			break;
		case "select event":
			clickElement(auditTrailEvent);
			break;
		case "start date":
			clickOnPerticularListElement(dateFeild, 0);
			break;
		case "end date":
			clickOnPerticularListElement(dateFeild, 1);
			break;
		case "generate":
			waitTillAttributeDisplay(enableGenerateBtn, "textContent", "Generate", Duration.ofSeconds(30));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement(enableGenerateBtn);
			break;
		case "user":
			clickElement(selectUser);
			break;
		case "download":
			clickElement(downloadBtnEnable);
			break;
		case "reset all filters":
			clickOnPerticularListElement(enableResetAllFiltersAndRemoveAddedEventCategory, 0);
			break;
		case "remove added event category":
			clickOnPerticularListElement(enableResetAllFiltersAndRemoveAddedEventCategory, 1);
			break;
		case "remove login":
			clickOnPerticularListElement(checkBoxFields, 2);
			break;
		case "add new event category":
			clickElement(addNewEventBtn);
			break;
		case "cancel":
			clickElement(cancelBtnRemoveCategory);
			break;
		case "remove":
			clickElement(removeBtn);
			break;
		case "identification id":
			clickOnPerticularListElement(checkBoxFields, 1);
			break;
		case "start date calender":
			clickOnPerticularListElement(calenderIcons, 0);
			break;
		case "end date calender":
			clickOnPerticularListElement(calenderIcons, 1);
			break;
		case "all day":
			clickOnPerticularListElement(checkBoxFields, 0);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "add new event category generate":
			clickOnPerticularListElement(generateBtns, 1);
			break;
		case "add new event select category name":
			clickElement(selectEveentCategoryInNewEvent);
			break;
		case "add new select event":
			clickElement(selectEventInNewEvent);
			break;
		case "add new event all day":
			clickOnPerticularListElement(checkBoxFields, 2);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * validate mentioned row number data in audit trail table
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForLoginAuditTrail(String data, int rowNumber) {
		String loggedinTimeInAuditTrailTable = null;
		String loggedInTime = (LoginPage.loginTime).toLowerCase();
		String loginData = getXmlFilesData(data);
		String[] loginExpectedData = loginData.split("\\|");
		if (loginExpectedData[1].equals("##")) {
			loginExpectedData[1] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		int columnLength = loginExpectedData.length;
		List<String> rowData = new ArrayList<>();
		for (int i = 1; i <= columnLength + 1; i++) {
			String rowItem = "//*[@data-id='" + Integer.toString(rowNumber) + "']//*[@aria-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			if (i != 3) {
				rowData.add(getText(element));
			} else {
				loggedinTimeInAuditTrailTable = getText(element);
			}
			// scrollScrollBar(auditTrailTable, 90, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, loginExpectedData));
		Assert.assertTrue(compareArrayAndList(loginExpectedData, rowData));
		Assert.assertTrue(
				dateTimeiFunctions.validateTimeWithInDuration(loggedInTime, loggedinTimeInAuditTrailTable, "", 60));

	}

	/**
	 * verify audit trail column headers name
	 * 
	 * @param columnHeaders - audit trail table column headers name
	 */
	public void verifyAuditTrailTableColumnHeaders(String columnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(auditTrailTable, "class", "MuiDataGrid-virtualScroller css-1grl8tv",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(columnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> columnHeadersText = new ArrayList<>();
		for (int i = 1; i <= ExpectedColumnHeader.length; i++) {
			String columnHeader = auditTrailColumnHeader.replace("#", Integer.toString(i));
			WebElement element = driver.findElement(By.xpath(columnHeader));
			columnHeadersText.add(getText(element));
		}
		// compare expected and actual column headers
		log.info("audit trail table column headers " + columnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, columnHeadersText));
		log.info("audit trail table column headers displayed");
	}

	/**
	 * Select from drop down
	 * 
	 * @param value - value or index or text
	 */
	public void selectDropDownfromAuditTrailPage(String data, String fieldName) {
		String value = getXmlFilesData(data);
		WebElement element = null;
		switch (fieldName) {
		case "category name":
			clickElement(auditTrailCategory);
//			WebElement l = driver.findElement(By.tagName("body"));
//			String p = l.getText();
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			categoryName = value;
			break;
		case "event":
			clickElement(auditTrailEvent);
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			event = value;
			break;
		case "user":
			clickElement(selectUser);
			if (value.equals(CommonPage.loggedInUserfullName)) {
				List<WebElement> elements = driver.findElements(By.xpath("//*[text()='" + value + "']"));
				clickOnPerticularListElement(elements, 1);
			} else {
				element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
				clickElement(element);
			}
			aduitUser = value;
			clickElement(selectUser);
			break;
		case "name":
			clickElement(enterName);
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			auditName = value;
			break;
		case "condition":
			clickElement(selectCondition);
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			auditCondition = value;
			break;
		case "add new event category name":
			clickElement(selectEveentCategoryInNewEvent);
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			categoryName = value;
			break;
		case "add new event":
			clickElement(selectEventInNewEvent);
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			event = value;
			break;
		case "add new event user":
			clickElement(selectUserInNewEvent);
			if (value.equals(CommonPage.loggedInUserfullName)) {
				List<WebElement> elements = driver.findElements(By.xpath("//*[text()='" + value + "']"));
				clickOnPerticularListElement(elements, 1);
			} else {
				element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
				clickElement(element);
			}
			aduitUser = value;
			clickElement(selectUser);
			break;
		case "add new event name":
			clickOnPerticularListElement(enterNameInNewEvent, 1);
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			auditName = value;
			break;
		case "add new event condition":
			clickElement(selectConditionInNewEvent);
			element = driver.findElement(By.xpath("//*[text()='" + value + "']"));
			clickElement(element);
			auditCondition = value;
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}

	/**
	 * verify field name
	 * 
	 * @param fieldName
	 */
	public void verifyFieldName(String fieldName) {
		String name = getXmlFilesData(fieldName);
		WebElement element = null;
		switch (fieldName) {
		case "label audit trail":
			waitTillAttributeDisplay(auditTrailCategory, "id", "audit_trail_category", Duration.ofSeconds(60));
			verifyText(aduitTrail, name);
			break;
		case "label select category name":
		case "label select event":
		case "label start date":
		case "label end date":
		case "label select user":
		case "label select condition":
		case "label enter name":
			getTextFromElementInListAndValidate(auditTralFieldLabels, name);
			break;
		case "label or":
			verifyText(orField, name);
			break;
		case "label all day":
		case "label show identification id":
			getTextFromElementInListAndValidate(checkBoxFields, name);
			break;
		case "label add new event category":
			verifyTextContent(addNewEventCategory, "textContent", name);
			break;
		case "label generate":
			verifyTextContent(generateBtn, "textContent", name);
			break;
		case "label reset all filters":
		case "label remove added event category":
			getTextFromElementInListAndValidate(resetAllFiltersAndRemoveAddedEventCategory, name);
			break;
		case "label download":
			verifyTextContent(downloadBtn, "textContent", name);
			break;
		case "login tab":
			verifyText(loginTab, name);
			break;
		case "life cycle states tab":
			verifyText(lifeCycleStatesTab, name);
			break;
		case "numbering system tab":
			verifyText(numberingSystemTab, name);
			break;
		case "business unit tab":
			verifyText(numberingSystemTab, name);
			break;
		case "tag tab":
			verifyText(tagTab, name);
			break;
		case "remove event category header":
			verifyText(removeEventCategoryHeader, name);
			break;
		case "select category header":
			verifyText(selectCategoryHeader, name);
			break;
		case "cancel":
			verifyText(cancelBtnRemoveCategory, name);
			break;
		case "add new event category header":
			verifyText(addNewEventCategoryHeader, name);
			break;
		case "label add new event category generate":
			getTextFromElementInListAndValidate(generateBtns, name);
			break;
		case "label add new event select category name":
		case "label add new event select event":
		case "label add new event start date":
		case "label add new event end date":
		case "label add new event select user":
		case "label add new event select condition":
		case "label add new event enter name":
			getTextFromElementInListAndValidate(auditTralAddNewEventFieldLabels, name);
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}

	}

	/**
	 * verify element status
	 * 
	 * @param isEnabled - is in enabled state
	 * @param fieldName - previous or next month
	 */
	public void verifyMentionedElementDisableOrEnabled(String fieldName, String isEnabled) {
		switch (fieldName) {
		case "generate":
			if (isEnabled.equals("enabled")) {
				enableGenerateBtn.getAttribute("disabled");
				Assert.assertFalse(
						String.format("generate button is disabled %s", getAttribute(enableGenerateBtn, "disabled")),
						"false".equals(getAttribute(enableGenerateBtn, "disabled")));
			}
			if (isEnabled.equals("disabled")) {
				Assert.assertTrue(String.format("generate button is disabled", getAttribute(generateBtn, "disabled")),
						"true".equals(getAttribute(generateBtn, "disabled")));
			}
			break;
		case "add new event category":
			if (isEnabled.equals("enabled")) {
				Assert.assertTrue(
						String.format("add new event category disabled  %s ",
								getAttribute(addNewEventCategory, "disabled")),
						"false".equals(getAttribute(addNewEventCategory, "disabled")));
			}
			if (isEnabled.equals("disabled")) {
				Assert.assertTrue(
						String.format("add new event category disabled %s ",
								getAttribute(addNewEventCategory, "disabled")),
						"true".equals(getAttribute(addNewEventCategory, "disabled")));
			}
			break;
		case "reset all filters":
			if (isEnabled.equals("enabled")) {
				Assert.assertTrue(
						String.format("reset all filters disabled %s ",
								getAttribute(resetAllFiltersAndRemoveAddedEventCategory.get(0), "disabled")),
						"false".equals(getAttribute(resetAllFiltersAndRemoveAddedEventCategory.get(0), "disabled")));
			}
			if (isEnabled.equals("disabled")) {
				Assert.assertTrue(
						String.format("reset all filters disabled %s ",
								getAttribute(resetAllFiltersAndRemoveAddedEventCategory.get(0), "disabled")),
						"true".equals(getAttribute(resetAllFiltersAndRemoveAddedEventCategory.get(0), "disabled")));
			}
			break;
		case "remove added event category":
			if (isEnabled.equals("enabled")) {
				Assert.assertTrue(
						String.format("remove added event category disabled %s ",
								getAttribute(resetAllFiltersAndRemoveAddedEventCategory.get(1), "disabled")),
						"false".equals(getAttribute(resetAllFiltersAndRemoveAddedEventCategory.get(1), "disabled")));
			}
			if (isEnabled.equals("disabled")) {
				Assert.assertTrue(
						String.format("remove added event category disabled %s ",
								getAttribute(resetAllFiltersAndRemoveAddedEventCategory.get(1), "disabled")),
						"true".equals(getAttribute(resetAllFiltersAndRemoveAddedEventCategory.get(1), "disabled")));
			}
			break;
		case "download":
			if (isEnabled.equals("enabled")) {
				Assert.assertTrue(String.format("dowload disabled %s ", getAttribute(downloadBtn, "disabled")),
						"false".equals(getAttribute(downloadBtn, "disabled")));
			}
			if (isEnabled.equals("disabled")) {
				Assert.assertTrue(String.format("download disabled %s ", getAttribute(downloadBtn, "disabled")),
						"true".equals(getAttribute(downloadBtn, "disabled")));
			}
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}

	}

	/**
	 * verify drop down option from audit trail
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

	/**
	 * 
	 * @param text
	 * @param fieldName
	 */
	public void verifyFieldText(String text, String fieldName) {
		String name = getXmlFilesData(text);
		switch (fieldName) {
		case "category name":
			verifyText(auditTrailCategory, name);
			break;
		case "user":
			verifyText(selectUser, name);
			break;
		default:
			log.error("invalid field" + fieldName);
			Assert.fail("failed");
			break;
		}
	}

	/**
	 * verify category tab is not present in audit trail page
	 * 
	 * @param categoryTabName
	 */
	public void verifyElementNotPresent(String fieldName) {
		List<WebElement> element = null;
		switch (fieldName) {
		case "login tab":
			Assert.assertFalse(isElementPresent(loginTab));
			break;
		case "login option":
			String name = getXmlFilesData(fieldName);
			element = driver.findElements(By.xpath("//*[text()='" + name + "']"));
			if (element.size() > 1) {
				Assert.fail(String.format("s is not displaying"));
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
	public void verifyNumberOfRowsInAuditTrailTable(int rows) {
		scrollUpOrDownWindows(500);
		int totalRows = Integer.valueOf(getText(paginationPage.rowsPerPage));
		List<String> rowData = new ArrayList<>();
		for (int i = 1; i <= totalRows; i++) {
			String rowItem = "//*[@data-id='" + Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			rowData.add(getText(element));
			if (i > 31) {
				scrollScrollBar(auditTrailTable, 40, Constant.DOWN);
			} else {
				scrollScrollBar(auditTrailTable, 30, Constant.DOWN);

			}

		}

		Assert.assertTrue(rows == rowData.size());
		scrollScrollBar(auditTrailTable, 20, Constant.TOP);
	}

	/**
	 * validate mentioned row number data in life cycle states audit trail table
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForLifeCycleStatesAuditTrail(String data, String eventName,
			int rowNumber) {
		String expectedTime = null;
		String actualTime = null;
		List<String> rowData = new ArrayList<>();
		String lifeCycleStateData = getXmlFilesData(data);
		String[] expectedData = lifeCycleStateData.split("\\|");
		int columnLength = expectedData.length;
		if (expectedData[0].equals("##")) {
			expectedData[0] = Integer.toString(rowNumber);
		}
		if (expectedData[1].equals("##")) {
			expectedData[1] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (expectedData[3].contains("##")) {
			expectedData[3] = expectedData[3].replace("##", LifeCycleStatesPage.lifeCycleName);
					
		}
		switch (eventName) {
		case "create":
			expectedTime = (LifeCycleStatesPage.lifeCycleStateCreatedTime).toLowerCase();
			break;
		case "update":
			expectedTime = (LifeCycleStatesPage.lifeCycleStateUpdatedTime).toLowerCase();
			break;
		case "delete":
			expectedTime = (LifeCycleStatesPage.lifeCycleStateDeletedTime).toLowerCase();
			break;
		default:
			log.error("invalid field" + eventName);
			Assert.fail("failed");
			break;
		}
		for (int i = 1; i <= columnLength+1; i++) {
			String rowItem = "//*[@data-id='" + Integer.toString(rowNumber) + "']//*[@aria-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			if (i != 3) {
				rowData.add(getText(element));
			} else {
				actualTime = getText(element);
			}
			// scrollScrollBar(auditTrailTable, 90, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, expectedData));
		Assert.assertTrue(compareArrayAndList(expectedData, rowData));
		Assert.assertTrue(dateTimeiFunctions.validateTimeWithInDuration(expectedTime, actualTime, "", 60));

	}
	
	/**
	 * validate mentioned row number data in numbering system audit trail table
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForNumberingSystemAuditTrail(String data, String eventName,
			int rowNumber) {
		String expectedTime = null;
		String actualTime = null;
		List<String> rowData = new ArrayList<>();
		String lifeCycleStateData = getXmlFilesData(data);
		String[] expectedData = lifeCycleStateData.split("\\|");
		int columnLength = expectedData.length;
		if (expectedData[0].equals("##")) {
			expectedData[0] = Integer.toString(rowNumber);
		}
		if (expectedData[1].equals("##")) {
			expectedData[1] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (expectedData[3].contains("##")) {
			expectedData[3] = expectedData[3].replace("##", NumberingSystemPage.numberingSystemName);
					
		}
		switch (eventName) {
		case "create":
			expectedTime = (NumberingSystemPage.numberingSystemCreatedTime).toLowerCase();
			break;
		case "update":
			expectedTime = (NumberingSystemPage.numberingSystemUpdatedTime).toLowerCase();
			break;
		case "delete":
			expectedTime = (NumberingSystemPage.numberingSystemDeletedTime).toLowerCase();
			break;
		default:
			log.error("invalid field" + eventName);
			Assert.fail("failed");
			break;
		}
		for (int i = 1; i <= columnLength+1; i++) {
			String rowItem = "//*[@data-id='" + Integer.toString(rowNumber) + "']//*[@aria-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			if (i != 3) {
				rowData.add(getText(element));
			} else {
				actualTime = getText(element);
			}
			// scrollScrollBar(auditTrailTable, 90, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, expectedData));
		Assert.assertTrue(compareArrayAndList(expectedData, rowData));
		Assert.assertTrue(dateTimeiFunctions.validateTimeWithInDuration(expectedTime, actualTime, "", 60));

	}

	/**
	 * validate mentioned row number data in Tag audit trail table
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForTagAuditTrail(String data, String eventName,
			int rowNumber) {
		String expectedTime = null;
		String actualTime = null;
		List<String> rowData = new ArrayList<>();
		String lifeCycleStateData = getXmlFilesData(data);
		String[] expectedData = lifeCycleStateData.split("\\|");
		int columnLength = expectedData.length;
		if (expectedData[0].equals("##")) {
			expectedData[0] = Integer.toString(rowNumber);
		}
		if (expectedData[1].equals("##")) {
			expectedData[1] = dateTimeiFunctions.getCurrentDateMonthNameYear();
		}
		if (expectedData[3].contains("##")) {
			expectedData[3] = expectedData[3].replace("##", TagsPage.tagName);
					
		}
		switch (eventName) {
		case "create":
			expectedTime = (TagsPage.tagCreatedTime).toLowerCase();
			break;
		case "update":
			expectedTime = (TagsPage.tagUpdatedTime).toLowerCase();
			break;
		case "delete":
			expectedTime = (TagsPage.tagDeletedTime).toLowerCase();
			break;
		default:
			log.error("invalid field" + eventName);
			Assert.fail("failed");
			break;
		}
		for (int i = 1; i <= columnLength+1; i++) {
			String rowItem = "//*[@data-id='" + Integer.toString(rowNumber) + "']//*[@aria-colindex='"
					+ Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			if (i != 3) {
				rowData.add(getText(element));
			} else {
				actualTime = getText(element);
			}
			// scrollScrollBar(auditTrailTable, 90, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, expectedData));
		Assert.assertTrue(compareArrayAndList(expectedData, rowData));
		Assert.assertTrue(dateTimeiFunctions.validateTimeWithInDuration(expectedTime, actualTime, "", 60));

	}

}
