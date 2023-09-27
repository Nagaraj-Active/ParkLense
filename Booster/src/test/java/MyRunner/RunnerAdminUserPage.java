package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "./ParklenseFeature/KAdminUser/AUDeletion.feature",
glue = {"stepdefination","myBrowsers"},
plugin = {"html:./target/AdminUser/Delete.html"}
)
public class RunnerAdminUserPage 
{

}
