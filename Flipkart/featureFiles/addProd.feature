@AddProduct
Feature: Getting detail of the product and adding it to the cart
  @GettingDetail
  Scenario: Getting Detail of a searched product
    Given User has searched a product type
    When User clicks on a specific product 
    Then User is navigated to product detail page

  @AddToCart
  Scenario: Adding a product to cart
    Given User has searched a product type
    And Is on product detail page
    When User selects size and adds product to cart
    Then User is navigated to shopping cart page

