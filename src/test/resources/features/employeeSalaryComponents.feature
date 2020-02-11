Feature: US 18804: As an admin I should be able to add employee's salary components
  

  Background: 
    Given I enter valid username and valid password
    When I click login button
	@smoke
  Scenario: Assigned Salary Components
    Then I navigated to Add employee
    And I send employee information
    Then I click AddEmployee save button
    Then I click salary button
    When I click Assigned Salary Components Add button
    Then I enter employee Salary details
      | Pay Grade        | Salary Component | Pay Frequency | Currency             | Amount | Comments                         |
      | batuhan sutceker | Basic Salary     | Monthly       | United States Dollar |   8000 | this salary not contains bonuses |
    And I click Add Direct Deposit Deatails button
    Then I enter other deatails
      | Account Number   | Account Type | Routing Number | Amount |
      | 1245254825477896 | Checking     |      123456789 |  12000 |
    And I click Salary page Save Button
    And I added attacments
   