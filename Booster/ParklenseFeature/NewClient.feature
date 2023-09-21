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
    