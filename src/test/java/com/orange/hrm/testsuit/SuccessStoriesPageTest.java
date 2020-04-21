package com.orange.hrm.testsuit;

import com.orange.hrm.pages.HomePage;
import com.orange.hrm.pages.SuccessStoriesPage;
import com.orange.hrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
Created By Bhavesh
*/
public class SuccessStoriesPageTest extends TestBase {

    HomePage homePage ;
    SuccessStoriesPage successStoriesPage;

    @BeforeMethod (groups = "regression")
    public void setUp(){
        homePage = new HomePage();
        successStoriesPage = new SuccessStoriesPage();

    }

    @Test (groups = "regression")

    public void userShouldNavigateToSuccessStoriePage(){
    homePage.clickOnSuccessStoriesLink();
        String expectedText = "Success Stories";
        String actualText = successStoriesPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }

}
