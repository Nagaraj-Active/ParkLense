Feature: Verifying Dashboard Content

  Scenario: Verify Data Count
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    And verify the Prospects section
    And verify the Lots section
    And verify the Stalls section
    And verify the Live Camera functionality
    And verify the Down Camera functionality
    And verify the Maintenance Lots section
    And they exit the browser
