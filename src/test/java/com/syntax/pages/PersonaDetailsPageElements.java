package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;


public class PersonaDetailsPageElements {
	
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
	
	public PersonaDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}	
}
