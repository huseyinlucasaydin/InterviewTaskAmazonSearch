package com.avalon.tests;

import com.avalon.pages.AmazonAllItemsPage;
import com.avalon.pages.AmazonCartPage;
import com.avalon.pages.AmazonMainPage;
import com.avalon.pages.AmazonSelectedItemPage;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSearchTest2 extends TestBase{

  //  String url = "https://www.amazon.com";


    @Test(priority = 1)
    public void amazonWatchSearchTest() throws InterruptedException {

        logger = extent.startTest("amazonWatchSearchTest");
     //   Assert.assertTrue(true);

        logger.log(LogStatus.PASS, "Test Case Passed is passTest");

        //Step1: Go to the amazon.com and verify the main page title
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().equals("Amazon.com. Spend less. Smile more."));

        //Step2: Search for watch
        AmazonMainPage amazonMainPage = new AmazonMainPage(driver);
        amazonMainPage.searchField.sendKeys("watch");
        amazonMainPage.searchBtn.click();

        //Step3: Select the 1st item
        AmazonAllItemsPage allItemsPage = new AmazonAllItemsPage(driver);
        Thread.sleep(500);
        allItemsPage.firstWatch.click();

        //Step4: Add 4 quantities to the cart and cancel the warranty purchase offer
        AmazonSelectedItemPage selectedItemPage = new AmazonSelectedItemPage(driver);
        selectedItemPage.watchQuantityDropdown.click();
        selectedItemPage.watchQuantity4.click();
        selectedItemPage.addToCartBtn.click();
        selectedItemPage.noThanksBtn.click();


        //Step5: Go to the cart and validate the cart quantity and total price
        Thread.sleep(2000);
        amazonMainPage.cartBtn.click();
        AmazonCartPage cartPage = new AmazonCartPage(driver);
        Assert.assertTrue(cartPage.quantityInCart.getText().equals("4"));
        String finalTotalCost = cartPage.getFinalTotalCost(cartPage, cartPage.quantityInCart);
        Assert.assertTrue(cartPage.totalPrice.getText().trim().equals(finalTotalCost));

        //Step6: Remove 2 quantities from the cart and re-validate quantity and total price
        cartPage.quantityInCart.click();
        cartPage.quantity2.click();
        String finalCost = cartPage.getFinalTotalCost(cartPage, cartPage.quantity);
        Thread.sleep(1000);
        Assert.assertEquals(cartPage.totalPrice.getText().trim(),finalCost);
    }

    @Test(priority = 2)
    public void amazonSchoolBagSearchTest() throws InterruptedException {

        logger = extent.startTest("amazonSchoolBagSearchTest");
        //   Assert.assertTrue(true);

        logger.log(LogStatus.PASS, "Test Case Passed is passTest");

        //Step1: Go to the amazon.com and verify the main page title
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().equals("Amazon.com. Spend less. Smile more."));

        //Step2: Search for School bag
        AmazonMainPage amazonMainPage = new AmazonMainPage(driver);
        amazonMainPage.searchField.sendKeys("School bag");
        amazonMainPage.searchBtn.click();

        //Step3: Select the 4th item
        AmazonAllItemsPage allItemsPage = new AmazonAllItemsPage(driver);
        allItemsPage.fourthSchoolBag.click();

        //Step4: Add 6 quantities to the cart and cancel the warranty purchase offer
        AmazonSelectedItemPage selectedItemPage = new AmazonSelectedItemPage(driver);
        selectedItemPage.schoolBagQuantityDropDown.click();
        selectedItemPage.schoolBagQuantity6.click();
        selectedItemPage.addToCartBtn.click();
        selectedItemPage.noThanksBtn.click();


        //Step5: Go to the cart and validate the cart quantity and total price
        Thread.sleep(2000);
        amazonMainPage.cartBtn.click();
        selectedItemPage.schoolBagCartBtn.click(); //There is a "cart" button on the pop-op.
        AmazonCartPage cartPage = new AmazonCartPage(driver);
        Assert.assertTrue(cartPage.quantityInCart.getText().equals("6"));
        String finalTotalCost = cartPage.getFinalTotalCost(cartPage, cartPage.quantityInCart);
        Assert.assertTrue(cartPage.totalPrice.getText().trim().equals(finalTotalCost));

        //Step6: Remove 2 quantities from the cart and re-validate quantity and total price
        cartPage.quantityInCart.click();
        cartPage.quantity4.click();
        String finalCost = cartPage.getFinalTotalCost(cartPage, cartPage.quantity);
        Thread.sleep(1000);
        Assert.assertEquals(cartPage.totalPrice.getText().trim(),finalCost);

    }



}
