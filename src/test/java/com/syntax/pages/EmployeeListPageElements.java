package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;


public class EmployeeListPageElements extends CommonMethods {

	@FindBy(id="empsearch_employee_name_empName")
	public WebElement name;
	
	@FindBy(id="empsearch_id")
	public WebElement id;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[2]/a")
	public WebElement idCell;
	
		public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void serchByName(String empName) {
		
		sendText(name,empName);
		jsClick(searchBtn);
		
	}
	
	

	
	
	

}
