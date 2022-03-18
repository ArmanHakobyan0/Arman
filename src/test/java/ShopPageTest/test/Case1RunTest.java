package ShopPageTest.test;

import ShopPageTest.base.BaseClass;
import ShopPageTest.pages.Elements;
import org.testng.annotations.Test;

public class Case1RunTest extends BaseClass {
    Elements elements;

    @Test
    public void runTest() {
        elements = new Elements(super.driver);
        elements.isTitleTrue();
    }

    @Test
    public void isPageHaveWomanDressesShirtsButton() {
        elements = new Elements(super.driver);
        elements.isPageHaveWomanDressesShirtsButton();
    }

    @Test
    public void test5SortDresses() {
        elements = new Elements(super.driver);
        elements.dresses();
        elements.countDresses();
        elements.isInStock();
    }

    @Test
    public void test7clickAddCard() throws InterruptedException {
        elements = new Elements(super.driver);
        elements.dresses();
        elements.clickAddToCardButton();

    }

    @Test
    public void test8clickProceedButton()  {
        elements = new Elements(super.driver);
        elements.dresses();
        elements.clickProceedButton();
    }

    @Test
    public void saleApplyed(){
        elements = new Elements(super.driver);
        elements.dresses();
        elements.clickProceedButton();
        elements.isPriceTrue();
    }
}
