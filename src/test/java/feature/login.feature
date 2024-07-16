Feature: Login page

@positive
Scenario: Validate login page
Given User is on login page
When User enters username as "demosalesmanager" and password as "crmsfa"
And user clicks on login button
Then User should be able to login successfully


@negative
Scenario: Validate login page
Given User is on login page
When User enters username as "demosalesmanager" and password as "crmsfas"
And user clicks on login button
Then User should not be able to login successfully