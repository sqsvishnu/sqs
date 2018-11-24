Feature: Policy creation

  @Policy
  Scenario: Create a Policy for an Existing Account
    Given I have an Existing Account
    When Account Summary is Displayed
    And I select a product as Personal Auto
    And I enter the Required Details
    Then Policy Number is generated
