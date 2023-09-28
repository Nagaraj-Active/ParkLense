Feature: Verify the Lot creation

  Scenario: Verify Lot Creation
    Given the user launches the application
    When they log in to their account
    When they click on the Lot links
    When they click on the new button
    And they select the client
    And they select the site
    And they enter the lot name
    And they enter the lot title
    And they enter the parking duration
    And they upload the overlay
    And they select the lots location
    And they select the lots status
    And click on the save button
    Then the created Lot should be verified
    