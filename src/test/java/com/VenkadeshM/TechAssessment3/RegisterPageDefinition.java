package com.VenkadeshM.TechAssessment3;

import java.util.List;

import java.util.Map;

import org.testng.Assert;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageDefinition {
	RegisterPageAction objRegist= new RegisterPageAction();
	UtilityClass data = new UtilityClass();
	HomePageActions objHome = new HomePageActions();
	LoginPageActions objLogin = new LoginPageActions();
	@Given("url to launch webpage")
	public void url_to_launch_webpage() {
		  System.out.println("HomePage");
		   HelperClass.openPage("https://demowebshop.tricentis.com/");

	}
	@When("User clicking register Page to enter credentials")
	public void user_clicking_register_page_to_enter_credentials() {
		  System.out.println("Register Page");
		  objRegist.clickRegisterPage();
	}




	@When("User clicking radio button")
	public void user_clicking_radio_button() {
		System.out.println("Gender");
		objRegist.selectMale();

	}

	@When("User entering firstname,Lastname,email,password and also confirm password")
	public void user_entering_firstname_lastname_email_password_and_also_confirm_password(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	
	    	String FirstName=data.get("FirstName");
	    	objRegist.setFirstname(FirstName);
	    	
	    	String LastName=data.get("LastName");
	    	objRegist.setLastname(LastName);
	    	
	    	String Email=data.get("Email");
	    	objRegist.setEmail(Email);
	    	
	    	String Password=data.get("Password");
	    	objRegist.setPassword(Password);
	    	
	    	String Confirm=data.get("Confirm Password");  
	    	objRegist.setConfirmPassword(Confirm);
	    }

	}

	@When("User clicks register button")
	public void user_clicks_register_button() {
		System.out.println("Register Button");
		objRegist.Submit();

	}
	@Then("Check weather User register successfully")
	public void check_weather_user_register_successfully() {
		Assert.assertTrue(objHome.VerifyRegistrationError().contains("The specified email already exists"));
		   System.out.println("sucessfull login");


	}

}
