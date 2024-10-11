Feature: Position search and filtering on BaykarTech career site
  The user should be able to filter by department and search for positions on the BaykarTech career site.
  The automation should be dynamic, and position data should be fetched from the site.
  The results of the search and filtering should be validated.

  Background:
    Given Navigate to website
    When Language control
      | language | en |

  @DataDriven
  Scenario Outline: User performs position search and filtering
    Given The user clicks on the button at the bottom of the page
      | acikPozisyonlarBottom |
    Given The user selects "<department>" in the department filter
      | birimAra |
    When The user enters "<position>" in the search box
      | searchBox |
    And The user clicks on the first position in the search results "<position>"
    Then the position page title should match "<position>"
      | positionPageTitle |

    Examples:
      | department     | position |
      | Web Sistemleri | test     |
      | bilişim        | kontrol  |
      | elektrik       | batarya  |
