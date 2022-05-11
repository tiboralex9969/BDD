package com.epam.szte.bdd.steps;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import io.cucumber.java.en.Then;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.AccountPage;

/**
 * Step definitions for Account page.
 */
public class AccountStep {
	
    private AccountPage accountPage = new AccountPage(Hooks.driver);

    @Then("^The account title should be (.+)$")
    public void the_account_title_should_be(String accountTitle) {
        assertThat(accountPage.checkAccountTitleIsContain(), is(containsString(accountTitle)));
    }
}
