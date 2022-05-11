package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.epam.szte.bdd.utils.PageObject;

public class LoginPage extends PageObject {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css="#email")
	private WebElement eMailTextField;
	
	@FindBy(css="#passwd")
	private WebElement passwordField;
	
	@FindBy(id="SubmitLogin")
	private WebElement loginButton;
	
	@FindBy(id="login_form")
	private WebElement loginForm;

	@FindBy(id="email_create")
	private WebElement createEmailField;

	@FindBy(id="SubmitCreate")
	private WebElement createAccountButton;

	public void writeEmailAddress(String emailAddress) {
		eMailTextField.sendKeys(emailAddress);
	}
	
	public void writePassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean checkLoginForm() {
		return loginButton.isDisplayed();
	}

	public void writeCreateAccountEmail(String emailAddress) {
		createEmailField.sendKeys(emailAddress);
	}
	public void clickCreateAccountButton(){
		createAccountButton.click();
	}
}
