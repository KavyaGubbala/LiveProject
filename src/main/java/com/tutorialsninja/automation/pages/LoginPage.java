package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="input-email")
	public static WebElement EmailField;
	@FindBy(id="input-password")
	public static WebElement PasswordField;
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement loginbutton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement warningMessage;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement ForgotPassword;
	
	public static void login(String email,String password)
	{
		Elements.TypeText(LoginPage.EmailField, email);
	    Elements.TypeText(LoginPage.PasswordField, password);
	    Elements.click(LoginPage.loginbutton);
	}

}
