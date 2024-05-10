package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class stepDefinition {

    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }

    @And("^I enter the correct username (.*)$")
    public void i_enter_the_correct_username_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    @And("^I enter the correct password (.*)$")
    public void i_enter_the_correct_password_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();

    }

    @Then("The I get directed to the home page")
    public void the_i_get_directed_to_the_home_page() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]")).isDisplayed();

    }
}
