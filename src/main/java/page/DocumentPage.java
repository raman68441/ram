package page;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
import utility.DateTimeiFunctions;
	
/*
 * This class explains about Document screen functionality
 */
public class DocumentPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(DocumentPage.class);
	private WebDriver driver;
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	public DocumentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	
	
}
