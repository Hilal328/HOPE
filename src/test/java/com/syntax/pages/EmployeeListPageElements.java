package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;


public class EmployeeListPageElements extends CommonMethods {

	@FindBy(id="empsearch_employee_name_empName")
	public WebElement name;
	 	 
	@FindBy(id = " //div[@class='ac_results']/ul/li")
	public WebElement selectSrchname;
	
	@FindBy(id="empsearch_id")
	public WebElement id;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[2]/a")
	public WebElement idCell;
	
	@FindBy(id="btnDelete")
	public WebElement deleteBtn;
	
	@FindBy(id="dialogDeleteBtn")
	public WebElement deleteConfirmBtn;
	
	@FindBy(css="input.btn.cancel")
	public WebElement cancelDeleteBtn;
	
	@FindBy(css="input[id^=ohrmList_chkSelectRecord]")
	public WebElement empSelectBox;
	
		public void serchByName(String empName) {
		
		sendText(name,empName);
		jsClick(searchBtn);
		
	}
		public EmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

	
	

	
	
	

}
