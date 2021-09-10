package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class jobsPage {
	public WebDriver driver;

	By jobTab = By.id("menu_admin_Job");
	By jobTabsAllPages = By.xpath("//a[@id='menu_admin_Job']/following-sibling::ul[1]/li");
	By jobTitlesPageHeader=By.cssSelector("div[class='head'] h1");
	By AddButton=By.id("btnAdd");
	By deleteButton=By.id("btnDelete");
	By saveButton=By.id("btnSave");
	By allRows=By.xpath("//table[@id='resultTable']/tbody/tr");
	By checkbox=By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[1]");
	By jobTitleTextbox=By.id("jobTitle_jobTitle");
	By jobDescriptionTextbox=By.id("jobTitle_jobDescription");
	By noteTextBox=By.id("jobTitle_note");
	By popupDeleteButton=By.id("dialogDeleteBtn");
	
	public jobsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public WebElement jobTab() {
		return driver.findElement(jobTab);
	}
	
	public List<WebElement> jobTabsAllPages() {
		return driver.findElements(jobTabsAllPages);
	}
	public WebElement jobTitlesPageHeader() {
		return driver.findElement(jobTitlesPageHeader);
	}
	public WebElement AddButton() {
		return driver.findElement(AddButton);
	}
	
	public WebElement deleteButton() {
		return driver.findElement(deleteButton);
	}
	
	public WebElement saveButton() {
		return driver.findElement(saveButton);
	}
	public List<WebElement> allRows() {
		return driver.findElements(allRows);
	}
	
	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}
	public WebElement jobDescriptionTextbox() {
		return driver.findElement(jobDescriptionTextbox);
	}
	public WebElement noteTextBox() {
		return driver.findElement(noteTextBox);
	}
	public WebElement jobTitleTextbox() {
		return driver.findElement(jobTitleTextbox);
	}
	
	public WebElement popupDeleteButton() {
		return driver.findElement(popupDeleteButton);
	}
	
	
}
