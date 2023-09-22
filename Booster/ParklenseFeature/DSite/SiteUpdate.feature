Feature: Updating the Existing site

  Scenario: Verify the Updation Of site
    Given the user launches the application
    When they log in to their account
    When they click on the site link
    And select one particular site click on edit icon
    Then the user on the edit site page
    When they update the site name
    And they click on the Save button
    Then verify is the client-site is get upadted
