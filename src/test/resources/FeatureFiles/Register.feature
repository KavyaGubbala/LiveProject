
@tags
Feature: Registration Functionality Scenarios
	@Register@One
  Scenario: Verify whether the user is able to register into the appliaction by providing all the fields
    Given I launch the application
    And I navigate to Account Registration Page
    When I provide all the below valid details
    		|FirstName |Ravi             					|
    		|LastName  |Kiran           						|
    		|Email 		 |ravikiran2@gmail.com       |
    		|Telephone |9876543210									|
    		|Password	 |rkiran											|
    And I select the privacy policy
    And I click on continue button
    Then I should see that user account is successfully created
    
    @Register @Two
    Scenario: Verify whether the user is not allowed to register on skipping the manadatory fields
    	Given I launch the application
    	And I navigate to Account Registration Page
    	When I click on continue button
    	Then I should see that the user Account is not created 
    	And I should see the error messages informing the user to fill manadatory fields
    
    @Register @Three
    Scenario: Verify whether the user is able to register into the application by opting for Newsletter subscription
    	Given I launch the application
    	And I navigate to Account Registration Page
    	When I provide all the below valid details
    				|FirstName |Ravi             					|
    				|LastName  |Kiran           						|
    				|Email 		 |ravikiran2@gmail.com       |
    				|Telephone |9876543210									|
    				|Password	 |rkiran											|
    	And I select the privacy policy
    	And I subscribe the Newsletter
    	And I click on continue button
    	Then I should see that user account is successfully created
    
    @Register  @Four
  	Scenario: Verify whether the user is restricted from creating duplicate account
    	Given I launch the application
    	And I navigate to Account Registration Page
    	When I provide all the below duplicate details into the fields
    			|FirstName |Ravi             					 |
    			|LastName  |Kiran           					 |
    			|Email 		 |ravikiran1@gmail.com       |
    			|Telephone |9876543210								 |
    			|Password	 |rkiran										 |
    	And I select the privacy policy
    	And I click on continue button
    	Then I should see that user is restricted from creating duplicate account
 