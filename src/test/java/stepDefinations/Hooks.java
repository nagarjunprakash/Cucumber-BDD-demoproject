package stepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
import utilities.base;

public class Hooks extends base {

	@Before
	public void setup() throws IOException {

		configProp = new Properties();
		FileInputStream ConfigPropertiesfile = new FileInputStream("config.properties");
		configProp.load(ConfigPropertiesfile);

		log = log.getLogger("Project Cucumber BDD DemoProject");
		PropertyConfigurator.configure("log4j.properties");

		initializeDriver();

	}	
	@After(order=1)
	public void takesScreenshotOnFailure(Scenario scenario){
		
		if(scenario.isFailed())
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			
//			scenario.log("Screenshot is taken");
//			scenario.attach(src, "img/png", "screenshot");
			scenario.embed(src, "img/png");
			driver.close();
		}
		
		
		
	}

}
