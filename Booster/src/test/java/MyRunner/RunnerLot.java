package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = /*"./ParklenseFeature/ELot/LotCreation.feature",
                          "./ParklenseFeature/ELot/LotUpdate.feature",*/
                         "./ParklenseFeature/ELot/LotDeletion.feature",
                    glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/LotdeletionReport.html"}
		)


public class RunnerLot {

}
