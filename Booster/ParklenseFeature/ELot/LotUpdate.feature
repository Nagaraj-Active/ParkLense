Feature: Verify the Lot page components

  Scenario: Verify Lot Editing
    Given the user launches the application
    When they log in to their account
    When they click on the Lot links
    When select one particular record and click on edit icon
    And modify the lot name
    And they upload the overlay
    And they enter the all coordinates
    And click on the save button
    Then the edited Lot should be verified
  