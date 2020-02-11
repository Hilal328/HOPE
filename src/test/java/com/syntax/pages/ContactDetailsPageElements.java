package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;



public class ContactDetailsPageElements extends CommonMethods {
	@FindBy(linkText = "Contact Details")
	public WebElement contactDetail;
	
	@FindBy(id = "btnSave")
	public WebElement editSaveBtn;
	
	@FindBy(id = "contact_street1")
	public WebElement empStreet1;
	
	@FindBy(id = "contact_street2")
	public WebElement empStreet2;
	
	@FindBy(id = "contact_city")
	public WebElement empCity;
	
	@FindBy(id = "contact_province")
	public WebElement empState;
	
	@FindBy(id = "contact_emp_zipcode")
	public WebElement empZip;
	
	@FindBy(id = "contact_country")
	public WebElement contactCountry;
	
	@FindBy(name = "contact[emp_hm_telephone]")
	public WebElement empHomePhone;
	
	@FindBy(name = "contact[emp_mobile]")
	public WebElement empMobile;
	
	@FindBy(name = "contact[emp_work_telephone]")
	public WebElement empWorkPhone;
	
	@FindBy(id = "contact_emp_work_email")
	public WebElement empWorkEmail;
	
	@FindBy(id = "contact_emp_oth_email")
	public WebElement empOtherEmail;
	
	@FindBy(id = "empPic")
	public WebElement empPicture;
	
	
	
	public ContactDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}	
}



