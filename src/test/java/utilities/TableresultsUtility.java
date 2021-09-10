package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TableresultsUtility {
	WebDriver driver;
	public boolean  flag =true;

	public TableresultsUtility(WebDriver driver) {
		this.driver = driver;

	}

	public void tableSorting(List<WebElement> allRows, String text) {

		for (WebElement ele : allRows) {

			if (ele.getText().contains(text)) {
				ele.findElement(By.xpath("td[1]")).click();
				break;
			}
		}

	}

	public void verifyElementinTable(List<WebElement> allRows, String text) {
		for (WebElement ele : allRows) {

			if (ele.getText().contains(text)) {
				System.out.println(text + "Present in the Table");
			} else {
				 flag = false;
			}
			

		}

	}
}
