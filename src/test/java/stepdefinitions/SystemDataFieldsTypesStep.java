package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.config.SystemDataFieldsTypesPage;

public class SystemDataFieldsTypesStep {
	
	SystemDataFieldsTypesPage systemDataFieldsTypesPage = new SystemDataFieldsTypesPage(BaseClass.getDriver());

	@When("User verify {string} in system data fields types page")
	@When("User verify {string} button in system data fields types page")
	@When("User verify {string} radio button in system data fields types page")
	public void userVerifyFieldName(String expectedText) {
		systemDataFieldsTypesPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in system data fields types page")
	public void userVerifySystemDataFieldsTypesTableHeaderColumns(String columnuName) {
		systemDataFieldsTypesPage.verifySystemDataFieldsTypeListTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in system data fields types list table system data fields types page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		systemDataFieldsTypesPage.verifyNumberOfRowsInSystemDataFieldsTypesTable();
	}
	
	@When("User clicks on {string} in system data fields types page")
	@Then("User clicks on {string} button in system data fields types page")
	@Then("User clicks on {string} radio button in system data fields types page")
	@Then("User clicks on {string} checkbox in system data fields types page")
	@Then("User clicks on {string} icon in system data fields types page")
	public void userClicksOnElement(String fieldName) {
		systemDataFieldsTypesPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of system data fields types page")
	public void userVerifySystemDataFieldsTypesTableMentionedRowData(String data, int rowNumber) {
		systemDataFieldsTypesPage.validateMentionedRowNumberDataFromTable(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of system data fields types page")
	public void userEntersValue(String text, String fieldName) {
		systemDataFieldsTypesPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in system data fields types page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		systemDataFieldsTypesPage.selectDropDownfromSystemDataFieldsTypesPage(data, fieldName);
	}
	
	@When("User verify only {string} activities records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		systemDataFieldsTypesPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in system data fields types page")
	public void userVerifySystemDataFieldsTypesTableCellData(String data, int rowNumber, int columnNumber) {
		systemDataFieldsTypesPage.verifyMentionedRowCellDataInTable(data, rowNumber, columnNumber);
	}
	

}
