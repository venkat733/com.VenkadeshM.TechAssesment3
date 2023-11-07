package com.VenkadeshM.TechAssessment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageAction {
	RegisterPageLocators RegLoc = new RegisterPageLocators();
	 
	WebDriver driver;
	
	public RegisterPageAction() {
		this.RegLoc = new RegisterPageLocators();
		PageFactory.initElements(HelperClass.getDriver(), RegLoc);
		
	}
	public void clickRegisterPage() {
		RegLoc.RegisterPage.click();
	}
	public void selectMale() {
		RegLoc.genderMale.click();
	}
	public void selectFemale() {
		RegLoc.genderFemale.click();
	}
	public void setFirstname(String name1) {		
		RegLoc.firstName.sendKeys(name1);		
	}
	public void setLastname(String name2) {		
		RegLoc.lastName.sendKeys(name2);		
	}
	public void setEmail(String mailId) {		
		RegLoc.email.sendKeys(mailId);		
	}
	public void setPassword(String pass1) {		
		RegLoc.passWord.sendKeys(pass1);		
	}
	public void setConfirmPassword(String pass2) {		
		RegLoc.confirm.sendKeys(pass2);		
	}
	public void Submit() {
		RegLoc.registerButton.click();
	}
	public void register(String name1,String name2, String mailId, String pass1, String pass2) {
		setFirstname(name1);
		setLastname(name2);
		setEmail(mailId);
		setPassword(pass1);
		setConfirmPassword(pass2);
	}

}
