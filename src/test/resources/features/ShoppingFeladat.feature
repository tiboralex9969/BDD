Feature: Delete Items
  I want to delete items from the shopping cart

  Scenario: Add items into the shopping cart
    Given I open the My Store page
    When I click on "Women" tab
    And I select the "Faded Short Sleeve T-shirts" product
    And I set Quantity number to "2"
    Then I see the Quantity number is "2"
    When I set Size to "M"
    Then I see the selected Size is "M"
    When I click on Add to cart button
    And I click on Proceed To Checkout
    Then I see the shopping cart page
    And I see the added items
      | Description                 | Unit price | Qty | Total  |
      | Faded Short Sleeve T-shirts | $16.51     | 2   | $33.02 |
    When I click on delete button
    Then I can see the cart is empty

  Scenario: Add new items into the shopping cart
    Given I open the My Store page
    When I click on "Women" tab
    And I select the "Blouse" product
    And I set Quantity number to "3"
    Then I see the Quantity number is "3"
    When I set Size to "S"
    Then I see the selected Size is "S"
    When I click on Add to cart button
    And I click on Proceed To Checkout
    Then I see the shopping cart page
    And I see the total value
		
		

