@Test
Feature: Log in to Skynet healt care center
  Scenario: Use correct credentials to log in
    Given user is on skynet health care page
    When user enters "administrator@skynethealthcare.com" and "$kyN3t"
    And user clicks on login button
    Then user navigated to dashboard
    And user clicks on username located on the top right corner
    And user clicks on Log out option

  Scenario: Try to log in to Skynet Health Care with wrong credentials
    Given user is on skynet health care page
    When user enters "admin@skynethealthcare.com" and "12345"
    And user clicks on login button
    Then the following error message "Invalid login attempt." should display