
Feature: Verify the Admin-Roles page functionalities

  Background: 
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on Admin-roles link
Scenario: Verify admin-role Deletion
    When they select a specific admin-role and click on the edit button
    And click on the delete button
    Then the deleted admin-role should be verified
    And they should exit from the browser