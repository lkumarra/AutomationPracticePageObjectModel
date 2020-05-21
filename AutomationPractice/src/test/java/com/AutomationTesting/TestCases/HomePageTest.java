package com.AutomationTesting.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AutomationPractice.Actions.HomePageActions;
import com.AutomationPractice.TestBase.Page;

public class HomePageTest {
	
	static HomePageActions homePage;
	
	@BeforeMethod
	public void setUp() {
		Page.initConfiguration();
		homePage = new HomePageActions();
	}
	
	@Test(priority = 1)
	public void verifyHomePageTitle() {
		Assert.assertEquals(homePage.getHomePageTitle(), "My Store");
	}
	
	@Test(priority = 2)
	public void verifyNewsLetterWithInvalidData() {
		Assert.assertEquals(homePage.verifyNewsLetter("1234"), "Invalid email address.");
	}
	
	public void verifyNewsLetterWithValidData() {
		Assert.assertEquals(homePage.verifyNewsLetter("Lavendra.rajput1@gmail.com"), "");
	}
	
	@AfterMethod
	public void tearDown() {
		Page.quitBrowser();
	}

}
