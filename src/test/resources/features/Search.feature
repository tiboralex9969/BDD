Feature: Search
  I want to searching for the items

  
  Scenario: Searching for items
  	Given I open the My Store page
		When I type the "Dress" on search field
		And I click on Search button
		Then I see the page redirected to the search result page
		And I see the "Dress" contained
		
  Scenario: Select the Searched items
  	Given I open the My Store page
		When I type the "Dress" on search field
		And I click on Search button
		And I select the "Printed Summer Dress" product
		Then I see the "Printed Summer Dress" product page
