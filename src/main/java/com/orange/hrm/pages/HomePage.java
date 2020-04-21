package com.orange.hrm.pages;

import com.orange.hrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/*
Created By Bhavesh
*/
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy (xpath ="//a[contains(text(),'Success Stories')]" )
    WebElement _successStroiesLink;


public void clickOnSuccessStoriesLink(){

    Reporter.log("clicking on successstoried link  : " +  _successStroiesLink.toString() +"<br>" );
    clickOnElement(_successStroiesLink);
    log.info("clicking on successstoried link  : " +  _successStroiesLink.toString());
}

}
