package StepDefinition;

import org.openqa.selenium.WebDriver;

import AppUtils.Hooks;
import PageObjectModule.AddUser;
import PageObjectModule.Admin_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddUserStepDefination {
	WebDriver driver;

	AddUser ad;

	@Given("user click on Add")
	public void user_click_on_add() {
		driver = Hooks.driver;
		ad = new AddUser(driver);
		ad.userclickAddButton();

	}

	@Given("user add user role")
	public void user_add_user_role() {

		ad.userSelectAdminUserRole();
	}

	@Given("user add emp name")
	public void user_add_emp_name() {
		ad.UserEnterAddEmpName();
	}

	@Given("user add username")
	public void user_add_username() {
		ad.UserEnterAdminUsername();
	}

	@Given("user add password")
	public void user_add_password() {
		ad.userEnterAdminPwd();
	}

	@Then("user confirm password")
	public void user_confirm_password() {
		ad.userEnterAdminPwd();
	}

	@Then("user click on Save Button")
	public void user_click_on_save_button() {
		ad.userEnterAdminconfirmPwd();
	}
}
