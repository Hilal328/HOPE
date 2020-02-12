package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;

public class QualificationsPageElements extends CommonMethods{
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmployee;
	
	
	@FindBy(id="firstName")
	public WebElement addFirstName;
	@FindBy(id="lastName")
	public WebElement addlastName;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement saveAddedEmployee;
	
	
	@FindBy(linkText="Qualifications")
	public WebElement qualifications;
	
	@FindBy(id="addWorkExperience")
	public WebElement addWorkExperience;
		@FindBy(id="experience_employer")
		public WebElement company;
		@FindBy(id="experience_jobtitle")
		public WebElement jobTitle;
		@FindBy(id="experience_from_date")
		public WebElement fromDateWorkExperience;
		@FindBy(xpath="//input[@name='experience[to_date]']")
		public WebElement toDateWorkExperience;
		@FindBy(id="experience_comments")
		public WebElement commentWorkSpace;
		@FindBy(id="btnWorkExpSave")
		public WebElement addWorkExperienceSave;
		
		
		
	@FindBy(id="addEducation")
	public WebElement addEducation;
		@FindBy(id="education_code")
		public WebElement addEducationLevel;
		@FindBy(id="education_institute")
		public WebElement addInstitute;
		@FindBy(id="education_major")
		public WebElement addMajorSpecialization;
		@FindBy(id="education_year")
		public WebElement addYear;
		@FindBy(id="education_gpa")
		public WebElement addGPAScore;
		@FindBy(id="education_start_date")
		public WebElement educationStartDate;
		@FindBy(id="education_end_date")
		public WebElement educationEndDate;
		@FindBy(id="btnEducationSave")
		public WebElement addEducationSave;
		
	@FindBy(id="addSkill")
	public WebElement addSkills;
		@FindBy(id="skill_code")
		public WebElement addSkillElement;
		@FindBy(id="skill_years_of_exp")
		public WebElement addYearsOfExperience;
		@FindBy(id="skill_comments")
		public WebElement commentAddSkills;
		@FindBy(id="btnSkillSave")
		public WebElement AddSkillsSave;
		
		
	
	@FindBy(id="addLanguage")
	public WebElement addLanguage;
		@FindBy(id="language_code")
		public WebElement addLanguageCode;
		@FindBy(id="language_lang_type")
		public WebElement addFluency;
		@FindBy(id="language_competency")
		public WebElement addCompetency;
		@FindBy(id="language_comments")
		public WebElement addLanguageComments;
		@FindBy(id="btnLanguageSave")
		public WebElement addLanguageSave;
		
	
	@FindBy(id="addLicense")
	public WebElement addLicence;
		@FindBy(id="license_code")
		public WebElement addLicenceType;
		@FindBy(id="license_license_no")
		public WebElement addLicenceNumber;
		@FindBy(id="license_date")
		public WebElement addLicenceIssuedDate;
		@FindBy(id="license_renewal_date")
		public WebElement addExpiredDate;
		@FindBy(xpath="//input[@id='btnLicenseSave']")
		public WebElement addLicenseSave;
	
	@FindBy(id="btnAddAttachment")
	public WebElement addAttachment;
		@FindBy(id="ufile")
		public WebElement selectFile;
		@FindBy(id="txtAttDesc")
		public WebElement attachmentComment;
		@FindBy(id="btnSaveAttachment")
		public WebElement attachmentUpload;
		
		
		
		
	public QualificationsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);

	}
}
