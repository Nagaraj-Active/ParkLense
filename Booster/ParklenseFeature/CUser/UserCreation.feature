Feature: User Management

  Scenario: Verifing the new user creation
    Given the user launches the application
    When they log in to their account
    Then the user is on the dashboard home page
    When click on the client-User link
    And they click on the new button
    Then the user is on the client-user new page
    And they select client from the client dropdown
    And they enter  Name into the  name text field
    And they enter  User name into the User name text field
    And they enter user-email into the email text field
    And they enter mobile number into the mobile text field
    And they select Role from the role dropdown
    And they select Lot from the lot dropdown
    And they select Status from the client status dropdown
    And they enter  Password into the  password text field
    And they enter Retype-Password into the  retype-password text field
    And click on the save button
    Then the created Client-User should be displayed on the client page
