package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Scanner;

 // NOT Working //

    public class MultiIfElse {
        String baseUrl = "https://www.nopcommerce.com/en/demo";
        static String browser = "Chrome";
        //static String browser1 = "Edge";
       // static String browser2 = "Firefox";

        static WebDriver driver;

        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            System.out.println("Enter Website name: ");
            String base = scn.nextLine().toLowerCase();
            System.out.println("Enter web browser: Edge / Chrome / Firefox: ");
            String browser = scn.nextLine().toLowerCase();

            if (browser.equals("Chrome")){
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            }else if (browser.equals("Firefox")){
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            }else if (browser.equals("Edge")){
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();
            }else{
                System.out.println("Wrong Browser name: ");
            }

            // driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.quit();
        }


    }


