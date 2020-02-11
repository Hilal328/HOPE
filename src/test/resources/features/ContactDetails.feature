@sprint1 @regression
Feature: ContactDetails

	Background: 
    Given I looged succesfully Hrms web page.
    Given I added employees
      | FirstName | LastName |
      | Monica    | Smith    |
      | Jessica   | Kirkland |
      | Alex      | Small    |
    And I navigated to Emplooye list
  
  @regression
	Scenario: Changes employee Contact Details
  When I entered an exist employee name
      | FirstName | LastName |
      | Monica    | Smith    |
    And I clicked search button on employee list page
    Then I selected the employee on the table
    And I click Contact Details
    Then I click edit
    And I am able to modify Contact Details
      | AddressStreet1 | AddressStreet2 | City    | State | Zip   | Country       | HomePhone | Mobile   | WorkPhone | WorkEmail          | OtherEmail           |
      | 123 Sky Dr     | Sky Apt        | Houston | TX    | 77469 | United States | 123-4567  | 123-5678 | 123-8520  | Hilal123@gmail.com | birisi23@hotmail.com |
    Then I click Save
    And I see Employee Contact details succesfully edited
#		Then I delete added employees from Employee List
      #| FirstName | LastName |
      #| Monica    | Smith    |
      #| Jessica   | Kirkland |
      #| Alex      | Small    |