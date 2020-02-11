package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;


public class PersonaDetailsPageElements extends CommonMethods{
	
	@FindBy(xpath="//a[text()='Dependents']")
	public WebElement dependents;
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement empid;
	
	@FindBy(xpath="//a[text()='Contact Details']")
	public WebElement contactDetails;
	
	@FindBy(xpath="//a[text()='Emergency Contacts']")
	public WebElement emergencyContact;
	
	@FindBy(xpath="//a[text()='Immigration']")
	public WebElement immigration;
	
	@FindBy(xpath="//a[text()='Job']")
	public WebElement job;
	
	@FindBy(xpath="//a[text()='Salary']")
	public WebElement salary;
	
	@FindBy(xpath="//a[text()='Tax Exemptions']")
	public WebElement taxExemption;
	
	@FindBy(xpath="//a[text()='Report-to']")
	public WebElement reportTo;
	
	@FindBy(xpath="//a[text()='Qualifications']")
	public WebElement qualifications;
	
	@FindBy(xpath="//a[text()='Memberships']")
	public WebElement memberships;
	
	// PIM Menu
	@FindBy(linkText = "PIM")
	public static WebElement pim;
	// employee list
	@FindBy(linkText = "Employee List")
	public static WebElement employeeList;

	// addEmployee

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmpBtn;
	
	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement profileName;
	
	@FindBy(xpath = "//input[@id='photofile']")
	public WebElement chooseFilebtn;
	
	@FindBy(id="personal_txtEmpFirstName")
	public WebElement firstName;
	
	@FindBy(id="personal_txtEmpMiddleName")
	public WebElement middleName;
	
	@FindBy(id="personal_txtEmpLastName")
	public WebElement lastName;
	
	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(id="personal_txtOtherID")
	public WebElement otherId;
	
	@FindBy(id = "personal_txtLicenNo")
	public WebElement driverLicense;
	
	@FindBy(id="personal_txtLicExpDate")
	public WebElement LicExpDate;
	
	@FindBy(xpath ="//input[@id='personal_txtLicExpDate']/following-sibling::img")
	public WebElement licExpDateCalendar;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	public WebElement selectMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	public WebElement selectYear;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public WebElement date;
	
	@FindBy(id="personal_txtNICNo")
	public WebElement SSN;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement SIN;
	
	@FindBy(xpath="//label[contains(@for,'personal_optGender')]")
	public List<WebElement> gender;
	
	@FindBy(id="personal_cmbMarital")
	public WebElement maritalStatus;
	
	@FindBy(id="personal_cmbNation")
	public WebElement nationality;
	
	@FindBy(id="personal_DOB")
	public WebElement DOB;
	
	@FindBy(id="//input[@id='personal_DOB']/following::img")
	public WebElement DOBCalendar;
	
	@FindBy(id="personal_txtEmpNickName")
	public WebElement nickName;
	
	@FindBy(xpath="//label[contains(@for,'personal_chkSmokeFlag')]")
	public List<WebElement> smoker;
	
	
	@FindBy(id="personal_txtMilitarySer")
	public WebElement militaryService;
	
	@FindBy(id ="btnSave")
	public WebElement edit_Save;
	
	@FindBy(xpath = " //input[@id='btnAddAttachment']")
	public WebElement addAttachment;
	
	@FindBy(id="ufile")
	public WebElement chooseFile;
	
	
	@FindBy(id="txtAttDesc")
	public WebElement comment;
	
	@FindBy(id="btnSaveAttachment")
	public WebElement attachmentUpload;
	
	@FindBy(xpath = "//img[@id='empPic']")
	public WebElement empPic;

	public void navigateToEmployeeList() {
		jsClick(pim);
		jsClick(employeeList);
	}
	
	public PersonaDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}	
}
