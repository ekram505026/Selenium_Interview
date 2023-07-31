package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class LoginTest {

    public static String browser = "edge";  // External configuration - xls, csv
    public static WebDriver driver;

    public static void main(String[] args) {

        switch (browser) {
            case "Firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            }
            case "Chrome" -> {
                WebDriverManager.chromedriver().create();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                options.addArguments("--disable notifications");
                DesiredCapabilities cp = new DesiredCapabilities();
                cp.setCapability(ChromeOptions.CAPABILITY, options);
                options.merge(cp);
                driver = new ChromeDriver(options);

            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
        }

        driver.get("http://www.saucedemo.com/");
        driver.manage().window().maximize();

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        String title = driver.getTitle();
        System.out.println(title);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.quit();


    }
}
