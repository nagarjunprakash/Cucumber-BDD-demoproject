package testRunner;

import org.junit.runner.RunWith;

//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
// (features={"src/test/resource/login.feature","src/test/resource/usermanagement.feature"},
// features={"src/test/resource/usermanagement.feature"},
(features = { "src/test/resource/features" },
		glue = { "stepDefinations" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"html:target/HTMLReports",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:test-output" },
// tags={"@sanity"}
//tags={"@test"}		
// tags = {"@regression"}
//	tags="@regression"		
// tags={"@sanity","@regression"}
// tags={"@sanity,@regression"}
 tags={"@sanity,@regression,@test"}
//tags="@sanity,@regression,@test"
)
public class TestRun {

}