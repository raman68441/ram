package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.admin.DepartmentPage;
import page.admin.OrganizationPage;

public class DepartmentStep {

	DepartmentPage departmentPage = new DepartmentPage(BaseClass.getDriver());

	@When("User verify {string} in department page")
	@When("User verify {string} button in department page")
	public void userVerifyFieldName(String expectedText) {
		departmentPage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in department page")
	public void userVerifyDepartmentTableHeaderColumns(String columnuName) {
		departmentPage.verifydepartmentTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in department table department page")
	public void userVerifyNumberOfRowsInAuditTrailTable() {
		departmentPage.verifyNumberOfRowsIndepartmentTable();
	}
	
	@When("User clicks on {string} in department page")
	@Then("User clicks on {string} button in department page")
	@Then("User clicks on {string} checkbox in department page")
	@Then("User clicks on {string} icon in department page")
	public void userClicksOnElement(String fieldName) {
		departmentPage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in department row {int}")
	public void userVerifyDepartmentTableeMentionedRowData(String data, int rowNumber) {
		departmentPage.validateMentionedRowNumberDataFordepartment(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of department page")
	public void userEntersValue(String text, String fieldName) {
		departmentPage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in department page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		departmentPage.selectDropDownfromDepartmentPage(data, fieldName);
	}
	
}
