package com.avalon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMainPage extends BasePage{

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchField;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchBtn;

    // @FindBy(id = "nav-cart-count-container")
    @FindBy(xpath = "//div[@id='nav-cart-count-container']")
    public WebElement cartBtn;


    public AmazonMainPage(WebDriver driver) {
        super(driver);
    }
}
