package AppUtils;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestNGParameter {

	public static String browser;

	@BeforeSuite
	@Parameters("browser")
	public void getBrowser(@Optional("chrome") String browserName) {

		browser = browserName;

		System.out.println("Browser from testng.xml: " + browser);
	}

}
