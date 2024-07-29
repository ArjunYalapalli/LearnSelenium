package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FT {
	@Given("User has opened the application URL")
	public void user_has_opened_the_application_url() {
		System.out.println("User has opened the application URL");
	}

	@Given("Navigated to Login Page")
	public void navigated_to_login_page() {

	}

	@When("Enters valid email address arjunyalapalli44@gmail.com")
	public void enters_valid_email_address_arjunyalapalli44_gmail_com() {

	}

	@When("User Enters valid password Arjun@{int}")
	public void user_enters_valid_password_arjun(Integer int1) {

	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {

	}

	@Then("User should be able to successfully login")
	public void user_should_be_able_to_successfully_login() {

	}

	@When("Enters valid email address arjunyalapalli33@gmail.com")
	public void enters_valid_email_address_arjunyalapalli33_gmail_com() {

	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String string) {

	}

	@When("Enters invalid password {string}")
	public void enters_invalid_password(String string) {

	}

	@Then("User should not be able to login")
	public void user_should_not_be_able_to_login() {

	}

	@Then("get proper warning message")
	public void get_proper_warning_message() {

	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String string) {

	}

}
