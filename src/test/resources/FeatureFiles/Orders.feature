
@Orders
Feature: Order placing Scenarios

  @OrdersOne
  Scenario: Verify whether the user is not able to place the order as payment options are not available
    Given I login to the application
    When I add product to the bag and checkout
    And I place an order
    Then I should see that the warning message "Warning: No Payment options are available. Please contact us for assistance!"


  
