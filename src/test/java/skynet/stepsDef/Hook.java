package skynet.stepsDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import skynet.config.BasePage;

public class Hook extends BasePage {
    @Before
    public void setUp(){
        initialization();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
