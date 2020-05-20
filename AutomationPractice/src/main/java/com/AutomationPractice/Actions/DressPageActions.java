package com.AutomationPractice.Actions;

import static com.AutomationPractice.Utilities.DriverManager.getDriver;

public class DressPageActions {
	
	/**
	 * Return the Title of Women Page.
	 * @return Titlr of women page.
	 */
	public String getDressPageTitle() {
		return getDriver().getTitle();
	}

}
