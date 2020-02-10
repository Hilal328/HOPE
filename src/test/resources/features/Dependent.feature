@sprint1 @login
Feature: Login

  Background: 
    Given I looged succesfully Hrms web page.
    And I added employees
      | FirstName | LastName |
      | Monica    | Smith    |
    And I navigated to Emplooye list

  @zeynep
  Scenario: Adding  dependents to an existing employee
    When I entered an exist employee name
      | FirstName | LastName |
      | Monica    | Smith    |
    And I clicked search button on employee list page
    Then I selected the employee on the table
    And I clicked Dependents on the left menu
    Then I click add button on Dependents page
    And I entered Name  , Relationship and DateOfBirth  and saved them.
      | Name    | Relationship | DateOfBirth |
      | Nilufer | Child        | 2015-01-15  |
      | Berrin  | Child        | 2010-08-14  |
      | Ali     | Child        | 1987-02-13  |
    And I uploaded file for the dependents
    And I see the dependents added.
    And I delete added employees from Employee List
      | FirstName | LastName |
      | Monica    | Smith    |
