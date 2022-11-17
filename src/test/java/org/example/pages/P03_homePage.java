package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement user_select_euro_option() {

        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> euroSymbol() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement searchTextBox() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }


    public void type_product_name(String productname) {
        searchTextBox().sendKeys(productname);
        searchTextBox().submit();

    }


    public List<WebElement> searchResult() {

        return Hooks.driver.findElements(By.className("search-results"));
    }

    public WebElement product_link() {

        return Hooks.driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a"));
    }

    public void open_product_page() {
        product_link().click();
    }

    public WebElement SKU() {

        {
            return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]"));

        }
    }


    public List<WebElement> categories() {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
    }

    public WebElement subCategory() {

        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a"));
    }

    public  WebElement slider(String sliderNumber )
    {
        return Hooks.driver.findElement(By.cssSelector("a.nivo-control:nth-child("+sliderNumber+")"));
    }

}
