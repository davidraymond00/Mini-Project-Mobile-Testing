@Beli
Feature: Beli
  As a user
  I want to click beli
  So i can manage my list beli

  Scenario: I click button beli
    Given I am on the dashboard
    When I click login icon
    And I input valid email
    And I input valid password
    And I click login button
    And I click beli button
    Then I get plus cart