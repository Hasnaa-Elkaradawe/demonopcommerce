@smoke
Feature: F05_hoverCategories | user could hover and select sub_category

  Scenario: user hover over selected category
    Given user hover over selected category
    And   select sub_category
    Then  datails page Opened
