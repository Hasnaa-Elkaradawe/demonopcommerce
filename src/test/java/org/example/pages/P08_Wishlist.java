package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P08_Wishlist {
    public List<WebElement> wishlist_btn() {

        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));

    }

    public  WebElement notification_success_bar()
    {return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));}

    public WebElement notification_success_message() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }


    public WebElement wishlistPageLink() {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));

    }

    public WebElement Quantity() {
        return Hooks.driver.findElement(By.className("qty-input"));
    }


}
