package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl ="https://www.x-cart.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get(baseUrl);
        obj.manage().window().maximize();
        obj.close();
    }
}
