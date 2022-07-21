package com.avalon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonCartPage extends BasePage {

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    public WebElement quantityInCart;

    @FindBy(xpath = "//span[@id='sc-subtotal-amount-activecart']/span")
    public WebElement totalPrice;

    @FindBy(xpath = "(//*[@id=\"quantity_2\"])[1]")
    public WebElement quantity2;

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    public WebElement quantity;

    @FindBy(xpath = "//p[@class='a-spacing-mini']/span")
    public WebElement unitPriceOfItem;

    @FindBy(xpath = "(//*[@id=\"quantity_4\"])[1]")
    public WebElement quantity4;


    public AmazonCartPage(WebDriver driver) {
        super(driver);
    }

    public String getFinalTotalCost(AmazonCartPage cartPage, WebElement quantityInCart2) {
        int quantityInCart = Integer.parseInt(quantityInCart2.getText());
        double unitPrice1 = Double.parseDouble(cartPage.unitPriceOfItem.getText().replace("$", ""));
        double totalCost = quantityInCart * unitPrice1;
        return "$" + totalCost;
    }


}
