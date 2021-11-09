package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl ="https://www.xcart.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver obj = new EdgeDriver();
        obj.get(baseurl);
        obj.manage().window().maximize();
        obj.close();
    }
}
