@productMaster @regression
Feature: Master product functionality

  Scenario Outline: validate newly created product in product list
    Given User launched the application
    When User clicks on 'Arcolab Bangalore' in login page
    And User clicks on 'Vender Login' in login page
    Then User enters 'username' in login page
    Then User enters 'password' in login page
    And User clicks on 'login' button in login page
    Then User clicks on 'e-commerce' button
    Then User clicks on 'product master' option
    And User verify 'product list table column headers names' in product page
    Then User clicks on 'new product' in product page
    And User enters "<product name>" in 'product name' field of product page
    And User enters 'material number' in 'material number' field of product page
    Then User selects "<product category>" in 'product category' field of product page
    And User selects "<product sub category>" in 'product sub category' field of product page
    When User selects "<unit of measurement>" in 'unit of measurement' field of product page
    And User selects "<vender level>" in 'vender level' field of product page
    And User enters "<unit weight>" in 'unit weight' field of product page
    And User enters "<unit vender price>" in 'unit vender price' field of product page
    When User selects "<currency>" in 'currency' field of product page
    And User enters "<available quantity>" in 'available quantity' field of product page
    And User enters "<minimum order quantity>" in 'minimum order quantity' field of product page
    Then User enters 'text_ipad_description' in 'description' field of product page
    Then User upload 'txt_file_ipad_image' in product page
    Then User clicks on 'save' in product page
    And User search 'material number' in product master product list table
    Then User verifies 'txt_product_order1' in product list row 1

    Examples: 
      | product name           | product category                 | product sub category       | unit of measurement          | vender level         | unit weight         | unit vender price            | currency          | available quantity           | minimum order quantity          |
      | text_ipad_product_name | text_product_category_by_product | text_sub_category_adhesive | text_unit_of_measurement_tst | text_vender_level_l2 | text_unit_weight_15 | text_unit_vender_price_20000 | text_currency_INR | text_available_quantity_1000 | text_minimum_order_quantity_500 |

      
  