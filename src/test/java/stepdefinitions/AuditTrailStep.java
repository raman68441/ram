package stepdefinitions;

import core.BaseClass;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AuditTrailPage;
import page.CommonPage;
import page.ForgotPasswordPage;
import page.LoginPage;
import page.PaginationPage;

public class AuditTrailStep {

	AuditTrailPage auditTrailPage = new AuditTrailPage(BaseClass.getDriver());

	CommonPage commonPage = new CommonPage(BaseClass.getDriver());
	BaseClass baseClass = new BaseClass();
	Hooks hooks = new Hooks();

	@When("User verify {string} in audit trail page")
	@When("User verify {string} button in audit trail page")
	public void userVerifyFieldName(String expectedText) {
		auditTrailPage.verifyFieldName(expectedText);
	}

	@When("User verify {string} button is {string} in audit trail page")
	public void userVerifyElementDisabledOrEnabled(String fieldName, String isEnabled) {
		auditTrailPage.verifyMentionedElementDisableOrEnabled(fieldName, isEnabled);
	}

	@When("User clicks on {string} in audit trail page")
	@Then("User clicks on {string} button in audit trail page")
	@Then("User clicks on {string} checkbox in audit trail page")
	@Then("User clicks on {string} icon in audit trail page")
	public void userClicksOnElement(String fieldName) {
		auditTrailPage.clickOnBtn(fieldName);
	}

	@When("User selects {string} as {string} in audit trail page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		auditTrailPage.selectDropDownfromAuditTrailPage(data, fieldName);
	}

	@Then("User verify {string} in {string} drop down in audit trail page")
	public void userVerifyDropDownFields(String option, String fieldName) {
		auditTrailPage.verifyDropDownOptions(option, fieldName);
	}

	@Then("User verify {string} in {string} field of audit trail page")
	public void userDateFields(String dateValue, String fieldName) {
		auditTrailPage.verifyDate(dateValue, fieldName);
	}	

	@Then("User verifies {string} in audit trail page")
	public void userVerifyAuditTrailTableHeaderColumns(String columnuName) {
		auditTrailPage.verifyAuditTrailTableColumnHeaders(columnuName);
	}

	@Then("User verify login tab {string} in audit trail row {int}")
	public void userVerifyAuditTrailTableMentionedRowData(String data, int rowNumber) {
		auditTrailPage.validateMentionedRowNumberDataForLoginAuditTrail(data, rowNumber);
	}

	@Then("User verify {string} in {string} field in audit trail page")
	public void userVerifyAuditTrailTableMentionedRowData(String data, String fieldName) {
		auditTrailPage.verifyFieldText(data, fieldName);
	}

	@Then("User verify {string} not displayed in audit trail page")
	public void userVerifyCategoryTabIsDisplaoyed(String fieldName) {
		auditTrailPage.verifyElementNotPresent(fieldName);
	}

	@Then("User verify number of rows in table is {int} in audit trail page")
	public void userVerifyNumberOfRowsInAuditTrailTable(int totalRows) {
		auditTrailPage.verifyNumberOfRowsInAuditTrailTable(totalRows);
	}

	@Then("User verify life cycle states audit tail table data {string} for {string} event in row {int}")
	public void userVerifyAuditTrailTableMentionedRowDataForLifeCycleStates(String data, String eventName, int rowNumber) {
		auditTrailPage.validateMentionedRowNumberDataForLifeCycleStatesAuditTrail(data, eventName, rowNumber);
	}
	
	@Then("User verify numbering system audit tail table data {string} for {string} event in row {int}")
	public void userVerifyAuditTrailTableMentionedRowDataForNumberingSystem(String data, String eventName, int rowNumber) {
		auditTrailPage.validateMentionedRowNumberDataForNumberingSystemAuditTrail(data, eventName, rowNumber);
	}
	
	@Then("User verify tag audit tail table data {string} for {string} event in row {int}")
	public void userVerifyAuditTrailTableMentionedRowDataForTag(String data, String eventName, int rowNumber) {
		auditTrailPage.validateMentionedRowNumberDataForTagAuditTrail(data, eventName, rowNumber);
	}
	
}
