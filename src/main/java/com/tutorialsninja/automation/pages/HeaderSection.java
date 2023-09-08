package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeaderSection {
	public HeaderSection() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement Myaccountlink;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li[1]")
	public static WebElement RegistrationLink;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li[2]")
	public static WebElement LoginLink;
	@FindBy(name="search")
	public static WebElement SearchBoxField;
	@FindBy (css="button[class$='btn-lg']")
	public static WebElement Searchbutton;
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement ViewShoppingCartOption;
	
	public static void navigateToLoginPage() {
		Elements.click(HeaderSection.Myaccountlink);
		Elements.click(HeaderSection.LoginLink);
	}
	public static void searchProduct() {
		Elements.TypeText(HeaderSection.SearchBoxField, Base.reader.getProduct());
	    Elements.click(HeaderSection.Searchbutton);

	}
	public static void navigateToShoppingcartPage() {
		Elements.click(HeaderSection.ViewShoppingCartOption);
	}

}
