 Feature: Updating Attribute 

 Scenario: Verify Attribute updation
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    When they select a specific attribute and click on the edit button
    And modify the Attribute name
    And click on the Save button
    Then the edited attribute should be verified
    