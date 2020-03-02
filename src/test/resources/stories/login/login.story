Login

Meta:
@login

Narrative:
  In order to access aplication
  As a regular user
  I want to be able to login via email


Lifecycle:
Before:
Scope: SCENARIO
Given I open Landing page

Scenario: Successful login
Meta: @login01
When I login with username userEmail and password userPassword
Then I should see Home page

Examples:
|userEmail          |userPassword   |
|matrizzza@gmail.com|!$6gMPQzDN&cE_)|
|matriZZZa@gmail.com|!$6gMPQzDN&cE_)|
