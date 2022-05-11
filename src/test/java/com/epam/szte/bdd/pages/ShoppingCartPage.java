package com.epam.szte.bdd.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.szte.bdd.dao.Product;
import com.epam.szte.bdd.utils.PageObject;

import static org.junit.Assert.assertTrue;

public class ShoppingCartPage extends PageObject {

	private WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css="#cart_title")
	private WebElement shoppingCartTitle;
	
	private static final String PRODUCT_NAME = ".product-name";
	private static final String PRODUCT_UNIT_TOTAL_PRICE = ".cart_unit .price";
	private static final String PRODUCT_TOTAL_PRICE = ".cart_total .price";
	private static final String PRODUCT_QUANTITY = ".cart_quantity_input";
	
	@FindBy(css=".cart_item")
	private List<WebElement> cartItems;

	@FindBy(id="group_1")
	private WebElement shirtSize;

	@FindBy(id="1_3_0_0")
	private WebElement deleteButton;

	@FindBy(css="#center_column > p")
	private WebElement alertText;

	@FindBy(id="total_price")
	private WebElement totalPriceText;
	
	public boolean shoppingCartIsDisplayed() {
		return shoppingCartTitle.isDisplayed();
	}
	
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		for(WebElement cartItem : cartItems) {
			Product product = new Product();
			product.setProductName(cartItem.findElement(By.cssSelector(PRODUCT_NAME)).getText());
			product.setUnitProductPrice(cartItem.findElement(By.cssSelector(PRODUCT_UNIT_TOTAL_PRICE)).getText());
			product.setTotalProductPrice(cartItem.findElement(By.cssSelector(PRODUCT_TOTAL_PRICE)).getText());
			product.setProductQuantity(cartItem.findElement(By.cssSelector(PRODUCT_QUANTITY)).getAttribute("value"));
			products.add(product);
		}
		return products;
	}
	
	/**
	 * �rai Feladat
	 */
	public void selectShirtSize(String size){
		Select sizes = new Select(shirtSize);
		sizes.selectByVisibleText(size);
	}
	public void assertShirtSize(String size){
		assertTrue(shirtSize.getText().contains(size));
	}

	public void clickDeleteButton() {
		deleteButton.click();
	}

	public void assertEmptyCart() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(alertText));
		assertTrue(alertText.getText().contains("Your shopping cart is empty."));
	}

	public void assertTotalValue(){
		assertTrue ("Helytelen ár", totalPriceText.getText().contains("$83.00"));
	}
}
