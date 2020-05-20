package com.AutomationTesting.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AutomationPractice.Actions.HomePageActions;
import com.AutomationPractice.Actions.WomenPageActions;
import com.AutomationPractice.TestBase.Page;

public class WomenPageTest {
	
	static HomePageActions homePage;
	static WomenPageActions womenPage;
	
	@BeforeMethod
	public void setUp() {
		Page.initConfiguration();
		homePage = new HomePageActions();
		womenPage = homePage.clickOnWomenLink();
	}
	
	@Test(priority = 1)
	public void verifyWomenPageTitle() {
		Assert.assertEquals(womenPage.getWomenPageTitle(), "Women - My Store");
	}
	
	@AfterMethod
	public void tearDown() {
		Page.quitBrowser();
	}

}
