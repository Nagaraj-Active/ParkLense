Feature: Client Management

  Background: 
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When they click on the client link
    And I click on the New Client button

  Scenario: User successfully navigates to the New-Client page
    Then the user on the new client page
    And they exit from the browser

  Scenario: Creating a new client
    And I enter  Name into the client name text field
    And I enter mobile number into the mobile number text field
    And I enter email into the email text field
    And I enter client adress into the address text field
    And I select Country from the country dropdown
    And I select State from the state dropdown
    And I select City from the city dropdown
    And I select client type from the client type dropdown
    And I select Status from the client status dropdown
    And I select the client start date and end date
    And I click on the Save button
    Then the created client should be displayed on the client page
