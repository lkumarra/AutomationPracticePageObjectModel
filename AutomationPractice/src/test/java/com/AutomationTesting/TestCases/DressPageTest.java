package com.AutomationTesting.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AutomationPractice.Actions.DressPageActions;
import com.AutomationPractice.Actions.HomePageActions;
import com.AutomationPractice.TestBase.Page;

public class DressPageTest {
	
	static HomePageActions homePage;
	static DressPageActions dressPage;
	
	@BeforeMethod
	public void setUp() {
		Page.initConfiguration();
		homePage = new HomePageActions();
		dressPage = homePage.clickOnDresses();
	}
	
	@Test
	public void verifyDressPageTitle() {
		Assert.assertEquals(dressPage.getDressPageTitle(), "Dresses - My Store");
	}
	
	public void tearDown() {
		Page.quitBrowser();
	}

}
