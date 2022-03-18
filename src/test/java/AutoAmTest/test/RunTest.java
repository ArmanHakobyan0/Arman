package AutoAmTest.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import AutoAmTest.base.SeleniumTask;
import AutoAmTest.pages.autoPage;

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
        Assert.assertTrue(autoPage.priceCarGetText(), "we dont have 67000$ car");
    }
}

