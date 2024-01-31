package uk.co.heartbingo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import uk.co.heartbingo.pages.SignUpPage;

import static uk.co.heartbingo.browserfactory.ManageBrowser.driver;

public class SignupSteps {
    @When("I open the URL")
    public void iOpenTheURL() {
    }

    @And("I click on Sign Up button")
    public void iClickOnSignUpButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".buttons__login_bar--create-account.bvs-button.is-primary")));


    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("button[type='regpath-button-next']")));
    }

    @And("I enter the FirstName {string}")
    public void iEnterTheFirstName(String firstName) {
        new SignUpPage().enterFirstName(firstName);
    }

    @Then("I enter lastname {string}")
    public void iEnterLastname(String lastName) {
        new SignUpPage().enterLastName(lastName);
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.id("onetrust-accept-btn-handler")));
    }

}