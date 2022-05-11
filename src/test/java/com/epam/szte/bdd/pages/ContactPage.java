package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.epam.szte.bdd.utils.PageObject;

public class ContactPage extends PageObject{

	private WebDriver drive;
	
	public ContactPage(WebDriver driver) {
		super(driver);
		this.drive = driver;
	}
	
	@FindBy(css="#contact")
	private WebElement contactPage;
	
	@FindBy(css="#id_contact")
	private WebElement subjectHeading;
	
	@FindBy(css="#email")
	private WebElement emailField;
	
	@FindBy(css="#id_order")
	private WebElement orderReferencField;
	
	@FindBy(css="#message")
	private WebElement messageField;

	@FindBy(id = "contact-link")
	private WebElement contactButton;
	
	public boolean contactPageIsVisible() {
		return contactPage.isDisplayed();
	}

	public void selectSubjectHeading(String subject) {
		Select select = new Select(subjectHeading);
		select.selectByVisibleText(subject);
	}
	
	public void writeEmailAddress(String email) {
		emailField.sendKeys(email);
	}
	
	public void writeOrderReference(String order) {
		orderReferencField.sendKeys(order);
	}
	
	public void writeMessage(String message) {
		messageField.sendKeys(message);
	}
	
	public String getMessage() {
		return messageField.getAttribute("value");
	}
	
	public void clickContactUsButton(){
		contactButton.click();
	}
}
