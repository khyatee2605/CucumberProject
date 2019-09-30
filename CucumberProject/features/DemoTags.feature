@FunctionalTest
Feature: Tags Functionality
  To test Tags Functionality

  Background: Background Functionality
    Given Test one background
    When Test two background
    Then Test Three Background

  @SmokeTest
  Scenario: Test Smoke Functionality
    Given Its a Smoke first step
    When Its a Smoke second step
    Then Its a Smoke third step

  @RegressionTest
  Scenario: Test Regression Functionality
    Given Its a Regression first step
    When Its a Regression second step
    Then Its a Regression third step

  @IntegrationTest
  Scenario: Test Integration Functionality
    Given Its an Integration first step
    When Its an Integration second step
    Then Its an Integration third step


