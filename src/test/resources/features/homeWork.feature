@homework_test
Feature: US167854_manager_login_test

  Scenario Outline: kullanici tum manager login bilgileriyle giriş yapabilmeli
    Given kullanici sayfa "https://www.bluerentalcars.com/" gider
    When kullanici login sayfasina gider
    And kullanıcı "<email>" girer
    And kullanici "<password>" girer
    And kullanici login butonunu tiklar
    Then login girisinin basarili "email" oldugunu test et

    Examples: bilgiler
      | email                          | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |

