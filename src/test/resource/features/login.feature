Feature: Login(Step1)

Background: These are the common steps found across the scenarios implemented in this feature
Given Initialize browser with chrome
And Navigate to the "https://opensource-demo.orangehrmlive.com/index.php/auth/login"


@sanity
Scenario: Successful Login to the application with valid credentials
And user enter the Email as "Admin" and Password as "admin123"
When click on the login button
Then Dashboard page should be displayed url should be "https://opensource-demo.orangehrmlive.com/index.php/dashboard"
And close the Browser

@regression
Scenario Outline: Successful Login to the application with valid credentials Data driven testing
And para user enter the Email as <username> and Password as <password>
When click on the login button
Then Dashboard page should be displayed url should be "https://opensource-demo.orangehrmlive.com/index.php/dashboard"
And close the Browser

Examples:
|username|password|
|test1|test1|
|test2|test2|