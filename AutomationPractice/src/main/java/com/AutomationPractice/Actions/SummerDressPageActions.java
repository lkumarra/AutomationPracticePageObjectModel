package com.AutomationPractice.Actions;

import static com.AutomationPractice.Utilities.DriverManager.*;
import static com.AutomationPractice.Utilities.TestUtil.*;


import org.openqa.selenium.support.PageFactory;

import com.AutomationPractice.Locators.SummerDressPageLocator;
import com.AutomationPractice.TestBase.Page;

public class SummerDressPageActions extends Page{
	
	public SummerDressPageLocator summerPageLocators;
	
	public SummerDressPageActions() {
		summerPageLocators = PageFactory.initElements(getDriver(), SummerDressPageLocator.class);
	}
	
	public String getSummerDressPageTitle() {
		return getDriver().getTitle();
	}
	/**
	 * Click on Small Size Check Box.
	 */
	public void clickOnSmallCheckBox() {
		click(summerPageLocators.getSizeSmallCheckbox());
	}
	
	/**
	 * Click on Medium Size Check box.
	 */
	public void clickOnMediumCheckBox() {
		click(summerPageLocators.getSizeMediumCheckbox());
	}
	
	/**
	 * Click on Large Size Check box.
	 */
	public void clickOnLargeCheckBox() {
		click(summerPageLocators.getSizeLargeCheckbox());
	}
	
	/**
	 * Sort the items by Price: Highest first
	 */
	public void shortByHighestPrice() {
		selectByVisibleText(summerPageLocators.getShortBy(), "Price: Highest first");
	}
	
	/**
	 * Sort the items by Product Name: A to Z
	 */
	public void shortByProductAtoZ() {
		selectByVisibleText(summerPageLocators.getShortBy(), "Product Name: A to Z");
	}
	
	public boolean verifySmallSizeSelected() {
		this.clickOnSmallCheckBox();
		return isElementSelected(summerPageLocators.getSizeSmallCheckbox());
	}

}
