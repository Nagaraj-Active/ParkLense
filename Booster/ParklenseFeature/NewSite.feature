Feature: New user page components verification

  Scenario: User successfully navigates to the New-Site page
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When they click on the site link
    And click on the site new button
    Then the user on the new site page
    And they exit from the browser