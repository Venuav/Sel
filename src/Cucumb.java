import io.cucumber.java.en.*;

public class Cucumb {
	
	@Given("User navigate to login page")
	public void user_navigate_to_login_page() {
	    System.out.println(">>User navigate to Login page");
	}

	@When("User enters the valid emailaddress {string}")
	public void user_enters_the_valid_emailaddress(String email) {
		System.out.println(">>User enters the valid email"+email  );
	}

	@When("User enters the valid password {string}")
	public void user_enters_the_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to access the application")
	public void user_should_be_able_to_access_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
