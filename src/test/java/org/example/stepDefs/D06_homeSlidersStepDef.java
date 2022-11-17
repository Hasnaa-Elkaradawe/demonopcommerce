package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D06_homeSlidersStepDef {
    P03_homePage home = new P03_homePage();
    SoftAssert soft = new SoftAssert();

    @Given("user click on the {string} slider")
    public void user_click_on_slider(String slider_number)   {
        home.slider(slider_number).click();

    }

    @Then("user could navigate to nokia page")
    public void user_could_navigate_to_nokia_page() {
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
        soft.assertAll();
    }

    @Then("user could navigate to iphone page")
    public void user_could_navigate_to_iphone_page() {
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
        soft.assertAll();
    }
}
