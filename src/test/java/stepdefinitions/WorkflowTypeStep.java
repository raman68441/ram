package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.config.SystemDataFieldsTypesPage;
import page.config.WorkflowTypePage;

public class WorkflowTypeStep {

	WorkflowTypePage workflowTypePage = new WorkflowTypePage(BaseClass.getDriver());

	@When("User verify {string} in workflow type page")
	@When("User verify {string} button in workflow type page")
	@When("User verify {string} radio button in workflow type page")
	public void userVerifyFieldName(String expectedText) {
		workflowTypePage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in workflow type page")
	public void userVerifyWorkflowTypeTableHeaderColumns(String columnuName) {
		workflowTypePage.verifyWorkflowTypeTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in workflow type table workflow type page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		workflowTypePage.verifyNumberOfRowsInWorkflowTypeTable();
	}
	
	@When("User clicks on {string} in workflow type page")
	@Then("User clicks on {string} button in workflow type page")
	@Then("User clicks on {string} radio button in workflow type page")
	@Then("User clicks on {string} checkbox in workflow type page")
	@Then("User clicks on {string} icon in workflow type page")
	public void userClicksOnElement(String fieldName) {
		workflowTypePage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of workflow type page")
	public void userVerifyWorkflowTypeMentionedRowData(String data, int rowNumber) {
		workflowTypePage.validateMentionedRowNumberDataFromTable(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of workflow type page")
	public void userEntersValue(String text, String fieldName) {
		workflowTypePage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in workflow type page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		workflowTypePage.selectDropDownfromWorkflowTypePage(data, fieldName);
	}
	
	@When("User verify only {string} workflow type records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		workflowTypePage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in workflow type page")
	public void userVerifyWorkflowTypeTableCellData(String data, int rowNumber, int columnNumber) {
		workflowTypePage.verifyMentionedRowCellDataInTable(data, rowNumber, columnNumber);
	}
	
	@When("User selects {int} index option in {string} in workflow type page")
	public void userSelectsIndexFromDropDown(int index, String fieldName) {
		workflowTypePage.selectDropDownfromWorkflowTypePage(index, fieldName);
	}

}
