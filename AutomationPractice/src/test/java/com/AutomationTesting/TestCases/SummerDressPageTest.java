package com.AutomationTesting.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AutomationPractice.Actions.HomePageActions;
import com.AutomationPractice.Actions.SummerDressPageActions;
import com.AutomationPractice.TestBase.Page;

public class SummerDressPageTest {
	
	static HomePageActions homePage;
	static SummerDressPageActions summerDress;
	
	
	@BeforeMethod
	public void setUp() {
		Page.initConfiguration();
		homePage = new HomePageActions();
		summerDress = homePage.clickOnSummerDresses();
	}
	
	@Test(priority = 1)
	public void verifySummerDressPageTitle() {
		Assert.assertEquals(summerDress.getSummerDressPageTitle(), "Summer Dresses - My Store");
	}
	
	@Test(priority = 2)
	public void verifyCheckBoxSelected() {
		Assert.assertEquals(summerDress.verifySmallSizeSelected(), true);
	}
	
	@AfterMethod
	public void tearDown() {
		Page.quitBrowser();
	}

}
