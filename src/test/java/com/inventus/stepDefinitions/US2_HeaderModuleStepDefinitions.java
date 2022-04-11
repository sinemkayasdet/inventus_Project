package com.inventus.stepDefinitions;

import com.inventus.page.HomePage;
import com.inventus.utilities.utilities.BrowserUtils;
import com.inventus.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US2_HeaderModuleStepDefinitions {
    HomePage homePage = new HomePage();



    @Then("Verify the user see the following modules:")
    public void verifyTheUserSeeTheFollowingModules(List<String> expected) {


        List<String> actual = new ArrayList<>();
        for (WebElement each : homePage.blackMenuHeader) {
            actual.add(each.getText());
        }
        Assert.assertEquals(expected,actual);
    }
}
