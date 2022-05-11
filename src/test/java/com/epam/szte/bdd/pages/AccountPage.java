package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.epam.szte.bdd.utils.PageObject;

/**
 * Page object for Account page.
 */
public class AccountPage extends PageObject {
	
	private WebDriver driver;
	
    public AccountPage(WebDriver driver) {
    	super(driver);
		this.driver = driver;
	}

	@FindAll({@FindBy(css = ".info-account"), @FindBy(css=".alert")})
    private WebElement accountTitle;
    
    public String checkAccountTitleIsContain() {
    	return accountTitle.getText();
    }
}
