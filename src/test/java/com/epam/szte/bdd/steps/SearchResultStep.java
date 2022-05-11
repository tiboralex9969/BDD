package com.epam.szte.bdd.steps;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.SearchResultsPage;

import io.cucumber.java.en.Then;


public class SearchResultStep {
	
	private SearchResultsPage searchResultsPage = new SearchResultsPage(Hooks.driver);
	
	private static final String SEARCH = "SEARCH";
	
	@Then("^I see the page redirected to the search result page$")
	public void searchResultPageisDisplayed() {
		assertThat(searchResultsPage.getSearchResultHeader(), is(containsString(SEARCH)));
	}

}
