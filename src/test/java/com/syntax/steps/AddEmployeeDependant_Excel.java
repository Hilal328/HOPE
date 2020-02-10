package com.syntax.steps;

import java.util.List;
import java.util.Map;

import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmployeeDependant_Excel extends CommonMethods {
	

	@Given("I added employees")
	public void i_added_employees(DataTable dataTable) throws InterruptedException {
		dashboard.navigateToAddEmployee();
		List<Map<String, String>> empinfo = dataTable.asMaps();

		for (Map<String, String> map : empinfo) {
			sendText(addEmp.firstName, map.get("FirstName"));
			sendText(addEmp.lastName, map.get("LastName"));
			jsClick(addEmp.saveBtn);
			Thread.sleep(1000);
			dashboard.navigateToAddEmployee();
			Thread.sleep(1000);
		}
	}

	@When("I navigate to Emloyee List Page")
	public void i_navigate_to_Emloyee_List_Page() {
		System.out.println("To be continued");
	}

	@When("I enter name and click Search button")
	public void i_enter_name_and_click_Search_button() {
		System.out.println("To be continued");
	}

	@When("I click on the name in Result Table")
	public void i_click_on_the_name_in_Result_Table() {
		System.out.println("To be continued");
	}

	@When("I click dependants")
	public void i_click_dependants() {
		System.out.println("To be continued");
	}

	@When("I click Add button")
	public void i_click_Add_button() {
		System.out.println("To be continued");
	}

	@When("I enter dependant name, relationship and date of birth with data in excel at {string}")
	public void i_enter_dependant_name_relationship_and_date_of_birth_with_data_in_excel_at(String string) {
		System.out.println("To be continued");
	}

	@When("I click save button")
	public void i_click_save_button() {
		System.out.println("To be continued");
	}

	@Then("I see dependant is saves successfully")
	public void i_see_dependant_is_saves_successfully() {
		System.out.println("To be continued");
	}

	@Then("I delete added employees from Employee List")
	public void i_delete_added_employees_from_Employee_List(DataTable dataTable) throws InterruptedException {
		
		pdetails.navigateToEmployeeList();
		
		List<Map<String, String>> empinfo = dataTable.asMaps();
		
		for (Map<String, String> map : empinfo) {
			waitForClickability(emplist.name);
			String name=map.get("FirstName")+" "+map.get("LastName");
			sendText(emplist.name, name);
			jsClick(emplist.searchBtn);
			jsClick(emplist.empSelectBox);
			jsClick(emplist.deleteBtn);
			jsClick(emplist.deleteConfirmBtn);
		}
	}
}
