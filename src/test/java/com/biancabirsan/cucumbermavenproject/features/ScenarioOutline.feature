Feature: Final Cost Calculation

@ScenariOutlineExample
Scenario Outline: Customer Loan Interest Calculation
Given I have a Customer
And user enters principal <principal>
And Interest rate is <interestRate>
And period time <time> years
Then final total cost owned is <totalcost>
Examples:
|principal|interestRate|time|totalcost|
|1000     |10          |2   |1200     |
|2000     |6           |3   |2360     |
|1500     |5           |5   |1875     |
