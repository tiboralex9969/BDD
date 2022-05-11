package com.epam.szte.bdd.steps;

import org.junit.Assert;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.ProductPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStep {

	private ProductPage productPage = new ProductPage(Hooks.driver);
	
	@Then("^I see the \"([^\"]*)\" product page$")
	public void seeTheSelectedProduct(String productName) {
		Assert.assertEquals(productName, productPage.getSelectedProductName());
	}

	@When("^I set Quantity number to \"([^\"]*)\"$")
	public void setQuantity(String quantity) {
		productPage.setTheQuantity(quantity);
	}

	@Then("^I see the Quantity number is \"([^\"]*)\"$")
	public void checkQuantityNumber(String quntity) {
		Assert.assertEquals(quntity, productPage.getQuantityNumbet());
	}

	@When("^I click on Add to cart button$")
	public void clickOnAddToCartButton() {
		productPage.clickOnAddToCartButton();
	}

	@When("^I click on continue shopping$")
	public void clicOnContinueShoppingButton() {
		productPage.clickOnContinueShoppingButton();
	}

	@When("^I click on Proceed To Checkout$")
	public void clickOnProceedToCheckout() {
		productPage.clickOnProceedToCheckout();
	}

	/**
	 * Órai Feladat
	 */


}
