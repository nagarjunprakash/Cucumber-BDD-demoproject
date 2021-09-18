package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities.ActionsClass;
import utilities.DatePickerDateselection;
import utilities.WaitHelper;

public class RecruitmentsPage {
	WebDriver driver;
	public WaitHelper wait;
	public DatePickerDateselection dp;
	public ActionsClass act;

	By candidatesFilterwindow = By.id("srchCandidates");
	By jobTitleDropdown = By.xpath("//select[@id='candidateSearch_jobTitle']");
	By vacancyDropdown = By.xpath("//select[@id='candidateSearch_jobVacancy']");
	By hiringManageDropdown = By.xpath("//select[@id='candidateSearch_hiringManager']");
	By stausDropdown = By.xpath("//select[@id='candidateSearch_status']");
	By candidateNameTextBox = By.xpath("//input[@id='candidateSearch_candidateName']");
	By candidateNameTextBoxAutosugesstion = By.xpath("//div[@class='ac_results']/ul/li");
	By dateofApplictionFrom = By.xpath("//input[@id='candidateSearch_fromDate']");
	By dateofApplicationto = By.xpath("//input[@id='candidateSearch_toDate']");
	By datePickerIconFrom = By.xpath("//li[7]//img[1]");
	By datePickerIconTo = By.xpath("//li[8]//img[1]");
	By allRowsResult = By.xpath("//table[@id='resultTable']/tbody/tr");
	By datepickerLeftarrow = By.cssSelector(".ui-icon.ui-icon-circle-triangle-w");
	By datepickerRightarrow = By.cssSelector(".ui-icon.ui-icon-circle-triangle-e");
	By datepickerMonth = By.cssSelector(".ui-datepicker-month option[selected='selected']");
	By datepickerYear = By.cssSelector(".ui-datepicker-year option[selected='selected']");
	By allDatesinDatePicker = By.cssSelector(".ui-datepicker-calendar td");
	By searchButton=By.id("btnSrch");
	
	
	
	public RecruitmentsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WaitHelper(driver);
		dp = new DatePickerDateselection(driver);
		act = new ActionsClass(driver);

	}

	public WebElement candidatesFilterwindow() {
		wait.waitForElement(driver.findElement(candidatesFilterwindow), 5);
		return driver.findElement(candidatesFilterwindow);
	}

	public WebElement jobTitleDropdown() {
		wait.waitForElement(driver.findElement(jobTitleDropdown), 5);
		return driver.findElement(jobTitleDropdown);
	}

	public WebElement vacancyDropdown() {
		wait.waitForElement(driver.findElement(vacancyDropdown), 5);
		return driver.findElement(vacancyDropdown);
	}

	public WebElement hiringManageDropdown() {
		wait.waitForElement(driver.findElement(hiringManageDropdown), 5);
		return driver.findElement(hiringManageDropdown);
	}

	public WebElement stausDropdown() {
		wait.waitForElement(driver.findElement(stausDropdown), 5);
		return driver.findElement(stausDropdown);
	}

	public WebElement candidateNameTextBox() {
		wait.waitForElement(driver.findElement(candidateNameTextBox), 5);
		return driver.findElement(candidateNameTextBox);
	}

	public List<WebElement> candidateNameTextBoxAutosugesstion() {
		wait.waitForElement(driver.findElement(candidateNameTextBoxAutosugesstion), 5);
		return driver.findElements(candidateNameTextBoxAutosugesstion);
	}

	public WebElement dateofApplictionFrom() {
		wait.waitForElement(driver.findElement(dateofApplictionFrom), 5);
		return driver.findElement(dateofApplictionFrom);
	}

	public WebElement dateofApplicationto() {
		wait.waitForElement(driver.findElement(dateofApplicationto), 5);
		return driver.findElement(dateofApplicationto);
	}

	public WebElement datePickerIconFrom() {
		wait.waitForElement(driver.findElement(datePickerIconFrom), 5);
		return driver.findElement(datePickerIconFrom);
	}

	public WebElement datePickerIconTo() {
		wait.waitForElement(driver.findElement(datePickerIconTo), 5);
		return driver.findElement(datePickerIconTo);
	}

	public List<WebElement> allRowsResult() {
		wait.waitForElement(driver.findElement(allRowsResult), 5);
		return driver.findElements(allRowsResult);
	}

	public WebElement datepickerLeftarrow() {
		wait.waitForElement(driver.findElement(datepickerLeftarrow), 5);
		return driver.findElement(datepickerLeftarrow);
	}

	public WebElement datepickerRightarrow() {
		wait.waitForElement(driver.findElement(datepickerRightarrow), 5);
		return driver.findElement(datepickerRightarrow);
	}

	public WebElement datepickerMonth() {
		try {
			wait.waitForElement(driver.findElement(datepickerMonth), 5);
			return driver.findElement(datepickerMonth);
		} catch (StaleElementReferenceException e) {
			wait.waitForElement(driver.findElement(datepickerMonth), 5);
			return driver.findElement(datepickerMonth);
		}

	}

	public WebElement datepickerYear() {
		try {
			wait.waitForElement(driver.findElement(datepickerYear), 5);
			return driver.findElement(datepickerYear);
		} catch (StaleElementReferenceException e) {
			wait.waitForElement(driver.findElement(datepickerYear), 5);
			return driver.findElement(datepickerYear);
		}
		
		
	}

	public List<WebElement> allDatesinDatePicker() {
		wait.waitForElement(driver.findElement(allDatesinDatePicker), 5);
		return driver.findElements(allDatesinDatePicker);
	}
	
	
	public WebElement searchButton() {
		wait.waitForElement(driver.findElement(searchButton), 5);
		return driver.findElement(searchButton);
	}

	public String getCandidatename(WebElement s) {
		String candidateName = s.getText();
		return candidateName;
	}

}
