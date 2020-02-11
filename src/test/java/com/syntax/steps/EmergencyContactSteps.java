package com.syntax.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class EmergencyContactSteps extends CommonMethods{
	
	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
	    login.login("Admin", "Syntax@123");
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() {
	   dashboard.navigateToAddEmployee();
	}
	@Given("I have added firstName, middleName and last name")
	public void i_have_added_firstName_middleName_and_last_name() {
		  sendText(addEmp.firstName, "Orhan");
		  sendText(addEmp.middleName, "Gencebay");
		  sendText(addEmp.lastName, "abi");
	}

	@Given("I have clicked Save button")
	public void i_have_clicked_Save_button() {
	    click(addEmp.saveBtn);
	}

	@Then("I will see Personal Details")
	public void i_will_see_Personal_Details() {
	   boolean displayed=pdetails.empPicture.isDisplayed();
	 Assert.assertTrue("Employee pic is not displayed", displayed);
	}


	@Then("I navigate to emergency contact page")
	public void i_navigate_to_emergency_contact_page() throws InterruptedException {
		Thread.sleep(5000);
	pdetails.emergencyContact.click();
	Thread.sleep(5000);
	}

	@Then("I enter emergency contact detail")
	public void i_enter_emergency_contact_detail(DataTable data) throws InterruptedException {
	   List<Map<String, String>> emergencyList=data.asMaps();
	   for(Map<String, String> emgC:emergencyList) {
		   jsClick(emergency.addButtonForEmergency);
		   sendText(emergency.emgName, emgC.get("Name"));
		   sendText(emergency.emgRelationship,emgC.get("Relationship"));
		   sendText(emergency.emgHomeTel, emgC.get("HomePhoneNumber"));
		   sendText(emergency.emgMobileTel, emgC.get("MobilePhone"));
		   sendText(emergency.emgWorkTel, emgC.get("workphone"));
		   Thread.sleep(3000);
		   jsClick(emergency.EmgSaveBtnCon);
	   }
	}

	@Then("I confirm saved emergency detail")
	public void i_confirm_saved_emergency_detail() {
	   boolean displayedPic=emergency.empPicture.isDisplayed();
	 Assert.assertTrue("Employee pic is not displayed", displayedPic);
	}


}
