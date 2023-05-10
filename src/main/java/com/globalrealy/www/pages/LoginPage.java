package com.globalrealy.www.pages;

import com.globalrealy.www.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By LoginText =By.cssSelector("#loginHeader");
    public String getLoginText(){
                return getTextFromElement(LoginText);
    }

}
