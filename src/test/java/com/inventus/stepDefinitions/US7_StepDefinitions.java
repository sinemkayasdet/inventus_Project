package com.inventus.stepDefinitions;

import com.inventus.page.HomePage;
import com.inventus.page.ModelPage;
import com.inventus.utilities.utilities.BrowserUtils;
import com.inventus.utilities.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;

public class US7_StepDefinitions {
    HomePage homePage = new HomePage();
    ModelPage modelPage = new ModelPage();


    @And("user click {string} modulesss")
    public void userClickModulesss(String arg0) {
        homePage.headerModules(arg0);
        homePage.ekranKartiModule.click();

    }


    @And("user should be select spesific checkbox for model")
    public void userShouldBeSelectSpesificCheckboxForModel() {

        BrowserUtils.waitFor(5);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,750),true");
        BrowserUtils.waitFor(5);

        modelPage.firstCheckBox.click();
        modelPage.secondCheckBox.click();



    }

    @Then("user verify the checbox is select")
    public void userVerifyTheChecboxIsSelect() {
    }



}
