Login

Meta:
@login

Narrative:
  In order to access aplication
  As a regular user
  I want to be able to login via email

Scenario: Successful login
Given I open Landing page
When I login with username 'matrizzza@gmail.com' and password '!$6gMPQzDN&cE_)'
Then I should see Home page
