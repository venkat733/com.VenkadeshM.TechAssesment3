package com.VenkadeshM.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
	LoginPageLocators loginPageLocators=null;
	
	
	
	public LoginPageActions() {
		this.loginPageLocators=new LoginPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
	}
	public void clickLoginPage() {
		loginPageLocators.LoginPage.click();
	}
	public void setUserName(String strUserName) {
		loginPageLocators.Email.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		loginPageLocators.Password.sendKeys(strPassword);
	}
	public void RemeberMe() {
		loginPageLocators.RememberMe.click();
	}
	public void clickLoginButton() {
		loginPageLocators.loginBuuton.click();
	}
	
	public void login(String Email, String password) {
		
		
		this.setUserName(Email);
		this.setPassword(password);
	}

}
