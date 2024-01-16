package stepdefinitions;

import core.BaseClass;
import io.cucumber.java.en.When;
import page.CalenderPage;
import page.CommonPage;

public class CalenderStep {

	CalenderPage calenderPage = new CalenderPage(BaseClass.getDriver());
	BaseClass baseClass = new BaseClass();
	
	
	@When("User verify {string} arrow is {string} in calender")
	public void userVerifyPreviousNextMonthArrowStatus( String fieldName,String isEnabled) {
		calenderPage.verifyPreviousAndNextMonthArrowState(isEnabled, fieldName);
	}
	
	@When("User verify {string} in calender")
	public void userVerifyFieldName( String fieldName) {
		calenderPage.verifyFieldName(fieldName);
	}
	
	@When("User select {string} as {string} in calender")
	public void userSelectYearMonthDate( String value, String fieldName) {
		calenderPage.selectYearDateMonth(fieldName, value);
	}
	
	
	
}
