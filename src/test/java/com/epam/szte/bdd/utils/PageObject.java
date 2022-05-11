package com.epam.szte.bdd.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	public PageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
