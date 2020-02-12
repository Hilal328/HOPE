package com.syntax.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class QualificationPageSteps extends CommonMethods{
	
	@Given("navigate to add employee page")
	public void navigate_to_add_employee_page() throws InterruptedException {
	    click(qualification.PIM);
		click(qualification.addEmployee);
		Thread.sleep(2000);
		
	}

	@Given("add employee first and last name and save")
	public void add_employee_first_and_last_name_and_save() {
//	    sendText(qualification.addFirstName, "Mistik");
//		sendText(qualification.addlastName, "Ses");
//		click(qualification.saveAddedEmployee);
		
	}
	
	@Given("add employee {string} and {string} and save")
	public void add_employee_and_and_save(String firstName, String lastName) {
		sendText(qualification.addFirstName, firstName);
		sendText(qualification.addlastName, lastName);
		click(qualification.saveAddedEmployee);  
	}

	@When("navigate to Qualification page")
	public void navigate_to_Qualification_page() {
	   click(qualification.qualifications);
	}

	@When("add work experience of the  employee and save")
	public void add_work_experience_of_the_employee_and_save() throws InterruptedException {
	   jsClick(qualification.addWorkExperience);
	   sendText(qualification.company, "syntax");
	   sendText(qualification.jobTitle, "developer");
	   sendText(qualification.fromDateWorkExperience, "2016-02-04");
	   sendText(qualification.toDateWorkExperience, "2020-01-01");
	   sendText(qualification.commentWorkSpace, "...");
	   click(qualification.addWorkExperienceSave);
	   Thread.sleep(2000);
	   
	}

	@Then("see work experience {string}")
	public void see_work_experience(String string) {
	  //String alertTextActual= getAlertText();
	  System.out.println(getAlertText());
//	  String expected="Successfully Saved";
//	  Assert.assertEquals(expected, alertTextActual);
	}

	@Then("add education of the the first employee and save")
	public void add_education_of_the_first_employee_and_save() throws InterruptedException {
	   jsClick(qualification.addEducation);
	   selectDdValue(qualification.addEducationLevel, "MBA");
	   sendText(qualification.addInstitute, "UTD");
	   sendText(qualification.addMajorSpecialization, "Business");
	   sendText(qualification.addYear, "10");
	   sendText(qualification.addGPAScore, "88");
	   sendText(qualification.educationStartDate, "2010-02-01");
	   sendText(qualification.educationEndDate, "2014-01-01");
	   click(qualification.addEducationSave);
	   Thread.sleep(2000);
	}

	@Then("see education {string}")
	public void see_education(String string) {
	   
	}

	@Then("add skills of the first employee and save")
	public void add_skills_of_the_first_employee_and_save() throws InterruptedException {
	  jsClick(qualification.addSkills);
	  selectDdValue(qualification.addSkillElement, "Java");
	  sendText(qualification.addYearsOfExperience, "10");
	  sendText(qualification.commentAddSkills, "no comment");
	  click(qualification.AddSkillsSave);
	  Thread.sleep(2000);
	}

	@Then("see skills {string}")
	public void see_skills(String string) {
	   
	}

	@Then("add language of the first employee and save")
	public void add_language_of_the_first_employee_and_save() throws InterruptedException {
	    jsClick(qualification.addLanguage);
	    selectDdValue(qualification.addLanguageCode, "Turkish");
	    selectDdValue(qualification.addFluency, "Writing");
	    selectDdValue(qualification.addCompetency, "Good");
	    sendText(qualification.addLanguageComments, "no comment");
	    click(qualification.addLanguageSave);
	    Thread.sleep(2000);
	    
	}
	
	@Then("add multiple data concerning language qualification")
	public void add_multiple_data_concerning_language_qualification(DataTable language) {
	
	List <Map<String, String>> addLanguage= language.asMaps();
	
	for( Map<String, String> map:addLanguage) {
		jsClick(qualification.addLanguage);
		selectDdValue(qualification.addLanguageCode, map.get("Language"));
		selectDdValue(qualification.addFluency, map.get("Fluency"));
		selectDdValue(qualification.addCompetency, map.get("Competency"));
		sendText(qualification.addLanguageComments, map.get("Comments"));
		click(qualification.addLanguageSave);
	}
	}

	@Then("see language {string}")
	public void see_language(String string) {
	   
	}

	@Then("add work licence of the first employee and save")
	public void add_work_licence_of_the_first_employee_and_save() throws InterruptedException {
	  jsClick(qualification.addLicence);
	  selectDdValue(qualification.addLicenceType, "Private");
	  sendText(qualification.addLicenceNumber, "K192837");
	  sendText(qualification.addLicenceIssuedDate, "2018-01-02");
	  sendText(qualification.addExpiredDate, "2022-01-02");
	  click(qualification.addLicenseSave);
	  Thread.sleep(2000);
	}

	@Then("see licence {string}")
	public void see_licence(String string) {
	    
	}

	@Then("Add attachment of the first employee and save")
	public void add_attachment_of_the_first_employee_and_save() {
	  jsClick(qualification.addAttachment);
	  qualification.selectFile.sendKeys(Constants.ATTACHED_FILE_PATH);
	  sendText(qualification.attachmentComment, "no non non");
	  click(qualification.attachmentUpload);
	  
	}

	@Then("see attachment {string}")
	public void see_attachment(String string) {
	   
	}
}
