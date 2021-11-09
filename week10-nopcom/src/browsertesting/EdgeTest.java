package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl ="https://www.harrow.gov.uk/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver obj = new EdgeDriver();
        obj.get(baseurl);
        obj.manage().window().maximize();
        obj.close();
    }
}
