Feature: Camera Editing

  Scenario: Verify Camera Editing
    Given the user launches the application
    When they log in to their account
    When they click on the camera link
    When they select a specific camera and click on the edit button
    And modify the camera name
    And click on the save button
    Then the updated camera should be verified
    