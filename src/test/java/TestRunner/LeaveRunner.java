package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "./Feature/Leave.feature" },

		glue = { "StepDefinition", "AppUtils" },

		dryRun = false,

		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		tags = "@leave")

public class LeaveRunner extends AbstractTestNGCucumberTests {

}