Feature: Verify the Attribute page components

  Background: 
    Given the user launches the application
    When they log in to their account
    When they click on the setting page

  Scenario: User successfully navigates to the Attribute page
    Then the user is on the Attribute home page
    And they exit from the browser

  Scenario: Verifying the Homepage Components are Enabled
    Then the search text field should be enabled
    Then the status dropdown should be enabled
    And the new button should be enabled
    And the reset button should be enabled
    And the edit icon should be enabled
    And the pagination dropdown should be enabled
    And the next page icon should be enabled

  Scenario: Verify Attribut New Page Components are Enabled
    When they click on the new button
    Then user is on the Attribute new page
    Then the name text field should be enabled
    And the description text field should be enabled
    And the status radio buttons should be enabled
    And the save button should be enabled
    And the cancel button should be enabled

  Scenario: Verify Attribute Creation
    When they click on the new button
    And enter the attribute name
    And enter the description
    And select the attribute's status
    And click on the save button
    Then the created attribute should be verified
    And they should exit from the browser

  Scenario: Verify Attribute Editing
    When they select a specific attribute and click on the edit button
    And modify the name
    And click on the save button
    Then the edited attribute should be verified
    And they should exit from the browser

  Scenario: Verify Attribute Deletion
    When they select a specific attribute and click on the edit button
    And click on the delete button
    Then the deleted attribute should be verified
    And they should exit from the browser

  Scenario: Verifying the Search Text Field
    And search for an Attribute by its ID
    Then the Attribute should be verified by its ID

