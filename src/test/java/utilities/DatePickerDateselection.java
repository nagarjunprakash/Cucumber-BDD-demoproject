package utilities;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DatePickerDateselection {
	
	
	WebDriver driver;
	
	public DatePickerDateselection(WebDriver driver )
	{
		
		this.driver=driver;
	}
	
	
	public void selectMonthandYear(WebElement monthElement,WebElement yearElement, WebElement datepickerLeftarrow,String monthYearText,ActionsClass act)
	{
		while(!(monthElement.getText().contains(monthYearText.split(" ")[0]) && yearElement.getText().contains(monthYearText.split(" ")[1])) )
		{
			

			if(datepickerLeftarrow.isDisplayed())
			{
				try {
					act.mouseover(datepickerLeftarrow);
					System.out.println(monthElement.getText()+" "+yearElement.getText());
				} catch (StaleElementReferenceException e) {
//					System.out.println(e.toString());
					act.mouseover(datepickerLeftarrow);
					
				}
			}
			
//			else if (driver.findElement(By.cssSelector("ui-datepicker-prev ui-corner-all ui-state-hover ui-datepicker-prev-hover")).isDisplayed())
//			{
//				try {
//					act.mouseover(driver.findElement(By.cssSelector("ui-datepicker-prev ui-corner-all ui-state-hover ui-datepicker-prev-hover")));
//					System.out.println(monthElement.getText()+" "+yearElement.getText());
//				} catch (StaleElementReferenceException e) {
//					System.out.println(e.toString());
//				}
//				
//				
//			}
			
			
		}
		
	}
	
	public void selectDate(List<WebElement> alldates, String requireddate)
	{
		
		for(int i=0;i<alldates.size();i++)
		{
			if(alldates.get(i).getText().contains(requireddate))
			{
				alldates.get(i).click();
				break;
			}
			
		}
		
	}
	

}
