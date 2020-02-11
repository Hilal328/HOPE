@sprint1 @ContactDetails
Feature: ContactDetails
Background: 
    Given I looged succesfully Hrms web page.
    And I added employees
      | FirstName | LastName |
      | Monica    | Smith    |
      | Jessica   | Kirkland |
      | Alex      | Small    |
    And I navigated to Emplooye list
  
  @smoke
  Scenario: Changes employee Contact Details
    When I click Contact Details
    Then I click edit
    And I am able to modify Contact Details
      | AddressStreet1 | AddressStreet2 | City    | State | Zip   | Country       | HomePhone | Mobile   | WorkPhone | WorkEmail          | OtherEmail           |
      | 123 Sky Dr     | Sky Apt        | Houston | TX    | 77469 | United States | 123-4567  | 123-5678 | 123-8520  | Hilal123@gmail.com | birisi23@hotmail.com |
    When I click Save
    And I see Employee Contact details  succesfully edited
And I delete added employees from Employee List
      | FirstName | LastName |
      | Monica    | Smith    |
      | Jessica   | Kirkland |
      | Alex      | Small    |