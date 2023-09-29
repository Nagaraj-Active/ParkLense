Feature: Updating the Existing Client-User

  Scenario: Verify the Updation Of User
    Given the user launches the application
    When they log in to their account
    When click on the client-User link
    And select one particular record and click on edit icon
    Then the user on the edit client-user page
    When they update the client-user name
    And they update the user-mobile number
    And they update the user-email
    And click on the save button
    Then verify is the client-User is get upadted
