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

	@FindBy(xpath = "//*[@class='MuiDataGrid-virtualScroller css-1pzb349']")
	WebElement organizationListTable;

	public String organizationColumnHeader = "//*[@class='MuiDataGrid-columnHeader MuiDataGrid-columnHeader--sortable' and  @aria-colindex='#']";

	public String orgaizationData = "//*[@data-colindex='#']";

	@FindBy(xpath = "//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	WebElement editIcon;

	@FindBy(xpath = "//*[@data-testid='DeleteOutlineOutlinedIcon']")
	WebElement deleteIcon;

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
	
	@FindBy(xpath = "//*[@class='MuiDataGrid-columnHeaderTitleContainerContent']")
	List<WebElement> columnHeader;
	
	@FindBy(xpath = "//*[@class='MuiBox-root css-1km9knq']")
	WebElement scrollPage;
	
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
		case "organization tab":
			waitTillAttributeDisplay(organization, "text", "Organisation", Duration.ofSeconds(30));
			verifyText(organization, name);
			break;
		case "organization list":
			waitTillAttributeDisplay(organizationList, "role", "tab", Duration.ofSeconds(20));
			verifyText(organizationList, name);
			break;
		case "new organization does not displayed":
			Assert.assertFalse(isElementPresent(newOrganization));
			break;
		case "edit icon does not displayed":
			Assert.assertFalse(isElementPresent(editIcon));
			break;
		case "delete icon does not displayed":
			Assert.assertFalse(isElementPresent(deleteIcon));
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
	public void verifyOrganizationTableColumnHeaders(String expectedColumnHeaders) {
		waitTillAttributeDisplay(organizationListTable, "class", "MuiDataGrid-virtualScroller css-1pzb349",
				Duration.ofSeconds(60));
		String columnHeaderValue = getXmlFilesData(expectedColumnHeaders);
		String[] ExpectedColumnHeader = columnHeaderValue.split("\\|");
		List<String> actualColumnHeadersText = new ArrayList<>();
		for (int i = 0; i < columnHeader.size(); i++) {
			actualColumnHeadersText.add(getText(columnHeader.get(i)));                                
		}
		scrollScrollBar(organizationListTable, 300, Constant.LEFT);
		// compare expected and actual column headers
		log.info("Organization column headers " + actualColumnHeadersText);
		Assert.assertTrue(compareArrayAndList(ExpectedColumnHeader, actualColumnHeadersText));
		log.info("Organization type column headers displayed");
	}
		
	/**
	 * verify total number of rows
	 * 
	 * @param rows
	 */
	public void verifyNumberOfRowsInOrganizationTable() {
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
		default:
			Assert.fail("failed");
			log.error("invalid field " + fieldName);
			break;
		}
	}

}
