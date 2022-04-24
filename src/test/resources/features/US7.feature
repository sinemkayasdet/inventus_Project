Feature:As a user I want to able to select spesific model on checkBox

  Scenario: Verify able to select checkbox
    Given  user on the login page Inventus
    When user enter valid username and password
    And user click the login button
    And user click "TEMEL DONANIMLAR" modulesss
    And user should be select spesific checkbox for model
    Then user verify the checbox is select