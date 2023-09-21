package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = /*"./AdminRole/AllPageComponents.feature",*/
                            "./AdminRole/Creation.feature",
                     glue = {"stepdefination","myBrowsers"},
                   plugin = {"html:./target/AllPageComponents/Creation.html"}
		)


public class RunnerAdminRoleAllComponents {

}