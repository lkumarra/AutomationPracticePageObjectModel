package com.AutomationPractice.Actions;

import static com.AutomationPractice.Utilities.DriverManager.*;

public class TshirtsPageActions {
	/**
	 * Return the Title of Women Page.
	 * @return Titlr of women page.
	 */
	public String getTshirtPageTitle() {
		return getDriver().getTitle();
	}
}
