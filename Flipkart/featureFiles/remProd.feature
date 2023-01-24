@Remove
Feature: User removes product from a cart
  
  Scenario: User removes a particular product from the cart
    Given User has logged in
    When User clicks on cart icon
    Then User is navigated to cart page
    When User clicks on remove button for a particular product
    Then The name of the item is removed from the cart.
