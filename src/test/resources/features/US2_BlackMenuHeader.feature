Feature: As a user, I should be accessing all the main modules of the app.

  Scenario:  Verify users accessing all the main modules of the app.
    Given  user on the login page Inventus
    When user enter valid username and password
    And user click the login button
    Then Verify the user see the following modules:
      | ANASAYFA                 |
      | BILGISAYARLAR            |
      | TEMEL DONANIMLAR         |
      | DEPOLAMA BIRIMLERI       |
      | HIZAŞIRTMA ÜRÜNLERI      |
      | ÇEVRE BIRIMLERI          |
      | AĞ ÜRÜNLERI              |
      | YAZILIM VE DIĞER ÜRÜNLER |