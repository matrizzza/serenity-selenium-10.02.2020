Login

Meta:
@login

Narrative:
  In order to access aplication
  As a regular user
  I want to be able to login via email

Scenario: Successful login
Given I open Landing page
When I login with username userEmail and password userPassword
Then I should see Home page

Examples:
|userEmail          |userPassword   |
|matrizzza@gmail.com|!$6gMPQzDN&cE_)|
|matriZZZa@gmail.com|!$6gMPQzDN&cE_)|
|MATRIZZZA@gmail.com|!$6gMPQzDN&cE_)|
