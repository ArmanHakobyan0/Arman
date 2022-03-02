package case1AutomationExercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Elements {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='header']")
    List<WebElement> list;

    @FindBy(linkText = "Signup / Login")
    WebElement loginButton;

    String titleNameLogin = "Automation Exercise - Signup / Login";

    @FindBy(name = "name")
    WebElement nameInput;

    @FindBy(xpath = "//*[@class='signup-form']//*[@name='email']")
    WebElement mailInput;

    @FindBy(css = "div:nth-child(3) > div > form > button")
    WebElement singnUpButton;



    public Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isElementPresent() {
        if (list.size()==1){
            return true;
        } else return false;
    }

    public void clickButton(){
        loginButton.click();
    }

    public void isGetTitleTrueToSingIn(){
        Assert.assertEquals(driver.getTitle(), titleNameLogin );
    }

    public void enterNameEmail(){
         nameInput.sendKeys("Tom");
        mailInput.sendKeys(untils.randomAlpha(5) + "@mail.ru");
        System.out.println(untils.randomAlpha(5) + "@mail.ru");
    }


}

