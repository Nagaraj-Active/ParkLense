package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/Setting/ClientRole.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/ClientRoleReport.html"}
		)

public class RunnerClientRole 
{

}
