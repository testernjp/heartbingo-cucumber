package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());
    @CacheLookup
    @FindBy(css = ".buttons__login_bar--create-account.bvs-button.is-primary")
    WebElement signUpButton;

    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastName;

    @CacheLookup
    @FindBy(css = "button[type='regpath-button-next']")
    WebElement continueButton;

    public void clickOnSignUpButton() {
        clickOnElement(signUpButton);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}
