package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.admin.UserCreationPage;

public class UserCreationStep {
	
	UserCreationPage userCreationPage = new UserCreationPage(BaseClass.getDriver());

	@When("User verify {string} in user creation page")
	@When("User verify {string} button in user creation page")
	@When("User verify {string} radio button in user creation page")
	public void userVerifyFieldName(String expectedText) {
		userCreationPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in user creation page")
	public void userVerifyUserListTableHeaderColumns(String columnuName) {
		userCreationPage.verifyUserListTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in user list table user creation page")
	public void userVerifyNumberOfRowsInUserListTable() {
		userCreationPage.verifyNumberOfRowsInUserListTable();
	}
	
	@When("User clicks on {string} in user creation page")
	@Then("User clicks on {string} button in user creation page")
	@Then("User clicks on {string} radio button in user creation page")
	@Then("User clicks on {string} checkbox in user creation page")
	@Then("User clicks on {string} icon in user creation page")
	public void userClicksOnElement(String fieldName) {
		userCreationPage.clickOnBtn(fieldName);
	}
	
	@Then("User enters {string} in {string} field of user creation page")
	public void userEntersValue(String text, String fieldName) {
		userCreationPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in user creation page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		userCreationPage.selectDropDownfromUserCreationPage(data, fieldName);
	}
	
	@When("User verify only {string} user creation records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		userCreationPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in user creation page")
	public void userVerifyUserListTableCellData(String data, int rowNumber, int columnNumber) {
		userCreationPage.verifyMentionedRowCellDataInTable(data, rowNumber, columnNumber);
	}

}
