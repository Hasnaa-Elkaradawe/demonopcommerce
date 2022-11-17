package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_Wishlist;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class D08_WishlistStepDef {
    P08_Wishlist whishlist = new P08_Wishlist();


    @Given("user click on wishlist button on product")
    public void user_click_on_wishlist_button_on_product() {
        whishlist.wishlist_btn().get(2).click();

    }

    @Then("Success message appear that product added to wishlist")
    public void success_message_appear() {
        SoftAssert soft = new SoftAssert();
        String Expected_success_message ="The product has been added to your wishlist";
        WebElement wishlist_Success_message = whishlist.notification_success_message() ;
        soft.assertTrue(wishlist_Success_message.isDisplayed(), "Wrong Alert");
        soft.assertTrue(wishlist_Success_message.getText().equals(Expected_success_message));
        String expected_color = "#4bb07a";
        String rgba_actual_color=whishlist.notification_success_bar().getCssValue("background-color");
        String hex_actualcolor = Color.fromString(rgba_actual_color).asHex();
        soft.assertTrue(hex_actualcolor.contains(expected_color),"Wrong background color");

    }

    @When("user click on wishlist button")
    public void user_click_on_wishlist_button() {
        user_click_on_wishlist_button_on_product();
    }

    @And("user navigate to whishlist page")
    public void user_navigate_to_whishlist_page() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,
                Duration.ofMillis(5000));
        wait.until(ExpectedConditions.invisibilityOf(whishlist.notification_success_bar()));
        whishlist.wishlistPageLink().click();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/wishlist"));

    }


    @Then("user get product quantity value")
    public void user_get_product_quantity_value() {

        String quantityValue = whishlist.Quantity().getAttribute("value");
        int quantityValue_integer = Integer.parseInt(quantityValue);
        Assert.assertTrue(quantityValue_integer > 0);
    }

}
