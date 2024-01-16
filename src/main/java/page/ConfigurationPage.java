package page;

import java.util.List;

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
	
	@FindBy(xpath="//*[@class='MuiTypography-root MuiTypography-body2 css-68o8xu']")
	List<WebElement> configrationtabs;
	
	@FindBy(xpath="//*[@class='MuiBox-root css-12z0wuy']")
	WebElement configrationimgs;
	
	@FindBy(xpath="//*[@class='MuiTablePagination-selectLabel css-1chpzqh']")
	WebElement rowsPerPage;
	
	@FindBy(xpath="//*[@class='MuiSelect-select MuiTablePagination-select MuiSelect-standard MuiInputBase-input css-1cccqvr']")
	WebElement numberOfRows;
	
	@FindBy(xpath="//*[@data-testid='ArrowDropDownIcon']")
	WebElement airDropDownField;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters MuiTablePagination-menuItem css-1orew1q']")
	List<WebElement> airDropDownElements;
	
	@FindBy(xpath="//*[@class='MuiTablePagination-displayedRows css-1chpzqh']")
	WebElement NumberOfRowsDispalyIntotalNumberOfRowsField;
	
	@FindBy(xpath="//*[@title='Go to previous page']")
	WebElement previousPageArrow;
	
	@FindBy(xpath="//*[@title='Go to next page']")
	WebElement nextPageArrow;
	
	@FindBy(xpath="//*[@class='MuiDataGrid-selectedRowCount css-eozsn7']")
	WebElement selectedRowCount;
	
	
	

}


