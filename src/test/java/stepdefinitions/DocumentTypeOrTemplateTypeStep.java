package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.config.DocumentTypeOrTemplateTypePage;

public class DocumentTypeOrTemplateTypeStep {

	DocumentTypeOrTemplateTypePage documentTypeOrTemplateTypePage = new DocumentTypeOrTemplateTypePage(BaseClass.getDriver());

	@When("User verify {string} in document type template type page")
	@When("User verify {string} button in document type template type page")
	@When("User verify {string} check box in document type template type page")
	@When("User verify {string} radio button in document type template type page")
	public void userVerifyFieldName(String expectedText) {
		documentTypeOrTemplateTypePage.verifyFieldName(expectedText);
	}
	
	@Then("User verifies {string} in document type template type page")
	public void userVerifyDocuementTypeTemplateTypeTableHeaderColumns(String columnuName) {
		documentTypeOrTemplateTypePage.verifyDocumentTemplateTypeTableColumnHeaders(columnuName);
	}
	
	@Then("User verify number of rows in document type template type list table of document type template type page")
	public void userVerifyNumberOfRowsInDocuementTypeTemplateTypeTable() {
		documentTypeOrTemplateTypePage.verifyNumberOfRowsInDocumentTemplateTypeTable();
	}
	
	@When("User clicks on {string} in document type template type page")
	@Then("User clicks on {string} button in document type template type page")
	@Then("User clicks on {string} radio button in document type template type page")
	@Then("User clicks on {string} checkbox in document type template type page")
	@Then("User clicks on {string} icon in document type template type page")
	public void userClicksOnElement(String fieldName) {
		documentTypeOrTemplateTypePage.clickOnBtn(fieldName);
	}
	
	@Then("User verify {string} in row {int} of document type template type page")
	public void userVerifyDocuementTypeTemplateTypeMentionedRowData(String data, int rowNumber) {
		documentTypeOrTemplateTypePage.validateMentionedRowNumberDataFromTable(data, rowNumber);
	}
	@Then("User enters {string} in {string} field of document type template type page")
	public void userEntersValue(String text, String fieldName) {
		documentTypeOrTemplateTypePage.enterValue(text, fieldName);
	}
	
	@When("User selects {string} as {string} in document type template type page")
	public void userSelectsFromDropDown(String data, String fieldName) {
		documentTypeOrTemplateTypePage.selectDropDownfromDocumentTemplateTypePage(data, fieldName);
	}
	
	@When("User verify only {string} document type template type list records will display")
	public void userVerifyActiveInactiveRecords(String activeOrInactiveRecords) {
		documentTypeOrTemplateTypePage.verifyActiveInactiveState(activeOrInactiveRecords);
	}
	
	@When("User verify {string} in row {int} column {int} in document type template type page")
	public void userVerifyDocuementTypeTemplateTypeTableCellData(String data, int rowNumber, int columnNumber) {
		documentTypeOrTemplateTypePage.verifyMentionedRowCellDataInTable(data, rowNumber, columnNumber);
	}
	
	@When("User selects {int} index option in {string} in document type template type page")
	public void userSelectsIndexFromDropDown(int index, String fieldName) {
		documentTypeOrTemplateTypePage.selectDropDownfromDocuementTypePage(index, fieldName);
	}
	
	@When("User verify {string} displayed in document type template type page")
		public void userVerifyAllTabs(String expectedText) {
		documentTypeOrTemplateTypePage.verifyDocumentTemplateTypeTabs(expectedText);
	}
}
