package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

        public static void main(String[] args) {
            String baseurl = "https://www.x-cart.com/";
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            WebDriver obj = new FirefoxDriver();
            obj.get(baseurl);
            obj.manage().window().maximize();
            //obj.close();
            obj.quit();
        }
    }

