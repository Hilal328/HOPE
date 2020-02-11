@sprint1 @regression
Feature: AddEmployeeDependant_Scenario_Outline

  Scenario Outline: As an admin I should be able to add employee's dependents
    Given I logged succesfully in Hrms web page and navigate to Add Employee page
    And I added "<FirstName>" and "<LastName>" of the employee and click on save button
    And I navigated to Emplooye list
    When I entered "<FirstName>" and "<LastName>" of and existing employee and click search button
    And I selected the employee on the table
    And I clicked Dependents on the left menu
    And I click add button on Dependents page
    And I enter dependant "<Name1>", "<Relationship1>", "<DateOfBirth1>" and click save button
    And I enter dependant "<Name2>", "<Relationship2>", "<DateOfBirth2>" and click save button
    And I enter dependant "<Name3>", "<Relationship3>", "<DateOfBirth3>" and click save button
    Then I see the dependents added.
    #And I delete "<FirstName>" "<LastName>" from Employee List

    Examples: 
      | FirstName | LastName | Name1  | Relationship1 | DateOfBirth1 | Name2   | Relationship2 | DateOfBirth2 | Name3   | Relationship3 | DateOfBirth3 |
      | Michael   | Owen     | Brian  | Child         | 2002-06-06   | Amanda  | Other         | 2003-03-03   | Steven  | Child         | 2004-04-04   |
      #| George    | Hagi     | Ianis  | Child         | 2000-10-10   | Elena   | Child         | 2001-01-01   | Preslov | Child         | 2012-12-12   |
      #| Sofian    | Feghuili | Yousef | Child         | 2015-10-15   | Yassine | Child         | 2017-01-31   | Omer    | Child         | 2019-07-19   |
