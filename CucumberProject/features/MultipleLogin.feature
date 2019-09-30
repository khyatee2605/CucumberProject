@FunctionalTest
Feature: To test multiple login functionality

  @SmokeTest
  Scenario Outline: To test multiple login functionality on DemoWebShop
    Given User is on DemoWebShop page
    When User enters "<username>" and "<password>"
    Then Display message Logged in Successfully

    Examples: 
      | username           | password  |
      | pratiksha@test.com | pratiksha |
      | rick@test.com      | tester    |
