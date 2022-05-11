package com.epam.szte.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.epam.szte.bdd.utils.PageObject;

public class CommonPage extends PageObject {

	private WebDriver driver;
	
	public CommonPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css="h1")
	private WebElement productName;
	
	@FindBy(css="#center_column .product-name")
	private List<WebElement> productNames;
	
	@FindBy(css=".menu-content>li>[title=\"Women\"]")
	private WebElement womenTab;
	
	@FindBy(css=".menu-content>li>[title=\"T-shirts\"]")
	private WebElement dressTab;

	public void clickOnSelectedTab(String tabName) {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".button-container .continue span")));
		switch (tabName.toLowerCase()) {
		case "women":
			womenTab.click();
			break;
		case "t-shirts":
			dressTab.click();			
		default:
			System.out.println("The Tab not exist");
		}
	}
	
	public String getProductName() {
		return productNames.get(0).getText();
	}
	
	public void clickOnSelectedProduct(String productName) {
		for(WebElement product : productNames) {
			if (product.getText().trim().equals(productName)) {
				product.click();
				break;
			}
		}
	}
	
}
