@smoke
Feature: As a user I want to verify "Neden Inventus"

  Scenario: Verify "Neden Inventus"
    Given  user on the login page Inventus
    When user enter valid username and password
    And user click the login button
    Then user should verify "Neden Inventus" displayed on the page