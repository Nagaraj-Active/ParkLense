Feature: Updating the Existing site

  Scenario: Verify the Updation Of site
    Given the user launches the application
    When they log in to their account
    When they click on the site link
    And select one particular record and click on edit icon
    Then the user on the edit site page
    When they update the site name
    And click on the save button
    Then verify is the client-site is get upadted
