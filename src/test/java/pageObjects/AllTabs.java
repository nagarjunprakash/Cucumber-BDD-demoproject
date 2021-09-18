package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AllTabs {
	public WebDriver driver;

	By adminTab = By.id("menu_admin_viewAdminModule");
	By pimTab = By.id("menu_pim_viewPimModule");
	By leaveTab = By.id("menu_leave_viewLeaveModule");
	By timeTab = By.id("menu_recruitment_viewRecruitmentModule");
	By myInfoTab = By.id("menu_pim_viewMyDetails");
	By performanceTab = By.id("menu__Performance");
	By dashboardTab = By.id("menu_dashboard_index");
	By directoryTab = By.id("menu_directory_viewDirectory");
	By maintainaceTab = By.xpath("(//a[@id='menu_maintenance_purgeEmployee'])[1]");
	By buzzTab = By.id("menu_buzz_viewBuzz");
	By recruitmentsTab=By.id("menu_recruitment_viewRecruitmentModule");

	public AllTabs(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement adminTab() {
		return driver.findElement(adminTab);
	}
	
	public WebElement pimTab() {
		return driver.findElement(pimTab);
	}

	public WebElement leaveTab() {
		return driver.findElement(leaveTab);
	}

	public WebElement timeTab() {
		return driver.findElement(timeTab);
	}

	public WebElement performanceTab() {
		return driver.findElement(performanceTab);
	}

	public WebElement dashboardTab() {
		return driver.findElement(dashboardTab);
	}

	public WebElement directoryTab() {
		return driver.findElement(directoryTab);
	}

	public WebElement maintainaceTab() {
		return driver.findElement(maintainaceTab);
	}
	
	public WebElement buzzTab() {
		return driver.findElement(buzzTab);
	}

	public WebElement recruitmentsTab() {
		return driver.findElement(recruitmentsTab);
	}



}
