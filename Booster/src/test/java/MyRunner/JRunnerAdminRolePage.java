package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/JAdminRole/Delete.feature",
                   glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/AdmintRole/Delete.html"}
		        )

public class JRunnerAdminRolePage 
{

}
