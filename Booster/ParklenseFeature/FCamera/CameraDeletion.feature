Feature: Camera Deletion

  Scenario: Verify Camera Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the camera link
    When they select a specific camera and click on the edit button
    And click on the delete camera button
    Then the deleted camera should be verified
 