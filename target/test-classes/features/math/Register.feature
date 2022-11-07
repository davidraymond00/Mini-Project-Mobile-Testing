@Register
Feature: Register
  As a user
  I want to register new account
  So i can create new account

  Scenario: Register with null fullname null email null password
    Given I am on the dashboard
    When I click login icon
    And I click register icon
    And I input null fullname
    And I register null email
    And I register null password
    And I clik register button
    Then I get error message fullname can not empty

  Scenario: Register with valid fullname null email null password
    Given I am on the dashboard
    When I click login icon
    And I click register icon
    And I input valid fullname
    And I register null email
    And I register null password
    And I clik register button
    Then I get error message emaill can not empty

  Scenario: Register with null fullname valid email null password
    Given I am on the dashboard
    When I click login icon
    And I click register icon
    And I input null fullname
    And I register valid email
    And I register null password
    And I clik register button
    Then I get error message password can not empty

  Scenario: Register with null fullname null email valid password
    Given I am on the dashboard
    When I click login icon
    And I click register icon
    And I input null fullname
    And I register null email
    And I register valid password
    And I clik register button
    Then I get error message emaill can not empty

