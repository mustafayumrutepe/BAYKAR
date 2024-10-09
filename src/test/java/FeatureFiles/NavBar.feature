Feature: Navigation Bar Functionality

  Background:
    Given Navigate to website
    Then Language control
      | language | en |

  Scenario: Verify Navigation Bar Links
    When When user clicks a navbar item, they are redirected correctly
      | kariyer         | null                       |
      | irtifa          | irtifa                     |
      | yerleskelerimiz | yerleskelerimiz            |
      | yasam           | yasam                      |
      | pozisyonlar     | pozisyonlar                |
      | staj            | staj                       |
      | sss             | sss                        |
      | baykar          | https://baykartech.com/tr/ |
      | giris           | login                      |