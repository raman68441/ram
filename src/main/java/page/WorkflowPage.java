package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
import utility.DateTimeiFunctions;

/*
 * This class explains about Workflow screen functionality
 */
public class WorkflowPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(WorkflowPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public WorkflowPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}