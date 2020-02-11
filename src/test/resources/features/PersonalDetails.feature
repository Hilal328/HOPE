@sprint1 @regression
Feature: Modify employee personal details

  Background: 
    Given I looged succesfully Hrms web page.
    And I added employees
      | FirstName | LastName |
      | Monica    | Smith    |
    And I navigated to Emplooye list

  @regression
  Scenario: As an admin I should be able to modify employee's personal details
    When I entered an exist employee name
      | FirstName | LastName |
      | Monica    | Smith    |
    And I clicked search button on employee list page
    And I selected the employee on the table
    And I modify employee's personal deatils
      | MiddleName | OtherId | DriverLisence | ExperationDate | SSN         | SIN     | Gender | MaritalStatus | Nationality | DOB        | NickName | Smoker | MilitaryService |
      | Jane       |    1200 | N7878774      | 2021-12-08     | 123-43-6789 | 7648567 | Female | Married       | American    | 1980-10-10 | Monic    | Smoker | Not Required    |
    Then I see employee details modified
    And I add attachment and write comment
    #And I delete added employees from Employee List
      #| FirstName | LastName |
      #| Monica    | Smith    |
