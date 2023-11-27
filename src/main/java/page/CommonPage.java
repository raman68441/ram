package page;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ConfigReader;
import utility.ReadXml;

/**
 * This class will have common elements and its functionality
 */
public class CommonPage  extends GlobalFunctions {

	Logger log = LogManager.getLogger(CommonPage.class);
	ReadXml readxml = new ReadXml();
	private WebDriver driver;	
	ConfigReader configReader;
	Properties prop;
	
	@FindBy(xpath="//*[@class ='MuiSvgIcon-root MuiSvgIcon-fontSizeInherit css-1cw4hi4']")
	WebElement hooverActivatedMenu;
	
	@FindBy(xpath="//*[@class ='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-dense MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-dense MuiMenuItem-gutters css-7zzzi9']")
	WebElement logoutBtn;
	
	@FindBy(xpath="//*[@class ='MuiTypography-root MuiTypography-caption css-1j6vmv8']")
	WebElement loginEmailId;
	
	@FindBy(xpath="//*[@class ='MuiTypography-root MuiTypography-body2 css-1r5bq9o']")
	WebElement loginName;
	
	public CommonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void launchApplication() {
		switchWindow(0);
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("launching Vender application");
	}
	
	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		switch (fieldName) {
		case "hover activated menu":
			clickElement(hooverActivatedMenu);
			break;
		case "logout option":
			clickElement(logoutBtn);
			break;
		case "back button":
			driver.navigate().back();
			break;
		case "forward button":
			driver.navigate().forward();
			break;
		case "close button":
			driver.close();
			break;
		case "new window":
			openNewWindow();
			break;
		case "refresh button":
			driver.navigate().refresh();
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
	public void verifyFieldText(String text, String fieldName) {
		String name = getXmlFilesData(text);
		switch (fieldName) {
		case "user name":
			verifyText(loginName, name);
			break;
		case "email id":
			verifyText(loginEmailId, name);
			break;
		case "logout":
			verifyText(logoutBtn, name);
			break;
		default:
			log.info("***failed***");
			log.error("***error***");
			Assert.fail("invalid name");
			break;
		}
	}

}
