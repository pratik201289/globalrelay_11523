package com.globalrealy.www.testsuite;

import com.globalrealy.www.pages.HomePage;
import com.globalrealy.www.pages.LoginPage;
import com.globalrealy.www.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage =new LoginPage();
    @Test
    public void clickOnAcceptCookie() throws InterruptedException {

        homePage.clickOnAcceptCookies();

    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        homePage.clickOnAcceptCookies();
        homePage.clickOnLoginTab();
        driver.get("https://compliance.login.globalrelay.com/cc/archiver/getToken?svcUrl=https%3A%2F%2Farchiver.globalrelay.com%2Farchivewebmail%2Farchivewebmail.fpl");
        //Thread.sleep(2000);
        String expectedText = "Log in";
        System.out.println(loginPage.getLoginText());
        Assert.assertEquals(loginPage.getLoginText(),  expectedText, "Login page not displayed");
    }




}
