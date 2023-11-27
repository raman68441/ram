package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(ConfigurationPage.class);
	private WebDriver driver;
	
	public ConfigurationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-testid='BusinessIcon']")
	WebElement aduitTrailIcon;

}
