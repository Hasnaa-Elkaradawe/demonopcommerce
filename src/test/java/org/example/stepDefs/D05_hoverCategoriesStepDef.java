package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage();
    Actions action = new Actions(Hooks.driver);


    @Given("user hover over selected category")
    public void user_hover_over_selected_category() {

        List<WebElement> categories = home.categories();
       action.moveToElement(categories.get(1)).perform();
    }

    @And("select sub_category")
    public void select_sub_category() {

        home.subCategory().click();

    }

    @Then("datails page Opened")
    public void details_page_opened() {
       String expected_title_result=home.subCategory().getText();
        String actual_title= Hooks.driver.getTitle();
        Assert.assertTrue(actual_title.contains(expected_title_result),"wrong title");

    }
}
