package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./AdminRole/AllPageComponents.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/LotAllPageComponents/Report.html"}
		)


public class RunnerLotAllPageComponents {

}
