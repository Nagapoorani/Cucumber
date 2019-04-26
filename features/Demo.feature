
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Launch demo tours application
    Given I want to launch demotours application
    And verify page title
    Then Close Application
    
 @tag2
  Scenario Outline: Login to demo tours application
    Given I want to launch demotours application
    And Login to demotours by using <username> and <password>
    Then Logout from Application
    Then Close Application
    Examples:
    |username|password|
    |mercury|mercury|
    |test|test|
    
  @tag3
  Scenario Outline: Title of your scenario outline
    Given I want to write step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
