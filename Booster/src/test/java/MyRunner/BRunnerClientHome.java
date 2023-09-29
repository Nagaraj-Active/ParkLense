package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/BClient/ClientCreation.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/Client/Update.html"})

              

public class BRunnerClientHome 
{

}
