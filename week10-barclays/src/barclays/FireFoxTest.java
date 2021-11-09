package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {
    public static void main(String[] args) {
        String baseUrl= "https://www.barclays.co.uk/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get(baseUrl);
        obj.manage().window().maximize();
        obj.close();
    }
}
