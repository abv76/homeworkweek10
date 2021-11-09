package wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FfoxTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get(baseUrl);
        obj.manage().window().maximize();
        obj.close();

    }
}
