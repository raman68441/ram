package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.admin.UserGroupPage;

public class UserGroupStep {

	UserGroupPage userGroupPage = new UserGroupPage(BaseClass.getDriver());

	@When("User verify {string} in user group page")
	@When("User verify {string} button in user group page")
	@When("User verify {string} radio button in user group page")
	public void userVerifyFieldName(String expectedText) {
		userGroupPage.verifyFieldName(expectedText);
	}

	@Then("User verifies {string} in user group page")
	public void userVerifyUserGroupTableHeaderColumns(String columnuName) {
		userGroupPage.verifyUserGroupTableColumnHeaders(columnuName);
	}

	@Then("User verify number of rows in user group table user group page")
	public void userVerifyNumberOfRowsInUserGroupTable() {
		userGroupPage.verifyNumberOfRowsInUserGroupTable();
	}

	@When("User clicks on {string} in user group page")
	@Then("User clicks on {string} button in user group page")
	@Then("User clicks on {string} radio button in user group page")
	@Then("User clicks on {string} checkbox in user group page")
	@Then("User clicks on {string} icon in user group page")
	public void userClicksOnElement(String fieldName) {
		userGroupPage.clickOnBtn(fieldName);
	}

	@Then("User verify {string} in row {int} of user group page")
	public void userVerifyUserGroupMentionedRowData(String data, int rowNumber) {
		userGroupPage.validateMentionedRowNumberDataFromTable(data, rowNumber);
	}

	@Then("User enters {string} in {string} field of user group page")
	public void userEntersValue(String text, String fieldName) {
		userGroupPage.enterValue(text, fieldName);
	}

	@When("User selects {string} as {string} in user group page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		userGroupPage.selectDropDownfromUserGroupPage(data, fieldName);
	}

	@When("User verify only {string} user group records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		userGroupPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}

	@When("User verify {string} in row {int} column {int} in user group page")
	public void userVerifyUserGroupTableCellData(String data, int rowNumber, int columnNumber) {
		userGroupPage.verifyMentionedRowCellDataInTable(data, rowNumber, columnNumber);
	}
	
	@Then("User clicks on {string} and {string} check box in user group page")
	public void userSelectMentionedCheckBoxesInPrivileges(String rowNumber, String columnNumber) {
		userGroupPage.clickOnMentionedCheckBoxes(rowNumber, columnNumber);
	}

}
