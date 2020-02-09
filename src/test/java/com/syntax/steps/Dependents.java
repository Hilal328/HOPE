package com.syntax.steps;

import java.util.List;
import java.util.Map;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

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
		dashboard.navigateToEmployeeList();
	}


@When("I entered an exist employee id")
public void i_entered_an_exist_employee_name() throws InterruptedException {
	//waitForVisibility(emplist.name);
	//jsClick(emplist.name);
    //sendText(emplist.name,"Zeynep");
	
	sendText(emplist.id,"9277");
    Thread.sleep(3000);
}

@When("I clicked search button on employee list page")
public void i_clicked_search_button_on_employee_list_page() {
    jsClick(emplist.searchBtn);
}

@Then("I selected the employee on the table")
public void i_selected_the_employee_on_the_table() {
	//emplist.selectEmployee("9177");
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
	public void i_entered_Name_Relationship_and_DateOfBirth_and_saved_them(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> empDetailList=dataTable.asMaps();
		
		for(Map<String, String> map:empDetailList) {
			waitForVisibility(depend.name);
			sendText(depend.name,map.get("Name"));
			Thread.sleep(3000);
		    
		    selectDdValue(depend.relationships,map.get("Relationship"));
		    
		    sendText(depend.dateOfBirth,map.get("DateOfBirth"));
		    jsClick(depend.saveBtn);
		    Thread.sleep(3000);
		    jsClick(depend.addButton);
		    Thread.sleep(3000);
		   
		}
		 
	}


@Then("I see the dependents added.")
public void i_see_the_dependents_added() {
    System.out.println("succes");
}





}
