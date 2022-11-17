@smoke
Feature: F08_Wishlist | users could add product to wishlist

  Scenario: user add product to Wishlist
    Given user click on wishlist button on product
    Then Success message appear that product added to wishlist

  Scenario: user go to whishlist page
    Given user click on wishlist button
    And  user navigate to whishlist page
    Then user get product quantity value
