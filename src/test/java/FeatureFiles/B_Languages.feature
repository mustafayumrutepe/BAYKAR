Feature: Language switching functionality on the Baykartech website
  A visitor should be able to switch between the provided languages on the Baykartech website,
  and page elements should be displayed correctly according to the selected language.

  Background:
    Given Navigate to website

  @StaticLanguageCheck
  Scenario: Verify available languages
    When The user checks the available languages
    Then The available languages should include "tr" and "en"

  @LanguageSwitch
  Scenario: Switch language and verify page elements
    When The user selects the language
      | language | en |
      | body | null |
    Then The page URL should contains this
      | tr |
    And The main page elements should be correctly displayed in this language
      | staj | staj |

    When The user selects the language
      | language | tr |
      | body | null |
    Then The page URL should contains this
      | en |
    And The main page elements should be correctly displayed in this language
      | kariyer | career |

    And  The last control Select all texts
      |body|

