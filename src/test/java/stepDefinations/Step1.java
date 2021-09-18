package stepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.sun.tools.internal.jxc.gen.config.Config;

//import io.cucumber.java.en.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;
import pageObjects.LoginPage;
import utilities.base;

public class Step1 extends base {
	LoginPage lp;
	
	
//	@Before
//	public void setup() throws IOException
//	{
//		
//		
//		configProp=new Properties();
//		FileInputStream ConfigPropertiesfile=new FileInputStream("config.properties");
//		configProp.load(ConfigPropertiesfile);
//		
//		log=log.getLogger("Project Cucumber BDD DemoProject");
//		PropertyConfigurator.configure("log4j.properties");
//		
//		initializeDriver();
//		
//		
//		
//	}

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() {
		
		
		log.info("****Launching Browser**");
		
		
	}

	@And("^Navigate to the \"([^\"]*)\"$")
	public void navigate_to_the(String url) {
//		System.out.println(driver);
		driver.get(url);
		log.info("*****Passing the URL ********");
//		System.out.println(driver);
	}

	// @And("^user enter the Email as \"([^\"]*)\" and Password as
	// \"([^\"]*)\"$")
	@When("user enter the Email as {string} and Password as {string}")
	public void user_enter_the_Email_as_and_Password_as(String username, String password) {

		lp = new LoginPage(driver);
		lp.usernametextbox(username);
		lp.passwordtextbox(password);
		log.info("*****Providing the user Information for Valid Single user ********");
	}

	@And("^para user enter the Email as (.+) and Password as (.+)$")
	public void parameterisation_user_enter_the_Email_as_and_Password_as(String username, String password) {

		lp = new LoginPage(driver);
		lp.usernametextbox(username);
		lp.passwordtextbox(password);
		log.info("*****Providing the user information for data driven testing for multiple sets of data ********");
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() {
		lp.loginbutton();
		log.info("*****Clicking on Login button ********");
	}

	@Then("^Dashboard page should be displayed url should be \"([^\"]*)\"$")
	public void dashboard_page_should_be_displayed_url_should_be_something(String url) {
		// This Wait is coming from the base class
		// wait.until(ExpectedConditions.visibilityOf(lp.dashboarddropdown()));
		Assert.assertEquals(url, driver.getCurrentUrl());
		log.info("*****Opening the Dashboard page after login ********");

	}

	@And("^close the Browser$")
	public void close_the_browser() {
		driver.quit();
		log.info("*****Closed the browser********");
	}

}
