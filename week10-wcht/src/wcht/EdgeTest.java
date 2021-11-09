package wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver obj = new EdgeDriver();
        obj.get(baseUrl);
        obj.manage().window().maximize();
        obj.close();
    }
}
