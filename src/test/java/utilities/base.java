package utilities;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public static WebDriver driver;
	public WebDriverWait wait;
	public static Logger logger;
	public Properties configProp;

	public WebDriver initializeDriver() {

		String br = configProp.getProperty("browser");
		// System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
		// + "\\Drivers\\chromedriver.exe");

		if (br.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if (br.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		if (br.contains("edge")) {
			System.setProperty("webdriver.edge.driver", configProp.getProperty("edgepath"));
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}

		return driver;
	}

	public void waitmethod() {
		wait = new WebDriverWait(driver, 10);
	}

	// utility for generating the randomstring for the unique email id
	public static String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(10);
		return generatedString;
	}

}
