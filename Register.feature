Feature: nopCommerce Registration
  Background:
    Given User open browser And Enter Url
    # Simple data driven without Example Keyword

  Scenario: nopCommerce Registration Test
  Then User click the Registration button
  Then User Click on Radio Female button
    Then User Enter "vinal"and "kakadiya" as FirstName and LastName
    Then User Enter "5" for Day
    Then User Enter"may" for month
    Then User Enter"1986" for Year
    Then User Enter "vinal.kakadiya@tesco.com" as Email
    And User Enter "tesco" for Company Name
    And User Enter"12345" for Password
    When User Enter "12345" for Confirm Password field
    And Click on register
    Then User is on HomePage