package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;


public class PersonaDetailsPageElements extends CommonMethods{
	
	@FindBy(xpath="//a[text()='Dependents']")
	public WebElement dependents;
	
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

	public void navigateToEmployeeList() {
		jsClick(pim);
		jsClick(employeeList);
	}
	
	public PersonaDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}	
}
