package page;

import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
import utility.ConfigReader;
import utility.ReadXml;

/**
 * This class will have common elements and its functionality
 */
public class CommonPage extends GlobalFunctions {

	Logger log = LogManager.getLogger(CommonPage.class);
	ReadXml readxml = new ReadXml();

	private BaseClass baseClass;
	private WebDriver driver;
	ConfigReader configReader;
	Properties prop;

	@FindBy(xpath = "//*[@class ='MuiAvatar-img css-1hy9t21']")
	WebElement loginImage;

	@FindBy(xpath = "//*[@class ='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-11v7f0k']")
	WebElement loginDropDown;

	@FindBy(xpath = "//*[text()='Logout']")
	WebElement logoutOption;

	@FindBy(xpath = "//*[text()='Your Profile']")
	WebElement yourProfileOption;

	@FindBy(xpath = "//*[text()='Notifications']")
	WebElement notificationsOption;

	@FindBy(xpath = "//p[contains(text(),'@')]")
	WebElement loginEmailId;

	@FindBy(xpath = "//*[@class ='MuiTypography-root MuiTypography-body1 css-j5a1ma']")
	WebElement loginName;

	@FindBy(xpath = "//*[text()='Sort by ASC']")
	WebElement sortByAscendingOption;

	@FindBy(xpath = "//*[text()='Sort by DESC']")
	WebElement sortByDescendingOption;

	@FindBy(xpath = "//*[text()='Filter']")
	WebElement filterOption;

	@FindBy(xpath = "//*[text()='Hide column']")
	WebElement hideColumnOption;

	@FindBy(xpath = "//*[text()='Manage columns']")
	WebElement manageColumnOption;

	@FindBy(xpath = "//*[@class='MuiFormLabel-root MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-sizeMedium MuiInputLabel-standard MuiFormLabel-colorPrimary MuiInputLabel-root MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-sizeMedium MuiInputLabel-standard css-1r4qbck']")
	WebElement findColumn;

	@FindBy(xpath = "//*[text()='Show all']")
	WebElement showAll;

	@FindBy(xpath = "//*[text()='Hide all']")
	WebElement hideAll;
	
	@FindBy(xpath = "//*[text()='System']")
	WebElement systemMenu;
	
	@FindBy(xpath = "//*[text()='Config']")
	WebElement configMenu;
	
	@FindBy(xpath = "//*[text()='Admin']")
	WebElement adminMenu;
	
	@FindBy(xpath = "//*[text()='Workflow']")
	WebElement workFlowMenu;
	
	@FindBy(xpath = "//*[text()='Repository']")
	WebElement repositoryMenu;
	
	@FindBy(xpath = "//*[text()='Task']")
	WebElement taskMenu;
	
	@FindBy(xpath = "//*[text()='Template']")
	WebElement templateMenu;
	
	@FindBy(xpath = "//*[text()='Document']")
	WebElement documentMenu;
	
	@FindBy(xpath = "//*[text()='Reports']")
	WebElement reportsMenu;
	
	@FindBy(xpath = "//*[text()='Dashboard']")
	WebElement dashBoardMenu;
	
	@FindBy(xpath = "//*[@type='file']")
	WebElement fileupload;
	
	@FindBy(xpath = "//*[text()='Delete']")
	WebElement deleteBtn;
	
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextBtn;
	
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement cancelBtn;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()='Update']")
	WebElement updateBtn;
	
	@FindBy(xpath = "//*[text()='Back']")
	WebElement backBtn;
	
	
	public static String loggedInUserfullName;

	public CommonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launchApplication() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Launching DMS application");
	}

	/**
	 * Click on Button
	 * 
	 * @param fieldName - field name
	 */
	public void clickOnBtn(String fieldName) {
		switch (fieldName) {
		case "logged in user drop down":
			clickElement(loginDropDown);
			break;
		case "logout option":
			clickElement(logoutOption);
			break;
		case "back button":
			driver.navigate().back();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "forward button":
			driver.navigate().forward();
			break;
		case "close button":
			driver.close();
			break;
		case "new tab":
			openNewWindow();
			break;
		case "refresh button":
			driver.navigate().refresh();
			break;
		case "system":
			clickElement(systemMenu);
			break;	
		case "config":
			clickElement(configMenu);
			break;
		case "task":
			clickElement(taskMenu);
			break;
		case "admin":
			clickElement(adminMenu);
			break;
		case "workflow":
			clickElement(workFlowMenu);
			break;
		case "repository":
			clickElement(repositoryMenu);
			break;
		case "template":
			clickElement(templateMenu);
			break;
		case "document":
			clickElement(documentMenu);
			break;
		case "report":
			clickElement(reportsMenu);
			break;
		case "dashboard":
			clickElement(dashBoardMenu);
			break;
		case "delete":
			clickElement(deleteBtn);
			break;
		case "next":
			clickElement(nextBtn);
			break;
		case "cancel":
			clickElement(cancelBtn);
			break;
		case "save":
			clickElement(saveBtn);
			break;
		case "update":
			clickElement(updateBtn);
			break;
		case "back":
			clickElement(backBtn);
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
		case "logged in user":
			waitTillAttributeDisplay(loginName, "textContent", name, Duration.ofSeconds(60));
			verifyText(loginName, name);
			loggedInUserfullName = name;
			break;
		case "email id":
			verifyText(loginEmailId, name);
			break;
		case "logout":
			verifyText(logoutOption, name);
			break;
		case "your profile":
			verifyText(yourProfileOption, name);
			break;
		case "notifications":
			verifyText(notificationsOption, name);
			break;
		case "delete":
			verifyText(deleteBtn, name);
			break;
		case "task":
			verifyText(taskMenu, name);
			break;
		case "save button":
			verifyText(saveBtn, name);
			break;
		case "update":
			verifyText(updateBtn, name);
			break;
		case "next":
			verifyText(nextBtn, name);
			break;	
		case "back":
			verifyText(backBtn, name);
			break;
		case "cancel button":
			verifyText(cancelBtn, name);
			break;
		default:
			log.info("***failed***");
			log.error("***error***");
			Assert.fail("invalid name");
			break;
		}
	}

	/**
	 * Relaunch the application.
	 */
	public void reLauchApplication() {
		driver.quit();
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		String browserName = prop.getProperty("browser");
		baseClass = new BaseClass();
		driver = baseClass.init_dirver(browserName);
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Re launching DMS application");
	}

	/**
	 * switch to the mentioned window
	 * 
	 * @param windowNumber
	 */
	public void switchMentionedWindow(int windowNumber) {
		switchWindow(windowNumber);
	}

	/**
	 * open new tab
	 */
	public void openNewTab() {
		openNewWindow();
	}
	
	/**
	 * Upload file
	 * 
	 * @param file - file name
	 */
	public void uploadFileFromFolder(String file) {
		String filePath = getXmlFilesData(file);
		String path = System.getProperty("user.dir");
		String fullPath = path + filePath;
		fileupload.sendKeys(fullPath);
		log.info(String.format("file uploaeded %s",fullPath));
	}

}
