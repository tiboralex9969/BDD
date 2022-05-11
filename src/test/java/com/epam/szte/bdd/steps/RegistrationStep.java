package com.epam.szte.bdd.steps;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.pages.LoginPage;
import com.epam.szte.bdd.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class RegistrationStep {
    private LoginPage loginPage = new LoginPage(Hooks.driver);
    private RegistrationPage registrationPage = new RegistrationPage(Hooks.driver);

    String firstName = "Tibor";
    String lastName = "Szekeres";
    String password = "Password";
    String address = "Kossuth Lajos sgt";
    String city = "Szeged";
    String state = "11";
    String zipCode = "738278";
    String mobilePhone = "+3620212121";


    @When("I type in email to email address field")
    public void iTypeInEmailToEmailAddressField() {
        loginPage.writeCreateAccountEmail("szekerest@gmail.com");
    }

    @And("click on Create Account button")
    public void clickOnCreateAccountButton() {
        loginPage.clickCreateAccountButton();
    }

    @Then("I redirect to the registration page")
    public void iRedirectToTheRegistrationPage() {
        assertTrue("Regisztrációs oldalon vagyunk",registrationPage.validateRegistrationPage());
    }

    @When("I type in customerFirstName")
    public void iTypeInCustomerFirstName() {
        registrationPage.typeCustomerFirstName(firstName);
    }

    @And("I type in customerLastName")
    public void iTypeInCustomerLastName() {
        registrationPage.typeCustomerLastName(lastName);
    }

    @And("I type in password")
    public void iTypeInPassword() {
        registrationPage.typeInPassword(password);
    }

    @And("I type in firstName")
    public void iTypeInFirstName() {
        registrationPage.typeFirstName(firstName);
    }

    @And("I type in lastName")
    public void iTypeInLastName() {
        registrationPage.typeLastName(lastName);
    }

    @And("I type in address")
    public void iTypeInAddress() {
        registrationPage.typeAddress(address);
    }

    @And("I type in City")
    public void iTypeInCity() {
        registrationPage.typeCity(city);
    }

    @And("I choose from State")
    public void iChooseFromState() {
        registrationPage.selectState(state);
    }

    @And("I type in Zip Code")
    public void iTypeInZipCode() {
        registrationPage.typeZipCode(zipCode);
    }

    @And("I type in Mobile phone")
    public void iTypeInMobilePhone() {
        registrationPage.typeMobile(mobilePhone);
    }

    @Then("Tibor is filled in")
    public void tiborIsFilledIn() {
        assertTrue("Keresztnév helytelen", registrationPage.validateCustomerFirstName(firstName));
    }

    @Then("Szekeres is filled in")
    public void szekeresIsFilledIn() {
        assertTrue("Vezetéknév helytelen", registrationPage.validateCustomerLastName(lastName));
    }

    @Then("password is filled in")
    public void passwordIsFilledIn() {
        assertTrue("Keresztnév helytelen", registrationPage.validatePassword(password));
    }

    @Then("Tibor is filled in to firstName")
    public void tiborIsFilledInToFirstName() {
        assertTrue("firstName helytelen", registrationPage.validateFirstName(firstName));
    }

    @Then("Szekeres is filled in to lastName")
    public void szekeresIsFilledInToLastName() {
        assertTrue("lastName helytelen", registrationPage.validateLastName(lastName));
    }

    @Then("the address is filled in")
    public void theAddressIsFilledIn() {
        assertTrue("Address helytelen", registrationPage.validateAddress(address));
    }

    @Then("City is filled in")
    public void cityIsFilledIn() {
        assertTrue("City helytelen", registrationPage.validateCity(city));
    }

    @Then("State is filled in")
    public void stateIsFilledIn() {
        assertTrue("State helytelen", registrationPage.validateState(state));
    }

    @Then("Zip Code is filled in")
    public void zipCodeIsFilledIn() {
        assertTrue("zipCode helytelen", registrationPage.validateZipCode(zipCode));
    }

    @Then("Mobile phone is filled in")
    public void mobilePhoneIsFilledIn() {
        assertTrue("Mobil helytelen", registrationPage.validateMobilePhone(mobilePhone));
    }
}
