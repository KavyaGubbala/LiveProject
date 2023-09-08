package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckOutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orders {
	HeaderSection headersection=new HeaderSection();
	LoginPage loginpage=new LoginPage();
	SearchResultsPage searchresults=new SearchResultsPage();
	ShoppingCartPage shoppingcart=new ShoppingCartPage();
	CheckOutPage checkoutpage=new CheckOutPage();

	
	@Given("I login to the application")
	public void i_login_to_the_application() {
		Browser.OpenApplicationURL();
		HeaderSection.navigateToLoginPage();
		LoginPage.login();
	    
	}
	@When("I add product to the bag and checkout")
	public void i_add_product_to_the_bag_and_checkout() {
		HeaderSection.searchProduct();
		SearchResultsPage.addFirstProductintheSearchresulttoCart();
		HeaderSection.navigateToShoppingcartPage();
		ShoppingCartPage.navigatetoCheckOutPage();
	}
	@And("I place an order")
	public void i_place_an_order() {
		Elements.click(CheckOutPage.ContinuebuttoninBillingDetails);
	    
	}
	@Then("I should see that the warning message {string}")
	public void i_should_see_that_the_warning_message(String warning) {
		Waits.waitUntilElementLocated(10, CheckOutPage.PaymentOptionsWarningMessage);
	    Assert.assertTrue(Elements.VerifyTextEquals(CheckOutPage.PaymentOptionsWarningMessage, warning));
	}



}
