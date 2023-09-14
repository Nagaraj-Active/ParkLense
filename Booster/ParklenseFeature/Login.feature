Feature: Login Functionality

  Background:
    Given the user launches the application
    And they exit from the browser
    
  Scenario: User logs in with valid credentials
    When User enters the email into the user text field
    And User enters the password into the password text field
    And clicks on the login button
    Then the user is on the dashboard home page
    

  Scenario: User attempts to log in with an invalid email
    When User enters an invalid email into the user text field
    And User enters a valid password into the password text field
    And clicks on the login button
    Then Verify the sign-in page
    

  Scenario: User attempts to log in with an invalid password
    When User enters a valid email into the user text field
    And User enters an invalid password into the password text field
    And clicks on the login button
    Then Verify the sign-in page
    

  Scenario: User attempts to log in without providing credentials
    When User leaves the email text field empty
    And User leaves the password text field empty
    And clicks on the login button
    Then Verify the sign-in page
    
