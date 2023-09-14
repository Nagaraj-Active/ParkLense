Feature: Site page features

  Background: 
    Given the user launches the application
    When they log in to their account

  Scenario: User successfully navigates to the Site page
    Then the user is on the dashboard home page
    When they click on the site link
    Then they should be on the site page
     And they exit from the browser
   Scenario: Verify Site Page Components
    When they click on the site link
    When they search for a site using the site ID from the search text field
    Then they should see the search results for the site

    

 
    