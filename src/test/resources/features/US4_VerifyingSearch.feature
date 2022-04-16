Feature: As a user, I should be search a product and verify it.

  Scenario: Verify searching product.
    Given  user on the login page Inventus
    When user enter valid username and password
    And user click the login button
    And user click search box and search "Asus"
    Then user verify "ASUS" contains
