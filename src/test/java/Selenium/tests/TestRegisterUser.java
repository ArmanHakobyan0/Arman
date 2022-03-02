package Selenium.tests;

import Selenium.base.SeleniumBase;
import org.testng.annotations.Test;
import Selenium.pages.MercouryTourRegisterPage;


public class TestRegisterUser  extends SeleniumBase {
    MercouryTourRegisterPage mercouryTourRegisterPage;

    @Test(priority = 1)
    public void checkMercuryToursPageTitle() {
        mercouryTourRegisterPage = new MercouryTourRegisterPage(driver);
        mercouryTourRegisterPage.clickNewTours();
        mercouryTourRegisterPage.clickDismissAdd();
        mercouryTourRegisterPage.checkMercuryToursPageTitle("Welcome: Mercury Tours");
    }

    @Test(priority = 2)
    public void registerNewUser(){
        mercouryTourRegisterPage = new MercouryTourRegisterPage(driver);
        mercouryTourRegisterPage.clickRegister();
        mercouryTourRegisterPage.inputFname("Gevorg");
        mercouryTourRegisterPage.inputLname("Gevorgyan");
        mercouryTourRegisterPage.selectItemSelectList("ARMENIA");
        mercouryTourRegisterPage.inputUserName("gg@mail.com");
        mercouryTourRegisterPage.inputPassword("Pass123456");
        mercouryTourRegisterPage.confirmPassword("Pass123456");
        mercouryTourRegisterPage.clickSubmit();
        mercouryTourRegisterPage.checkRegisteredUserName("Dear Gevorg Gevorgyan,");
    }

}

