package com.inventus.page;

import com.inventus.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[normalize-space(text())='MSI RADEON RX 6500 XT MECH 2X 4G OC AMD Radeon RX 6500 XT PCI-E16 4.0, 4GB/64bit GDDR6, HDMI, DisplayPort Ekran kartı']")
    public WebElement product;

    @FindBy(xpath = "//a[normalize-space(text())='Sepete Ekle']")
    public WebElement addToCart;

    @FindBy(xpath = "(//a[@class='ui-corner-all'])[1]")
    public WebElement AftersearchingFirstProduct;

    @FindBy(xpath = "//a[.='Sepete Git']")
    public WebElement cart;

    @FindBy(xpath = "//a[normalize-space(text())='MSI A320M PRO-VH AMD A320, DDR4, AM4 Ryzen, SATA6Gb/s, M2, USB3.2, HDMI, D-SUB microATX Anakart']")
    public WebElement cartProduct;

    @FindBy(xpath = "(//a[.='Neden İnventus?'])[2]")
    public WebElement whyInventus;

}
