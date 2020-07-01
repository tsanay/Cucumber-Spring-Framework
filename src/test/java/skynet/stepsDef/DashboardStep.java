package skynet.stepsDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import skynet.beans.DashboardPage;


public class DashboardStep {

    @Autowired
    private DashboardPage dashboard;

    @Then("^user navigated to dashboard$")
    public void user_navigated_to_dashboard(){
        dashboard.isLoggedIn("Admininstrator Administrator");
    }

    @And("^user clicks on username located on the top right corner$")
    public void user_clicks_on_username_located_on_the_top_right_corner(){
        dashboard.clickUsernameOptions();
    }

    @And("^user clicks on Log out option$")
    public void user_clicks_on_Log_out_option(){
        dashboard.clickLogout();
    }
}
