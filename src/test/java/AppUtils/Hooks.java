
package AppUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModule.Login_page;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {

	
    public static WebDriver driver;
	Readconfig config = new Readconfig();
	Login_page lp;

	@Before
	public void Launchapp() {



     driver= new ChromeDriver();
     driver.manage().deleteAllCookies();
     driver.manage().window().maximize();
     driver.get(config.getUrl());


		lp = new Login_page(driver);

		lp.UserEnterUsernamehooks();
		lp.UserEnterpasswordhooks();
		lp.clickOnLogin();
	}


	
	@BeforeStep
	public void test_execution_started() {

		System.out.println("Before test step started");
	}

	@AfterStep
	public void teardown(Scenario scenario) {

		if (scenario.isFailed()) {

			String ScenarioName = scenario.getName();

			System.out.println(ScenarioName);

			String fileName = ScenarioName.replaceAll("[^a-zA-Z0-9]", "_");

			String uniqueString = new SimpleDateFormat("HH_mm_ss").format(new Date());

			try {

				TakesScreenshot ts = (TakesScreenshot) driver;

				File src = ts.getScreenshotAs(OutputType.FILE);

				File destfile = new File("D:\\Software\\jdk-20_windows-x64_bin\\eclipse-jee-2021-09-R-win32-x86_64\\eclipse\\sulabha\\Practice2\\test-output\\Screenshot\\"
								+ fileName + "_" + uniqueString + ".png");

				FileUtils.copyFile(src, destfile);

			} catch (Exception e) {

				e.printStackTrace();
			}
		
		}}

	@After
	public void Logout() {

		if (driver != null) {

			driver.quit();
		}
	}
}