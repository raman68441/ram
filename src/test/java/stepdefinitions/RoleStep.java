package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.admin.RolePage;
import page.admin.TagsPage;

public class RoleStep {
	RolePage rolePage = new RolePage(BaseClass.getDriver());

	@When("User verify {string} in role page")
	@When("User verify {string} button in role page")
	@When("User verify {string} radio button in role page")
	public void userVerifyFieldName(String expectedText) {
		rolePage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in role page")
	public void userVerifyDepartmentTableHeaderColumns(String columnuName) {
		rolePage.verifyRoleTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in role list table of role page")
	@Then("User verify number of rows in select user table of role page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		rolePage.verifyNumberOfRowsInRoleTable();
	}
	
	@When("User clicks on {string} in role page")
	@Then("User clicks on {string} button in role page")
	@Then("User clicks on {string} radio button in role page")
	@Then("User clicks on {string} checkbox in role page")
	@Then("User clicks on {string} icon in role page")
	public void userClicksOnElement(String fieldName) {
		rolePage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of role page")
	public void userVerifyTagListTableeMentionedRowData(String data, int rowNumber) {
		rolePage.validateMentionedRowNumberDataForRoleListTable(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of role page")
	public void userEntersValue(String text, String fieldName) {
		rolePage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in role page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		rolePage.selectDropDownfromRolePage(data, fieldName);
	}
		
	@When("User verify only {string} role records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		rolePage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in role page")
	public void userVerifyTagTableCellData(String data, int rowNumber, int columnNumber) {
		rolePage.verifyMentionedCellDataInTable(data, rowNumber, columnNumber);
	}

	@Then("User verify {string} in {string} drop down in role page")
	public void userVerifyDropDownFields(String option, String fieldName) {
		rolePage.verifyDropDownOptions(option, fieldName);
	}
	
	@Then("User clicks on {string} and {string} check box in role page")
	public void userSelectMentionedCheckBoxesInPrivileges(String rowNumber, String columnNumber) {
		rolePage.clickOnMentionedCheckBoxes(rowNumber, columnNumber);
	}
	
	@Then("User verifies {string} in the role page")
	public void userVerifyPrivilegeTypesAndCategoriesAndHeaders(String fieldName) {
		rolePage.verifyPrivilegeTypesAndCategoriesAndHeaders(fieldName);
	}

}
