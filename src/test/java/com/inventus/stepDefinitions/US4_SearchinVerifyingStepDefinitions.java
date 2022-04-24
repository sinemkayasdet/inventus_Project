package com.inventus.stepDefinitions;

import com.inventus.page.HomePage;
import com.inventus.utilities.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US4_SearchinVerifyingStepDefinitions {
    HomePage home = new HomePage();

    @And("user click search box and search {string}")
    public void userClickSearchBoxAndSearch(String input) {
        BrowserUtils.waitFor(5);
        home.searchBox.sendKeys(input+ Keys.ENTER);

    }

    @Then("user verify {string} contains")
    public void userVerifyContains(String expected) {

        home.AfterSearhing.click();
        Assert.assertTrue(home.productName.getText().contains(expected));
    }


}
