Feature: Attribute Deletion

 Scenario: Verify Attribute Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    When they select a specific attribute and click on the edit button
    And click on the attribute delete button
    Then the deleted attribute should be verified
    