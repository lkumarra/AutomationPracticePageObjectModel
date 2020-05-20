package com.AutomationPractice.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.AutomationPractice.TestBase.Page;
import static com.AutomationPractice.Utilities.DriverManager.*;

public class TestUtil extends Page {

	/**
	 * 
	 * @param screenShotName
	 * @return
	 */
	public static String captureScreenShot(String screenShotName) {
		Date date = new Date();
		SimpleDateFormat dateFormate = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String formatedDate = dateFormate.format(date);
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		System.out.println(System.getProperty("user.dir"));
		try {
			File Src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Src, new File(
					System.getProperty("user.dir") + "\\test-output\\html\\" + screenShotName + formatedDate + ".png"));
		} catch (IOException e) {

		}
		String screenShotLink = screenShotName + formatedDate + ".png";
		Reporter.log("<a target = '_blank' href =" + screenShotLink + ">Screenshot</a>");
		return screenShotLink;
	}

	/**
	 * Perfrom click action
	 * 
	 * @param locator key of locator on which click action have to performed.
	 */
	public static void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	/**
	 * Enter the keys in the given locator.
	 * 
	 * @param locator Key of locator.
	 * @param value   Value tobe entered.
	 */
	public static void type(WebElement element, String value) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
	}
	
	/**
	 * Select a option by Text
	 * @param element Webelement of select 
	 * @param text Text of option
	 */
	public static void selectByVisibleText(WebElement element, String text) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	/**
	 * Perform mouse move action on the element
	 * @param element WebElement to perform mouse move action.
	 */
	public static void moveToElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).build().perform();
		actions.moveToElement(element).build().perform();
	}
	
	/**
	 * Return the text of webelement.
	 * @param element
	 * @return
	 */
	public static String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}
	
	/**
	 * Return the attrubute value of the webelement.
	 * @param element Webelement to get attribute.
	 * @param attribute Atrribute name to get value.
	 * @return Attribute value.	
	 */
	public static String getAttribute(WebElement element, String attribute) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getAttribute(attribute);
	}
	
	/**
	 * Return wether a element is selected or not.
	 * @param element to be checked
	 * @return true if element is checked else false.
	 */
	public static boolean isElementSelected(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return element.isSelected();
	}
}
