package stepdefinitions;


import java.util.List;
import java.util.Map;

import core.BaseClass;
import hooks.Hooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CommonPage;
import page.LoginPage;
import page.ForgotPasswordPage;

public class LoginStep {

	LoginPage loginPage = new LoginPage(BaseClass.getDriver());	
	CommonPage commonPage = new CommonPage(BaseClass.getDriver());
	BaseClass baseClass = new BaseClass();
	Hooks hooks = new Hooks();
	
	ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(BaseClass.getDriver());	
	
	@Given("User launched the application")
	public void userLoggedin() {
		commonPage.launchApplication();
	}
	
	@When("User verify {string} field name in login page")
	@When("User verify {string} in login page")
	public void userVerifyFieldName(String expectedText) {
		loginPage.verifyFieldName(expectedText);
	}

	@Then("User enters {string} in {string} field of login page")
	public void userEntersValue(String text, String fieldName) {
		loginPage.enterValue(text, fieldName);
	}
	@Then("User clicks on {string} in login page")
	@Then("User clicks on {string} button in login page")
	public void userClickOnBtn(String button) {
		loginPage.clickOnBtn(button);
	}
	@And("User verifies password protection status is {string}")
	public void userVerifyPasswordProtectionStatus(String status) {
		loginPage.verifyPasswordVisibilityIcon(status);
	}
	
	@Then("User enters invalid and click on login button in login page")
	public void userEntersInvalidPasswordAndClickOnLogin(DataTable testData) {
		List<String> details = testData.asList(String.class);
		for(int i = 0; i<details.size(); i++) {
			loginPage.enterValue(details.get(i), "password");
			loginPage.clickOnBtn("login");
		}
	}
	
	@When("User verify {string} field in forgot password page")
	@When("User verify {string} in forgot password page")
	public void userVerifyFieldNameInForgotPage(String fieldName) {
		forgotPasswordPage.verifyFieldText(fieldName);
	}
	
	@Then("User clicks on {string} in forgot password page")
	@And("User clicks on {string} button in forgot password page")
	public void userClickOnBtnInForgotPasswordPage(String button) {
		forgotPasswordPage.clickOnBtn(button);
	}

	@Then("User enters {string} in {string} field of forgotten password page")
	public void userEntersValueInForgotPassword(String text, String fieldName) {
		forgotPasswordPage.enterValue(text, fieldName);
	}

	@Then("User relaunch the application")
	public void userRelaunchApplication() {
		hooks.getProperty();
		hooks.launchBrowser();
		commonPage.launchApplication();
	}
}
