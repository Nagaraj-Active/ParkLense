Feature: Verify the Admin-Users page functionalities

  Scenario: Verify Admin-Users Editing
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-Users link
    When they select a specific Admin-Users and click on the edit button
    And modify the name,email and role
    And click on the save button
    Then the edited Admin-Users should be verified
    And they should exit from the browser
