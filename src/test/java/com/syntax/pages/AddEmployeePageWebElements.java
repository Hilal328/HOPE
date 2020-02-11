package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.CommonMethods;


public class AddEmployeePageWebElements extends CommonMethods{

	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="chkLogin")
	public WebElement createLoginDetails;
	
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement userPassword;
	
	@FindBy(id="re_password")
	public WebElement confirmUserPassword;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(css="input#employeeId")
	public WebElement empId;
	
	@FindBy(xpath="//span[@for='firstName']")
	public WebElement firstNameError;
	
	@FindBy(xpath="//span[@for='lastName']")
	public WebElement lastNameError;
	
	// PIM Menu
	@FindBy(linkText = "PIM")
	public static WebElement pim;
	// employee list
	@FindBy(linkText = "Employee List")
	public static WebElement employeeList;

	
	public AddEmployeePageWebElements() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToEmloyeeList() {
		jsClick(pim);
		jsClick(employeeList);
		
	}
}
