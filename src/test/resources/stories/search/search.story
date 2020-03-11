Login

Meta:
@search

Narrative:
  In order to find HR
  As a regular user
  I want to be able to serach by text "HR"


Lifecycle:
Before:
Scope: SCENARIO
Given I open Landing page
And I login with username matrizzza@gmail.com and password !$6gMPQzDN&cE_)

Scenario: Successful search for "HR"
When I enter search term 'HR' in search field
Then I should see search result HR

