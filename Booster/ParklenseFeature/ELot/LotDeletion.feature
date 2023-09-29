Feature: Verify the Lot page components

  Scenario: Verify Lot Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the Lot links
    When select one particular record and click on edit icon
    And click on the lot delete button
    Then the deleted record should be verified
    