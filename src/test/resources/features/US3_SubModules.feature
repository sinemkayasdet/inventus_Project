Feature: As a user, I should be accessing all the Sub modules of the Temel Donanimlar.

  Scenario: Verify users accessing all the Sub modules of Temel Donanimlar.
    Given  user on the login page Inventus
    When user enter valid username and password
    And user click the login button
    And user click "Temel donanımlar" module
    Then Verify the user see the SubModules  modules:
      | ANAKART                       |
      | İŞLEMCI                       |
      | EKRAN KARTI                   |
      | BELLEK                        |
      | KASA                          |
      | GÜÇ KAYNAĞI                   |
      | DIJITAL VIDEO IŞLEME KARTLARI |


  Scenario: Verify users accessing all the Sub modules of Depolama birimleri
    Given  user on the login page Inventus
    When user enter valid username and password
    And user click the login button
    And user click "Depolama birimleri" moduleS
    Then Verify the user see the SubModuless  modules:
      | DAHILI SABITDISK |
      | SSD SABITDISK    |
      | DVD YAZICI       |
      | USB BELLEK       |
      | HARICI SABITDISK |
      | SABITDISK KUTUSU |