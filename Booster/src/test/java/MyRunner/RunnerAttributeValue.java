package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/HAttributeValue/AvDeletion.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/attributeValueReport.html"}
		)

public class RunnerAttributeValue 
{

}
