package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgotPasswordPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	HeaderSection header=new HeaderSection();
	LoginPage loginpage=new LoginPage();
	MyAccountPage accountpage=new MyAccountPage();
	ForgotPasswordPage passwordforgot=new ForgotPasswordPage();
	@Given("I navigate to Account login page")
	public void i_navigate_to_account_login_page() {
		Elements.click(HeaderSection.Myaccountlink);
		Elements.click(HeaderSection.LoginLink);
	    
	}

	@When("I login to the application using Username {string} and Password {string}")
	public void i_login_to_the_application_using_username_and_password(String email, String password) {
	    LoginPage.login(email, password);
	}

	@Then("I should see that user is able to login successfully")
	public void i_should_see_that_user_is_able_to_login_successfully() {
	    Assert.assertTrue(Elements.isDisplayed(MyAccountPage.account));
	}
	@Then("I should see an error message that the credentails are invalid")
	public void i_should_see_an_error_message_that_the_credentails_are_invalid() {
	    Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.warningMessage, "Warning: No match for E-Mail Address and/or Password."));
	}
	

	@When("I reset the forgotten password for email {string}")
	public void i_reset_the_forgotten_password_for_email(String email) {
		Elements.click(LoginPage.ForgotPassword);
		Elements.TypeText(ForgotPasswordPage.email, email);
		Elements.click(ForgotPasswordPage.continue_button);
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.warningMessage,"An email with a confirmation link has been sent your email address."));
	}



	@Then("I should see a message informing the User that confiramtion mail has been sent to the mail to reset the password")
	public void i_should_see_a_message_informing_the_user_that_confiramtion_mail_has_been_sent_to_the_mail_to_reset_the_password() {
	   
	}




}
