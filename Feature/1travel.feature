Feature: Travel insurance page

  @sanity @regression
  Scenario: Displays the travel insurance plan for students
    Given user navigates to the home page
    When user selects the location and date
    And user selects number of travellers
    And user selects no for medical
    And User enters the mobile number
    And user selects the student plan and select the travellers
    Then user selects the sorting and displays the insurance plans
