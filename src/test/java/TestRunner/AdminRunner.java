package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			
			features= {"./Feature/Admin.feature"},
			glue= {"StepDefinition","AppUtils"},
			dryRun= false,
			plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			tags= "@Admin or @Add"
			
			)
	public class AdminRunner extends AbstractTestNGCucumberTests {

	
}
