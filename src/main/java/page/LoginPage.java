package page;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class will have login functionality
 */
public class LoginPage extends GlobalFunctions {

	Logger log = LogManager.getLogger(LoginPage.class);
	private WebDriver driver;

	@FindBy(id = "Username")
	WebElement userName;
	// private By usrnm = By.id("Username");

	@FindBy(id = "outlined-adornment-password")
	WebElement password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[text()='Login with SSO']")
	WebElement loginWithSsoBtn;

	@FindBy(xpath = "//b[text()='OR']")
	WebElement orField;

	@FindBy(linkText = "Forgot Password")
	WebElement forgotPassword;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h6 MuiTypography-gutterBottom css-1m5zi8o']")
	WebElement loginToDMS;

	@FindBy(xpath = "//*[@class='MuiOutlinedInput-notchedOutline css-igs3ac']//span")
	List<WebElement> defaultTextInUserNamePassword;

	@FindBy(xpath = "//*[@data-testid='VisibilityIcon']")
	WebElement passwordProtectionIconOn;

	@FindBy(xpath = "//*[@data-testid='VisibilityOffIcon']")
	WebElement passwordProtectionIconOff;
	
	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement loginErrorMessage;
	
	@FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeInherit css-1cw4hi4']")
	WebElement errorIcon;

	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		switch (fieldName) {
		case "login":
			clickElement(loginBtn);
			break;
		case "username":
			clickElement(userName);
			break;
		case "login with sso":
			clickElement(loginWithSsoBtn);
			break;
		case "forgot password":
			clickElement(forgotPassword);
			break;				
		case "password protection off":
			clickElement(passwordProtectionIconOn);
			break;
		case "password protection on":
			clickElement(passwordProtectionIconOff);
			break;
		default:
			Assert.fail("failed");
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * Verify field name
	 * 
	 * @param fieldName - expected name
	 */
	public void verifyFieldName(String fieldName) {
		String name = getXmlFilesData(fieldName);
		switch (fieldName) {
		case "login button":
			verifyText(loginBtn, name);
			break;
		case "forgot password":
			verifyText(forgotPassword, name);
			break;
		case "login to dms":
			verifyText(loginToDMS, name);
			break;
		case "login with sso":
			verifyText(loginWithSsoBtn, name);
			break;
		case "or field":
			verifyText(orField, name);
			break;
		case "user name default text":
		case "password default text":
			getTextFromElementInListAndValidate(defaultTextInUserNamePassword, name);
			break;
		case "login warning message":
			waitTillAttributeDisplay(errorIcon, "data-testid", "ErrorOutlineIcon", Duration.ofSeconds(60));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			verifyText(loginErrorMessage, name);
			break;			
		default:
			log.info("***failed***");
			log.error("***error***");
			Assert.fail("invalid name");
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
		case "username":
			enterValue(userName, fieldValue);
			break;
		case "password":
			enterValue(password, fieldValue);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}

	/**
	 * Verify password visibility icon is working and password not displayed in source page.
	 * 
	 * @param status - icon status
	 */
	public void verifyPasswordVisibilityIcon(String status) {
		if (status.equals("on")) {
			String password = passwordProtectionIconOn.getText();
			if(!password.equals("")) {
				Assert.fail("password displayed in source");
			}
			Assert.assertTrue(isExists(passwordProtectionIconOn));
		} else {
			String password = passwordProtectionIconOff.getText();
			if(!password.equals("")) {
				Assert.fail("password displayed in source");
			}
			Assert.assertTrue(isExists(passwordProtectionIconOff));
		}
	}

}
