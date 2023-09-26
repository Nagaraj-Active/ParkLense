package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
/*@CucumberOptions(features = "./ParklenseFeature/GAttribute/AbCreation.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/attributeReport.html"}
		)*/
//@CucumberOptions(features = "./ParklenseFeature/GAttribute/AbUpdation.feature",
//glue = {"stepdefination","myBrowsers"},
//plugin = {"html:./target/AbUpdate.html"}
@CucumberOptions(features = "./ParklenseFeature/GAttribute/AbDeletion.feature",
glue = {"stepdefination","myBrowsers"},
plugin = {"html:./target/Deletion.html"}
)
public class RunnerAttribute 
{

}
