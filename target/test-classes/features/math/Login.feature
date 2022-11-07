@Login
Feature: Login
  As a user
  I want to login
  So i can access my dashboard

  Scenario: Login with null email and null password
    Given I am on the dashboard
    When I click login icon
    And I input null email
    And I input null password
    And I click login button
    Then I get error message

  Scenario: Login with invalid email and null password
    Given I am on the dashboard
    When I click login icon
    And I input invalid email
    And I input null password
    And I click login button
    Then I get error message password can not empty

  Scenario: Login with null email and invalid password
    Given I am on the dashboard
    When I click login icon
    And I input null email
    And I input invalid password
    And I click login button
    Then I get error message email can not empty

  Scenario: Login with valid email and null password
    Given I am on the dashboard
    When I click login icon
    And I input valid email
    And I input null password
    And I click login button
    Then I get error message password can not empty

  Scenario: Login with null email and valid password
    Given I am on the dashboard
    When I click login icon
    And I input null email
    And I input valid password
    And I click login button
    Then I get error message email can not empty

  Scenario: Login with valid email and valid password
    Given I am on the dashboard
    When I click login icon
    And I input valid email
    And I input valid password
    And I click login button
    Then I go to product page