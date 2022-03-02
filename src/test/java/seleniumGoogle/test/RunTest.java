package seleniumGoogle.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumGoogle.base.SeleniumTask;
import seleniumGoogle.pages.autoPage;

import java.util.List;

public class RunTest extends SeleniumTask {
    autoPage autoPage;

    @Test
    public void runTest() {
        autoPage = new autoPage(super.driver);
        autoPage.enterTextInput();
        autoPage.clickInAutoAm();
        autoPage.getTitle();
        autoPage.putParam1();
        autoPage.putParam2();
        autoPage.putParam3();
        autoPage.putParam4();
        autoPage.enterSearchButton();
        autoPage.countOfResult();
      //  Assert.assertTrue(autoPage.getCountOfResult() == 1, "ERROR");
        autoPage.priceCarGetText();
    }
}

//    public int getCountOfResult() {
//        List<WebElement> count = driver.findElements(LIST);
//        int counts = count.size();
//        return counts;
//    }
