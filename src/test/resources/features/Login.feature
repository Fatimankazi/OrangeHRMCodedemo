#orangehrm project Scenarios
@regression
Feature: To be prepare login scenarios.
Scenario: Login by using various data

   Given User on login page
    When User enter username and password
     And user click on login button
    Then user navigate to home page
    

   Scenario Outline: Test the login functionallity by using set of data.
    Given User on login page
    When User enter <username> and <password>
    And user click on login button
    Then user navigate to home page

    Examples: 
      | username | Password | 
      |Admin  | admin123 | 
      | admn |  admin123 | 
      |Admin|admin111|
      |admn|admin111|
      |    |        |
      |Admin|       |
      |     | admin123 |
      