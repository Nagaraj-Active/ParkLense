Feature: AttributeValue Deletion

  Scenario: Verify AttributeValue Deletion
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on attributeValue link
    Then the user is on the AttributeValue home page
    When they select a specific attributeValue and click on the edit button
    And click on the AVdelete button
    Then the deleted attributevalue should be verified
