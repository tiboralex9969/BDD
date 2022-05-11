package com.epam.szte.bdd.steps;

import static org.junit.Assert.assertTrue;
import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	private LoginPage loginPage = new LoginPage(Hooks.driver);
	
	@When("^I write \"([^\"]*)\" into email field$")
	public void writeEmailAdressIntoEmailField(String emailAddress) {
		loginPage.writeEmailAddress(emailAddress);
	}
	
	@When("^I write \"([^\"]*)\" into password field$")
	public void writePasswordIntoPasswordField(String password) {
		loginPage.writePassword(password);
	}

	@When("^I click on Login Button$")
	public void clickOnLoginButton() {
		loginPage.clickOnLoginButton();
	}
	
	@Then("^I redirect to the login page$")
	public void redirectedToLoginPage() {
		assertTrue("The login form hasn't appeared", loginPage.checkLoginForm());
	}
	
	@When("^I login with (.+) emailaddress and (.+) password$")
	public void loginWithEmailAndPassword(String emailAddress, String password) {
		loginPage.writeEmailAddress(emailAddress);
		loginPage.writePassword(password);
	}
}
