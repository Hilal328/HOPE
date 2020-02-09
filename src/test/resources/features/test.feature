Feature: Test

  @smoke
  Scenario: Valid Login
    Given i enter valid username and valid password
    When i click login button
    Then i successfully logged in
    And i see welcome text