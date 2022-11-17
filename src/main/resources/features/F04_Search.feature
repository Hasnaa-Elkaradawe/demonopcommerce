@smoke
Feature: F04_Search | user could search for any product
  Scenario Outline: user could search using product name
    Given user clicks on search field
    When user search with "<productName>"
    Then user find "<productName>" in search results
    Examples:
      |productName|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user could search for product using sku
    Given user clicks on search field
    When user search with "<suku>"
    And  click on the product in search result
    Then product "<suku>" page opened
    Examples:
      |suku|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|