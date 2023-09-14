Feature: Verify Client Page Components

  Background: 
    Given the user launches the application
    When they log in to their account

  Scenario: User successfully navigates to the client page
    Then the user is on the dashboard home page
    When click on the client link
    Then the user on the client home page
    And they exit from the browser

  Scenario: Verifying the search text field
    And click on the client link
    Then the user on the client home page
    And search client by id
    Then verify client by id

  Scenario: Verifying the edit scenario
    When click on the client link
    And Select one particular client and click on edit icon
    Then the user on the client edit page
    When update the client name
    And update the mobile number
    And update the email
    And click on save button
    Then verify is the client get upadted
