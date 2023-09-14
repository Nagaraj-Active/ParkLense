package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/Client.feature",
                   glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/ClientReport.html"}
		        )

public class RunnerClientHome 
{

}
