package StepDefinition;

import org.openqa.selenium.WebDriver;

import AppUtils.Hooks;
import PageObjectModule.Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Stepdefinition {
	WebDriver driver;
	 Login_page lp;
	 
	@Given("user enters username as {string}")
	public void user_enters_username(String username) throws InterruptedException {
		  driver= Hooks.driver;
			 lp= new Login_page(driver);
			 Thread.sleep(1000);
			 lp.UserClickOnLogout();
			  Thread.sleep(4000);
	  lp.UserEnterUsername(username);
	}
	
	    
	@Given("user enters password {string}")
	public void user_enters_password(String password) {
		lp.userEnterpassword(password);
	}
	    
	@Then("user click on login")
	public void user_click_on_login() {
		lp.clickOnLogin();
	    	}
	@Then("user see admin module")
	public void user_see_admin_module() throws InterruptedException {
		lp.userseeAdminModule();
		}
		
		@Then("user should see invalid credential error message")
		public void user_should_see_invalid_credential_error_message() {
		 lp.UservalidateInvalidLoginMsg();  
		}
	    
	
}
