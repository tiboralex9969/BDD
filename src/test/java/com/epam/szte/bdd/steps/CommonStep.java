package com.epam.szte.bdd.steps;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.CommonPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CommonStep {

	private CommonPage commonPage = new CommonPage(Hooks.driver);
	
	@When("^I select the \"([^\"]*)\" product$")
	public void selectProduct(String productName) {
		commonPage.clickOnSelectedProduct(productName);
	}
	
	@When("^I click on \"([^\"]*)\" tab$")
	public void clickOnSelectedTab(String tabName) {
		commonPage.clickOnSelectedTab(tabName);
	}
	
	@Then("^I see the \"([^\"]*)\" contained$")
	public void validateTheSearchResults(String searchProductName) {
		assertThat(commonPage.getProductName(), is(containsString(searchProductName)));
	}
	
}
