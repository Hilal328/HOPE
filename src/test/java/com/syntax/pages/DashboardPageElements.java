package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {

	@FindBy(id = "welcome")
	public WebElement welcomeText;

	// PIM Menu
	@FindBy(linkText = "PIM")
	public static WebElement pim;
	// employee list
	@FindBy(linkText = "Employee List")
	public static WebElement employeeList;

	// addEmployee

	@FindBy(id = "menu_pim_addEmployee")
	public WebElement addEmpBtn;

	public static void navigateToEmployeeList() {
		jsClick(pim);
		jsClick(employeeList);

	}

	public void navigateToAddEmployee() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(pim));
		jsClick(pim);
		wait.until(ExpectedConditions.elementToBeClickable(addEmpBtn));
		jsClick(addEmpBtn);
	}

	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
