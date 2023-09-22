Feature: site Deletion

  Scenario: Verify site Deletion
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When they click on the site link
    When  select one particular site click on edit icon
    And click on the delete button
    Then the deleted site should be verified