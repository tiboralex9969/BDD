package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.szte.bdd.utils.PageObject;

public class HomepagePage extends PageObject {

	private WebDriver driver;
	
	public HomepagePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css=".login")
	WebElement signInButton;
	
	@FindBy(css = "#search_query_top")
	private WebElement searchField;
	
	@FindBy(css=".button-search")
	private WebElement searchButton;
	
	@FindBy(css=".shopping_cart")
	private WebElement shoppingCart;
	
	
	public void clickOnsigInButton() {
		signInButton.click();
	}
	
	public void openMyStorePage() {
		driver.get("http://automationpractice.com");
	}
	
	public void searchOnTextField(String text) {
		searchField.sendKeys(text);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	/**
	 * Órai Feladat
	 */
	


	
}
