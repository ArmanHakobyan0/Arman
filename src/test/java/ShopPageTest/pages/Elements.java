package ShopPageTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Elements {
    WebDriver driver;

    //chgitem xi css ov chi gtnum
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]")
    WebElement womanButton;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]")
    WebElement dressesButton;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]")
    WebElement shirt;

    @FindBy(css = ".top-pagination-content.clearfix > form")
    WebElement compareButton;

    @FindBy(id = "selectProductSort")
    WebElement sortButton;

    @FindBy(css="a.button.ajax_add_to_cart_button.btn.btn-default")
    List<WebElement> list;

    @FindBy(className = "available-now")
    List<WebElement> listInStock;

    @FindBy(css = "div[class='button-container'] > a[title='Add to cart']>span")
    List<WebElement> listOfAddButton;

    @FindBy(css= "a.product_img_link > img")
    List<WebElement> listOfAddImg;

    @FindBy(css= "a[title='Proceed to checkout'] >span")
    WebElement proceedButton;

    @FindBy(css ="#product_price_7_34_0 > span")
    List<WebElement> price;

    public Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void isTitleTrue() {
        Assert.assertEquals(driver.getTitle(), "My Store");
    }

    public void isPageHaveWomanDressesShirtsButton() {
        womanButton.click();
        Assert.assertTrue(compareButton.isDisplayed());
        dressesButton.click();
        Assert.assertTrue(compareButton.isDisplayed());
        shirt.click();
        Assert.assertTrue(compareButton.isDisplayed());
    }

    public void dresses(){
        dressesButton.click();
        Select selectSort = new Select(sortButton);
        selectSort.selectByVisibleText("Price: Lowest first");
    }

    public void countDresses(){
        Assert.assertEquals(5,list.size());
    }
    public void isInStock(){
        Assert.assertEquals(5,listInStock.size());
    }

    public void clickAddToCardButton() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(listOfAddImg.get(4)).perform();
        actions.moveToElement(listOfAddButton.get(4)).click().perform();
        Thread.sleep(7000);
    }

    public void clickProceedButton()  {
        Actions actions = new Actions(driver);
        actions.moveToElement(listOfAddImg.get(4)).perform();
        actions.moveToElement(listOfAddButton.get(4)).click().perform();
        proceedButton.click();
    }

    public void isPriceTrue(){
        double x = Double.parseDouble(price.get(price.size()-1).getText().substring(1));
        double y = Double.parseDouble(price.get(0).getText().substring(1));
        Assert.assertTrue(x-x/5==y);
    }



}

