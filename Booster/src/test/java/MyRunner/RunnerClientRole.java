package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/IClientRole/CrDeletion.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/ClientRole/DeletionReport.html"}
		)

public class RunnerClientRole 
{

}
