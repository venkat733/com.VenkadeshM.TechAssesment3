package com.VenkadeshM.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class WhishListAction {
	WhishListLocators wishlocators;
	
	 
	WhishListAction(){
		this.wishlocators = new WhishListLocators();
		PageFactory.initElements(HelperClass.getDriver(), wishlocators);
	}
	public void search() {
		wishlocators.search.click();
	}
	public void clicksearch() {
		wishlocators.search.sendKeys("Smartphone");
		wishlocators.searchButton.click();
	}
	
	public void mobileFunction() {
		wishlocators.mobile.click();
	}
	
	public void WhishList() {
		wishlocators.AddtoWish.click();
	}
	
	public void whishlistOpt() {
		wishlocators.whishlists.click();
	}
	
	public void removeWhishlist() {
		wishlocators.removelist.click();
	}
	
	public void removefrom() {
		wishlocators.remove.click();
	}

}
