package practicePageTest.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Set;

import static io.restassured.RestAssured.given;

public class Elements {
    WebDriver driver;

    public Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[value='radio2']")
    WebElement radioButton2;

    @FindBy(id = "autocomplete")
    WebElement textBox;

    @FindBy(id = "dropdown-class-example")
    WebElement dropDown;

    @FindBy(id = "checkBoxOption2")
    WebElement checkBox;

    @FindBy(id = "openwindow")
    WebElement openWindow;

    @FindBy(css = ".btn-style.class1.class2")
    WebElement openTab;

    @FindBy(id = "name")
    WebElement nameBox;

    @FindBy(id = "alertbtn")
    WebElement alertButton;

    @FindBy(id = "confirmbtn")
    WebElement confirm;

    @FindBy(css = "tr:nth-child(10) > td:nth-child(2)")
    WebElement tableText;

    @FindBy(id = "hide-textbox")
    WebElement hide;

    @FindBy(id = "displayed-text")
    WebElement displayedBox;

    @FindBy(id = "mousehover")
    WebElement mouseHoverButton;

    @FindBy(css = "fieldset > div > div > a:nth-child(1)")
    WebElement mouseTop;


    public void clickRadio2() {
        radioButton2.click();
    }

    public void enterText() {
        textBox.clear();
        textBox.sendKeys("asdf");
    }

    public void dropDown() {
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option2");
    }

    public void clickCheckBox() {
        if (!checkBox.isSelected()) {
            checkBox.click();
        }
    }

    public void openWindowButtonClickAndGetTitle() {
        String winHandleBefore = driver.getWindowHandle();
        openWindow.click();
        Set<String> seto = driver.getWindowHandles();
        for (String itm : seto) {
            driver.switchTo().window(itm);
        }
        Assert.assertEquals(driver.getTitle()
                , "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
        driver.close();
        driver.switchTo().window(winHandleBefore);
    }

    public void openTabAndGetTitle() {

//       es dzevov lav chi ashxatum
//        openTab.click();
//        Actions action = new Actions(driver);
//        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
//        driver.get("https://www.rahulshettyacademy.com/#/index");
//        Assert.assertEquals(driver.getTitle(),"Rahul Shetty Academy");
//        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String HandleBefore = driver.getWindowHandle();
        openTab.click();
        Set<String> seto = driver.getWindowHandles();
        for (String itm : seto) {
            driver.switchTo().window(itm);
        }
        Assert.assertEquals(driver.getTitle()
                , "Rahul Shetty Academy");
        driver.close();
        driver.switchTo().window(HandleBefore);
    }

    public void sendTextAndSwitchToAlert() {
        nameBox.sendKeys("bbbbbb");
        alertButton.click();
        Assert.assertEquals(driver.switchTo().alert().getText()
                , "Hello bbbbbb, share this practice page and share your knowledge");
        driver.switchTo().alert().accept();
        confirm.click();
        driver.switchTo().alert().dismiss();
    }

    public void getTableText() {
        Assert.assertEquals(tableText.getText()
                , "Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C");
    }

    public void hideElement() {
        hide.click();
        Assert.assertTrue(!displayedBox.isDisplayed(), "we see display box");
    }

    public void mouseHoverClick() {
        JavascriptExecutor jsCode = (JavascriptExecutor) driver;
        jsCode.executeScript("alert(document.getElementById('mousehover').getBoundingClientRect().top)");
        String height = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        jsCode.executeScript("window.scrollBy(0," + height + ")");
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoverButton).perform();
        mouseTop.click();
        jsCode.executeScript("window.scrollBy(0," + height + ")");
        actions.doubleClick().perform();
        Assert.assertTrue(mouseTop.isDisplayed());
    }
}
