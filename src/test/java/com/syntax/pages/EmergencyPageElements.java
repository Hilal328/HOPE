package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;

public class EmergencyPageElements extends BaseClass{
	@FindBy(id = "empPic")
	public WebElement empPicture;
	
	@FindBy(xpath = "//*[@id=\"sidenav\"]/li[3]/a")
	public WebElement EmergencyButton;
	
	@FindBy(id="btnAddContact")
	public WebElement addButtonForEmergency;
	
	@FindBy(xpath = "//input[@id='emgcontacts_name']")
	public WebElement emgName;
	
	@FindBy(xpath = "//input[@name='emgcontacts[relationship]']")
	public WebElement emgRelationship;
	
	@FindBy(id="emgcontacts_homePhone")
	public WebElement emgHomeTel;
	
	@FindBy(xpath = "//input[@name='emgcontacts[mobilePhone]']")
	public WebElement emgMobileTel;
	
	@FindBy(xpath="//input[@name='emgcontacts[workPhone]']")
	public WebElement emgWorkTel;
	
	@FindBy(id="btnSaveEContact")
	public WebElement EmgSaveBtnCon;
	
	@FindBy(id="btnCancel")
	public WebElement Cancelbtn;
	
	@FindBy(id="btnAddAttachment")
	public WebElement EmgAddAttachment;
	
	@FindBy(xpath = "//input[@id='ufile']")
	public WebElement EmgChooseFile;
	
	@FindBy(css = "#txtAttDesc")
	public WebElement AttCommit;
	
	@FindBy(xpath = "//input[@id='btnSaveAttachment']")
	public WebElement UploadAttachment;
	
	@FindBy(xpath = "//input[@id='cancelButton']")
	public WebElement AddAttachCancel;

	public EmergencyPageElements() {
		PageFactory.initElements(driver, this);
	}
	
}

