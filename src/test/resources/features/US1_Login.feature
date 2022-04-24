@smoke
Feature: As a user, I should be able to log in.

  Background:For the scenarios in the feature file, user is expected to be on login page
    Given  user on the login page Inventus

    Scenario: Verify login with valid credential
    When user enter valid username and password
      And user click the login button
      Then verify the user should be able to see "inventus - Ana Sayfa"