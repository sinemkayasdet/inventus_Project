package com.inventus.stepDefinitions;

import com.inventus.page.CartPage;
import com.inventus.page.HomePage;
import com.inventus.utilities.utilities.BrowserUtils;
import com.inventus.utilities.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US5_StepDefinitions {
    CartPage cartPage = new CartPage();
    HomePage home = new HomePage();

    @And("user click search box and search {string} and add it")
    public void userClickSearchBoxAndSearchAndAddIt(String input) {
        BrowserUtils.waitFor(5);
        home.searchBox.sendKeys(input + Keys.ENTER);

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(5);
        actions.moveToElement(cartPage.AftersearchingFirstProduct).click().perform();
        cartPage.addToCart.click();


    }

    @Then("user verify that product isDisplayed on page")
    public void userVerifyThatProductIsDisplayedOnPage() {
        BrowserUtils.waitFor(5);
        cartPage.cart.click();
        Assert.assertTrue(cartPage.cartProduct.getText().contains("MSI"));
    }


}
