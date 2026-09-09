package StepDefinition;

import org.openqa.selenium.WebDriver;

import AppUtils.Hooks;
import PageObjectModule.Leave_Module;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Leave_stepdefinition {
	WebDriver driver;
	Leave_Module lm;
	
	@Given("user click on Leave")
	public void user_click_on_leave() {
	   driver= Hooks.driver;
	   lm= new Leave_Module(driver);
	   lm.UserClickOnLeave();
	}
	


@Given("user select starting leave date")
public void user_select_starting_leave_date() throws InterruptedException {
    lm.userSelectStartLeaveDate();
}
@Given("user select ending leave date")
  public void user_select_ending_leave_date() throws InterruptedException {
    lm.userSelectEndLeaveDate();
    }

@Then("user unchecked pending approval status")
public void user_unchecked_pending_approval_status() throws InterruptedException {
	lm.ValidateOfPendingApprovalcheckbox();
}
@Then("user selects Rejected status")
public void user_selects_rejected_status() throws InterruptedException {
    lm.clickOnRejectedStatus();
}
   
@Then("user entered Leave emp Name as {string}")
public void user_entered_leave_emp_name_as(String string) {
    lm.UserSelectLeaveEmpName(string);
}
@Then("user click on include past employees")
public void user_click_on_include_past_employees() {
  lm.ClickOnPastEmployees();
}
	
}
