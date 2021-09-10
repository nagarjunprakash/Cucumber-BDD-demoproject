package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pageObjects.AllTabs;
import pageObjects.UsermanagementPage;
import pageObjects.jobsPage;
import utilities.ActionsClass;
import utilities.DropdownSelectResult;
import utilities.TableresultsUtility;
import utilities.base;

public class Step2 extends base {
	// WebDriver driver;
	AllTabs at;
	UsermanagementPage up;
	String randomName = base.randomString();
	DropdownSelectResult dropdwnselectvariable;
	jobsPage jp;
	ActionsClass act;
	TableresultsUtility tableResult;

	@When("^Navigate to the usermanagement page$")
	public void navigate_to_the_usermanagement_page() {
		System.out.println(driver);
		at = new AllTabs(driver);
		at.adminTab().click();

	}

	@And("^click on add button$")
	public void click_on_add_button() {
		up = new UsermanagementPage(driver);
		Assert.assertTrue(up.SystemUsersValiation().isDisplayed()); // Users
		up.addButton().click();

	}

	@And("^Add userpage should be displayed and enter all the feilds and click on save$")
	public void add_userpage_should_be_displayed_and_enter_all_the_feilds_and_click_on_save()
			throws InterruptedException {
		Assert.assertTrue(up.addUserPage().isDisplayed()); // Add userpage
															// validation
		up.addUseruserRole("Admin");
		up.addUserEmployeeName("C", "Cecil Bonaparte");
		up.addUserName(randomName);
		up.addUserStatus("Enabled");
		up.addUserPassword("Password123@%*#(BSHUDU)");
		up.addUserConfirmPassword("Password123@%*#(BSHUDU)");
		Thread.sleep(3000);
		up.addUserSavebutton().click();

	}

	@And("^Succefullysaved message should be displayed$")
	public void succefullysaved_message_should_be_displayed() {
		System.out.println(up.savedMessage().isDisplayed());
		Assert.assertTrue(up.savedMessage().isDisplayed());
	}

	@Then("^Search the user in the Search box by entering username and Employee Name$")
	public void search_the_user_in_the_search_box_by_entering_username_and_employee_name() throws InterruptedException {
		System.out.println(up.searchEmployeName());
		driver.navigate().refresh();
		Thread.sleep(3000);
		dropdwnselectvariable = new DropdownSelectResult(driver);
		String text = up.searchEmployeName().split(" ")[0];
		up.employeeName().sendKeys(text);
		dropdwnselectvariable.dropdownSelectResult(up.searchEmployeName(), up.allsuggestions());
		up.searchButton().click();
		Thread.sleep(2000);

	}

	@And("^The user should be reflected in the Table search$")
	public void the_user_should_be_reflected_in_the_table_search() {

		up.randomName(randomName);
		Assert.assertTrue(up.allSearchResults());

	}
	
	
	@And("^Navigate to the job Titles Page$")
    public void navigate_to_the_job_titles_page() throws InterruptedException  {
		jp=new jobsPage(driver);
		act=new ActionsClass(driver);
		act.mouseoverandselectoption(jp.jobTab(), jp.jobTabsAllPages(),"Job Titles"); 
		 Assert.assertTrue(jp.jobTitlesPageHeader().isDisplayed());
		 Thread.sleep(3000);
		  
	  }

	 @And("^create the new job title by clicking on add button, once added job title should be visible in table$")
	    public void create_the_new_job_title_by_clicking_on_add_button_once_added_job_title_should_be_visible_in_table() throws InterruptedException  {
	   
		jp.AddButton().click();
		Thread.sleep(3000);
		jp.jobTitleTextbox().sendKeys(randomName);
		jp.noteTextBox().sendKeys(randomName);
		jp.jobTitleTextbox().sendKeys(randomName);
		jp.saveButton().click();
		Assert.assertTrue(jp.jobTitlesPageHeader().isDisplayed());    
	    Thread.sleep(3000);
	    
	    
	    }
	    
	 @Then("^Search the added job title is present in the job Titles page and delete the title$")
	    public void search_the_added_job_title_is_present_in_the_job_titles_page_and_delete_the_title() throws InterruptedException  {
		 tableResult=new TableresultsUtility(driver);
		 tableResult.tableSorting(jp.allRows(), randomName);	
		 jp.deleteButton().click();
		 Thread.sleep(2000);
		 jp.popupDeleteButton().click();
		 Thread.sleep(3000);
	    }

	 @And("^verify that job title has been deleted from the job Titles table$")
	    public void verify_that_job_title_has_been_deleted_from_the_job_titles_table()   {
	        
		 tableResult.verifyElementinTable(jp.allRows(),randomName);
	     
		 Assert.assertFalse(randomName+" is not removed from Table",tableResult.flag );
		 System.out.println("Deleted the jobTile "+randomName +" from the table"); 
	 }
	
	@And("^close the Browser$")
	public void close_the_browser() {
		driver.quit();

	}

}
