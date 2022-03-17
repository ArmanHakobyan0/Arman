package seleniumGoogle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class autoPage {
    WebDriver driver;

    @FindBy(css = "div > div.a4bIc > input")
    WebElement googleSearch;

    @FindBy(css = "cite[role='text']:nth-child(1)")
    WebElement autoAmClick;

    String title = "Ավտոմեքենաների վաճառք Հայաստանում - Auto.am";

    @FindBy(css = "#filter-make")
    WebElement markCar;

    @FindBy(css = "#v-model")
    WebElement modelCar;

    @FindBy(name = "year[gt]")
    WebElement yearCar;

    @FindBy(className = "lever")
    WebElement maxazercvacButton;

    @FindBy(id = "search-btn")
    WebElement searchButton;

    @FindBy(css = "#search-result > .card")
    List<WebElement> list;

    //private final By LIST = By.cssSelector("#search-result > .card");
    @FindBy(css = "div.card-action > div > span")
    List<WebElement> listCarPrice;

    String actualPriceCar = "$ 67 000";

    public autoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterTextInput() {
        googleSearch.sendKeys("auto am");
        googleSearch.submit();
    }

    public void clickInAutoAm() {
        autoAmClick.click();
    }

    public void getTitle() {
        Assert.assertEquals(driver.getTitle(), title, "Title not match!!!");
    }

    public void putParam1() {
        Select selectMarkCar = new Select(markCar);
        selectMarkCar.selectByVisibleText("Tesla");
    }

    public void putParam2() {
        Select selectModelCar = new Select(modelCar);
        selectModelCar.selectByVisibleText("Model Y");
    }

    public void putParam3() {
        Select selectYearCar = new Select(yearCar);
        selectYearCar.selectByVisibleText("2018");
    }

    public void putParam4() {
        maxazercvacButton.click();
    }

    public void enterSearchButton() {
        searchButton.click();
    }

    public void countOfResult() {
        Assert.assertEquals(3, list.size());
    }

    public boolean priceCarGetText() {

        for (int i =0;i<listCarPrice.size();i++){
            System.out.println(listCarPrice.get(i).getText());
            if(listCarPrice.get(i).getText().equals(actualPriceCar)){
                System.out.println("sssssssss");
                return true;
            }
        }
        return false;
    }


}
