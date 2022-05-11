Feature: Login
  I want to login with valid and invalid user


  Scenario Outline: Login test
    Given I open the My Store page
    When I click on the Sign in button
    Then I redirect to the login page
    When I login with <user> emailaddress and <password> password
    And I click on Login Button
    Then The account title should be <accountTitle>

    Examples:
      | user                         | password  | accountTitle             |
      | epamuser.test.szte@gmail.com | Tester123 | Welcome to your account. |
      | epamuser.test.szte@gmail.com | usertest  | Authentication failed.   |
