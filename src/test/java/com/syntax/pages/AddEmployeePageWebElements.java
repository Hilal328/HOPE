package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.CommonMethods;

public class AddEmployeePageWebElements extends CommonMethods {

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "middleName")
	public WebElement middleName;

	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(id = "chkLogin")
	public WebElement createLoginDetails;

	@FindBy(id = "user_name")
	public WebElement username;

	@FindBy(id = "user_password")
	public WebElement userPassword;

	@FindBy(id = "re_password")
	public WebElement confirmUserPassword;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;

	@FindBy(css = "input#employeeId")
	public WebElement empId;

	@FindBy(xpath = "//span[@for='firstName']")
	public WebElement firstNameError;

	@FindBy(xpath = "//span[@for='lastName']")
	public WebElement lastNameError;

	// Elements under Admin Button

	@FindBy(xpath = "//b[text()='Admin']")
	public WebElement adminBtn;

	@FindBy(linkText = "User Management")
	public WebElement userManagementBtn;

	// Elements Under PIM Link

	@FindBy(xpath = "//b[text()='PIM']")
	public WebElement pimBtn;

	@FindBy(id = "menu_pim_Configuration")
	public WebElement configurationBtn;

	public void navigateToConfiguration() {
		click(pimBtn);
		click(configurationBtn);
	}

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement employeeListBtn;

	public void navigateToEmployeeList() {
		click(pimBtn);
		click(employeeListBtn);
	}

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmpBtn;

	public void navigateToAddEmployee() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(pimBtn));
		jsClick(pimBtn);
		wait.until(ExpectedConditions.elementToBeClickable(addEmpBtn));
		jsClick(addEmpBtn);
	}

	@FindBy(id = "menu_core_viewDefinedPredefinedReports")
	public WebElement reportsBtn;

	public void navigateToReports() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(pimBtn));
		jsClick(pimBtn);
		wait.until(ExpectedConditions.elementToBeClickable(reportsBtn));
		jsClick(reportsBtn);
	}

	@FindBy(id = "menu_leave_viewLeaveModule")
	public WebElement leaveBtn;

	@FindBy(id = "menu_leave_viewLeaveList")
	public WebElement leaveListBtn;

	public void navigateToLeaveList() {
		click(leaveBtn);
		click(leaveListBtn);
	}

	@FindBy(xpath = "//b[text()='Time']")
	public WebElement timeBtn;

	@FindBy(xpath = "//b[text()='Recruitment']")
	public WebElement recruitmentBtn;

	@FindBy(id = "menu_recruitment_viewCandidates")
	public WebElement candidatesBtn;

	public void navigateToCandidatesPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(recruitmentBtn));
		jsClick(recruitmentBtn);
		wait.until(ExpectedConditions.elementToBeClickable(candidatesBtn));
		jsClick(candidatesBtn);
	}

	public AddEmployeePageWebElements() {
		PageFactory.initElements(driver, this);
	}

}
