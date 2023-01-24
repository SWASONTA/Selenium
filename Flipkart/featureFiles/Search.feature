@search
Feature: Searching a product

  @dropdown
  Scenario: Search a product using dropdown
  	Given User is Logged In
    When User hovers on dropdown
		And Clicks on a product type
    Then User is navigated to product list page with title as "<product name>"
    Examples: 
      |product name|
      |Kurtas|

  @searchBar
  Scenario Outline: Search a product using search bar
    Given User is Logged In
    When User types in a "<product name>" in search bar
    And Clicks on search
    Then User is navigated to product list page with title as "<product name>"

    Examples: 
      |product name|
      |Smartphone|
      |Shoes|

@Filter
Scenario: Applying filters on searched products
	Given User is Logged In
  When User searches a product
  And applies filters
  Then Products are filtered accordingly
      
      