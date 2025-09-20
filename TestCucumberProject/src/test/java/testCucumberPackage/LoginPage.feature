@Regression
Feature: Login Page Feature

Background:
Given I am the user of facebook application
@Smoke @TestCaseNo:1
Scenario:
Login Page Valid Scenario
When I enter username as "abc@gmail.com"
And I enter password as "12345"
Then I should be able to login successfully

@TestCaseNo:2
Scenario:
Login Page Invalid Scenario
When I enter username as "invalid_abc@gmail.com"
And I enter password as "12345"
Then I should not be able to login sussessfully
@Smoke @TestCaseNo:3
Scenario Outline:
Scenario outline feature check
When I enter the user credUsername "<username>"
And I enter the user credPassword  "<password>"
Examples:
|username   | password      |
|validUser1 |validPassword1 |
|validUser2 |validPassword2 |