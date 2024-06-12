package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
import utility.DateTimeiFunctions;

/*
 * This class explains about Repository screen functionality
 */
public class RepositoryPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(RepositoryPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public RepositoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}