@base
Feature: Sample Child Module feature file

  Scenario Outline: API GET call sample scenario
    Given The valid google endpoint
    When I send a get request to the google endpoint
    Then Messages should come back to verify <endpoint>
    And Try to get secret from Vault
    And You should get <status> code
    Examples:
      | endpoint   | status |
      | GOOGLE_URL | 200    |
