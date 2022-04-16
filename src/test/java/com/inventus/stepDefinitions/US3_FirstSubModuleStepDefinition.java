package com.inventus.stepDefinitions;

import com.inventus.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class US3_FirstSubModuleStepDefinition {

    HomePage homePage = new HomePage();

    @And("user click {string} module")
    public void userClickModule(String text) {

        homePage.headerModules(text);
    }
    @Then("Verify the user see the SubModules  modules:")
    public void verifyTheUserSeeTheSubModulesModules(List<String> expected) {

        homePage.verifySubModule(3,expected);

    }


    @And("user click {string} moduleS")
    public void userClickModuleS(String text) {

        homePage.headerModules(text);

    }

    @Then("Verify the user see the SubModuless  modules:")
    public void verifyTheUserSeeTheSubModulessModules(List<String> expected) {
        homePage.verifySubModule(4,expected);
    }
}
