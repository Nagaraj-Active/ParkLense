Feature: verify the user page components
 Background: 
    Given the user launches the application
    When they log in to their account
  Scenario: User successfully navigates to the client user page
    Then the user is on the dashboard home page
    When click on the client-User link
    Then verify the client-User page
    And they exit from the browser

  Scenario: user can get the client user list based on client filter
    When click on the client-User link
    And add client filter 
    Then verify the users