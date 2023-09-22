package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = /*"./ParklenseFeature/DSite/SiteCreation.feature",
                           "./ParklenseFeature/DSite/SiteUpdate.feature",*/
                           "./ParklenseFeature/DSite/SiteDeletion.feature",
 					glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/SiteDeleteReport.html"}
		        )

public class RunnerSitePage 
{

}
