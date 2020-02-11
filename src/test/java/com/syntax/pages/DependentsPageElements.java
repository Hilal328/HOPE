package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;


public class DependentsPageElements {

	@FindBy(id = "btnAddDependent")
	public WebElement addButton;
	
	@FindBy(id = "dependent_name")
	public WebElement name;
	
	

	@FindBy(xpath = "//select[@id='dependent_relationshipType']")
	public WebElement relationships;
	
	@FindBy(xpath = "//input[@id='dependent_dateOfBirth']")
	public WebElement dateOfBirth;
	
	@FindBy(xpath = "//input[@id='btnSaveDependent']")
	public WebElement saveBtn;
	
	@FindBy(id = "btnAddAttachment")
	public WebElement addBtnAttach;
	
	@FindBy(id = "ufile")
	public WebElement chooseFile;
	
	@FindBy(id = "btnSaveAttachment")
	public WebElement uploadFile;
	
	@FindBy(xpath = "//table[@id='dependent_list']/tbody/tr/td[2]")
	public WebElement addedDepend;
	
	public DependentsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
