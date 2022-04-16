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

  Scenario: Verify users accessing all the Sub modules of Hızaşırtma ürünleri
    Given  user on the login page Inventus
    When user enter valid username and password
    And user click the login button
    And user click "Hızaşırtma ürünleri" modulle
    Then Verify the user see the SubModulles  modules:
      | İŞLEMCI SOĞUTUCUSU      |
      | İŞLEMCI SOĞUTUCUSU KITI |
      | TERMAL MACUN            |
      | KASA FANI               |
      | KASA FANI FILTRESI      |
      | PC SESSIZLEŞTIRME       |