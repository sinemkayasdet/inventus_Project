package com.inventus.page;

import com.inventus.utilities.utilities.BrowserUtils;
import com.inventus.utilities.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//ul[@class='menu black']/li/a")
    public List<WebElement> blackMenuHeader;

    @FindBy(xpath = "(//ul[@class='menu black']/li)[3]/ul/li/a")
    public List<WebElement> firstSubModule;

    @FindBy(id = "edSearch")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@id='ui-id-2']/strong")
    public WebElement AfterSearhing;


    @FindBy(xpath = "//h1/span[1]")
    public WebElement productName;

    @FindBy(xpath = "(//li/a[.='Ekran kartı'])[2]")
    public WebElement ekranKartiModule;


    String headerModule;

    public void headerModules(String text) {
        headerModule = "//ul[@class='menu black']/li/a[.='" + text + "']";
        WebElement elemnt = Driver.getDriver().findElement(By.xpath(headerModule));
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(10);
        actions.moveToElement(elemnt).perform();
        BrowserUtils.waitForVisibility(elemnt, 15);
    }

    public void FirstSubModule(String text) {
        String FirstSubModuleText = "//ul[@class='menu black']/li/a";
        WebElement element = Driver.getDriver().findElement(By.xpath(FirstSubModuleText));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();

    }


    //    public  void subModule(int numberIndex) {
//        String subModule = "(//ul[@class='menu black']/li)[" + numberIndex + "]/ul/li/a";
//        WebElement element = Driver.getDriver().findElement(By.xpath(subModule));
//
//    }
    public void verifySubModule(int index, List<String> expected) {
        String subModule = "(//ul[@class='menu black']/li)[" + index + "]/ul/li/a";
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath(subModule));

        List<String> actualSubModule = new ArrayList<>();
        for (WebElement eachSubModule : elements) {
            actualSubModule.add(eachSubModule.getText());
        }
        BrowserUtils.waitFor(5);
        Assert.assertEquals(expected, actualSubModule);
    }


    public void headerModuleVerify(List<String> expected) {
        List<String> actual = new ArrayList<>();
        for (WebElement each : blackMenuHeader) {
            actual.add(each.getText());
        }
        Assert.assertEquals(expected, actual);
    }


}


//    public  void verifyHeaderModule(String expected) {
//        headerModule = "(//li/a[.='" + expected+ "'])[2]";
//        List<WebElement> elemnt = Driver.getDriver().findElements(By.xpath(headerModule));
//       List<String> actual = new ArrayList<>();
//        for (WebElement each : elemnt) {
//            actual.add(each.getText());
//        }
//        Assert.assertEquals(expected,actual);


////span[@id='mainmenu2']/ul//a