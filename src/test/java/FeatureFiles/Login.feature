Feature: User Login
  In order to access the application
  As a registered user I want to be able to log in with valid credentials

  @positive
  Scenario: Successful login with valid credentials
    Given Navigate to website
    When Language control
      | language | en |
    Then The user clicks on the button
      | giris |
    And The user enters valid email and password.
      | email    | mstfyumrutepe@gmail.com |
      | password | Mstf51..                |
    And The user clicks on the button
      | recaptcha |
      | login     |
    Then The user should be successfully logged in.
      | loginVerify | başarıyla |