Feature: Verify the Admin-Users page functionalities

  Scenario: Verify Admin-Users Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-Users link
    When they select a specific Admin-Users and click on the edit button
    And click on the delete button
    Then the deleted Admin-Users should be verified
   
