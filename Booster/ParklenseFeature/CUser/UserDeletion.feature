Feature: User Deletion

  Scenario: Verify user Deletion
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When click on the client-User link
    When  select one particular user click on edit icon
    And click on the delete button
    Then the deleted user should be verified