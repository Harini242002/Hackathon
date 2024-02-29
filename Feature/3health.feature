Feature: Health insurance Menu page

  @sanity @regression
  Scenario: Displays the Health insurance Menu
    Given user navigates to the Menu page
    When user selects the Health Insurance Menu
    Then Display Health Insurance Menu
