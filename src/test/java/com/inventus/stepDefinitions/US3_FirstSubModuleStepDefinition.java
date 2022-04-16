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


    @And("user click {string} modulle")
    public void userClickModulle(String text) {
        homePage.headerModules(text);
    }


    @Then("Verify the user see the SubModulles  modules:")
    public void verifyTheUserSeeTheSubModullesModules(List<String> expected) {
        homePage.verifySubModule(5,expected);
    }


    @And("user click {string} modulles")
    public void userClickModulles(String text) {
        homePage.headerModules(text);

    }

    @Then("Verify the user see the SubModulles  moduless:")
    public void verifyTheUserSeeTheSubModullesModuless(List<String> expected) {
        homePage.verifySubModule(6,expected);
    }

    @And("user click {string} modules")
    public void userClickModules(String text) {
        homePage.headerModules(text);
    }

    @Then("Verify the user see the SubModulles  moduLles:")
    public void verifyTheUserSeeTheSubModullesModuLles(List<String> expected) {
        homePage.verifySubModule(7,expected);
    }

    @And("user click {string} moddules")
    public void userClickModdules(String text) {
        homePage.headerModules(text);
    }

    @Then("Verify the user see the Submoddulles  moduLles:")
    public void verifyTheUserSeeTheSubmoddullesModuLles(List<String> expected) {
        homePage.verifySubModule(8,expected);
    }
}
