package PageObjectModule;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import AppUtils.Readconfig;

public class Login_page {
	WebDriver driver;
	Readconfig config = new Readconfig();

	@FindBy(id = "txtUsername")
	WebElement UserClickOnUsername;

	@FindBy(id = "txtPassword")
	WebElement ClickOnpassword;

	@FindBy(id = "btnLogin")
	WebElement LoginButton;

	@FindBy(linkText = "Admin")
	WebElement AdminModule;

	@FindBy(linkText = "Welcome Suresh")
	WebElement WelcomeButton;
	@FindBy(linkText = "Logout")
	WebElement LogoutButton;

	@FindBy(xpath = "//span[text()='Invalid credentials']")
	WebElement invalidloginerrormsg;

	public Login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void UserEnterUsername(String username) {
		UserClickOnUsername.sendKeys(username);
	}

	public void UserEnterUsernamehooks() {
		UserClickOnUsername.sendKeys(config.getusername());
	}

	public void UserEnterpasswordhooks() {
		ClickOnpassword.sendKeys(config.getpwd());
	}

	public void userEnterpassword(String password) {
		ClickOnpassword.sendKeys(password);
	}

	public void clickOnLogin() {
		LoginButton.click();
	}

	public void userseeAdminModule() throws InterruptedException {

		Assert.assertEquals("Admin", AdminModule.getText());
		Thread.sleep(1000);

		System.out.println("Admin Module displayed");
	}

	public void UserClickOnLogout() throws InterruptedException {
         Thread.sleep(2000);
		WelcomeButton.click();
		 Thread.sleep(2000);
		LogoutButton.click();
	}

	public void UservalidateInvalidLoginMsg() {
		Assert.assertEquals(invalidloginerrormsg.getText(), "Invalid credentials");
	}
}
