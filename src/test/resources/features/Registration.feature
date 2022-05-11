Feature: Create account
  I want to type in details without submitting them

  Scenario: Fill in the mandatory fields
    Given I open the My Store page
    When I click on the Sign in button
    Then I redirect to the login page
    When I type in email to email address field
    And click on Create Account button
    Then I redirect to the registration page
    When I type in customerFirstName
    #Then Tibor is filled in
    And I type in customerLastName
    #Then Szekeres is filled in
    And I type in password
    #Then password is filled in
    And I type in firstName
    #Then Tibor is filled in to firstName
    And I type in lastName
    #Then Szekeres is filled in to lastName
    And I type in address
    #Then the address is filled in
    And I type in City
    #Then City is filled in
    And I choose from State
    #Then State is filled in
    And I type in Zip Code
    #Then Zip Code is filled in
    And I type in Mobile phone
    #Then Mobile phone is filled in