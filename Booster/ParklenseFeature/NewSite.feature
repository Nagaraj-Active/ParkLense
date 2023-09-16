Feature: New user page components verification
 Background:
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When they click on the site link
  Scenario: User successfully navigates to the New-Site page
    And click on the site new button
    Then the user on the new site page
    And they exit from the browser
  Scenario: User is able to create a new client
    And click on the site-new button
    And select a client
    And Enter the site name into the site-name text field
    And Enter the title into the title text field
    And Select the site status
    And Click on the save button
    Then Created site should be displayed on client page
