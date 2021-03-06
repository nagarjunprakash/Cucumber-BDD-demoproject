$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/login.feature");
formatter.feature({
  "name": "Login(Step1)",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "These are the common steps found across the scenarios implemented in this feature",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize browser with chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Step1.initialize_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the \"https://opensource-demo.orangehrmlive.com/index.php/auth/login\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.navigate_to_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful Login to the application with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user enter the Email as \"Admin\" and Password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.user_enter_the_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Step1.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard page should be displayed url should be \"https://opensource-demo.orangehrmlive.com/index.php/dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step1.dashboard_page_should_be_displayed_url_should_be_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resource/usermanagement.feature");
formatter.feature({
  "name": "Usermanagement(Step2)",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "These are the common steps found across the scenarios implemented in this feature",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize browser with chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Step1.initialize_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the \"https://opensource-demo.orangehrmlive.com/index.php/auth/login\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.navigate_to_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the Email as \"Admin\" and Password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.user_enter_the_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Step1.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard page should be displayed url should be \"https://opensource-demo.orangehrmlive.com/index.php/dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step1.dashboard_page_should_be_displayed_url_should_be_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add the new user and search in the table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Navigate to the usermanagement page",
  "keyword": "When "
});
formatter.match({
  "location": "Step2.navigate_to_the_usermanagement_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add button",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.click_on_add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add userpage should be displayed and enter all the feilds and click on save",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.add_userpage_should_be_displayed_and_enter_all_the_feilds_and_click_on_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Succefullysaved message should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.succefullysaved_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search the user in the Search box by entering username and Employee Name",
  "keyword": "Then "
});
formatter.match({
  "location": "Step2.search_the_user_in_the_search_box_by_entering_username_and_employee_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be reflected in the Table search",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.the_user_should_be_reflected_in_the_table_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "These are the common steps found across the scenarios implemented in this feature",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Initialize browser with chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "Step1.initialize_browser_with_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the \"https://opensource-demo.orangehrmlive.com/index.php/auth/login\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.navigate_to_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the Email as \"Admin\" and Password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.user_enter_the_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Step1.click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Dashboard page should be displayed url should be \"https://opensource-demo.orangehrmlive.com/index.php/dashboard\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step1.dashboard_page_should_be_displayed_url_should_be_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add the job Titles and verify once after job Title is Added",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "Navigate to the usermanagement page",
  "keyword": "When "
});
formatter.match({
  "location": "Step2.navigate_to_the_usermanagement_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the job Titles Page",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.navigate_to_the_job_titles_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "create the new job title by clicking on add button, once added job title should be visible in table",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.create_the_new_job_title_by_clicking_on_add_button_once_added_job_title_should_be_visible_in_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search the added job title is present in the job Titles page and delete the title",
  "keyword": "Then "
});
formatter.match({
  "location": "Step2.search_the_added_job_title_is_present_in_the_job_titles_page_and_delete_the_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that job title has been deleted from the job Titles table",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.verify_that_job_title_has_been_deleted_from_the_job_titles_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step2.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});