package practicePageTest.test;

import org.testng.annotations.Test;
import practicePageTest.base.BaseClass;
import practicePageTest.pages.Elements;

public class RunTests extends BaseClass {
    Elements elements;

    @Test(priority = 1)
    public void test1radio() {
        elements = new Elements(super.driver);
        elements.clickRadio2();
    }

    @Test(priority = 1)
    public void test2SendKey() {
        elements = new Elements(super.driver);
        elements.enterText();
    }

    @Test(priority = 1)
    public void test3dropDown() {
        elements = new Elements(super.driver);
        elements.dropDown();
    }

    @Test(priority = 1)
    public void test4CheckBox() {
        elements = new Elements(super.driver);
        elements.clickCheckBox();
    }

    @Test(priority = 1)
    public void test5openWindowAndGetTitle() {
        elements = new Elements(super.driver);
         elements.openWindowButtonClickAndGetTitle();
    }

    @Test(priority = 1)
    public void test6OpenTabAndGetTitle(){
        elements = new Elements(super.driver);
        elements.openTabAndGetTitle();
    }

    @Test(priority = 1)
    public void test7sendTextAndSwitchToAlert(){
        elements = new Elements(super.driver);
        elements.sendTextAndSwitchToAlert();
    }

    @Test(priority = 1)
    public void test8GetTableText(){
        elements = new Elements(super.driver);
        elements.getTableText();
    }

    @Test(priority = 1)
    public void test9hideElement(){
        elements = new Elements(super.driver);
        elements.hideElement();
    }

    @Test(priority = 0)
    public void test9mouseTop(){
        elements = new Elements(super.driver);
        elements.mouseHoverClick();
    }
}
