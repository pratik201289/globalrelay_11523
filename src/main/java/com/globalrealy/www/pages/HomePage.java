package com.globalrealy.www.pages;

import com.globalrealy.www.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {


    By acceptCookies = By.xpath("//a[@id='acceptbtn']");
    By loginTab= By.xpath("//a[@class='user-icon login-link']");

     public void clickOnAcceptCookies() {
        Reporter.log("Clicking on Accept Cookies " + acceptCookies.toString());
        clickOnElement(acceptCookies);


    }
    public void clickOnLoginTab(){

        Reporter.log("Clicking on Product Tab " + loginTab.toString());
        clickOnElement(loginTab);
    }



}
