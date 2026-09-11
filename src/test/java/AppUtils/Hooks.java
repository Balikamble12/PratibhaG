
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

	private static ThreadLocal<WebDriver> threaddriver= new ThreadLocal<>();

	Readconfig config = new Readconfig();
	Login_page lp;

	WebDriver webdriver;
	
	@Before
	public void Launchapp() {

  webdriver= new ChromeDriver();
 threaddriver.set(webdriver);
;
     threaddriver.get().manage().deleteAllCookies();
     threaddriver.get().manage().window().maximize();
     threaddriver.get().get(config.getUrl());


		lp = new Login_page(threaddriver.get());

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

				TakesScreenshot ts = (TakesScreenshot) threaddriver.get();

				File src = ts.getScreenshotAs(OutputType.FILE);

				File destfile = new File("D:\\Software\\jdk-20_windows-x64_bin\\eclipse-jee-2021-09-R-win32-x86_64\\eclipse\\sulabha\\Practice2\\test-output\\Screenshot\\"
								+ fileName + "_" + uniqueString + ".png");

				FileUtils.copyFile(src, destfile);
System.out.println("");
			} catch (Exception e) {

				e.printStackTrace();
			}
		
		}}

	@After
	public void Logout() {

		if (threaddriver.get() != null) {

			threaddriver.get().quit();
			threaddriver.remove();
		}
	}
}