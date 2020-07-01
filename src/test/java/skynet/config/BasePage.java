package skynet.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;

    public void initialization(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void setURL(String url){
        driver.get(url);
    }


}
