package com.syntax.steps;

import java.util.List;
import java.util.Map;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmployeeDependant_Scenario_Outline extends CommonMethods {

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

	@Given("I logged succesfully in Hrms web page and navigate to Add Employee page")
	public void i_logged_succesfully_in_Hrms_web_page_and_navigate_to_Add_Employee_page() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
	}

	@Given("I added {string} and {string} of the employee and click on save button")
	public void i_added_and_of_the_employee_and_click_on_save_button(String string, String string2) {
		waitForClickability(addEmp.firstName);
		sendText(addEmp.firstName, string);
		sendText(addEmp.lastName, string2);
		click(addEmp.saveBtn);
	}

	@When("I entered {string} and {string} of and existing employee and click search button")
	public void i_entered_and_of_and_existing_employee(String string, String string2) throws InterruptedException {
		Thread.sleep(2000);
		String name=string + " " + string2;
		waitForClickability(emplist.name);
		sendText(emplist.name, name);
		Thread.sleep(2000);
		jsClick(emplist.searchBtn);
	}

	@When("I enter dependant {string}, {string}, {string} and click save button")
	public void i_enter_dependant_one_and_click_save_button(String string, String string2, String string3) {
		waitForClickability(depend.name);
		sendText(depend.name, string);
		selectDdValue(depend.relationships, string2);
		sendText(depend.dateOfBirth, string3);
		jsClick(depend.saveBtn);
		jsClick(depend.addButton);
	}

	@Then("I delete {string} {string} from Employee List")
	public void i_delete_from_Employee_List(String string, String string2) throws InterruptedException {
		Thread.sleep(1000);
		depend.navigateToEmployeeList();
		Thread.sleep(1000);
		String name = string+" " + string2;
		sendText(emplist.name, name);
		Thread.sleep(2000);
		jsClick(emplist.searchBtn);
		jsClick(emplist.empSelectBox);
		jsClick(emplist.deleteBtn);
		jsClick(emplist.deleteConfirmBtn);
	}

	@Then("I delete added employees from Employee List")
	public void i_delete_added_employees_from_Employee_List(DataTable dataTable) throws InterruptedException {

		depend.navigateToEmployeeList();

		List<Map<String, String>> empinfo = dataTable.asMaps();

		for (Map<String, String> map : empinfo) {
			waitForClickability(emplist.name);
			String name = map.get("FirstName") + " " + map.get("LastName");
			sendText(emplist.name, name);
			jsClick(emplist.searchBtn);
			jsClick(emplist.empSelectBox);
			jsClick(emplist.deleteBtn);
			jsClick(emplist.deleteConfirmBtn);
		}
	}
}
