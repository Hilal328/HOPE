package com.syntax.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;
import com.syntax.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Dependents extends CommonMethods {

	@Given("I looged succesfully Hrms web page.")
	public void i_looged_succesfully_Hrms_web_page() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("I navigated to Emplooye list")
	public void i_navigated_to_Emplooye_list() {
		addEmp.navigateToEmloyeeList();
	}

	@When("I entered an exist employee name")
	public void i_entered_an_exist_employee_name(io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> empinfo = dataTable.asMaps();

		for (Map<String, String> map : empinfo) {
			Thread.sleep(2000);
			waitForClickability(emplist.name);
			String name = map.get("FirstName") + " " + map.get("LastName");
			sendText(emplist.name, name);

		}
	}

	@When("I clicked search button on employee list page")
	public void i_clicked_search_button_on_employee_list_page() throws InterruptedException {
		waitForClickability(emplist.searchBtn);
		jsClick(emplist.searchBtn);
		Thread.sleep(3000);
	}

	@Then("I selected the employee on the table")
	public void i_selected_the_employee_on_the_table() throws InterruptedException {
		// emplist.selectEmployee("9177");
		Thread.sleep(3000);
		waitForVisibility(emplist.idCell);
		jsClick(emplist.idCell);
	}

	@Then("I clicked Dependents on the left menu")
	public void i_clicked_Dependents_on_the_left_menu() {
		jsClick(pdetails.dependents);
	}

	@Then("I click add button on Dependents page")
	public void i_click_add_button_on_Dependents_page() {
		jsClick(depend.addButton);
	}

	@Then("I entered Name  , Relationship and DateOfBirth  and saved them.")
	public void i_entered_Name_Relationship_and_DateOfBirth_and_saved_them(DataTable dataTable)
			throws InterruptedException {
		List<Map<String, String>> empDetailList = dataTable.asMaps();

		for (Map<String, String> map : empDetailList) {
			waitForVisibility(depend.name);
			sendText(depend.name, map.get("Name"));
			Thread.sleep(3000);

			selectDdValue(depend.relationships, map.get("Relationship"));

			sendText(depend.dateOfBirth, map.get("DateOfBirth"));

			Thread.sleep(3000);
			jsClick(depend.saveBtn);

			jsClick(depend.addButton);
			Thread.sleep(3000);

		}

	}

	@Then("I uploaded file for the dependents")
	public void i_uploaded_file_for_the_dependents() throws InterruptedException {
		jsClick(depend.addBtnAttach);
		depend.chooseFile.sendKeys(Constants.ATTACH_FILE_PATH);
		Thread.sleep(3000);

		jsClick(depend.uploadFile);
	}

	@Then("I see the dependents added.")
	public void i_see_the_dependents_added() {
		boolean displayedd = depend.addedDepend.isDisplayed();
		Assert.assertTrue(displayedd);
	}

}
