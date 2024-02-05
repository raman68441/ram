package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CommonPage;
import page.LoginPage;
import page.PaginationPage;

public class CommonStep {
		
	CommonPage commonPage = new CommonPage(BaseClass.getDriver());
	BaseClass baseClass = new BaseClass();
	PaginationPage paginationPage = new PaginationPage(BaseClass.getDriver());

	
	
	@When("User verifies {string} is displayed in {string} field")
	public void userVerifyFieldName(String text, String fieldName) {
		commonPage.verifyFieldText(text, fieldName);
	}
	@Then("User clicks on {string}")
	@Then("User navigate to {string}")
	@Then("User clicks on {string} sidebar menu")
	public void userClicksOnOPtion(String btn) {
		commonPage.clickOnBtn(btn);
	}
	
	@Then("User open new tab")
	public void openNewTab() {
		commonPage.openNewTab();
	}
	
	@And("User switch to window number {int}") 
		public void userSwitchWindow(int windowNumber) {
		commonPage.switchMentionedWindow(windowNumber);
		
	}
	
	@Then("User verify {string} displayed in pagination field")
	public void userVerifyRowsMentionedInPagination(String tabName) {
		paginationPage.verifyRowsPerPage(tabName);
	}
	
	@Then("User verify {string} arrow is {string} in pagination field")
	public void userVerifyPreviousAndNextPageArrowStatus(String fieldName, String status) {
		paginationPage.verifyPreviousAndNextArrowState(status, fieldName);
	}
	
	@Then("User selects {string} from pagination drop down")
	public void userSelectsDataFromPaginationList(String data) {
		paginationPage.selectPagesFromDropDown(data);
	}
	
	@Then("User clicks on {string} pagination arrow")
	public void userClicksOnPaginationPreviousOrNextArrow(String fieldName) {
		paginationPage.clickPrevOrNext(fieldName);
	}
	@Then("User clicks on next page arrow till last page")
	public void userClicksOnNextPageArrowTillLastPage() {
		paginationPage.clickOnNextPageTillLastData();
	}
	
	@Then("User verify total number of records displayed in pagination")
	public void userVerifyTotalNumberOfRecordsInPagination() {
		paginationPage.getTotalNumberRecords();
	}
	
	@Then("User upload file {string}")
	@Then("User upload image {string}")
	public void userUploadFile(String file) {
		commonPage.uploadFileFromFolder(file);
	}
}
	
