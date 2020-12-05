Feature: TIC-323
  Scenario: Verify that functionality "Send a review" works as expected
    Given Launch Chrome browser TIC-323
    And Open loving-hermann.com page TIC-323
    Then Open clothing menu TIC-323
    And Click on product quick view TIC-323
    Then Press on REVIEW button
    Given Enter name, email and review
    And Press on SEND button
    Then Close the browser TIC-323
