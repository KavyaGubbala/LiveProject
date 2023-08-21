

Feature: Registration Functionality Scenarios

  Scenario: Verify whether the user is able to register into the appliaction by providing all the fields
    Given I launch the application
    And I navigate to Account Registration Page
    When I provide all the below valid details
    		|FirstName | Kavya             						|
    		|LastName  | Gubbala           						|
    		|Email 		 | kavyasribhavani123@gmail.com |
    		|Telephone | 9876543210										|
    		|Password	 | Kavya_9951										|
    And I select the privacy policy
    And I click on continue button
    Then I should see that user account is successfully created
   
 