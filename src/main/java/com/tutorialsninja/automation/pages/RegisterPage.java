package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import io.cucumber.datatable.DataTable;

public class RegisterPage {
	
	public RegisterPage() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="input-firstname")
	public static WebElement FirstName;
	@FindBy(id="input-lastname")
	public static WebElement LastName;
	@FindBy(id="input-email")
	public static WebElement Email;
	@FindBy(id="input-telephone")
	public static WebElement Phone;
	@FindBy(id="input-password")
	public static WebElement Password;
	@FindBy(id="input-confirm")
	public static WebElement ConfirmPassword;
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	@FindBy(xpath="//input[@value='Continue']")
	public static WebElement Continue;
	@FindBy(linkText="Register")
	public static WebElement Register;
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement FirstnameWarning;
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement LastnameWarning;
	@FindBy(css="input[id='input-email']+div")
	public static WebElement EmailWarning;
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement PhoneWarning;
	@FindBy(css="input[id='input-password']+div")
	public static WebElement PasswordWarning;
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement MainWarning;
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement YesToNewsLetter;
	public static void Details_To_enter(DataTable datatable,String DetailsType) {
		Map<String,String> map=datatable.asMap(String.class,String.class);
	    Elements.TypeText(RegisterPage.FirstName, map.get("FirstName"));
	    Elements.TypeText(RegisterPage.LastName, map.get("LastName"));
	    Elements.TypeText(RegisterPage.Phone, map.get("Telephone"));
	    Elements.TypeText(RegisterPage.Password, map.get("Password"));
	    Elements.TypeText(RegisterPage.ConfirmPassword, map.get("Password"));
	    if(DetailsType.equalsIgnoreCase("Duplicate"))
	    	 Elements.TypeText(RegisterPage.Email,map.get("Email"));
	    else
	    	Elements.TypeText(RegisterPage.Email,System.currentTimeMillis()+map.get("Email"));
	}
	/*public static void DuplicateDetails(DataTable datatable) {
		Map<String,String> map=datatable.asMap(String.class,String.class);
	    Elements.TypeText(RegisterPage.FirstName, map.get("FirstName"));
	    Elements.TypeText(RegisterPage.LastName, map.get("LastName"));
	    Elements.TypeText(RegisterPage.Email,map.get("Email"));
	    Elements.TypeText(RegisterPage.Phone, map.get("Telephone"));
	    Elements.TypeText(RegisterPage.Password, map.get("Password"));
	    Elements.TypeText(RegisterPage.ConfirmPassword, map.get("Password"));
	}*/

}
