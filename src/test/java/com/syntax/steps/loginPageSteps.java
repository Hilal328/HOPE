package com.syntax.steps;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginPageSteps extends CommonMethods {
	@Given("i enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password,  ConfigsReader.getProperty("password"));		
	}

	@When("i click login button")
	public void _click_login_button() {
		click(login.loginBtn);
}
}
