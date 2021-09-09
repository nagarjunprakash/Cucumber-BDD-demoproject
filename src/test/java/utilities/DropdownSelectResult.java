package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownSelectResult {
	
	WebDriver driver;
	
	public DropdownSelectResult(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void  dropdownSelectResult(String searchEmployeeName,List<WebElement> allsuggestions)
	{
		
		for(int i=0;i<allsuggestions.size();i++)
		{
			if(allsuggestions.get(i).getText().contains(searchEmployeeName))
			{
				allsuggestions.get(i).click();
				
			}
		
		}
		
	}
	

}
