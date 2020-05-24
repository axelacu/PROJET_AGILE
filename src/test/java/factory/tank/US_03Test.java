package factory.tank;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = "pretty",
        features = "./src/test/resources/US_03.feature"
)
public class US_03Test {
}
