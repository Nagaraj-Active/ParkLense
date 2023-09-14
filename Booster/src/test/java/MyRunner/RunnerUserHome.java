package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/User.feature",
                   glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/UserReport.html"}
		        )

public class RunnerUserHome 
{

}
