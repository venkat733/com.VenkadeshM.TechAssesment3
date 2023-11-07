Feature: Whishlist add and remoe options
 
Scenario: Verify the Whishlist with add and remoe options
 
Given User is on DemoWebShop Web mainpage
 
When User Click the Search Feature
And User Enter smartphone and click search option
And user pick the first smart phone
And User add the smartphone into whishlist
And User verify the wishlist count
And User remove the smartphone from the Whishlists
Then User Got the Whishlist add and remove function

