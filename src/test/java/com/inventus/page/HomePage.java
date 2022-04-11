package com.inventus.page;

import com.inventus.utilities.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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




    String headerModule;

    public void headerModules(String text) {
        headerModule = "(//li/a[.='" + text + "'])[2]";
        List<WebElement> elemnt = Driver.getDriver().findElements(By.xpath(headerModule));
        Driver.getDriver().findElement(By.xpath(headerModule)).click();
    }

//    public  void verifyHeaderModule(String expected) {
//        headerModule = "(//li/a[.='" + expected+ "'])[2]";
//        List<WebElement> elemnt = Driver.getDriver().findElements(By.xpath(headerModule));
//       List<String> actual = new ArrayList<>();
//        for (WebElement each : elemnt) {
//            actual.add(each.getText());
//        }
//        Assert.assertEquals(expected,actual);


}




