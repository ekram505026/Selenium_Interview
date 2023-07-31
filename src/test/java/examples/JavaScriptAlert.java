package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Alert Message handling
        driver.get("http://omayo.blogspot.com/");

        driver.findElement(By.id("alert1")).click();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String textOnAlert = alert.getText();

        // Displaying alert message
        System.out.println(textOnAlert);
        Thread.sleep(5000);

        // Accepting alert
        alert.accept();
    }
}
