package com.AutomationTesting.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.AutomationPractice.Actions.HomePageActions;
import com.AutomationPractice.Actions.TshirtsPageActions;
import com.AutomationPractice.TestBase.Page;

public class TshirtsPageTest {
	
	
	static HomePageActions homePage;
	static TshirtsPageActions tshirtPage;
	
	@BeforeMethod
	public void setUp() {
		Page.initConfiguration();
		homePage = new HomePageActions();
		tshirtPage = homePage.clickOnTshirtPageLink();
	}
	
	@Test
	public void verifyDressPageTitle() {
		Assert.assertEquals(tshirtPage.getTshirtPageTitle(), "T-shirts - My Store");
	}
	
	@AfterMethod
	public void tearDown() {
		Page.quitBrowser();
	}


}
