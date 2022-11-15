@smoke
Feature: F07_followUs | users could open followUs links

  Scenario: user opens facebook link
    When  user opens facebook link
    Then "https://www.facebook.com/nopCommerce" is opened in new tab
    And user could open and navigate to "https://twitter.com/nopCommerce" tab

  Scenario: user opens twitter link
    When user opens twitter link
    Then "https://twitter.com/nopCommerce" is opened in new tab


  Scenario: user opens youtube link
    When user opens youtube link
    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab