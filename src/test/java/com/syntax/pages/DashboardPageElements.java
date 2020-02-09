package com.syntax.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;



public class DashboardPageElements extends CommonMethods {
	


	//PIM Menu
	@FindBy(linkText="PIM")
	public WebElement pim;
	//employee list
	@FindBy(linkText="Employee List")
	public WebElement employeeList;
	
	 public DashboardPageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}
	 
	
	 public void navigateToEmployeeList() {
		 jsClick(pim);
		 jsClick(employeeList);
		 		 
	 }
	
	 
}
