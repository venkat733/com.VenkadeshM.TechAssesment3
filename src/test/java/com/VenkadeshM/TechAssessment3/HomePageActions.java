package com.VenkadeshM.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
HomePageLocators homepageLocators ;
	
	public HomePageActions(){
		homepageLocators = new HomePageLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), homepageLocators);
	}
	
	public String verifyText() {
		return homepageLocators.verifyText.getText();
	}
	public String VerifyErrorMessage() {
		return homepageLocators.VerifyErrorMessage.getText();
	}
	public String VerifyRegistration() {
		return homepageLocators.Registration.getText();
	}
	public String VerifyRegistrationError() {
		return homepageLocators.HomePageError.getText();
	}
	public String assercheck() {
		return homepageLocators.WhishlistText.getText();
	}
	

}
