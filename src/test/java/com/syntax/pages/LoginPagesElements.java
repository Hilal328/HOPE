package com.syntax.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.testbase.BaseClass;
import com.syntax.utils.CommonMethods;


public class LoginPagesElements extends CommonMethods {

	@FindBy(xpath = "//div[@id='divLogo']")
	public WebElement logo;

	@FindBy(id="logInPanelHeading")
	public WebElement loginLabel;

	@FindBy(name="txtUsername")
	public WebElement username;

	@FindBy(css="input#txtPassword")
	public WebElement password;

	@FindBy(css="input[name='Submit']")
	public WebElement loginBtn;

	@FindBy(id="spanMessage")
	public WebElement errorMsg;

	public LoginPagesElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void login(String uid,String pwd) {
		sendText(username,uid);
		sendText(password,pwd);
		click(loginBtn);
		boolean welcomeText=dashboard.welcomeText.isDisplayed();
	     Assert.assertTrue(welcomeText);
	}
}