package com.AutomationPractice.TestBase;

import java.time.Duration;

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
	public static Logger log = LogManager.getLogger(Page.class.getName());
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
			log.debug("Launching chrome");
			driver = new ChromeDriver();
		} else if (Constants.browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			log.debug("Launching Firefox");
			driver = new FirefoxDriver();
		} else if (Constants.browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			log.debug("Launching edge");
			driver = new EdgeDriver();
		} else if (Constants.browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			log.debug("Launching ie");
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
