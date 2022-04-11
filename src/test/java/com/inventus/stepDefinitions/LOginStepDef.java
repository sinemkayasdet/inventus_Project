package com.inventus.stepDefinitions;

import com.inventus.page.LoginPage;
import com.inventus.utilities.utilities.BrowserUtils;
import com.inventus.utilities.utilities.ConfigurationReader;
import com.inventus.utilities.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class LOginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("user on the login page Inventus")
    public void user_on_the_login_page_inventus() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("user enter valid username and password")
    public void userEnterValidUsernameAndPassword() {
        BrowserUtils.waitFor(3);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.enterLoginPageButton).perform();
        loginPage.kayitOlButton.click();
        BrowserUtils.waitFor(3);
        loginPage.Login();

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginButton.click();
    }


    @Then("verify the user should be able to see {string}")
    public void verifyTheUserShouldBeAbleToSee(String expected) {
        //  Assert.assertTrue(Driver.getDriver().getTitle().contains("inventus"));
        Assert.assertEquals(expected, Driver.getDriver().getTitle());
    }


}