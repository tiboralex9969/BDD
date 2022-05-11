package com.epam.szte.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.szte.bdd.utils.PageObject;

public class ProductPage extends PageObject {

	private WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css="[itemprop=\"name\"]")
	private WebElement productName;
	
	@FindBy(css="#quantity_wanted")
	private WebElement productQuantityField;
	
	@FindBy(css="#add_to_cart button")
	private WebElement addToCart;
	
	@FindBy(css=".button-container .continue span")
	private WebElement continueShopping;
	
	@FindBy(css=".button-container [title=\"Proceed to checkout\"]")
	private WebElement proceedToCheckout;
	
	public String getSelectedProductName() {
		return productName.getText();
	}
	
	public void setTheQuantity(String quantity) {
		productQuantityField.clear();
		productQuantityField.sendKeys(quantity);
	}
	
	public String getQuantityNumbet() {
		return productQuantityField.getAttribute("value");
	}
	
	public void clickOnAddToCartButton() {
		addToCart.click();
	}
	
	public void clickOnContinueShoppingButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(continueShopping));
		continueShopping.click();
	}
	
	public void clickOnProceedToCheckout() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(proceedToCheckout));
		proceedToCheckout.click();
	}	
	
	/**
	 * Órai Feladat
	 */
	


}
