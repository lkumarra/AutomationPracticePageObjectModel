package com.AutomationPractice.TestBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.AutomationPractice.Utilities.DriverManager.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static WebDriver driver;
	public static WebDriverWait wait;
	static WebElement dropdown;
	public static String browser;
	
	/**
	 * Initialize the webdriver and navigate to base url.
	 */
	public static void initConfiguration() {

		if (Constants.browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
		} else if (Constants.browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (Constants.browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (Constants.browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		setDriver(driver);
		getDriver().manage().window().maximize();
		getDriver().get(Constants.testSiteUrl);
		wait =new WebDriverWait(getDriver(), Constants.explicitWait);

	}

	/**
	 * Quit the browser after the execution complete.
	 */
	public static void quitBrowser() {
		getDriver().quit();
	}

}
