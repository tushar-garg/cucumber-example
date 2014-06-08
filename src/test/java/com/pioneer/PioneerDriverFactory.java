package com.pioneer;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 Driver Class to get driver according to browser
 */
public class PioneerDriverFactory {

	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	public static int waitTime = 10;

	public static String browser = "firefox";
	// public static String baseURL =
	// "http://dpio-app41.dc1.beachbody.com:8080/login/auth";
	public static String baseURL = "http://www.google.com";
	public static Platform currentOS = Platform.getCurrent();

	public String testName;
	public String ClassName = null;
	public String NewFileNamePath = null;

	protected static void getDriverInstance() {
		// so that multiple windows are not opened
		if (driver == null) {
			createDriver();
		}

	}

	protected static void createDriver() {

		System.out.println("Browser= " + browser);
		System.out.println("Platform= " + currentOS);
		System.out.println("URL= " + baseURL);

		createDriver(browser);
		OpenURL(baseURL);
	}

	public static void createDriver(final String browserId) {
		if (browserId.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserId.equalsIgnoreCase("ie")) {
			final File file = new File(
					"test/resources/drivers/ieDriver/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

			final DesiredCapabilities ieCapabilities = DesiredCapabilities
					.internetExplorer();
			ieCapabilities
					.setCapability(
							InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
							true);
			driver = new InternetExplorerDriver(ieCapabilities);

		} else if (browserId.equalsIgnoreCase("chrome")) {
			final File file = new File(
					"test/resources/drivers/chromeDriver/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",
					file.getAbsolutePath());

			final DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new ChromeDriver(capability);

		}
	}

	public static void OpenURL(String baseURL) {
		driver.manage().window().maximize();

		driver.get(baseURL);

		waitVar = new WebDriverWait(driver, waitTime);
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}

	public void tearDown() {
		if (!(driver == null)) {
			driver.quit();
			driver = null;
		}
	}

}
