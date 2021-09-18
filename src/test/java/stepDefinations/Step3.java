package stepDefinations;

import org.junit.Assert;
import org.mortbay.util.ajax.WaitingContinuation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ch.qos.logback.core.net.SyslogOutputStream;
import cucumber.api.java.en.*;
//import io.cucumber.java.en.*;

import pageObjects.AllTabs;
import pageObjects.RecruitmentsPage;
import utilities.ActionsClass;
import utilities.DatePickerDateselection;
import utilities.DropdownSelectResult;
import utilities.WaitHelper;
import utilities.base;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step3 extends base {
	AllTabs at;
	RecruitmentsPage rt;
	DropdownSelectResult dropselect;
	// DatePickerDateselection dp;
	// ActionsClass act1;

	@When("^Navigate to Recruitment page by clicking in the Recruitment Tab$")
	public void navigate_to_recruitment_page_by_clicking_in_the_recruitment_tab() {
		at = new AllTabs(driver);
		at.recruitmentsTab().click();
		rt = new RecruitmentsPage(driver);
		Assert.assertTrue(rt.candidatesFilterwindow().isDisplayed());

	}

	@And("^Enter all the relavent feilds of the filter and click on search$")
    public void enter_all_the_relavent_feilds_of_the_filter_and_click_on_search() throws InterruptedException {
    	dropselect=new DropdownSelectResult(driver);
    	dropselect.dropdownSelectclass("All", rt.jobTitleDropdown());
    	dropselect.dropdownSelectclass("Senior QA Lead", rt.vacancyDropdown());
    	dropselect.dropdownSelectclass("Odis Adalwin", rt.hiringManageDropdown());
    	dropselect.dropdownSelectclass("Application Initiated", rt.stausDropdown());
//    	rt.candidateNameTextBox().sendKeys("Phil Hughes");
//    	dropselect.dropdownSelectResultAutosugestion("Phil Hughes", rt.candidateNameTextBoxAutosugesstion());
    	rt.datePickerIconFrom().click();
    	
 //   	custom utility for Date Picker Causing Stale Element Reference Exception
//    	rt.dp.selectMonthandYear(rt.datepickerMonth(),rt.datepickerYear(), rt.datepickerLeftarrow(),"Aug 2019",rt.act);
    	
 
 //		to select the from date	
    	int i=0;
    	while(!(rt.datepickerMonth().getText().contains("Jan") && rt.datepickerYear().getText().contains("2019")))
    	{
    		waitmethod(driver).until(ExpectedConditions.elementToBeClickable(rt.datepickerLeftarrow()));
    		rt.act.mouseover(rt.datepickerLeftarrow());
//    		System.out.println(rt.datepickerMonth().getText()+" "+rt.datepickerYear().getText());
    		i++;
    		
    	}
    	
    	rt.dp.selectDate(rt.allDatesinDatePicker(), "4");
    
    
 // 	to select the to date
    	rt.datePickerIconTo().click();
    	while(!(rt.datepickerMonth().getText().contains("Dec") && rt.datepickerYear().getText().contains("2020"))){
    		
    		waitmethod(driver).until(ExpectedConditions.elementToBeClickable(rt.datepickerLeftarrow()));
    		rt.act.mouseover(rt.datepickerLeftarrow());
//    		System.out.println(rt.datepickerMonth().getText()+" "+rt.datepickerYear().getText());
    		i++;
    			}
    	rt.dp.selectDate(rt.allDatesinDatePicker(), "20");
    	rt.searchButton().click();
    }

	@Then("^In the table relavent search results sould be displayed as per the filter Applied$")
	public void in_the_table_relavent_search_results_sould_be_displayed_as_per_the_filter_applied() {

		System.out.println("The No of Candidates in the Search result is "+ rt.allRowsResult().stream().count()+" & the Candidates names are below ");
//		rt.allRowsResult().stream().map(s->rt.getCandidatename(s)).map(s->s.split(" ")[3]+" "+s.split(" ")[4]).forEach(s->System.out.println(s));
		 rt.allRowsResult().stream().map(s->s.findElement(By.xpath("td[3]"))).map(s->rt.getCandidatename(s)).forEach(s->System.out.println(s));
	}

}
