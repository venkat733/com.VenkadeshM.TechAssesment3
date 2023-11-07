package com.VenkadeshM.TechAssessment3;


import org.testng.Assert;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;

public class LoginPageDefinition {
	public static org.apache.logging.log4j.Logger log;
	
	LoginPageActions objLogin = new LoginPageActions();
	UtilityClass data = new UtilityClass();
	HomePageActions objHome = new HomePageActions();
	
	
	
	@Given("User is on DemoWebShop Home page")
	public void user_is_on_demo_web_shop_home_page() {
		log = LogManager.getLogger(LoginPageDefinition.class);
		  System.out.println("login page ");
		  HelperClass.openPage(data.strUrl);
		  log.info("Logged into DemoShopCart");
	}
	


	@When("User clicks Login")
	public void user_clicks_login() {
		log = LogManager.getLogger(LoginPageDefinition.class);
		   objLogin.clickLoginPage();
		   System.out.println("Login Page");
		   log.info("Clicliked Login Page");


	}

	@When("User enters Email and Password")
	public void user_enters_email_and_password() {
		log = LogManager.getLogger(LoginPageDefinition.class);
		try {
			objLogin.login(data.strEmail, data.strPassword);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			log.error("Exception occured",new Exception("Element Not Found"));
		}

		   System.out.println("Email and password");
		   log.info("Enterted Email and Password");
	}

	@When("User clicks Remember me")
	public void user_clicks_remember_me() {
		log = LogManager.getLogger(LoginPageDefinition.class);
		objLogin.RemeberMe();
		 System.out.println("Remember Me");
		 log.info("Ticked Remember Me CheckBox");
		 

	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		log = LogManager.getLogger(LoginPageDefinition.class);
		   objLogin.clickLoginButton();
		   System.out.println("login button");
		   log.info("Clicliked Login Button");
	}

	@Then("User should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
		log = LogManager.getLogger(LoginPageDefinition.class);
		Assert.assertTrue(objHome.verifyText().contains("venk123@gmail.com"));
		   System.out.println("sucessfull login");
		   log.info("Sucessfully Logged in");

	}

	@Then("Login will be unsucessful with error message")
	public void login_will_be_unsucessful_with_error_message() {
		log = LogManager.getLogger(LoginPageDefinition.class);
		Assert.assertTrue(objHome.VerifyErrorMessage().contains("Login was unsuccessful. Please correct the errors and try again."));
		   System.out.println("Unsucessfull login");
		   log.info("unSucessfully Login");

	}

}
