package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.admin.BusinessUnitPage;

public class BusinessUnitStep {
	
BusinessUnitPage businessUnitPage = new BusinessUnitPage(BaseClass.getDriver());

	@When("User verify {string} in business unit page")
	@When("User verify {string} button in business unit page")
	@When("User verify {string} radio button in business unit page")
	public void userVerifyFieldName(String expectedText) {
		businessUnitPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in business unit page")
	public void userVerifyDepartmentTableHeaderColumns(String columnuName) {
		businessUnitPage.verifyBusinessUnitTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in business unit table business unit page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		businessUnitPage.verifyNumberOfRowsInBusinessUnitTable();
	}
	
	@When("User clicks on {string} in business unit page")
	@Then("User clicks on {string} button in business unit page")
	@Then("User clicks on {string} radio button in business unit page")
	@Then("User clicks on {string} checkbox in business unit page")
	@Then("User clicks on {string} icon in business unit page")
	public void userClicksOnElement(String fieldName) {
		businessUnitPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of business unit page")
	public void userVerifyBusinessUintTableeMentionedRowData(String data, int rowNumber) {
		businessUnitPage.validateMentionedRowNumberDataForBusinessUnit(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of business unit page")
	public void userEntersValue(String text, String fieldName) {
		businessUnitPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in business unit page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		businessUnitPage.selectDropDownfromBusinessUnitPage(data, fieldName);
	}
	
	@When("User verify only {string} business unit records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		businessUnitPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in business unit page")
	public void userVerifyBusinessUnitTableCellData(String data, int rowNumber, int columnNumber) {
		businessUnitPage.verifyMentionedCellDataInTable(data, rowNumber, columnNumber);
	}

}
