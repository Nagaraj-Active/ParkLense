package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/NewClient.feature",
                   glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/NewClientReport.html"}
		        )

public class RunnerNewClient 
{

}
