package com.inventus.page;

import com.inventus.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelPage {
    public ModelPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@id='f27_2RTX3070']")
    public WebElement firstCheckBox;

    @FindBy(xpath = "f27_2RTX3060Ti")
    public WebElement secondCheckBox;

}
