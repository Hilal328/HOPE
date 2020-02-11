package com.syntax.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class ContactDetailsStep extends CommonMethods {
	@When("I add firstName, middleName and last name")
	public void i_add_firstName_middleName_and_last_name() {
		sendText(addEmp.firstName, "Alex");
		sendText(addEmp.middleName,  "De");
		sendText(addEmp.lastName,  "Souza");   
	}

	@Then("I click Save button")
	public void i_click_Save_button() {
	    click(addEmp.saveBtn);
	}

	@Then("I see Personal Details")
	public void i_see_Personal_Details() {
	    boolean displayed=pdetails.empPicture.isDisplayed();
	   Assert.assertTrue("Employee picture is NOT displayed", displayed);
	}

	@When("I click Contact Details")
	public void i_click_Contact_Details() {
		click(contact.contactDetail);
		
	}

	@Then("I click edit")
	public void i_click_edit() {
		click(contact.editSaveBtn);  
	}

	@Then("I am able to modify Contact Details")
	public void i_am_able_to_modify_Contact_Details(DataTable data) {
	    List<Map<String,String>> contactDetails=data.asMaps();
	    for(Map<String, String>contactDtl:contactDetails) {
	    	sendText(contact.empStreet1,contactDtl.get("AddressStreet1"));
	    	sendText(contact.empStreet2,contactDtl.get("AddressStreet2"));
	    	sendText(contact.empCity,contactDtl.get("City"));
	    	sendText(contact.empState,contactDtl.get("State"));
	    	sendText(contact.empZip,contactDtl.get("Zip"));
	    	selectDdValue(contact.contactCountry, contactDtl.get("Country"));
	    	sendText(contact.empHomePhone,contactDtl.get("HomePhone"));
	    	sendText(contact.empMobile,contactDtl.get("Mobile"));
	    	sendText(contact.empWorkPhone,contactDtl.get("WorkPhone"));
	    	sendText(contact.empWorkEmail,contactDtl.get("WorkEmail"));
	    	sendText(contact.empOtherEmail,contactDtl.get("OtherEmail"));

	    }
	}

	@When("I see Employee Contact details  succesfully edited")
	public void i_see_Employee_Contact_details_succesfully_edited() {
	    boolean displayedPic=contact.empPicture.isDisplayed();
	    Assert.assertTrue("Employee picture is NOT displayed", displayedPic);
	}


}
