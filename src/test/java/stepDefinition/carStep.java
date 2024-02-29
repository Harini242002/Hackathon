package stepDefinition;

import java.io.IOException;

import Factory.BaseClass;
import PageObject.carinsurance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class carStep {
	carinsurance c;
	@Given("user navigates to the main page")
	public void user_navigates_to_the_main_page() {
	    c=new carinsurance(BaseClass.getDriver());
	}
	@When("user selects the buying new car option")
	public void user_selects_the_buying_new_car_option() {
		c.carinsurances();
	}

	@When("user selects location")
	public void user_selects_location() {
	    c.carlocation();
	}

	@When("user selects carno")
	public void user_selects_carno() {
	   c.carno();
	}

	@When("User selects the carbrand")
	public void user_selects_the_carbrand() {
	    c.carbrand();
	}

	@When("user selects the carmodel")
	public void user_selects_the_carmodel() {
	   c.carmodel();
	}

	@When("user selects carfuel")
	public void user_selects_carfuel() {
	   c.carfuel();
	}

	@When("User selects the carvariant")
	public void user_selects_the_carvariant() {
	    c.carvariant();
	}

	@When("user fills the userdetails")
	public void user_fills_the_userdetails() {
	    try {
			c.userdetails();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("capture the Error message")
	public void capture_the_error_message() {
	    try {
			c.errormsg();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    c.navigate();
	}

}
