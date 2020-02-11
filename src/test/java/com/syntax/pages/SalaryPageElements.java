package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;

public class SalaryPageElements {

	@FindBy(linkText = "PIM")
	public WebElement PIMButton;
	
	@FindBy(id = "menu_pim_addEmployee")
	public WebElement AddEmployeeButton;
	
	@FindBy (id="firstName")
	public WebElement employeeFName;
	
	@FindBy (id="lastName")
	public WebElement employeeLName;
	
	@FindBy (id="btnSave")
	public WebElement AddESaveButton;
	
	@FindBy(xpath="//*[@id=\"sidenav\"]/li[7]/a")
	public WebElement salaryButton;

	@FindBy(id="addSalary")
	public WebElement addSalary;
	
	@FindBy(id="salary_sal_grd_code")
	public WebElement payGrade;
	
	@FindBy(id="salary_salary_component")
	public WebElement salaryComponent;
	
	@FindBy(id="salary_payperiod_code")
	public WebElement payFrequincy;
	
	@FindBy (id="salary_currency_id")
	public WebElement currency;
	
	@FindBy (id="salary_basic_salary")
	public WebElement amount;
	
	@FindBy (id="salary_comments")
	public WebElement comments;
	
	@FindBy (id="salary_set_direct_debit")
	public WebElement addDDDetails;
	
	@FindBy (id="directdeposit_account")
	public WebElement accountNumber;
	
	@FindBy (id="directdeposit_account_type")
	public WebElement accountType;
	
	
	@FindBy (id="directdeposit_routing_num")
	public WebElement routingNum;
	
	@FindBy (id="directdeposit_amount")
	public WebElement depositAmount;
	
	@FindBy (id="btnSalarySave")
	public WebElement salarySaveButton;
		
	@FindBy (id="txtAttDesc")
	public WebElement fileComment;
		
	@FindBy(id = "btnAddAttachment")
	public WebElement addButton;
	
	@FindBy(id = "ufile")
	public WebElement chooseFile;

	@FindBy(id = "btnSaveAttachment")
	public WebElement upload;
	
	public SalaryPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
