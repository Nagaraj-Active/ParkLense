Feature: Updating the Existing client


Scenario: Verify the Updation Of Client
    Given the user launches the application
    When they log in to their account
    When they click on the Client link
    And select one particular user click on edit icon
    Then the user on the edit client page
    When they update the client name
    And they update the mobile number
    And they update the email
    And they click on the Save button
    Then verify is the client get upadted
  
    