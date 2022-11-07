@Logout
Feature: Logout
  As a user
  I want to logout
  So i can logout my account

  Scenario: Logout from product page
    Given I am on the dashboard
    When I click login icon
    And I input valid email
    And I input valid password
    And I click login button
    And I click logout button
    Then I go to login page