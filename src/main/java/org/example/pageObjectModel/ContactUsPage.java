package org.example.pageObjectModel;
import org.example.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends AbstractClass{
    WebDriver driver;
    public ContactUsPage(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='Contact us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){
        clickFunction(contactUsButton);
    }

 /*   @FindBy(className = "form-control")
    public WebElement subjectHeading;

    @FindBy(css = "option[value='2']")
    public WebElement optionCustomerService;*/

    @FindBy(css = "select[id$='contact']")
    public WebElement selectContact;

    public void selectSubjectHeading(){
        selectElementFromDropdown(selectContact, "Customer service");
    }

}
