package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DateTimeiFunctions;

public class PaginationPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(AuditTrailPage.class);
	private WebDriver driver;

	public PaginationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='MuiSelect-select MuiTablePagination-select MuiSelect-standard MuiInputBase-input css-1cccqvr']")
	public WebElement rowsPerPage;

	@FindBy(xpath = "//*[@class='MuiTablePagination-displayedRows css-lf3lkf']")
	WebElement numberOfRowsDisplay;

	@FindBy(xpath = "//*[@title='Go to previous page']")
	WebElement previousPageArrowField;

	@FindBy(xpath = "//*[@title='Go to next page']")
	public WebElement nextPageArrowField;

	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters MuiTablePagination-menuItem css-wn1m24']")
	WebElement rowsDropDown;

	public static String totalNumberOfRecords;
    public String pageNumbers = "//*[@data-value='#']";
	//*[@data-value='20']
	
	/**
	 * select number of pages to display from a drop down
	 * 
	 * @param data       -> number of pages
	 * @param optionType -> value , index , text
	 */
	public void selectPagesFromDropDown(String data) {
		clickElement(rowsPerPage);
		String pageNumber = pageNumbers.replace("#", data);
		clickElement(driver.findElement(By.xpath(pageNumber)));
	}

	/**
	 * Verify Previous page and next page arrow status
	 * 
	 * @param isEnabled -> arrow is enabled true or false
	 * @param fieldName -> field name
	 */
	public void verifyPreviousAndNextArrowState(String status, String fieldName) {
		switch (fieldName) {
		case "previous page":
			if (status.equals("enabled")) {
				Assert.assertTrue(
						String.format("previous page arrow status %s ",
								getAttribute(previousPageArrowField, "disabled")),
						"false".equals(getAttribute(previousPageArrowField, "disabled")));
			}
			if (status.equals("disabled")) {
				Assert.assertTrue(
						String.format("previous page arrow status %s ",
								getAttribute(previousPageArrowField, "disabled")),
						"true".equals(getAttribute(previousPageArrowField, "disabled")));
			}
			break;
		case "next page":
			if (status.equals("enabled")) {
				Assert.assertTrue(
						String.format("next page arrow status %s ", getAttribute(nextPageArrowField, "disabled")),
						"false".equals(getAttribute(nextPageArrowField, "disabled")));
			}
			if (status.equals("disabled")) {
				Assert.assertTrue(
						String.format("next page arrow status %s ", getAttribute(nextPageArrowField, "disabled")),
						"true".equals(getAttribute(nextPageArrowField, "disabled")));
			}
			break;
		}

	}

	/**
	 * verify number of rows in page
	 * 
	 * @param rowNumber
	 */
	public void verifyRowsPerPage(String rowNumber) {
		verifyText(rowsPerPage, rowNumber);
	}

	/**
	 * click on previous or next page
	 * 
	 * @param fieldName
	 */
	public void clickPrevOrNext(String fieldName) {
		if (fieldName.equals("previous page")) {
			clickElement(previousPageArrowField);
		} else {
			clickElement(nextPageArrowField);
		}
	}

	/**
	 * get total number records
	 */
	public String getTotalNumberRecords() {
		String numberOfRecords = getText(numberOfRowsDisplay);
		String[] records = numberOfRecords.split(" ");
		totalNumberOfRecords = records[records.length - 1];
		return totalNumberOfRecords;
	}

	/**
	 * 
	 */
	public void clickOnNextPageTillLastData() {
		int totalRows = Integer.valueOf(getTotalNumberRecords());
		int rowsInPage = Integer.valueOf(getText(rowsPerPage));
		int pages = totalRows / rowsInPage;
		for (int i = 0; i < pages; i++) {
			clickElement(nextPageArrowField);
		}
	}
	
	/**
	 * get total number records
	 */
	public int getNumberRecordsInPage() {
		String numberOfRecords = getText(numberOfRowsDisplay);
		String[] data = numberOfRecords.split(" ");
		String[]pagePerData = data[0].split("–");
		int numberOfRecordsInPage = (Integer.valueOf(pagePerData[1]));
		return numberOfRecordsInPage;
	}

}
