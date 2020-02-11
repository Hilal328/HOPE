package com.syntax.steps;


import java.util.List;
import java.util.Map;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class EmployeeSalarySteps extends CommonMethods{
	
	
	
	@Given("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password,  ConfigsReader.getProperty("password"));
	}

	@When("I click login button")
	public void i_click_login_button() {
		click(login.loginBtn);
	}

	@Then("I navigated to Add employee")
	public void i_navigated_to_Add_employee() throws InterruptedException {
	    click(salary.PIMButton);
	    Thread.sleep(1000);
	    click(salary.AddEmployeeButton);
	}

	@Then("I send employee information")
	public void i_send_employee_information() {
		sendText(salary.employeeFName,"Mathew");
		sendText(salary.employeeLName, "jhonson");
	}

	@Then("I click AddEmployee save button")
	public void i_click_AddEmployee_save_button() {
		click(salary.AddESaveButton);
	}

	@Then("I click salary button")
	public void i_click_salary_button() throws InterruptedException {
		click(salary.salaryButton);
		Thread.sleep(1000);
	}

	@When("I click Assigned Salary Components Add button")
	public void i_click_Assigned_Salary_Components_Add_button() {
		click(salary.addSalary);
	}

	@Then("I enter employee Salary details")
	public void i_enter_employee_Salary_details(DataTable dataTable) throws InterruptedException {
	   List<Map<String,String>>salaryMap=dataTable.asMaps();
	   for(Map<String,String>map:salaryMap) {
		   selectDdValue(salary.payGrade,map.get("Pay Grade"));
		   sendText(salary.salaryComponent,map.get("Salary Component"));
		   selectDdValue(salary.payFrequincy,map.get("Pay Frequency"));
		   Thread.sleep(1000);
		   selectDdValue(salary.currency,map.get("Currency"));
		   sendText(salary.amount,map.get("Amount"));
		   sendText(salary.comments,map.get("Comments"));
		   
	   }
	}

	@Then("I click Add Direct Deposit Deatails button")
	public void i_click_Add_Direct_Deposit_Deatails_button() throws InterruptedException {
		click(salary.addDDDetails);
		Thread.sleep(1000);
	}

	@Then("I enter other deatails")
	public void i_enter_other_deatails(DataTable dataTable) {
		List<Map<String,String>>sDetailMap=dataTable.asMaps();
		   for(Map<String,String>map:sDetailMap) {
			   sendText(salary.accountNumber,map.get("Account Number"));
			   selectDdValue(salary.accountType,map.get("Account Type")); 
			   sendText(salary.routingNum,map.get("Routing Number"));
			   sendText(salary.depositAmount,map.get("Amount"));
		   }
	}

	@Then("I click Salary page Save Button")
	public void i_click_Salary_page_Save_Button() {
	    click(salary.salarySaveButton);
	}



	@Then("I added attacments")
	public void i_added_attacments() {
	   jsClick(salary.addButton);
	   salary.chooseFile.sendKeys(Constants.ATTACH_FILE_PATH_SALARY);
	   sendText(salary.fileComment,"The file is uploadad");
	   jsClick(salary.upload);
	}
		

	


}
