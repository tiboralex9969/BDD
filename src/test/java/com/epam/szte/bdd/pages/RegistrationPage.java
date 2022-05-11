package com.epam.szte.bdd.pages;

import com.epam.szte.bdd.hooks.Hooks;
import com.epam.szte.bdd.utils.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class RegistrationPage extends PageObject {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(id="customer_firstname")
    private WebElement customerFirstName;
    @FindBy(id="customer_lastname")
    private WebElement customerLastName;
    @FindBy(id="passwd")
    private WebElement passwordField;
    @FindBy(id="firstname")
    private WebElement firstNameField;
    @FindBy(id="lastname")
    private WebElement lastNameField;
    @FindBy(id="address1")
    private WebElement addressField;
    @FindBy(id="city")
    private WebElement cityField;
    @FindBy(id="id_state")
    private WebElement stateSelect;
    @FindBy(id="postcode")
    private WebElement zipCodeField;
    @FindBy(id="phone_mobile")
    private WebElement mobileField;

    public boolean validateRegistrationPage(){
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.urlToBe("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"));
        return Hooks.driver.getCurrentUrl().contains("account-creation");
    }

    public void typeCustomerFirstName(String firstName){
        customerFirstName.sendKeys(firstName);
    }

    public void typeCustomerLastName(String lastName) {
        customerLastName.sendKeys(lastName);
    }
    public void typeInPassword(String password){
        passwordField.sendKeys(password);
    }

    public void typeFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void typeLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void typeAddress(String address) {
        addressField.sendKeys(address);
    }

    public void typeCity(String city) {
        cityField.sendKeys(city);
    }

    public void selectState(String state) {
        Select select = new Select(stateSelect);
        select.selectByValue(state);
    }

    public void typeZipCode(String zipCode) {
        zipCodeField.sendKeys(zipCode);
    }

    public void typeMobile(String s) {
        mobileField.sendKeys(s);
    }

    public boolean validateCustomerFirstName(String firstName) {
        Hooks.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        return customerFirstName.getText().contains(firstName);
    }

    public boolean validateCustomerLastName(String lastName) {
        return customerLastName.getText().contains(lastName);
    }

    public boolean validatePassword(String password) {
        return passwordField.getText().contains(password);
    }

    public boolean validateFirstName(String firstName) {
        return firstNameField.getText().contains(firstName);
    }

    public boolean validateLastName(String lastName) {
        return lastNameField.getText().contains(lastName);
    }

    public boolean validateAddress(String address) {
        return addressField.getText().contains(address);
    }

    public boolean validateCity(String city) {
        return cityField.getText().contains(city);
    }

    public boolean validateState(String state) {
        return stateSelect.getText().contains(state);
    }

    public boolean validateZipCode(String zipCode) {
        return zipCodeField.getText().contains(zipCode);
    }

    public boolean validateMobilePhone(String mobilePhone) {
        return mobileField.getText().contains(mobilePhone);
    }
}
