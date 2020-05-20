package com.AutomationPractice.Actions;

import org.openqa.selenium.support.PageFactory;

import com.AutomationPractice.Locators.WomenPageLocators;
import com.AutomationPractice.TestBase.Page;

import static com.AutomationPractice.Utilities.DriverManager.*;
import static com.AutomationPractice.Utilities.TestUtil.*;

public class WomenPageActions extends Page{
	
	public WomenPageLocators womenPageLocators;
	
	public WomenPageActions(){
		womenPageLocators = PageFactory.initElements(getDriver(), WomenPageLocators.class);
	}
	
	/**
	 * Return the Title of Women Page.
	 * @return Titlr of women page.
	 */
	public String getWomenPageTitle() {
		return getDriver().getTitle();
	}
	
	/**
	 * Click on Small Size Check Box.
	 */
	public void clickOnSmallCheckBox() {
		click(womenPageLocators.getSizeSmallCheckbox());
	}
	
	/**
	 * Click on Medium Size Check box.
	 */
	public void clickOnMediumCheckBox() {
		click(womenPageLocators.getSizeMediumCheckbox());
	}
	
	/**
	 * Click on Large Size Check box.
	 */
	public void clickOnLargeCheckBox() {
		click(womenPageLocators.getSizeLargeCheckbox());
	}
	
	/**
	 * Sort the items by Price: Highest first
	 */
	public void shortByHighestPrice() {
		selectByVisibleText(womenPageLocators.getShortBy(), "Price: Highest first");
	}
	
	/**
	 * Sort the items by Product Name: A to Z
	 */
	public void shortByProductAtoZ() {
		selectByVisibleText(womenPageLocators.getShortBy(), "Product Name: A to Z");
	}

}
