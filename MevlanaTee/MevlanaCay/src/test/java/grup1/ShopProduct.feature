Feature: Shop Functionality


  Scenario: Verifying of Shop page images's functionality
    Given navigate to shop page
    When  product images should be visible
    Then  verify product's images functionalities

  Scenario: Verifying the product's information in shopping cart
    Given navigate to shop page
    When The information of the selected product should be verified
    Then  The Product-related information should be visible
    Then  User should be able to write review about product
      | review            | name   | email           |
      |                   | Grup_1 | techo@study.com |
      | Bu urun cok tutar |        | techo@study.com |
      | Bu urun cok tutar | Grup_1 |                 |
      | Bu urun cok tutar |        |                 |
      #| Bu urun cok tutar | Grup_1 | techo@study.com |

    Then User should be able to add product to the cart with wanted quantity

