$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/features/login.feature");
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
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Successful Login to the application with valid credentials Data driven testing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "para user enter the Email as \u003cusername\u003e and Password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "click on the login button",
  "keyword": "When "
});
formatter.step({
  "name": "Dashboard page should be displayed url should be \"https://opensource-demo.orangehrmlive.com/index.php/dashboard\"",
  "keyword": "Then "
});
formatter.step({
  "name": "close the Browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "test1",
        "test1"
      ]
    },
    {
      "cells": [
        "test2",
        "test2"
      ]
    }
  ]
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
  "name": "Successful Login to the application with valid credentials Data driven testing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "para user enter the Email as test1 and Password as test1",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.parameterisation_user_enter_the_Email_as_and_Password_as(String,String)"
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
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...mlive.com/index.php/[dashboard]\u003e but was:\u003c...mlive.com/index.php/[auth/validateCredentials]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinations.Step1.dashboard_page_should_be_displayed_url_should_be_something(Step1.java:93)\r\n\tat ✽.Dashboard page should be displayed url should be \"https://opensource-demo.orangehrmlive.com/index.php/dashboard\"(file:src/test/resource/features/login.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
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
formatter.scenario({
  "name": "Successful Login to the application with valid credentials Data driven testing",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "para user enter the Email as test2 and Password as test2",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.parameterisation_user_enter_the_Email_as_and_Password_as(String,String)"
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
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...mlive.com/index.php/[dashboard]\u003e but was:\u003c...mlive.com/index.php/[auth/validateCredentials]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinations.Step1.dashboard_page_should_be_displayed_url_should_be_something(Step1.java:93)\r\n\tat ✽.Dashboard page should be displayed url should be \"https://opensource-demo.orangehrmlive.com/index.php/dashboard\"(file:src/test/resource/features/login.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resource/features/recruitment.feature");
formatter.feature({
  "name": "Recruitment(Step3)",
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
  "name": "when the Candidates profile is searched in the filer then the relavent results should be displayed in the table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "Navigate to Recruitment page by clicking in the Recruitment Tab",
  "keyword": "When "
});
formatter.match({
  "location": "Step3.navigate_to_recruitment_page_by_clicking_in_the_recruitment_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter all the relavent feilds of the filter and click on search",
  "keyword": "And "
});
formatter.match({
  "location": "Step3.enter_all_the_relavent_feilds_of_the_filter_and_click_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In the table relavent search results sould be displayed as per the filter Applied",
  "keyword": "Then "
});
formatter.match({
  "location": "Step3.in_the_table_relavent_search_results_sould_be_displayed_as_per_the_filter_applied()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step1.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resource/features/usermanagement.feature");
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
  "location": "Step1.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
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
  "location": "Step1.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});