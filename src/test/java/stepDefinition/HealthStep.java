package stepDefinition;

import java.io.IOException;

import Factory.BaseClass;
import PageObject.HealthInsurance;
import PageObject.travel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthStep {
	HealthInsurance h;
	@Given("user navigates to the Menu page")
	public void user_navigates_to_the_Menu_page() {
	    h=new HealthInsurance(BaseClass.getDriver());
	  
	}

	@When("user selects the Health Insurance Menu")
	public void user_selects_the_health_insurance_menu() {
	    h.healthinsurance();
	}

	@Then("Display Health Insurance Menu")
	public void display_health_insurance_menu() throws IOException {
	   h.printmenu();
	}

}
