package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.DropdownSelectResult;
import utilities.WaitHelper;

public class UsermanagementPage {
	WebDriver driver;
	WaitHelper wait;
	String searchEmployeName;
	String randomName;
//	DropdownSelectResult dropdwnselect;

	By usernameTextBox = By.name("searchSystemUser[userName]");
	By UserRoleDroprdown = By.id("menu_admin_viewAdminModule");
	By employeeName = By.cssSelector("#searchSystemUser_employeeName_empName");
	By searchButton = By.id("searchBtn");
	By resetButton = By.id("resetBtn");
	By addButton = By.id("btnAdd");
	By deleteButton = By.id("btnDelete");
	By SystemUsersValiation = By.id("systemUser-information");
	By savedMessage = By.xpath("//div[contains(.,'Successfully Saved')]");

	By addUserPage = By.cssSelector("#UserHeading");
	By addUserEmployeeName = By.id("systemUser_employeeName_empName");
	By addUserName = By.id("systemUser_userName");
	By addUserStatus = By.id("systemUser_status");
	By addUserPassword = By.id("systemUser_password");
	By addUserConfirmPassword = By.id("systemUser_confirmPassword");
	By addUseruserRole = By.id("systemUser_userType");
	By addUserSavebutton = By.id("btnSave");
	By allRowresult = By.xpath("//table[@id='resultTable']/tbody/tr");
	By allColumnsresult = By.xpath("//table[@id='resultTable']/thead/tr/th");
	By allsuggestions = By.xpath("//div[@class='ac_results']/ul/li");


	public UsermanagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WaitHelper(driver);
//		dropdwnselect = new DropdownSelectResult(driver);
	}
	
	public void randomName(String randomName) {
		this.randomName = randomName;
	}

	public WebElement searchButton() {
		wait.waitForElement(driver.findElement(searchButton), 5);
		return driver.findElement(searchButton);

	}

	public WebElement employeeName() {
		wait.waitForElement(driver.findElement(employeeName), 5);
		return driver.findElement(employeeName);

	}

	public WebElement savedMessage() {
		wait.waitForElement(driver.findElement(savedMessage), 5);
		return driver.findElement(savedMessage);

	}

	public WebElement SystemUsersValiation() {
		wait.waitForElement(driver.findElement(SystemUsersValiation), 5);
		return driver.findElement(SystemUsersValiation);
	}

	public WebElement addButton() {

		wait.waitForElement(driver.findElement(addButton), 10);
		return driver.findElement(addButton);

	}

	public WebElement addUserPage() {
		return driver.findElement(addUserPage);
	}

	public List<WebElement> allRowresult() {

		return driver.findElements(allRowresult);
	}

	public List<WebElement> allsuggestions() {

		return driver.findElements(allsuggestions);
	}

	public void addUseruserRole(String selectrole) {
		wait.waitForElement(driver.findElement(addUseruserRole), 10);
		Select UserroleDropdown = new Select(driver.findElement(addUseruserRole));
		List<WebElement> alloptions = UserroleDropdown.getOptions();

		for (int i = 0; i < UserroleDropdown.getOptions().size(); i++) {
			if (alloptions.get(i).getText().contains(selectrole)) {
				alloptions.get(i).click();
			}

		}

	}

	public void addUserName(String username) {
		wait.waitForElement(driver.findElement(addUserName), 10);
		driver.findElement(addUserName).sendKeys(username);

	}

	public void addUserPassword(String password) {
		wait.waitForElement(driver.findElement(addUserPassword), 10);

		driver.findElement(addUserPassword).sendKeys(password);
	}

	public void addUserConfirmPassword(String confirmPassword) {
		wait.waitForElement(driver.findElement(addUserConfirmPassword), 10);
		driver.findElement(addUserConfirmPassword).sendKeys(confirmPassword);
	}

	public void addUserStatus(String status) {
		wait.waitForElement(driver.findElement(addUserStatus), 10);
		Select userstatusDropdown = new Select(driver.findElement(addUserStatus));

		List<WebElement> allOptions = userstatusDropdown.getOptions();

		for (int i = 1; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(status)) {

				allOptions.get(i).click();
			}
		}
	}

	public void addUserEmployeeName(String keywords, String nametoselect) {
		wait.waitForElement(driver.findElement(addUserEmployeeName), 10);
		driver.findElement(addUserEmployeeName).sendKeys(keywords);

		List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));

		for (int i = 0; i < allsuggestions.size(); i++) {
			if (allsuggestions.get(i).getText().contains(nametoselect)) {
				System.out.println(allsuggestions.get(i).getText());
				searchEmployeName = allsuggestions.get(i).getText();
				allsuggestions.get(i).click();
				break;
			}

		}

	}

	public String searchEmployeName() {

		return searchEmployeName;
	}

	public WebElement addUserSavebutton() {
		wait.waitForElement(driver.findElement(addUserSavebutton), 10);
		return driver.findElement(addUserSavebutton);

	}

	public boolean allSearchResults() {

		boolean flag = false;
		for (int i = 0; i < driver.findElements(allRowresult).size(); i++) {

			// for (int j = 0; j < driver.findElements(allColumnsresult).size();
			// j++) {

			// String text =
			// driver.findElements(allColumnsresult).get(i).findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+j+"]/td")).getText();
			String text = driver.findElements(allRowresult).get(i).getText();

			if (text.contains(searchEmployeName) && text.contains(randomName)) {
				System.out.println("The user is " + searchEmployeName + " with name " + randomName
						+ " is reflecting in the table");
				flag = true;
				break;
			}
			// }

		}
		return flag;

	}

}
