package com.VenkadeshM.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	@FindBy(xpath="//a[@class=\"ico-login\"]")
	public WebElement LoginPage;
	@FindBy(xpath="//input[@class=\"email\"]")
	public WebElement Email;
	@FindBy(xpath="//input[@class=\"password\"]")
	public WebElement Password;
	@FindBy(xpath="//input[@id=\"RememberMe\"]")
	public WebElement RememberMe;
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
	public WebElement loginBuuton;


}
