package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/test/resources/features"},
	glue = {"stepdefinitions", "hooks"},
	tags= "@Audit14",
	plugin={"pretty",
			"html:target/cucumber-html-report.html",
			"json:target/cucumber-reports/cucumber.json",
			"junit:target/cucumber-reports/cucumber.xml",
			"rerun:target/cucumber-reports/rerun.txt",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		/*
		 * "de.monochromatacucumber.report.PrettyReports:target/cucumber",
		 * "timeline:test-output-thread/"
		 */
			})
public class RunTest {

}
