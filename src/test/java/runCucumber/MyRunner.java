package runCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/featureFiles", glue = "stepDefs", tags = "@Smoke", // we can select by
																									// tags which TC
																									// category should
																									// run
		plugin = { "pretty", "html:target/CucumberHTMLReport.html" // this creates HTML reports
		})
public class MyRunner {

}
