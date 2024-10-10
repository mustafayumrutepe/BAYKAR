Feature: Navigation Bar Functionality.
  Visitor can click on all navbar elements on the BaykarTech site
  The visitor should be able to click on all navigation bar elements on the BaykarTech site and the pages should load smoothly.
  The navbar automation should be dynamic, ensuring no updates are needed when new elements are added.

  Background:
    Given Navigate to website
    Then Language control
      | language | en |

  @NavigationBar
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