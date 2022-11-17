package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {

    P03_homePage home = new P03_homePage();
    SoftAssert soft = new SoftAssert();


    @Given("user clicks on search field")
    public void user_click_on_search_field() {

        home.searchTextBox().click();
    }

    @When("user search with {string}")
    public void userSearchWith(String product) {
        home.type_product_name(product);


    }

    @Then("user find {string} in search results")
    public void user_find(String product) {

            soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
            List<WebElement> search_result = home.searchResult();
        for (int x = 0; x < search_result.size(); x++) {
            String Result = search_result.get(x).getText();
            soft.assertTrue(Result.toLowerCase().contains(product), "wrong book keyword assertion");


        }
        soft.assertAll();
    }

    @And("click on the product in search result")
    public void user_Find_Product( ) {
        home.open_product_page();

        }

        @And("product {string} page opened")
        public void click_on_the_product (String suku) {

            Assert.assertTrue(home.SKU().isDisplayed(), "Not displayed");
            Assert.assertTrue(home.SKU().getText().contains(suku));
        }


        }



