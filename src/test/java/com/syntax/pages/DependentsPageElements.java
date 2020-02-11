package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;

public class DependentsPageElements extends CommonMethods{

	@FindBy(id = "btnAddDependent")
	public WebElement addButton;

	@FindBy(id = "dependent_name")
	public WebElement name;

	@FindBy(xpath = "//select[@id='dependent_relationshipType']")
	public WebElement relationships;

	@FindBy(xpath = "//input[@id='dependent_dateOfBirth']")
	public WebElement dateOfBirth;

	@FindBy(xpath = "//input[@id='btnSaveDependent']")
	public WebElement saveBtn;

	@FindBy(id = "btnAddAttachment")
	public WebElement addBtnAttach;

	@FindBy(id = "ufile")
	public WebElement chooseFile;

	@FindBy(id = "btnSaveAttachment")
	public WebElement uploadFile;

	@FindBy(xpath = "//table[@id='dependent_list']/tbody/tr/td[2]")
	public WebElement addedDepend;

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

	public DependentsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
