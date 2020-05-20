package com.AutomationPractice.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePageLocators {
	
	@FindBy(xpath = "//a[text()='Women' and @class = 'sf-with-ul']")
	private WebElement womenLinkLocator;
	
	@FindBy(xpath = "//a[text()='Dresses' and @class = 'sf-with-ul']")
	private WebElement dressesLocator;
	
	@FindBy(xpath = "(//a[text()='T-shirts'])[1]")
	private WebElement tshirtsLinkLocator;
	
	@FindBy(css = "#newsletter-input")
	private WebElement newsLetterInputBox;
	
	@FindBy(linkText = "Summer Dresses")
	private WebElement summerDressesLink;
	
	@FindBy(name = "submitNewsletter")
	private WebElement newsLetterSubmit;
	
	@FindBy(css = "#search_query_top")
	private WebElement searchInput;

	/**
	 * Return Locator of Search Input
	 * @return
	 */
	public WebElement getSearchInput() {
		return searchInput;
	}

	/**
	 * Return Locator of women Link.
	 * @return
	 */
	public WebElement getWomenLinkLocator() {
		return womenLinkLocator;
	}

	/** 
	 * Return Locator of Dress
	 * @return
	 */
	public WebElement getDressesLocator() {
		return dressesLocator;
	}

	/** 
	 * Return Locator of Tshirts Link.
	 * @return
	 */
	public WebElement getTshirtsLinkLocator() {
		return tshirtsLinkLocator;
	}

	/** 
	 * Return Locator of News Letter Input Box.
	 * @return
	 */
	public WebElement getNewsLetterInputBox() {
		return newsLetterInputBox;
	}

	/** 
	 * Return Locator Of Summer Dress Link.
	 * @return
	 */
	public WebElement getSummerDressesLink() {
		return summerDressesLink;
	}

	/**
	 * Return Locator Of News Letter Submit.
	 * @return
	 */
	public WebElement getNewsLetterSubmit() {
		return newsLetterSubmit;
	}
	
	

}
