package page;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class will have forgot password screen functionality
 */
public class ForgotPasswordPage extends GlobalFunctions{
	Logger log = LogManager.getLogger(ForgotPasswordPage.class);
	private WebDriver driver;

	@FindBy(xpath = "//*[@class='MuiOutlinedInput-notchedOutline css-igs3ac']//span")
	WebElement emailField;
	
	@FindBy(id = "email-label")
	WebElement emailLabel;
	
	@FindBy(id = "email")
	WebElement emailId;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-1ycgwhr']")
	WebElement forgotPasswordHeading;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-vl1jh3']")
	WebElement resolveMessage;	
	
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth css-1s3d30o']")
	WebElement submitBtn;	
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1wd1o8s']")
	WebElement documentManagementSystem;	
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 css-1ujpxk5']")
	WebElement backToLoginLink;	

	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input Mui-disabled css-1x5jdmq']")
	WebElement disableEmailId;	

	@FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
	WebElement otpField;	

	@FindBy(xpath = "//*[@class='MuiOutlinedInput-notchedOutline css-igs3ac']//span")
	List<WebElement> defaultTextInUserNamePassword;
	
	@FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-fullWidth css-1s3d30o']")
	WebElement resetPassword;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-1rlkpk6']")
	WebElement sentOtpText;
	
	@FindBy(id = "outlined-adornment-password")
	WebElement password;
	
	@FindBy(xpath = "//*[@data-testid='VisibilityIcon']")
	WebElement passwordProtectionIconOn;

	@FindBy(xpath = "//*[@data-testid='VisibilityOffIcon']")
	WebElement passwordProtectionIconOff;
	
	@FindBy(id="otp-helper-text")
	WebElement otpWarningMessage;
	
	
	public ForgotPasswordPage(WebDriver driver) {
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
		case "submit":
			clickElement(submitBtn);
			break;
		case "back to login link":
			clickElement(backToLoginLink);
			break;
		case "password protection off":
			clickElement(passwordProtectionIconOn);
			break;
		case "password protection on":
			clickElement(passwordProtectionIconOff);
			break;		
		case "reset password":
			clickElement(resetPassword);
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
	public void verifyFieldText(String fieldName) {
		String name = getXmlFilesData(fieldName);
		switch (fieldName) {
		case "document management system text":
			verifyText(documentManagementSystem, name);
			break;
		case "back to login link text":
			verifyText(backToLoginLink, name);
			break;
		case "submit field text":
			verifyText(submitBtn, name);
			break;
		case "forgot password":
			verifyText(forgotPasswordHeading, name);
			break;
		case "resolve message":
			verifyText(resolveMessage, name);
			break;
		case "email default text":
			Assert.assertTrue(String.format("eamil defaulut text is %s",name),name.equals(getAttribute(emailField, "textContent")));
			break;
		case "email id label":
			verifyText(emailLabel, name);
			break;	
		case "email id field diabled":
			Assert.assertTrue(String.format("eamil id is disabled is %s",name),name.equals(getAttribute(disableEmailId, "disabled")));
			break;		
		case "otp field type":
			Assert.assertTrue(String.format("eamil id is disabled is %s",name),name.equals(getAttribute(otpField, "inputmode")));
			break;
		case "password default text":
		case "enter otp default text":
		case "email field label text":
			getTextFromElementInListAndValidate(defaultTextInUserNamePassword, name);
			break;
		case "reset password":
			Assert.assertTrue(String.format("reset password text is %s",name),name.equals(getAttribute(resetPassword, "textContent")));
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
		case "email id":
			enterValue(emailId, fieldValue);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}
}
