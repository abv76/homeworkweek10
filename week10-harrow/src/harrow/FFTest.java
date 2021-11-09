package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFTest {
    public static void main(String[] args) {
        String baseurl ="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get(baseurl);
        obj.manage().window().maximize();
        obj.quit();
        // obj.close();
    }
}
