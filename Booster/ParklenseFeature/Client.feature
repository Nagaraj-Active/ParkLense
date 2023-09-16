Feature: Verify Client Page Components

  Background: 
    Given the user launches the application
    When they log in to their account
    When they click on the client link
  Scenario: User successfully navigates to the client page
    Then the user is on the dashboard home page 
    Then the user on the client home page
    And they exit from the browser

  Scenario: Verifying the search text field
    Then the user on the client home page
    And search client by id
    Then verify client by id

  Scenario: Verifying the edit scenario
    And Select one particular client and click on edit icon
    Then the user on the client edit page
    When update the client name
    And update the mobile number
    And update the email
    And click on save button
    Then verify is the client get upadted
