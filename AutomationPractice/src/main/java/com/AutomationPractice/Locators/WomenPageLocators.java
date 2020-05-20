package com.AutomationPractice.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenPageLocators {
	
	@FindBy(css = "#layered_id_attribute_group_1")
	private WebElement sizeSmallCheckbox;
	
	@FindBy(css="#layered_id_attribute_group_2")
	private WebElement sizeMediumCheckbox;
	
	@FindBy(css = "#layered_id_attribute_group_2")
	private WebElement sizeLargeCheckbox;
	
	@FindBy(css = "#selectProductSort")
	private WebElement shortBy;

	/**
	 * Locator of Small Size Checkbox.
	 * @return WebElement of Small Size CheckBox.
	 */
	public WebElement getSizeSmallCheckbox() {
		return sizeSmallCheckbox;
	}

	/**
	 * Locator of Medium Size CheckBox.
	 * @return WebElement of Medium Size Checkbox.
	 */
	public WebElement getSizeMediumCheckbox() {
		return sizeMediumCheckbox;
	}

	/**
	 * Locator of Large Size Checkbox.
	 * @return WebElement of Large Size Checkbox.
	 */
	public WebElement getSizeLargeCheckbox() {
		return sizeLargeCheckbox;
	}

	/**
	 * Locator of Sort 
	 * @return WebElement of Short .
	 */
	public WebElement getShortBy() {
		return shortBy;
	}

}
