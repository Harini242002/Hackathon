Feature: Car insurance page

  @sanity @regression
  Scenario: Get a Car Insurance quote, proceed without  car number, keep filling details, give invalid email or phone number & capture the error message
    Given user navigates to the main page
    When user selects the buying new car option
    And user selects location
    And user selects carno
    And User selects the carbrand
    And user selects the carmodel
    And user selects carfuel
    And User selects the carvariant
    And user fills the userdetails
    Then capture the Error message
