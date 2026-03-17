Feature: Login functionality


  @ADO12 @smoke
  Scenario: Verify login successfully
    Given User launch login page
    When User enter login credentials in login page
    And User click on sign button
    Then User successfully enters welcome page


  @ADO13 @regression
  Scenario: Verify login successfully with parameters
    Given User launch login page
    When User enter "userName" and "Password" login credentials in login page
    And User click on sign button
    Then User successfully enters welcome page


  @ADO14 @smoke
  Scenario Outline: Verify login successfully with more than 2 parameters
    Given User launch login page
    When User enter "<username>" and "<password>" login credentials in login page
    And User click on sign button
    Then User successfully enters welcome page
    Examples:
      | username | password    |
      | chinni   | test@chinni |
      | venkat   | test@venkat |
      | pavan    | test@pavan  |


  @ADO15 @regression
  Scenario Outline: Verify login successfully with single parameters
    Given User launch login page
    When User enter "<username>" login credentials in login page
    And User click on sign button
    Then User successfully enters welcome page
    Examples:
      | username |
      | chinni   |
      | venkat   |
      | pavan    |

  @ADO16 @regression
  Scenario: Verify login successfully using datatable without header
    Given User launch login page
    When User enter credentials in login page
      | chinni | venkat |
    And User click on sign button
    Then User successfully enters welcome page

  @ADO17 @regression
  Scenario: Verify login successfully using datatable with header
    Given User launch login page
    When User enter credentials in login page using header
      | Last   | Name         |
      | CHINNI | VENKATAPAVAN |
      | PAVAN  | CHINNI       |
    And User click on sign button
    Then User successfully enters welcome page
