package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.TaskPage;
import page.config.ActivitiesPage;

public class TaskStep {
	
	TaskPage taskPage = new TaskPage(BaseClass.getDriver());

	@When("User verify {string} in task page")
	@When("User verify {string} button in task page")
	@When("User verify {string} radio button in task page")
	public void userVerifyFieldName(String expectedText) {
		taskPage.verifyFieldName(expectedText);
	}

	@Then("User verifies {string} in task page")
	public void userVerifyDepartmentTableHeaderColumns(String columnuName) {
		taskPage.verifyActivitesListTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in task table task page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		taskPage.verifyNumberOfRowsInActivitesTable();
	}
	
	@When("User clicks on {string} in task page")
	@Then("User clicks on {string} button in task page")
	@Then("User clicks on {string} radio button in task page")
	@Then("User clicks on {string} checkbox in task page")
	@Then("User clicks on {string} icon in task page")
	public void userClicksOnElement(String fieldName) {
		taskPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of task page")
	public void userVerifyBusinessUintTableeMentionedRowData(String data, int rowNumber) {
		taskPage.validateMentionedRowNumberDataFromTable(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of task page")
	public void userEntersValue(String text, String fieldName) {
		taskPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in task page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		taskPage.selectDropDownfromTaskPage(data, fieldName);
	}
	
	@When("User verify only {string} task records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		taskPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in task page")
	public void userVerifyBusinessUnitTableCellData(String data, int rowNumber, int columnNumber) {
		taskPage.verifyMentionedCellDataInTable(data, rowNumber, columnNumber);
	}
	
//	@Then("User verify {string} in {string} drop down in task page")
//	public void userVerifyDropDownFields(String option, String fieldName) {
//		taskPage.verifyDropDownOptions(option, fieldName);
//	}


}
