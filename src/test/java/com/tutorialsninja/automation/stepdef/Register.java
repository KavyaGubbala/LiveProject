package com.tutorialsninja.automation.stepdef;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import io.cucumber.core.api.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	HeaderSection headerSection=new HeaderSection();
	RegisterPage registerpage=new RegisterPage();
	AccountSuccessPage success=new AccountSuccessPage();
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	   Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to Account Registration Page$")
	public void i_navigate_to_Account_Registration_Page()  {
	    Elements.click(HeaderSection.Myaccountlink);
	    Base.driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	    Elements.click(HeaderSection.RegistrationLink);
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable datatable)  {
		//Base.driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	    RegisterPage.Details_To_enter(datatable,"unique");
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
		Elements.click(RegisterPage.privacyPolicy);
	   
	}

	@And("^I click on continue button$")
	public void i_click_on_continue_button() {
		Elements.click(RegisterPage.Continue);
	    
	}

	@Then("^I should see that user account is successfully created$")
	public void i_should_see_that_user_account_is_successfully_created() {
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.Success));   
	}
	@Then("I should see that the user Account is not created")
	public void i_should_see_that_the_user_account_is_not_created() {
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.Register));
	}

	@Then("I should see the error messages informing the user to fill manadatory fields")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_manadatory_fields() {
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.FirstnameWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.LastnameWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.EmailWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.PhoneWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.PasswordWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.MainWarning));
	}
	

	@And("I subscribe the Newsletter")
	public void i_subscribe_the_newsletter() {
	    Elements.click(RegisterPage.YesToNewsLetter);
	}
	
	

	@When("I provide all the below duplicate details into the fields")
	public void i_provide_all_the_below_duplicate_details_into_the_fields(DataTable dataTable) {
	    RegisterPage.Details_To_enter(dataTable,"duplicate");
	}
	@Then("I should see that user is restricted from creating duplicate account")
	public void i_should_see_that_user_is_restricted_from_creating_duplicate_account() {
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.MainWarning, "Warning: E-Mail Address is already registered!"));
	  
	}












}
