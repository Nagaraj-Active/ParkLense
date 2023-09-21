Feature: Verify the Admin-Users page functionalities

  Background: 
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-Users link

  Scenario: User successfully navigates to the Admin-Users page
    Then the user is on the Admin-Users home page
    And they exit from the browser

  Scenario: Verifying the Homepage Components are Enabled
    Then the search text field should be enabled
    Then the status dropdown should be enabled
    And the new button should be enabled
    And the reset button should be enabled
    And the edit icon should be enabled
    And the pagination dropdown should be enabled
    And the next page icon should be enabled

  Scenario: Verify New-Page Components are Enabled
    When they click on the new button
    Then user is on the Admin-user new page
    Then the admin-users name text field should be enabled
    And the Admin-Users mobile text field should be enabled
    And the Admin-Users email text field should be enabled
    And the Admin-Users role drop-down should be enabled
    And the Admin-Users password text field should be enabled
    And the Admin-Users retype-password text field should be enabled
    And the status radio buttons should be enabled
    And the save button should be enabled
    And the cancel button should be enabled

  

