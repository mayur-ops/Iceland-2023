Feature: Iceland home page features


  Background:
    Given user is on iceland homepage

  @Registration
  Scenario: Registration process
    When user click on the Register Button
    And user closed the advertise window
    And user give fill up all related details
    Then user click on create an account

  @Login
  Scenario Outline: Login process
    When user click on the login button
    And user provide email address "<Email>"
    And user provide password "<Password>"
    Then user click on sign in securely
    Examples:
      | Email             |  | Password  |
      | mkp802002@aol.com |  | Tester123 |

  @SearchButton
  Scenario: Iceland search button
    When user search the item food
    Then user should able see all related items

  @GroceriesButton
  Scenario: Iceland HomePage offer Bar product search
    When user click on groceries button
    And user click on halloween and Bonfire product
    And user select the Maoam sweets
    And user add in to basket
    And user give their post code and continue
    And user create an account
    And user add quantity
    And user click on checkout
    Then user is on basket window
    And user Delete the item
    And user Basket empty and close

