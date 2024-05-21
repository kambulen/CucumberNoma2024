Feature: Login

  Scenario Outline: As a user I want to login and verify if the login is successful
    Given I am on the login page
    And I enter the correct username <username>
    And I enter the correct password <password>
    When I click on the login button
    Then I get directed to the home page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      #| problem_user            | secret_sauce |
      #| performance_glitch_user | secret_sauce |