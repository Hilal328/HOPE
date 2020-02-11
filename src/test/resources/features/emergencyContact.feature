@sprint1 @regression
Feature: addingEmergencyContact

    Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page
    And I have added firstName, middleName and last name
    And I have clicked Save button
    Then I will see Personal Details

  @regression
  Scenario: Adding employee emergency contact details
    And I navigate to emergency contact page
    Then I enter emergency contact detail
      | Name        | Relationship | HomePhoneNumber | MobilePhone   | workphone     |
      | Orhan Pamuk | husband      | 978-954-45-45   | 666-666-66-66 | 777-777-77-77 |
      | Osman Abali | Brother      | 978-954-45-48   | 333-333-33-33 | 444-444-44-44 |
    Then I confirm saved emergency detail  
   