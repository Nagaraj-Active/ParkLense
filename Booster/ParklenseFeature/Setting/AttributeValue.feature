Feature: Verify the Attribute value page functionalities

  Background: 
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on attributeValue link

  Scenario: User successfully navigates to the Attribute page
    Then the user is on the AttributeValue home page
    And they exit from the browser

  Scenario: Verifying the Homepage Components are Enabled
    Then the search text field should be enabled
    Then the client dropdown should be enabled
    Then the status dropdown should be enabled
    And the new button should be enabled
    And the reset button should be enabled
    And the edit icon should be enabled
    And the pagination dropdown should be enabled
    And the next page icon should be enabled

  Scenario: Verify AttributeValue New-Page Components are Enabled
    When they click on the new button
    Then user is on the AttributeValue new page
    Then Attribute drop-down should be enabled
    Then the Attribute name text field should be enabled
    Then the attribute new page client dropdown should be enabled
    And the description text field should be enabled
    And the status radio buttons should be enabled
    And the save button should be enabled
    And the cancel button should be enabled

  Scenario: Verify AttributeValue Creation
    When they click on the new button
    And select the attribute from drop-down
    And enter the attribute value name
    And select the client from drop down
    And select the attribute's status
    And click on the save button
    Then the created attribute value should be verified
    And they should exit from the browser

  Scenario: Verify AttributeValue Editing
    When they select a specific attributeValue and click on the edit button
    And modify the Attribute name
    And click on the save button
    Then the edited attribute should be verified
    And they should exit from the browser

  Scenario: Verify AttributeValue Deletion
    When they select a specific attributeValue and click on the edit button
    And click on the delete button
    Then the deleted attributevalue should be verified
    And they should exit from the browser

  Scenario: Verifying the Search Text Field
    And search for an Attributevalue by its ID
    Then the AttributeValue should be verified by its ID
