package com.avalon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonAllItemsPage extends BasePage {


    public AmazonAllItemsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement firstWatch;

    @FindBy(xpath = "(//div[@class='a-section aok-relative s-image-fixed-height']/img)[4]")
    public WebElement fourthSchoolBag;

}
