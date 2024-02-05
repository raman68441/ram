package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AuditTrailPage;
import page.admin.OrganizationPage;

public class OrganizationStep {
	
	OrganizationPage organizationPage = new OrganizationPage(BaseClass.getDriver());

	@When("User verify {string} in organization page")
	@When("User verify {string} button in organization page")
	public void userVerifyFieldName(String expectedText) {
		organizationPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in organization page")
	public void userVerifyOrganizationTableHeaderColumns(String columnuName) {
		organizationPage.verifyOrganizationTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in organization table organization page")
	public void userVerifyNumberOfRowsInOrganizationTable() {
		organizationPage.verifyNumberOfRowsInOrganizationTable();
	}
	
	@When("User clicks on {string} in organization page")
	@Then("User clicks on {string} button in organization page")
	@Then("User clicks on {string} checkbox in organization page")
	@Then("User clicks on {string} icon in organization page")
	public void userClicksOnElement(String fieldName) {
		organizationPage.clickOnBtn(fieldName);
	}
	
	@Then("User enters {string} in {string} field of organization page")
	public void userEntersValue(String text, String fieldName) {
		organizationPage.enterValue(text, fieldName);
	}
	
	@Then("User verify {string} in organization table row {int}")
	public void userVerifyOrganizationTableMentionedRowData(String data, int rowNumber) {
		organizationPage.validateMentionedRowNumberDataForOrganization(data, rowNumber);
	}

}
