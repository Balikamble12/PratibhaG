package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AppUtils.Baseclass;
import AppUtils.Readconfig;

public class AddUser {


	WebDriver driver;
	Baseclass base= new Baseclass();
	Readconfig config = new Readconfig();
	
	@FindBy(id = "btnAdd")
	WebElement AdminAddButton;
	
	@FindBy(id="systemUser_userType")
	WebElement AdminaddUserRole;

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement AdminaddEmpName;

	@FindBy(id = "systemUser_userName")
	WebElement AdminAddUserName;

	@FindBy(id = "systemUser_password")
	WebElement AdminAddpwd;
	@FindBy(id = "systemUser_confirmPassword")
	WebElement AdminAddconfirmpwd;

	@FindBy(id = "btnSave")
	WebElement AdminSaveButton;

	public AddUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void userclickAddButton() {
		AdminAddButton.click();

	}

	public void userSelectAdminUserRole() {
		
		AdminaddUserRole.click();
		base.DropdownText(AdminaddUserRole, "Admin");
	}

	public void UserEnterAddEmpName() {
		AdminaddEmpName.sendKeys("Suresh Babu");
	}

	public void UserEnterAdminUsername() {
		AdminAddUserName.sendKeys("abc");
	}

	public void userEnterAdminPwd() {
		AdminAddpwd.sendKeys(config.AddAdminpwd());
	}

	public void userEnterAdminconfirmPwd() {
		AdminAddconfirmpwd.sendKeys(config.AddAdminpwd());
	}

	public void userClickOnSaveButton() {
		AdminSaveButton.click();
	}
	
}
