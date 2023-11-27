package core;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utility.Constant;

/**
 * This class Base calls for launching browser
 */
public class BaseClass {
	
	Logger log = LogManager.getLogger(BaseClass.class);
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public WebDriver init_dirver(String browser) {
		System.out.println("browser value is: "+browser);
		if(browser.equals("chrome") ) {
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());		
		}
		else if(browser.equals("safari")) {
			tlDriver.set(new SafariDriver());		
		}
		else {
			System.out.println("please pass the proper browser" + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.IMPLICIT_WAIT_TIME));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constant.IMPLICIT_WAIT_TIME));
		return getDriver();
		
	}
	/**
	 * this is used to get the driver with thread local(for  multi thread)
	 * @return driver
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
