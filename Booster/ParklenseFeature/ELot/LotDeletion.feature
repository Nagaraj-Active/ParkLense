Feature: Verify the Lot page components

  Scenario: Verify Lot Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the Lot links
    When they select a specific Lot and click on the edit button
    And click on the lot delete button
    Then the deleted Lot should be verified
    