Feature: Verify the Lot page components

  Scenario: Verify Lot Editing
    Given the user launches the application
    When they log in to their account
    When they click on the Lot links
    When they select a specific Lot and click on the edit button
    And modify the lot name
    And they upload the overlay
    And Enter the coor
    And click on the Save button
    Then the edited Lot should be verified
  