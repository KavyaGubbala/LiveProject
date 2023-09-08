package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	HeaderSection headersection=new HeaderSection();
	SearchResultsPage searchResults=new SearchResultsPage();

	@When("I search for a product {string}")
	public void i_search_for_a_product(String string) {
	   Elements.TypeText(HeaderSection.SearchBoxField, string);
	   Elements.click(HeaderSection.Searchbutton);
	}
	@Then("I should see the products in the search results")
	public void i_should_see_the_products_in_the_search_results() {
	    Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.SamsungSyncMasterSearchResult));
	}
	

	@Then("I should see the page displaying the message {string}")
	public void i_should_see_the_page_displaying_the_message(String message) {
	   Assert.assertTrue(Elements.VerifyTextEquals(SearchResultsPage.noResultsPage, message));
	}







}
