Feature: Add from android calculator
  As a user
  I want to add two integers
  So that I can use the results
  Scenario: Adding Numbers
    Given That the calculator is opened
    When I add two numbers
    Then The correct results should be displayed