package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.syntax.testbase.BaseClass;

public class JobDetailsPageElements extends BaseClass{

	
	@FindBy(xpath="//b[text()='PIM']")
	public WebElement pimBtn;
	
	@FindBy(id = "empPic")
	public WebElement empPicture;
	
	@FindBy(id="btnSave")
	public WebElement editBtn;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(xpath="//ul[@id='sidenav']/li[6]/a")
	public WebElement JobBtn;
	
	@FindBy(id="job_job_title")
	public WebElement JobTitle;
	
	@FindBy(id="notDefinedLabel")
	public WebElement NotDefinedLbl;
	
	@FindBy(id="job_emp_status")
	public WebElement EmpStatus;
	
	@FindBy(id="job_eeo_category")
	public WebElement EmpCat;
	
	@FindBy(id="job_joined_date")
	public WebElement JoinDate;
	
	@FindBy(id="job_sub_unit")
	public WebElement SubUnit;

	@FindBy(id="job_location")
	public WebElement Location;
	
	@FindBy(id="job_contract_start_date")
	public WebElement JobStartDate;
	
	@FindBy(id="job_contract_end_date")
	public WebElement JobEndDate;
	
	@FindBy(id="job_contract_file")
	public WebElement ContractFile;
	
	@FindBy(id="btnSave")
	public WebElement JobDetailSaveBtn;
	
	@FindBy(id="btnTerminateEmployement")
	public WebElement EmpTermiBtn;
	
	@FindBy(id="attachmentActions")
	public WebElement AttachAction;
	
	
	public void selectDate(String year, String month, String day) throws InterruptedException {
		 
		JoinDate.clear();
		JoinDate.click();

		WebElement mnth = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		Select mSelect = new Select(mnth);
		mSelect.selectByVisibleText(month);

		List<WebElement> years = driver.findElements(By.xpath("//select[@class='ui-datepicker-year']/option"));

		for (WebElement yr : years) {
			if (yr.getText().equals(year)) {
				yr.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

		for (WebElement dy : dayList) {
			if (dy.getText().equals(day)) {
				dy.click();
				break;
			}
	
	
		}
	
	}
	
	
	public JobDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}