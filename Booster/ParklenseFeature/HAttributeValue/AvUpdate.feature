Feature: Updating Attribute Value

  Scenario: Verify AttributeValue Editing
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on attributeValue link
    Then the user is on the AttributeValue home page
    When they select a specific attributeValue and click on the edit button
    And enter the attribute value name
    And click on the Save button
    Then the edited attribute should be verified
    
