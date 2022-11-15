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
    public void user_click_on_slider(String add_number) throws InterruptedException {
        home.slider(add_number).click();
        Thread.sleep(2000);
    }

    @Then("user could navigate to {string} page")
    public void userCouldNavigateToPage(String arg0) {
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
        soft.assertAll();
    }
}
