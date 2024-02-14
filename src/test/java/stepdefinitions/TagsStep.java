package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.admin.TagsPage;

public class TagsStep {
	
	TagsPage tagsPage = new TagsPage(BaseClass.getDriver());

	@When("User verify {string} in tag page")
	@When("User verify {string} button in tag page")
	@When("User verify {string} radio button in tag page")
	public void userVerifyFieldName(String expectedText) {
		tagsPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in tag page")
	public void userVerifyDepartmentTableHeaderColumns(String columnuName) {
		tagsPage.verifyTagTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in tag list table of tag page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		tagsPage.verifyNumberOfRowsInTagTable();
	}
	
	@When("User clicks on {string} in tag page")
	@Then("User clicks on {string} button in tag page")
	@Then("User clicks on {string} radio button in tag page")
	@Then("User clicks on {string} checkbox in tag page")
	@Then("User clicks on {string} icon in tag page")
	public void userClicksOnElement(String fieldName) {
		tagsPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of tag page")
	public void userVerifyTagListTableeMentionedRowData(String data, int rowNumber) {
		tagsPage.validateMentionedRowNumberDataForTagListTable(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of tag page")
	public void userEntersValue(String text, String fieldName) {
		tagsPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in tag page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		tagsPage.selectDropDownfromTagPage(data, fieldName);
	}
		
	@When("User verify only {string} tag records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		tagsPage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in tag page")
	public void userVerifyTagTableCellData(String data, int rowNumber, int columnNumber) {
		tagsPage.verifyMentionedCellDataInTable(data, rowNumber, columnNumber);
	}


}
