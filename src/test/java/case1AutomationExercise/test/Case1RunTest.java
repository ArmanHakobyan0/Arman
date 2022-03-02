package case1AutomationExercise.test;

import case1AutomationExercise.base.BaseClass;
import case1AutomationExercise.pages.Elements;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumGoogle.pages.autoPage;

import static org.testng.Assert.*;

public class Case1RunTest extends BaseClass {
    Elements elements;

    @Test
    public void runTest(){
        elements = new Elements(super.driver);
        assertTrue(elements.isElementPresent(), "chi bacel ejy");
        elements.clickButton();
        elements.isGetTitleTrueToSingIn();
        elements.enterNameEmail();
        elements.clickButton();
    }
}
