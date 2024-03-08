package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.admin.BusinessUnitPage;
import page.config.ActivitiesPage;

public class ActivitiesStep {
	
	ActivitiesPage activitiesPage = new ActivitiesPage(BaseClass.getDriver());

	@When("User verify {string} in activities page")
	@When("User verify {string} button in activities page")
	@When("User verify {string} radio button in activities page")
	public void userVerifyFieldName(String expectedText) {
		activitiesPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in activities page")
	public void userVerifyDepartmentTableHeaderColumns(String columnuName) {
		activitiesPage.verifyActivitesListTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in activites table activities page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		activitiesPage.verifyNumberOfRowsInActivitesTable();
	}
	
	@When("User clicks on {string} in activities page")
	@Then("User clicks on {string} button in activities page")
	@Then("User clicks on {string} radio button in activities page")
	@Then("User clicks on {string} checkbox in activities page")
	@Then("User clicks on {string} icon in activities page")
	public void userClicksOnElement(String fieldName) {
		activitiesPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of activities page")
	public void userVerifyBusinessUintTableeMentionedRowData(String data, int rowNumber) {
		activitiesPage.validateMentionedRowNumberDataFromTable(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of activities page")
	public void userEntersValue(String text, String fieldName) {
		activitiesPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in activities page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		activitiesPage.selectDropDownfromActivityPage(data, fieldName);
	}
	
	@When("User verify only {string} activities records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		activitiesPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in activities page")
	public void userVerifyBusinessUnitTableCellData(String data, int rowNumber, int columnNumber) {
		activitiesPage.verifyMentionedCellDataInTable(data, rowNumber, columnNumber);
	}

}
