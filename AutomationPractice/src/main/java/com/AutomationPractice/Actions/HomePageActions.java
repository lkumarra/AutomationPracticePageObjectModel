package com.AutomationPractice.Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.AutomationPractice.Locators.HomePageLocators;
import com.AutomationPractice.TestBase.Page;

import static com.AutomationPractice.Utilities.DriverManager.*;
import static com.AutomationPractice.Utilities.TestUtil.*;

public class HomePageActions extends Page {
	
	public HomePageLocators homePageLocators;
	
	public HomePageActions() {
		this.homePageLocators = PageFactory.initElements(getDriver(), HomePageLocators.class);
	}
	
	/**
	 * Return the title of HomePage.
	 * @return title of HomePage.
	 */
	public String getHomePageTitle() {
		return getDriver().getTitle();
	}
	/**
	 * Click on WomenLink on HomePage.
	 * @return Return The Instance of WomenPage Actions.
	 */
	public WomenPageActions clickOnWomenLink() {
		click(homePageLocators.getWomenLinkLocator());
		return new WomenPageActions();
	}
	
	/**
	 * Click on DressPage Link on HomePage.
	 * @return Return the Instance of DressPage Actions.
	 */
	public DressPageActions clickOnDresses() {
		click(homePageLocators.getDressesLocator());
		return new DressPageActions();
	}
	
	/**
	 * Click on T-Shirts Page Link on HomePage.
	 * @return Return the Instance of T Shirt Page.
	 */
	public TshirtsPageActions clickOnTshirtPageLink() {
		click(homePageLocators.getTshirtsLinkLocator());
		return new TshirtsPageActions();
	}
	
	/**
	 * Click on summer dress link on HomePage.
	 * @return 
	 */
	public SummerDressPageActions clickOnSummerDresses() {
		moveToElement(homePageLocators.getWomenLinkLocator());
		moveToElement(homePageLocators.getWomenLinkLocator());
		click(homePageLocators.getSummerDressesLink());
		return new SummerDressPageActions();
	}
	
	/**
	 * Verify the NewsLetter Input box by filling different sets of data.
	 * @param data Data tobe entered.
	 * @return
	 */
	public String verifyNewsLetter(String data) {
		type(homePageLocators.getNewsLetterInputBox(),data);
		click(homePageLocators.getNewsLetterSubmit());
	    return getAttribute(homePageLocators.getNewsLetterInputBox(), "value");
	}

}
