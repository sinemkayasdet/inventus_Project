package com.inventus.page;

import com.inventus.utilities.utilities.ConfigurationReader;
import com.inventus.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Hoşgeldin,']")
    public WebElement enterLoginPageButton;

    @FindBy(xpath = "//span[.='veya']")
    public WebElement kayitOlButton;


    @FindBy(id = "edUserName")
    public WebElement userName;

    @FindBy(id = "edPassword")
    public WebElement passWord;

    @FindBy(xpath = "//a[.='Giriş Yap']")
    public WebElement loginButton;

    public  void Login(){

       userName.sendKeys(ConfigurationReader.getProperty("username"));
       passWord.sendKeys(ConfigurationReader.getProperty("password"));

    }

    public void LoginBy(String username,String password){
    userName.sendKeys(username);
    passWord.sendKeys(password);

    }


}
