package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class CheckOutPage {
	public CheckOutPage() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="input-payment-firstname")
	public static WebElement FirstNameinBillingDetails;
	@FindBy(id="input-payment-lastname")
	public static WebElement LastNameinBillingDetails;
	@FindBy(id="input-payment-address-1")
	public static WebElement AddressinBillingDetails;
	@FindBy(id="input-payment-city")
	public static WebElement CityinBillingDetails;
	@FindBy(id="input-payment-postcode")
	public static WebElement postalcodeinBillingDetails;
	@FindBy(id="input-payment-country")
	public static WebElement CountryinBillingDetails;
	@FindBy(id="input-payment-zone")
	public static WebElement StateinBillingDetails;
	@FindBy(id="button-payment-address")
	public static WebElement ContinuebuttoninBillingDetails;
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement PaymentOptionsWarningMessage;
	

}
