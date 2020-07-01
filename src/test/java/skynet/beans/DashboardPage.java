package skynet.beans;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import skynet.config.BasePage;

@Component
public class DashboardPage extends BasePage {

    By a_username_dashboard = By.xpath("//a[@href=\"#\"]");
    By h3_user_dashboard = By.xpath("//*[@id=\"displayName\"]");
    By btn_logout_dashboard = By.xpath("//*[@id=\"logoutForm\"]/button");

    public void isLoggedIn(String displayName){
        Assert.assertEquals(displayName,driver.findElement(h3_user_dashboard).getText());
    }

    public void clickUsernameOptions(){
        driver.findElement(a_username_dashboard).click();
    }

    public void clickLogout(){
        driver.findElement(btn_logout_dashboard).click();
    }
}
