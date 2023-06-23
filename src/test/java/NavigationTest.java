import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Google title for the 1st visit: " + driver.getTitle());

        driver.navigate().to("https://codenboxautomationlab.com/");
        System.out.println("CodenBox title for the 1st visit: " + driver.getTitle());

        driver.navigate().back();
        Thread.sleep(3000);
        System.out.println("Google title for the 2nd visit: " + driver.getTitle());

        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println("CodenBox title for the 2nd visit: " + driver.getTitle());

        driver.quit();

    }

}
