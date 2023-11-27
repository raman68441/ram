package hooks;

import java.util.Properties;
import org.openqa.selenium.WebDriver;

import core.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import page.GlobalFunctions;
import utility.ConfigReader;

/**
 * This class contains Hooks
 */
public class Hooks {
	private BaseClass baseClass;
	private WebDriver driver;
	ConfigReader configReader;
	Properties prop;
	GlobalFunctions globalFunctions;

	/**
	 * @Before which runs before each scenario - initializing property reader
	 * order = 0
	 */
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	/**
	 * @Before which runs before each scenario -  launching application
	 * order = 1
	 */
	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		baseClass = new BaseClass();
		driver = baseClass.init_dirver(browserName);
	}

/**
 * @AfterStep - run after each step. taking screen shot
 * @param scenario
 */
	@AfterStep(order = 0)
	public void takeScreenshotAfterStep(Scenario scenario) {	
		globalFunctions=  new GlobalFunctions();
		try {
			scenario.attach(globalFunctions.getByteScreenshot(), "image/png", "image");
		} catch (Exception e) {
		
		}
	}
	
	/**
	 * @After -  runs after each scenario quitting driver
	 * @param sc -  scenario
	 */
	@After(order = 0)
	public void tearDown(Scenario sc) {
		driver.quit();
	}
	
}


