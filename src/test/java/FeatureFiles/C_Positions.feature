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
    Given The user clicks on the button
    |acikPozisyonlarBottom|
    Given the user selects "<department>" in the department filter
    When the user enters "<position>" in the position field and clicks the search button
    Then the titles of the search results should contain "<position>"
    And the user clicks on the first position in the search results
    Then the position page title should match "<position>"

    Examples:
      | department    | position               |
      | Engineering    | Software Test Engineer  |
      | Manufacturing | Production Engineer      |
      | R&D           | Project Manager          |
