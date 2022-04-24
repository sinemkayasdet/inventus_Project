@smoke
Feature: As a user, I want to add to cart product and verify it.

  Scenario: verify the adding product
    Given  user on the login page Inventus
    When user enter valid username and password
    And user click the login button
    And user click search box and search "MSI" and add it
    Then user verify that product isDisplayed on page
