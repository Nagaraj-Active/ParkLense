Feature: Verify the Client-Roles page functionalities

  Background: 
    Given the user launches the application
    When they log in to their account
    When they click on the setting page
    And click on client-roles link

  Scenario: User successfully navigates to the client-role page
    Then the user is on the Client-role home page
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

  Scenario: Verify New-Page Components are Enabled
    When they click on the new button
    Then user is on the client-role new page
    Then the Permissoin title text field should be enabled
    Then the client-role new page client dropdown should be enabled
    And the all check-boxes should be enabled
    And the status radio buttons should be enabled
    And the save button should be enabled
    And the cancel button should be enabled

  Scenario: Verify client-role Creation
    When they click on the new button
    And enter the client-role title
    And in the clientRoleNew page select the client from client drop down
    And select the client-role status
    And click on the save button
    Then the created client-role should be verified
    And they should exit from the browser

  Scenario: Verify client-role Editing
    When they select a specific client-role and click on the edit button
    And do some modification on client-role
    And click on the save button
    Then the edited client-role should be verified
    And they should exit from the browser

  Scenario: Verify client-role Deletion
    When they select a specific client-role and click on the edit button
    And click on the delete button
    Then the deleted client-role should be verified
    And they should exit from the browser

  #Scenario: Verifying the Search Text Field
    #And search for an client-role by its ID
    #Then the client-role should be verified by its ID
