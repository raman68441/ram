package page;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuditTrailPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(AuditTrailPage.class);
	private WebDriver driver;
	
	public AuditTrailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@data-testid='BusinessIcon']")
	WebElement aduitTrailIcon;
	
	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body2 css-68o8xu']")
	WebElement aduitTrail;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-1b8y91']")
	List<WebElement> auditTrailFieldsLabel;
	
	@FindBy(id="audit_trail_event_category")
	WebElement categoryName;
	
	@FindBy(id="audit_trail_event")
	WebElement eventName;
	
	@FindBy(id=":rbt:")
	WebElement selectDate1;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
