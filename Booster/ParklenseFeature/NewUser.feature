Feature: New user page components verification

  Scenario: User successfully navigates to the New-Client-user page
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When click on the client-User link
    And click on the new button
    Then verify the client-user new page
    And they exit from the browser
