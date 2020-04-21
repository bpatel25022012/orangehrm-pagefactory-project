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
*/public class SuccessStoriesPage extends Utility {
    private static final Logger log = LogManager.getLogger(SuccessStoriesPage.class.getName());


    @FindBy (xpath = "//h1[contains(text(),'Success Stories')]")
    WebElement _successStoriesText;



    public String getWelcomeText(){

        Reporter.log("Getting text from : " + _successStoriesText.toString() + "<br>");
        log.info("Getting text from " +_successStoriesText.toString());

        return getTextFromElement(_successStoriesText);

    }
}
