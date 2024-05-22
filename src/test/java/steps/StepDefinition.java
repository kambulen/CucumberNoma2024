package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

    }

    @And("^I enter the correct username (.*)$")
    public void i_enter_the_correct_username_username(String username) {
        loginPage.enterUsername(username);

    }

    @And("^I enter the correct password (.*)$")
    public void i_enter_the_correct_password_password(String password) {
        loginPage.enterPassword(password);

    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLoginButton();

    }

    @Then("I get directed to the home page")
    public void the_i_get_directed_to_the_home_page() {
        homePage.verifyUserIsLoggedIn();

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
