package com.inventus.stepDefinitions;

import com.inventus.page.CartPage;
import com.inventus.utilities.utilities.BrowserUtils;
import com.inventus.utilities.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class US6_StepDefinitions {

    CartPage cartPage = new CartPage();

    @Then("user should verify {string} displayed on the page")
    public void userShouldVerifyDisplayedOnThePage(String arg0) {

        BrowserUtils.waitFor(5);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,750),true");
        Assert.assertTrue(cartPage.whyInventus.isDisplayed());


    }


}
