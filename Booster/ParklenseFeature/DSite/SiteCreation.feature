Feature: Site Management

  Scenario: Verifing the new site creation
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When they click on the site link
    And they click on the new button
    Then the user is on the site new page
    When they select client from the client dropdown
    And they enter  site Name into the  site text field
    And they enter  site title into the site title text field
    And click on the save button
    Then Verify for the created site
