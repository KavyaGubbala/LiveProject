
@tag
Feature: Login Functionality Scenarios


  @Loginone
  Scenario: Verify whether the user is able to login with valid credentials
    Given I launch the application
    And I navigate to Account login page
    When I login to the application using Username "ravikiran1@gmail.com" and Password "rkiran"
    Then I should see that user is able to login successfully
  @Logintwo
  Scenario: Verify whether the user is not able to login with invalid credentials
  	Given I launch the application
    And I navigate to Account login page
    When I login to the application using Username "ravikiran9@gmail.com" and Password "rkiran9"
    Then I should see an error message that the credentails are invalid
  @Loginthree
  Scenario: Verify whether the user is not able to login without providing credentials
  	Given I launch the application
    And I navigate to Account login page
    When I login to the application using Username "" and Password ""
    Then I should see an error message that the credentails are invalid
  @Loginfour
  Scenario: Verify whether the user is not able to reset the forgotten password
  	Given I launch the application
    And I navigate to Account login page
    When I reset the forgotten password for email "ravikiran1@gmail.com"
    Then I should see a message informing the User that confiramtion mail has been sent to the mail to reset the password
    


  