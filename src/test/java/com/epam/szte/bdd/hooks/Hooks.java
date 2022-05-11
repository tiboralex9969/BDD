package com.epam.szte.bdd.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks {
	public static WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver32.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
