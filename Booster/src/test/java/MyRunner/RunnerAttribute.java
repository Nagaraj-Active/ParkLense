package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/Setting/attribute.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/attributeReport.html"}
		)

public class RunnerAttribute 
{

}
