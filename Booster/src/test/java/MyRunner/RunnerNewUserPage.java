package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/NewUser.feature",
                   glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/NewUserReport.html"}
		        )

public class RunnerNewUserPage 
{

}
