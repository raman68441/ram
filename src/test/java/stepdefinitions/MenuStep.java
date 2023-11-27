package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CommonPage;
import page.LoginPage;

public class MenuStep {
		
	CommonPage commonPage = new CommonPage(BaseClass.getDriver());
	BaseClass baseClass = new BaseClass();
	
	
	@When("User verifies {string} is displayed in {string} field")
	public void userVerifyFieldName(String text, String fieldName) {
		commonPage.verifyFieldText(text, fieldName);
	}
	@Then("User clicks on {string}")
	@Then("User navigate to {string}")
	public void userClicksOnOPtion(String btn) {
		commonPage.clickOnBtn(btn);
	}
}
	
