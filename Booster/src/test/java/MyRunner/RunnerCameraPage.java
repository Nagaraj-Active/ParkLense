package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = /*"./ParklenseFeature/FCamera/CameraCreation.feature",*/
                          "./ParklenseFeature/FCamera/CameraDeletion.feature",
                        /* "./ParklenseFeature/FCamera/CameraDeletion.feature",*/
                    glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/CameraDeleteReport.html"}
		)


public class RunnerCameraPage {

}
