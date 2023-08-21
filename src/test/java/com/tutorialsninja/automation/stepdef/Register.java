package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import io.cucumber.core.api.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	   Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to Account Registration Page$")
	public void i_navigate_to_Account_Registration_Page()  {
	    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable datatable)  {
	    
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
	   
	}

	@And("^I click on continue button$")
	public void i_click_on_continue_button() {
	    
	}

	@Then("^I should see that user account is successfully created$")
	public void i_should_see_that_user_account_is_successfully_created() {
	    
	}



}
