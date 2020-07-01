package skynet.beans;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import skynet.config.BasePage;

import static org.junit.Assert.assertTrue;

@Component
public class LoginPage extends BasePage {


    By txt_username_login = By.name("EmailAddress");
    By txt_password_login = By.id("Password");
    By btn_login = By.xpath("//*[@type=\"submit\"]");
    By lbl_errormessage_login = By.xpath("//*[@id=\"login\"]/section/div[2]/div/form/div[1]/ul/li");

    public void sendURLToBasePage(String url){
        setURL(url);
    }

    public void setUsername(String username){
        driver.findElement(txt_username_login).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(txt_password_login).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void validateLogin() {
        assertTrue(driver.getPageSource().contains("Log out"));
    }

    public void validateErrorMessage(String message){
        Assert.assertEquals(message,driver.findElement(lbl_errormessage_login).getText());
    }

}
