Feature: Usermanagement(Step2)

Background: These are the common steps found across the scenarios implemented in this feature
Given Initialize browser with chrome
And Navigate to the "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
#And Navigate to the "https://opensource-demo.orangehrmlive.com"
And user enter the Email as "Admin" and Password as "admin123"
When click on the login button
Then Dashboard page should be displayed url should be "https://opensource-demo.orangehrmlive.com/index.php/dashboard"

@sanity
Scenario: Add the new user and search in the table
When Navigate to the usermanagement page
And click on add button
And Add userpage should be displayed and enter all the feilds and click on save
And Succefullysaved message should be displayed
Then Search the user in the Search box by entering username and Employee Name
And The user should be reflected in the Table search
And close the Browser