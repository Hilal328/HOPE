@sprint1 @regression
Feature: jobDetail

  Background: 
    Given I looged succesfully Hrms web page.
    And I added employees
      | FirstName | LastName |
      | Amanda    | Simpsons |
      | Julia     | Stiles   |
      | Alexandra | Taylor   |
    And I navigated to Emplooye list

  @regression
  Scenario: Employee Add Job Details
    When I entered an exist employee name
      | FirstName | LastName |
      | Amanda    | Simpsons |
    And I clicked search button on employee list page
    And I selected the employee on the table
    And i navigate to jobDetail page
    Then i enter jobDetail info
      | JobTitle | EmpStatus | JobCat        | JoinYear | JoinMonth | JoinDay |
      | Tester   | Employee  | Professionals |     2003 | Feb       |       2 |
    And i click job save button
    Then i confirm saved jobDetail
    #And I delete added employees from Employee List
      #| FirstName | LastName |
      #| Amanda    | Simpsons |
      #| Julia     | Stiles   |
      #| Alexandra | Taylor   |
