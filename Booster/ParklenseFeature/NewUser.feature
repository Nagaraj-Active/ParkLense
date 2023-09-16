Feature: User Management

  Background: 
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When click on the client-User link
    And I click on client-user new button

  Scenario: User successfully navigates to the New-Client-user page
    Then the user is on the client-user new page
    And they exit from the browser

  Scenario: Creating a new User
    And I select client from the client dropdown
    And I enter  Name into the  name text field
    And I enter  User name into the User name text field
    And I enter email into the email text field
    And I enter mobile number into the mobile text field
    And I select Role from the role dropdown
    And I select Lot from the lot dropdown
    And I select Status from the client status dropdown
    And I enter  Password into the  password text field
    And I enter  Retype-Password into the  retype-password text field
    And I click on the Save button
    Then the created Client-User should be displayed on the client page
