Feature: Add employee qualification

  Background: 
    Given I looged succesfully Hrms web page.
    And I added employees
      | FirstName | LastName |
      | Ataturk   | Gazi     |
      | Ismet     | Inonu    |
      | Celal     | Bayar    |
    And I navigated to Emplooye list

  @regression
  Scenario: Verify to add employee's qualifications
    Given navigate to add employee page
    And add employee "Mustafa" and "Kemal" and save
    When navigate to Qualification page
    Then add work experience of the  employee and save
    And add education of the the first employee and save
    And add skills of the first employee and save
    And add language of the first employee and save
    And add multiple data concerning language qualification
      | Language | Fluency  | Competency | Comments   |
      | Arabic   | Writing  | Poor       | no comment |
      | Russian  | Speaking | Basic      | nothing    |
      | Spanish  | Reading  | Good       |            |
    And add work licence of the first employee and save
    And Add attachment of the first employee and save
