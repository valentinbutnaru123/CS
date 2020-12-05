Feature: TIC-325
  Scenario: Verify that functionality "Contacts" works as expected
    Given Launch Chrome browser TIC-325
    And Open loving-hermann.com page TIC-325
    Then Press on ”Contacts” button
    Given Enter name, email, subject and message on Contact Form
    And Press on SEND button TIC-325
    Then Close the browser TIC-325
