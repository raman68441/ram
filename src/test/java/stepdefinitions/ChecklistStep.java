package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.config.ChecklistPage;

public class ChecklistStep {
	
	ChecklistPage checklistPage = new ChecklistPage(BaseClass.getDriver());

	@When("User verify {string} in checklist page")
	@When("User verify {string} button in checklist page")
	@When("User verify {string} radio button in checklist page")
	public void userVerifyFieldName(String expectedText) {
		checklistPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in checklist page")
	public void userVerifyChecklistTableHeaderColumns(String columnuName) {
		checklistPage.verifyChecklistTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in checklist table checklist page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		checklistPage.verifyNumberOfRowsInChecklistTable();
	}
	
	@When("User clicks on {string} in checklist page")
	@Then("User clicks on {string} button in checklist page")
	@Then("User clicks on {string} radio button in checklist page")
	@Then("User clicks on {string} checkbox in checklist page")
	@Then("User clicks on {string} icon in checklist page")
	public void userClicksOnElement(String fieldName) {
		checklistPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of checklist page")
	public void userVerifyBusinessUintTableeMentionedRowData(String data, int rowNumber) {
		checklistPage.validateMentionedRowNumberDataForChecklist(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of checklist page")
	public void userEntersValue(String text, String fieldName) {
		checklistPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in checklist page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		checklistPage.selectDropDownfromChecklistPage(data, fieldName);
	}
	
	@When("User verify only {string} checklist records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		checklistPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in checklist page")
	public void userVerifyBusinessUnitTableCellData(String data, int rowNumber, int columnNumber) {
		checklistPage.verifyMentionedCellDataInTable(data, rowNumber, columnNumber);
	}

	@When("User save {string} row {int} data in checklist page")
	public void userSaveData(String data, int rowNumber) {
		checklistPage.saveMentionedRowDataInChecklistTable(data, rowNumber);
	}
}
