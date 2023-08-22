package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeaderSection {
	public HeaderSection() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement Myaccountlink;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li[1]")
	public static WebElement RegistrationLink;

}
