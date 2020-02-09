package com.syntax.steps;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test extends CommonMethods{

	@Given("i enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password,  ConfigsReader.getProperty("password"));		
	}

	@When("i click login button")
	public void _click_login_button() {
		click(login.loginBtn);
	}

	@Then("i successfully logged in")
	public void i_successfully_logged_in() {
		System.out.println("I am logged in");
	}

	@Then("i see welcome text")
	public void i_see_welcome_text() {
		System.out.println("I logged in");
	}
}
