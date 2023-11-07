package com.VenkadeshM.TechAssessment3;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhislistDefinition {
	WhishListAction wish = new WhishListAction();
	UtilityClass data = new UtilityClass();
	HomePageActions objHome = new HomePageActions();
 
 
	@Given("User is on DemoWebShop Web mainpage")
	public void user_is_on_demo_web_shop_web_mainpage() {
		HelperClass.openPage("https://demowebshop.tricentis.com/");
	    System.out.println("login page");	
		
	}
 
	@When("User Click the Search Feature")
		public void user_click_the_search_feature() {
	    wish.search();
	    System.out.println("search feature enable");
	}
 
	@When("User Enter smartphone and click search option")
	public void user_enter_smartphone_and_click_search_option() {
		wish.clicksearch();
		System.out.println("search the smartphone");
	   	}
 
	@When("user pick the first smart phone")
	public void user_pick_the_first_smart_phone() {
	   wish.mobileFunction();
	}
 
	@When("User add the smartphone into whishlist")
	public void user_add_the_smartphone_into_whishlist() {
	    wish.WhishList();
	    System.out.println("moble successfully added");
	}
 
	@When("User verify the wishlist count")
	public void user_verify_the_wishlist_count() {
	    wish.whishlistOpt();
	    System.out.println("verify the WhishList ");
	}
 
	@When("User remove the smartphone from the Whishlists")
	public void user_remove_the_smartphone_from_the_whishlists() {
	    wish.removeWhishlist();
	    wish.removefrom();
	    System.out.println("remove from the whishlist");
	}
 
	@Then("User Got the Whishlist add and remove function")
	public void user_got_the_whishlist_add_and_remove_function() {
	   Assert.assertTrue(objHome.assercheck().contains("The wishlist is empty!"));
	   System.out.println("Assert successfull");
	}

}
