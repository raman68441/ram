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

import utility.Constant;

/**
 * This class will have forgot password screen functionality
 */
public class ForgotPasswordPage extends GlobalFunctions{
	Logger log = LogManager.getLogger(ForgotPasswordPage.class);
	private WebDriver driver;

	@FindBy(id = "login-username")
	WebElement emailField;
	
	@FindBy(id = "login-username-label")
	WebElement emailLabel;
	
	@FindBy(id = "login-username-helper-text")
	WebElement invalidEmailIdMessage;

	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom css-g9jn89']")
	WebElement forgotPasswordHeading;
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body2 MuiTypography-gutterBottom css-gix94l']")
	WebElement resolveMessage;	
	
	@FindBy(id = "email-submit-button")
	WebElement submitBtn;	
	
	@FindBy(id = "email-sent")
	WebElement emailSendText;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-fullWidth MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-fullWidth css-p5f629']")
	WebElement backToLoginLink;
	
	
	@FindBy(xpath = "//*[@class='MuiTypography-root MuiTypography-body1 css-1wd1o8s']")
	WebElement documentManagementSystem;		

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
	
	@FindBy(id="login-username-label")
	WebElement loginUserIdLabel;
	
	@FindBy(xpath="//*[@class='MuiAlert-message css-1xsto0d']")
	WebElement submitMessage;
	
	@FindBy(id="otp-sent")
	WebElement enterOtpField;
	
	@FindBy(id="resend-otp-btn")
	WebElement resendOtpBtn;
	
	@FindBy(id="otp-message")
	WebElement otpMessage;
	
	@FindBy(id="otp-input")
	WebElement otpInputField;
	
	@FindBy(id="otp-input-helper-text")
	WebElement otpErrorMessage;
	
	@FindBy(id="otp-submit-button")
	WebElement otpSubmitBtn;
	
	
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
		case "otp submit button":
			clickElement(otpSubmitBtn);
			break;	
		case "enter":
			clickOnKeyBoardKeys(emailField,Constant.ENTER);
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
		case "email field default text":
		case "invalid email id label message":
			Assert.assertTrue(String.format("eamil defaulut text is %s",name),name.equals(getAttribute(emailLabel, "textContent")));
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
		case "invalid email label error message":
			Assert.assertTrue(String.format("reset password text is %s",name),name.equals(getAttribute(loginUserIdLabel, "textContent")));
			break;
		case "send email text":
			verifyText(emailSendText, name);
			break;	
		case "otp success message":
			waitTillAttributeDisplay(submitMessage, "class", "MuiAlert-message css-1xsto0d", Duration.ofSeconds(60));
			verifyText(submitMessage, name);
			break;
		case "enter otp":
			verifyText(enterOtpField, name);
			break;
		case "otp error message":
			verifyText(submitMessage, name);
			break;
		case "invalid email error message":
			verifyText(submitMessage, name);
			break;
		case "invalid email label":
			verifyText(invalidEmailIdMessage, name);
			break;
		case "resend otp text":
			verifyText(resendOtpBtn, name);
			break;		
		case "otp message text":
			Assert.assertTrue(String.format("otp text is %s",name),(getAttribute(otpMessage, "textContent").contains(name)));
			break;
		case "otp less than six digit error message":
			verifyText(otpErrorMessage, name);
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
			enterValue(emailField, fieldValue);
			break;
		case "otp":
			enterValue(otpInputField, fieldValue);
			break;
		default:
			System.out.println("invalid name");
			break;
		}
	}
}
