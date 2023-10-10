Feature: Iceland home page features

  @SearchButton
Scenario: Iceland search button
  Given user is on iceland homepage
  When user search the item food
  Then user should able see all related items
