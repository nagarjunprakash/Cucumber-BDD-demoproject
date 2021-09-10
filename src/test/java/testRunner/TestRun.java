package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
// (features={"src/test/resource/login.feature","src/test/resource/usermanagement.feature"},
// features={"src/test/resource/usermanagement.feature"},
(features = { "src/test/resource" },
		glue = { "stepDefinations" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"html:target/HTMLReports" },
 tags={"@sanity"}
// tags = {"@regression"}
// tags={"@sanity","@regression"}
// tags={"@sanity,@regression"}
)
public class TestRun {

}
