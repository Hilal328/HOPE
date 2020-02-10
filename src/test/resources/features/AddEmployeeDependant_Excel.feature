@Hope
Feature: AddEmployeeDependant_Excel

  Background: 
    Given I looged succesfully Hrms web page.
    And I added employees
      | FirstName | LastName | Id   |
      | Monica    | Smith    | 8000 |
      | Jessica   | Kirkland | 9000 |
      | Alex      | Small    | 1000 |
    And I navigated to Emplooye list

  Scenario: As an admin I should be able to add employee's dependents
    When I navigate to Emloyee List Page
    And I enter name and click Search button
    And I click on the name in Result Table
    And I click dependants
    And I click Add button
    And I enter dependant name, relationship and date of birth with data in excel at "C:\Users\hvanl\eclipse-workspace\HOPE\src\test\resources\testdata\HrmsTestData.xlsx"
    And I click save button
    Then I see dependant is saves successfully
    And I delete added employees from Employee List
      | FirstName | LastName | Id   |
      | Monica    | Smith    | 8000 |
      | Jessica   | Kirkland | 9000 |
      | Alex      | Small    | 1000 |
