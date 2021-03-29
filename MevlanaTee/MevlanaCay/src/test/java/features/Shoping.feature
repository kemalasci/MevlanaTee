
Feature: Shopping regression

  Scenario:
    Given user on home page
    And   user navigate to shop page
    When  user select the 2.th product
    Then  the name and the price should be correct in product detail page

  Scenario: User change quantity
    When  user change quantity to 4
    And   user goto Cart
    Then  quantity should be changed
    And   the price in cart should be correct
    And   the total price in cart should be correct

  Scenario: