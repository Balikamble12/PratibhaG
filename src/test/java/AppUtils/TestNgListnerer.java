package AppUtils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date; // <-- Correct Date import
import java.time.Duration;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNgListnerer implements ITestListener {
	@Override
	public void onFinish(ITestContext result) {
		System.out.println("TestCases results are" + result.getName());
	}

	@Override
	public void onStart(ITestContext result) {

		System.out.println("TestCases starts results are" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) { // result means whatever test result will come store in particular
													// object arg0
		System.out.println("TestCases failed and test case results are== " + result.getName());
	}

	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases skipped and results are" + result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases on Test start results are" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases passed and results are" + result.getName());
	}

}
