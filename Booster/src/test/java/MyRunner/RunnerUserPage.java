package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
/*@CucumberOptions(features = "./ParklenseFeature/CUser/NewUserCreation.feature",
                   glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/UserCreationReport.html"}
		        )*/
@CucumberOptions(features = "./ParklenseFeature/CUser/UpdateUser.feature",
glue = {"stepdefination","myBrowsers"},
plugin = {"html:./target/UserUpdationReport.html"}
)
public class RunnerUserPage 
{

}
