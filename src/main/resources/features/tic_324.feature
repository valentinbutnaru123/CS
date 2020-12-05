Feature: TIC-324
  Scenario: Verify that sign up panel verify if passwords coincide
    Given Launch Chrome browser TIC-324
    And Open loving-hermann.com page TIC-324
    Then Press on ”Sign Up” button
    Given Enter name, password and confirm password
    And Press on SIGN UP button
    Then Close the browser TIC-324
