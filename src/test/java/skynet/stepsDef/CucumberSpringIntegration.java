package skynet.stepsDef;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration("classpath:cucumber.xml")
public class CucumberSpringIntegration {
}
