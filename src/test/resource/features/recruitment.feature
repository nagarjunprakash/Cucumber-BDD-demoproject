Feature: Recruitment(Step3)

  Background: These are the common steps found across the scenarios implemented in this feature
    Given Initialize browser with chrome
    And Navigate to the "https://opensource-demo.orangehrmlive.com/index.php/auth/login"
    #And Navigate to the "https://opensource-demo.orangehrmlive.com"
    And user enter the Email as "Admin" and Password as "admin123"
    When click on the login button
    Then Dashboard page should be displayed url should be "https://opensource-demo.orangehrmlive.com/index.php/dashboard"

  @test
  Scenario: when the Candidates profile is searched in the filer then the relavent results should be displayed in the table
    When Navigate to Recruitment page by clicking in the Recruitment Tab
    And Enter all the relavent feilds of the filter and click on search
    Then In the table relavent search results sould be displayed as per the filter Applied
    And close the Browser
