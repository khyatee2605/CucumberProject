@FunctionalTest
Feature: To test login functionality with multiple parameters

  @SmokeTest
  Scenario Outline: To test multiple login functionality on TestMeApp
    Given User is on TestMeApp page
    When User enters "<user>" and "<pass>" in TestMeApp
    Then Display message - Login is Successful

    Examples: 
      | user    | pass        |
      | katie26 | test02      |
      | lalitha | Password123 |
      | meh123  | katie02     |
