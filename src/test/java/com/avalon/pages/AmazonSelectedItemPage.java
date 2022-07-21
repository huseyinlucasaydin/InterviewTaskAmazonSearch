package com.avalon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSelectedItemPage extends BasePage {

    @FindBy(id = "a-autoid-0")
    public WebElement watchQuantityDropdown;

    @FindBy(id = "quantity_3")
    public WebElement watchQuantity4;

    @FindBy(xpath = "//input[@name='submit.add-to-cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']")
    public WebElement noThanksBtn;

    public AmazonSelectedItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    public WebElement schoolBagQuantityDropDown;

    @FindBy(id = "quantity_5")
    public WebElement schoolBagQuantity6;

    @FindBy(xpath = "//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
    public WebElement schoolBagCartBtn;
}
