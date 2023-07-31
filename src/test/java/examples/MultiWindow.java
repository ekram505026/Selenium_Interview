package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultiWindow {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://codenboxautomationlab.com/practice/");
        System.out.println("Title of the parent page:" + driver.getTitle());

        driver.findElement(By.id("openwindow")).click();
        System.out.println();

    }
}
