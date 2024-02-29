package stepDefinition;

import java.io.IOException;

import Factory.BaseClass;
import PageObject.travel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class travelStep {
	travel t;
	@Given("user navigates to the home page")
	public void user_navigates_to_the_home_page() {
	    t=new travel(BaseClass.getDriver());
	}

	@When("user selects the location and date")
	public void user_selects_the_location_and_date() {
	    t.travellocation();
	    t.DateClicking();
	}

	@When("user selects number of travellers")
	public void user_selects_number_of_travellers() {
	    t.nooftravellers();
	    try {
			t.travellerdetails();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@When("user selects no for medical")
	public void user_selects_no_for_medical() {
	   t.travellersmedicalcondition();
	}

	@When("User enters the mobile number")
	public void user_enters_the_mobile_number() {
	    try {
			t.mobilenumber();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@When("user selects the student plan and select the travellers")
	public void user_selects_the_student_plan_and_select_the_travellers() {
	    try {
			t.studentplan();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user selects the sorting and displays the insurance plans")
	public void user_selects_the_sorting_and_displays_the_insurance_plans() {
	   try {
		t.sortBy();
	} catch (Exception e) {
		e.printStackTrace();
	} 
	   t.navigate();
	}

}
