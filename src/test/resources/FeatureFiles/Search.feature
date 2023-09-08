@search
Feature: Search functionality Scenarios
 

  @search1
  Scenario: Verify whether the user is able to search for products
    Given I launch the application
    When I search for a product "Samsung SyncMaster 941BW"
    Then I should see the products in the search results
  @search2
  Scenario: Verify whether the user is informed when the product being searched is not available
  	Given I launch the application
  	When I search for a product "apple iphone"
  	Then I should see the page displaying the message "There is no product that matches the search criteria."


 