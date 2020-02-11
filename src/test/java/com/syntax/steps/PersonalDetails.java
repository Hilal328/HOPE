package com.syntax.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.Constants;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class PersonalDetails extends CommonMethods{

	@When("I modify employee's personal deatils")
	public void i_modify_employee_s_personal_deatils(DataTable dataTable) {
		
		List<Map<String, String>> modifyList = dataTable.asMaps();

		for (Map<String, String> map : modifyList) {
			
			waitForClickability(pdetails.edit_Save);
			jsClick(pdetails.edit_Save);
			sendText(pdetails.middleName, map.get("MiddleName"));
			sendText(pdetails.otherId, map.get("OtherId"));
			sendText(pdetails.driverLicense, map.get("DriverLisence"));
			sendText(pdetails.LicExpDate, map.get("ExperationDate"));
			sendText(pdetails.SSN, map.get("SSN"));
			sendText(pdetails.SIN, map.get("SIN"));
			clickRadio(pdetails.gender,map.get("Gender"));
			waitForClickability(pdetails.maritalStatus);
			selectDdValue(pdetails.maritalStatus,map.get("MaritalStatus"));
			selectDdValue(pdetails.nationality, map.get("Nationality"));
			sendText(pdetails.DOB, map.get("DOB"));
			sendText(pdetails.nickName, map.get("NickName"));
			clickRadio(pdetails.smoker, map.get("Smoker"));
			sendText(pdetails.militaryService, map.get("MilitaryService"));
			
		}
		click(pdetails.edit_Save);
			
	}

	@Then("I see employee details modified")
	public void i_see_employee_details_modified() {
	   String name = pdetails.profileName.getText();
	   Assert.assertEquals("Names do not match","Kristen Jane Bell" , name);
	}

	@Then("I add attachment and write comment")
	public void i_add_attachment_and_write_comment() {
	   jsClick(pdetails.addAttachment);
	   sendText(pdetails.chooseFile, Constants.ADD_ATTACHMENT_FILE_PATH);
	   sendText(pdetails.comment, "I tested file attachment and comment");
	   jsClick(pdetails.attachmentUpload);
	}
}
