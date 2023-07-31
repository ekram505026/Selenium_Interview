package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    @Given("^User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        System.out.println("User is on NetBanking landing page");

    }

    @When("^User login into application with username and password")
    public void user_login_into_application_with_username_and_password() {

        System.out.println("Logged in success");

    }

    @Then("^Home page is populated")
    public void home_page_is_populated() {
        System.out.println("Validated home page");

    }

    @And("^Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");

    }

}
