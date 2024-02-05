package stepdefinitions;

import core.BaseClass;
import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AuditTrailPage;
import page.CommonPage;
import page.config.LifeCycleStatesPage;

public class LifeCycleStatesStep {
	
	LifeCycleStatesPage lifeCycleStatesPage = new LifeCycleStatesPage(BaseClass.getDriver());

	@When("User verify {string} in life cycle states page")
	@When("User verify {string} button in life cycle states page")
	@When("User verify {string} radio button in life cycle states page")
	public void userVerifyFieldName(String expectedText) {
		lifeCycleStatesPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in life cycle states page")
	public void userVerifyDepartmentTableHeaderColumns(String columnuName) {
		lifeCycleStatesPage.verifyLifeCycleStatesTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in life cycle states table life cycle states page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		lifeCycleStatesPage.verifyNumberOfRowsInLifeCycleStatesTable();
	}
	
	@When("User clicks on {string} in life cycle states page")
	@Then("User clicks on {string} button in life cycle states page")
	@Then("User clicks on {string} radio button in life cycle states page")
	@Then("User clicks on {string} checkbox in life cycle states page")
	@Then("User clicks on {string} icon in life cycle states page")
	public void userClicksOnElement(String fieldName) {
		lifeCycleStatesPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of life cycle states page")
	public void userVerifyDepartmentTableeMentionedRowData(String data, int rowNumber) {
		lifeCycleStatesPage.validateMentionedRowNumberDataForLifeCycleStates(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of life cycle states page")
	public void userEntersValue(String text, String fieldName) {
		lifeCycleStatesPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in life cycle states page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		lifeCycleStatesPage.selectDropDownfromLifeCycleStatesPage(data, fieldName);
	}
	
	@When("User verify only {string} life cycle states records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		lifeCycleStatesPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	
}
