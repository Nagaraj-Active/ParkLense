package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/Site.feature",
                   glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/SiteReport.html"}
		        )

public class RunnerSiteHome 
{

}
