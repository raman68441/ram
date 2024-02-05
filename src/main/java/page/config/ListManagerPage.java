package page.config;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import page.ConfigurationPage;
import page.GlobalFunctions;

public class ListManagerPage extends GlobalFunctions {
	Logger log = LogManager.getLogger(ConfigurationPage.class);
	private WebDriver driver;
	
	public ListManagerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='MuiDataGrid-main css-opb0c2']")
	WebElement table;
	
	@FindBy(xpath="//*[@role='row' and @aria-rowindex='1']")
	WebElement headerRow;
	
	@FindBy(xpath="//*[@role='columnheader']")
	WebElement columnHeader;
	
	public String rowElements = "//*[@role='row' and @aria-rowindex='#']";
	
	@FindBy(xpath="//*[@class='MuiDataGrid-cellContent']")
	List<WebElement> tableCellData;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1wmzw0t']")
	WebElement PickList;
	
	@FindBy(xpath="//*[@class='MuiButtonBase-root MuiTab-root MuiTab-labelIcon MuiTab-textColorPrimary css-cueugn']")
	WebElement newNumberingSystem;
	
	@FindBy(xpath="//*[@data-field='pickListCategory']//*[@class='MuiDataGrid-cellContent']")
	List<WebElement> pickListCategoryData;
	
	@FindBy(xpath="//*[@data-field='pickListCategory']//*[@class='MuiDataGrid-menuIcon']")
	WebElement pickListCategoryMenuIcon;
	
	
	@FindBy(xpath="//*[@data-field='pickListName']//*[@class='MuiDataGrid-cellContent']")
	List<WebElement> pickListNameData;
	
	@FindBy(xpath="//*[@data-field='pickListName']//*[@class='MuiDataGrid-menuIcon']")
	WebElement pickListNameMenuIcon;
	
	
	@FindBy(xpath="//*[@data-field='valueShortForm']//*[@class='MuiDataGrid-cellContent']")
	List<WebElement> valueShortFormData;
	
	@FindBy(xpath="//*[@data-field='valueShortForm']//*[@class='MuiDataGrid-menuIcon']")
	WebElement valueShortFormMenuIcon;
	
	@FindBy(xpath="//*[@data-field='id']//*[@class='MuiDataGrid-cellContent']")
	List<WebElement> idData;
	
	@FindBy(xpath="//*[@data-field='id']//*[@class='MuiDataGrid-menuIcon']")
	WebElement idMenuIcon;
	
	
	@FindBy(xpath="//*[@data-field='dependedOn']//*[@class='MuiDataGrid-cellContent']")
	List<WebElement> dependedONData;
	
	@FindBy(xpath="//*[@data-field='dependedOn']//*[@class='MuiDataGrid-menuIcon']")
	WebElement dependedONMenuIcon;
	
	
	@FindBy(xpath="//*[@data-field='dependedItems']//*[@class='MuiDataGrid-cellContent']")
	List<WebElement> dependedItemsData;
	
	@FindBy(xpath="//*[@data-field='dependedItems']//*[@class='MuiDataGrid-menuIcon']")
	WebElement dependedItemsMenuIcon;
	
	@FindBy(id="picklist_business_unit")
	WebElement pickListBusinessUnitField;
	
	@FindBy(id="picklist_name")
	WebElement pickListNameField;
	
	@FindBy(id="picklist_value")
	WebElement pickListValueField;
	
	
	@FindBy(xpath="//*[text()='Apply']")
	WebElement applyBtn;
	
	@FindBy(xpath="//*[text()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//*[text()='Cancel']")
	WebElement cancelBtn;
	
	@FindBy(xpath="//*[@data-testid='DriveFileRenameOutlineOutlinedIcon']")
	List<WebElement> editIcon;
	
	@FindBy(xpath="//*[@data-testid='DeleteOutlineOutlinedIcon']")
	List<WebElement> deleteIcon;
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

}
