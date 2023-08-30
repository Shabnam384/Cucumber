package org.example.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObjectModel.ContactUsPage;
import org.example.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ContactUsSteps {

    private WebDriver driver;

    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("navigate to website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("click on contact us bottom")
    public void click_on_contact_us_bottom() {
        contactUsPage.clickContactUsButton();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
    }

    @Given("select Subject Heading")
    public void select_subject_heading() {
        contactUsPage.selectSubjectHeading();
    }

    @Given("type Email")
    public void type_email() {

    }

    @Given("type Order referance")
    public void type_order_referance() {

    }

    @Given("type a message")
    public void type_a_message() {

    }

    @When("click on Submit button")
    public void click_on_submit_button() {

    }

    @Then("verify success message")
    public void verify_success_message() {

    }

    @Then("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }
}
