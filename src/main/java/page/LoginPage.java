package page;

import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Constant;
import utility.DateTimeiFunctions;

/**
 * This class will have login functionality
 */
public class LoginPage extends GlobalFunctions {

	Logger log = LogManager.getLogger(LoginPage.class);
	private WebDriver driver;
	DateTimeiFunctions dateTimeiFunctions = new DateTimeiFunctions();

	@FindBy(id = "login-email")
	WebElement emailId;
	// private By usrnm = By.id("Username");

	@FindBy(id = "login-password")
	WebElement password;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-fullWidth MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-fullWidth css-1jexqpc'] | //*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-fullWidth MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-fullWidth css-6rq4vy']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-fullWidth MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-fullWidth css-1bdjuef']")
	WebElement loginWithSsoLink;

	@FindBy(xpath = "//b[text()='OR']")
	WebElement orField;

	@FindBy(linkText = "Forgot Password")
	WebElement forgotPassword;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-g9jn89']")
	WebElement loginToDMS;
	
	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	WebElement enterLoginDetails;

	@FindBy(xpath = "//*[@class='css-yjsfm1']//span")
	List<WebElement> defaultTextInUserNamePassword;

	@FindBy(xpath = "//*[@data-testid='VisibilityIcon']")
	WebElement passwordProtectionIconOn;

	@FindBy(xpath = "//*[@data-testid='VisibilityOffIcon']")
	WebElement passwordProtectionIconOff;
	
	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement loginErrorMessage;
	
	@FindBy(xpath = "//*[@class='MuiAvatar-img css-1hy9t21']")
	WebElement loginLogo;
	
	@FindBy(xpath = "//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement loginError;

	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body2 css-1tulygb']")
	WebElement poweredByField;
	
	@FindBy(xpath="//*[@class='MuiBox-root css-c2m5kg']")
	WebElement arcolabLogoField;
	
	@FindBy(id="login-email-helper-text")
	WebElement emailRequiredErrorMessage;
	
	@FindBy(id="login-password-helper-text")
	WebElement passwordRequiredErrorMessage;
	
	public static String loginTime;
	
	
	
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
			loginTime= dateTimeiFunctions.getCurrentTime();
			break;
		case "username":
			clickElement(emailId);
			break;
		case "login with sso":
			clickElement(loginWithSsoLink);
			break;
		case "forgot password":
			clickElement(forgotPassword);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;				
		case "password protection off":
			clickElement(passwordProtectionIconOn);
			break;
		case "password protection on":
			clickElement(passwordProtectionIconOff);
			break;
		case "enter":
			clickOnKeyBoardKeys(password,Constant.ENTER);
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
			waitTillAttributeDisplay(loginToDMS, "textContent", "Login To DMS", Duration.ofSeconds(60));
			verifyTextContent(loginToDMS, "textContent", name);
			break;
		case "enter your login details":
			verifyText(enterLoginDetails, name);
			break;	
		case "login with sso link":	
			String ssoText = getText(loginWithSsoLink);
			ssoText = ssoText.replaceAll("&nbsp;", " "); 
			ssoText = ssoText.replaceAll(String.valueOf((char) 160), " ");
			ssoText = ssoText.trim();
			compareTwoString(ssoText, name);
			break;
		case "email is required field":
		case "invalid email":
			verifyText(emailRequiredErrorMessage, name);
			break;
		case "password is required field":
			verifyText(passwordRequiredErrorMessage, name);
			break;
		case "arcolab logo text":
			compareTwoString(getAttribute(arcolabLogoField, "alt"), name);
			break;
		case "powered by text":
			verifyText(poweredByField, name);
			break;
		case "email default text":
			(defaultTextInUserNamePassword.get(0).getDomProperty("textContent")).contains(name);	
			break;
		case "password default text":
			(defaultTextInUserNamePassword.get(0).getDomProperty("textContent")).contains(name);
			break;
		case "invalid login credential error message":
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			verifyText(loginErrorMessage, name);
			break;
		case "no error message":
			 Assert.assertTrue(isExists(loginLogo));
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
		case "email":
			emailId.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			enterValue(emailId, fieldValue);
			break;
		case "password":
			password.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
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
