package TestRunner;

import org.testng.annotations.Listeners;

import AppUtils.TestNgListnerer;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "./Feature/Login.feature" }, 
		glue = { "StepDefinition", "AppUtils" }, dryRun = false, plugin = {
				"pretty",

				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		tags = "@smoke or @sanity"

)
@Listeners(TestNgListnerer.class)

public class LoginRunner extends AbstractTestNGCucumberTests {
  
	
	
	
	
	
	
	
}
