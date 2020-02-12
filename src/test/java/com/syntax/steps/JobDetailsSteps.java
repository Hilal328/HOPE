package com.syntax.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class JobDetailsSteps extends CommonMethods{
	
   @Then("i navigate to jobDetail page")
	public void i_navigate_to_jobDetail_page() {
		pdetails.JobBtn.click();
		job.editBtn.click();
	}

	@Then("i enter jobDetail info")
	public void i_enter_jobDetail_info(DataTable data) throws InterruptedException {
		List<Map<String, String>> perJobDetail=data.asMaps();		
		for(Map<String, String> perJob:perJobDetail) {		
			selectDdValue(job.JobTitle,  perJob.get("JobTitle"));
			selectDdValue(job.EmpStatus,  perJob.get("EmpStatus"));
			selectDdValue(job.EmpCat, perJob.get("JobCat"));
			 Thread.sleep(3000);
			 //sendText(JobDetail.JoinDate, perJob.get("JoinDate"));
			 job.selectDate(perJob.get("JoinYear"), perJob.get("JoinMonth"), perJob.get("JoinDay"));
			 Thread.sleep(3000);
		}	 
	}
	@Then("i click job save button")
	public void i_click_job_save_button() {
		job.saveBtn.click();
	}

	@Then("i confirm saved jobDetail")
	public void i_confirm_saved_jobDetail() {
		 boolean isDisplayed=job.empPicture.isDisplayed();
		Assert.assertTrue(isDisplayed);
	     
	}


}
