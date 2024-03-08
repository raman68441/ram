package page.admin;

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
import page.DateSelectionPage;
import page.GlobalFunctions;
import page.LoginPage;
import page.PaginationPage;
import utility.Constant;

/**
 * This class has Organization functionality details
 */

public class OrganizationPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(OrganizationPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());

	public OrganizationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@role='tab' and text()='Organisation List']")
	WebElement organizationList;

	@FindBy(xpath = "//*[text()='Organisation']")
	WebElement organization;

	@FindBy(xpath = "//*[@role='tab' and text()='New Organisation '] ")
	WebElement newOrganization;

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1grl8tv']")
	WebElement organizationListTable;

	public String organizationColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String orgaizationData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeSmall css-12ef6ku']")
	List<WebElement> editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	List<WebElement> newOrganizationFieldLabels;

	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;

	@FindBy(id = "org_name")
	WebElement orgName;

	@FindBy(id = "org_code")
	WebElement orgCode;

	@FindBy(xpath = "//*[text()='Edit Organisation']")
	WebElement editOrganizationHeader;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	WebElement confirmDelete;

	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement organizationMessage;

	@FindBy(xpath = "//*[text()='Organisation Name is required']")
	WebElement organizationNameRequired;

	@FindBy(xpath = "//*[text()='Organisation Code is required']")
	WebElement organizationCodeRequired;

	@FindBy(id = "org_description")
	WebElement orgDescription;

	/**
	 * verify the field name
	 * 
	 * @param fieldName
	 */
	public void verifyFieldName(String fieldName) {
		String name = getXmlFilesData(fieldName);
		switch (fieldName) {
		case "organization tab":
			waitTillAttributeDisplay(organization, "text", "Organisation", Duration.ofSeconds(30));
			verifyText(organization, name);
			break;
		case "organization list":
			waitTillAttributeDisplay(organizationList, "role", "tab", Duration.ofSeconds(20));
			verifyText(organizationList, name);
			break;
		case "new organization":
			verifyText(newOrganization, name);
			break;
		case "label organization name":
		case "label organization code":
		case "label organization description":
			getTextFromElementInListAndValidate(newOrganizationFieldLabels, name);
		case "cancel":
			verifyText(cancelBtn, name);
			break;
		case "save":
			verifyText(saveBtn, name);
			break;
		case "warning message organization name required":
			verifyText(organizationNameRequired, name);
			break;
		case "warning message organization code required":
			verifyText(organizationCodeRequired, name);
			break;
		case "organization create message":
		case "organization allready exist message":
		case "organization updated successfully message":
			verifyText(organizationMessage, name);
			break;
		case "confirm you delete":
			verifyText(confirmDelete, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "edit organization header":
			verifyText(editOrganizationHeader, name);
			break;
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

	/**
	 * verify Organization table column headers name
	 * 
	 * @param columnHeaders -organization column headers name
	 */
	public void verifyOrganizationTableColumnHeaders(String columnHeaders) {
		// wait for element to load
		waitTillAttributeDisplay(organizationListTable, "class", "MuiDataGrid-virtualScroller css-1grl8tv",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(columnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> columnHeadersText = new ArrayList<>();
		for (int i = 2; i <= ExpectedColumnHeader.length + 1; i++) {
			String columnHeader = organizationColumnHeader.replace("#", Integer.toString(i));
			WebElement element = driver.findElement(By.xpath(columnHeader));
			columnHeadersText.add(getText(element));
		}
		// compare expected and actual column headers
		log.info("organization column headers " + columnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, columnHeadersText));
		log.info("organization column headers displayed");
	}

	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInOrganizationTable() {
		scrollUpOrDownWindows(500);
		int rowsInPage = Integer.valueOf(getText(paginationPage.rowsPerPage));
		int totalRecords = Integer.valueOf(paginationPage.totalNumberOfRecords);
		if (rowsInPage > totalRecords) {
			rowsInPage = totalRecords;
		}
		List<String> rowData = new ArrayList<>();
		for (int i = 1; i <= rowsInPage; i++) {
			String rowItem = "//*[@data-colindex='" + Integer.toString(i) + "']";
			WebElement element = driver.findElement(By.xpath(rowItem));
			rowData.add(getText(element));
			if (i > 31) {
				scrollScrollBar(organizationListTable, 40, Constant.DOWN);
			} else {
				scrollScrollBar(organizationListTable, 30, Constant.DOWN);

			}

		}

		Assert.assertTrue(rowsInPage == rowData.size());
		scrollScrollBar(organizationListTable, 20, Constant.TOP);
	}

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		String name = fieldName.toLowerCase();
		switch (name) {
		case "new organization":
			clickElement(newOrganization);
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
		case "delete icon":
			clickOnPerticularListElement(deleteIcon, 1);
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
		case "organization name":
			enterValue(orgName, fieldValue);
			break;
		case "organization code":
			enterValue(orgCode, fieldValue);
			break;
		case "description":
			enterValue(orgDescription, fieldValue);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * validate mentioned row number data in organization
	 * 
	 * @param rowNumber
	 * @param data
	 */
	public void validateMentionedRowNumberDataForOrganization(String data, int rowNumber) {
		String organizationData = getXmlFilesData(data);
		String[] organizationExpectedData = organizationData.split("\\|");
		int columnLength = organizationExpectedData.length;
		List<String> rowData = new ArrayList<>();
		for (int i = 0; i <= columnLength; i++) {
			String rowItem = orgaizationData.replace("#", Integer.toString(i));
			WebElement element = driver.findElement(By.xpath(rowItem));
			rowData.add(getText(element));
			// scrollScrollBar(auditTrailTable, 90, Constant.RIGHT);
		}
		log.info(String.format("mentioned row %s %s", rowNumber, organizationExpectedData));
		Assert.assertTrue(compareArrayAndList(organizationExpectedData, rowData));
	}

}
