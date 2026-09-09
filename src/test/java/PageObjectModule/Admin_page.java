package PageObjectModule;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import AppUtils.Baseclass;
import AppUtils.Readconfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Admin_page {

	WebDriver driver;
	Baseclass base = new Baseclass();
	Readconfig config = new Readconfig();

	@FindBy(linkText = "Admin")
	WebElement AdminButton;
	
	@FindBy(id = "searchSystemUser_userName")
	WebElement AdminUserName;

	@FindBy(id = "searchSystemUser_userType")
	WebElement Adminuserrole;

	@FindBy(id = "searchSystemUser_employeeName_empName")
	WebElement AdminempName;

	@FindBy(id = "searchSystemUser_status")
	WebElement AdminUserstatus;

	@FindBy(id = "searchBtn")
	WebElement AdminSearhButton;

	@FindBy(id = "resultTable")
	WebElement table;
	@FindBy(xpath = "(//option[@value=1])[2]")
	WebElement selectEnable;

	@FindBy(xpath = "//table[id='resultTable']//tr")
	List<WebElement> tableRows;

	@FindBy(xpath = "//table[id='resultable']//tr[1]//td")
	List<WebElement> tablecolmns;

	@FindBy(xpath = "//td[contains(text(),'No Records Found')]")
	WebElement HandleNotFoundRecord;



	public Admin_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void userClickOnAdminButton() {
		AdminButton.click();
	}

	public void UserEnterAdminUserName(String username) {
		AdminUserName.sendKeys(username);
	}

	public void userSelectUserRole() {
	
		base.DropdownText(Adminuserrole,"Admin");

	}

	public void userEnterEmpName(String empname) {
		AdminempName.sendKeys(empname);

	}

	public void UserSelectStatus() throws InterruptedException {
		Thread.sleep(1000);
		base.Dropdownvalue("Enabled", AdminUserstatus);

	}

	public void UserClickOnSearch() throws InterruptedException {
		AdminSearhButton.click();
		Thread.sleep(1000);
	}

	public void userValidateRecordmsg() {

		String text = HandleNotFoundRecord.getText();

		System.out.println("Print errror msg!!!!    ==" + text);
		Assert.assertEquals(text, "No Records Found");

	}

}
