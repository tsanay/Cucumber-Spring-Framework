package skynet;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.*;

import skynet.config.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {"pretty","html:target/cucumber-html-report.html"},
        tags = "@Test",
        glue = {"skynet/stepsDef"}
)
public class CucumberRunnerTest {

}
