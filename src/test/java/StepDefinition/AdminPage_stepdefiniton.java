package StepDefinition;

import org.openqa.selenium.WebDriver;

import AppUtils.Hooks;
import PageObjectModule.Admin_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdminPage_stepdefiniton {
	WebDriver driver;

	Admin_page ad;
	

	@Given("user click on admin module")
	public void user_click_on_admin_module() {

		driver = Hooks.driver;
		ad = new Admin_page(driver);
		ad.userClickOnAdminButton();
	}

	@Given("user enters system user name as {string}")
	public void user_enters_system_user_name_as(String username) {
		ad.UserEnterAdminUserName(username);
	}

	@Given("user select userrole")
	public void user_select_userrole() {
		ad.userSelectUserRole();
	}

	@Given("user enter employee name {string}")
	public void user_enter_employee_name(String empname) {
		ad.userEnterEmpName(empname);
	}

	@Given("user select user status")
	public void user_select_user_status() throws InterruptedException {
		ad.UserSelectStatus();
	}

	@Then("user click on Search")
	public void user_click_on_search() throws Exception{
		ad.UserClickOnSearch();
	}

	@Then("user should see error message")
	public void user_should_see_error_message() {
		ad.userValidateRecordmsg();
	}
}
