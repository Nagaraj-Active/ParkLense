package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./ParklenseFeature/FCamera/CameraCreation.feature",
                          /*"./ParklenseFeature/FCamera/CameraUpdate.feature",
                         "./ParklenseFeature/FCamera/CameraDeletion.feature",*/
                    glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/CameraCreationReport.html"}
		)


public class RunnerCameraPage {

}
