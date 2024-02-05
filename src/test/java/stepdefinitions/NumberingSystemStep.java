package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.config.NumberingSystemPage;

public class NumberingSystemStep {
	
	NumberingSystemPage numberingSystemPage = new NumberingSystemPage(BaseClass.getDriver());

	@When("User verify {string} in numbering system page")
	@When("User verify {string} button in numbering system page")
	@When("User verify {string} radio button in numbering system page")
	public void userVerifyFieldName(String expectedText) {
		numberingSystemPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in numbering system page")
	public void userVerifyDepartmentTableHeaderColumns(String columnuName) {
		numberingSystemPage.verifyNumberingSystemTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in numbering system table numbering system page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		numberingSystemPage.verifyNumberOfRowsInNumberingSystemTable();
	}
	
	@When("User clicks on {string} in numbering system page")
	@Then("User clicks on {string} button in numbering system page")
	@Then("User clicks on {string} radio button in numbering system page")
	@Then("User clicks on {string} checkbox in numbering system page")
	@Then("User clicks on {string} icon in numbering system page")
	public void userClicksOnElement(String fieldName) {
		numberingSystemPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of numbering system page")
	public void userVerifyDepartmentTableeMentionedRowData(String data, int rowNumber) {
		numberingSystemPage.validateMentionedRowNumberDataForNumberingSystem(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of numbering system page")
	public void userEntersValue(String text, String fieldName) {
		numberingSystemPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in numbering system page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		numberingSystemPage.selectDropDownfromNumberingSystemPage(data, fieldName);
	}
	
	@When("User verify only {string} numbering system records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		numberingSystemPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}

}
