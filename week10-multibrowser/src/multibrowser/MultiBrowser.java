
package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultiBrowser {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Website name :");
        String baseUrl ="http://" + reader.nextLine().toLowerCase();
        System.out.println("Enter web browser : Edge / Chrome / Firefox :");
        String browser = reader.nextLine().toLowerCase().trim();

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid Browser Type");
                break;
        }


        driver.get(baseUrl);
        driver.manage().window().maximize();
        reader.close();
    }
}
