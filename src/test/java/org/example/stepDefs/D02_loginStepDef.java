package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    SoftAssert soft = new SoftAssert();

    @Given("user go to login page")
    public void user_goto_login_page() {
        login.user_goto_login_page().click();

    }

    @When("^user login with \"(.*)\" \"(.*)\" and \"(.*)\"$")
    public void enter_valid_data(String type ,String email, String password) {
        login.enter_email_and_password(email, password);
    }

    @And("user press on login button")
    public void user_press_on_login_button() {
        login.user_press_on_login_button().click();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        soft.assertTrue(login.success_alert().isDisplayed());
        soft.assertEquals("https://demo.nopcommerce.com/", Hooks.driver.getCurrentUrl());
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void user_could_not_login() {
        String expected_result = "Login was unsuccessful.";
        String actual_result = login.failed_alert().getText();
        soft.assertTrue(actual_result.contains(expected_result), "wrong alert message");

        String rgbacolor = login.failed_alert().getCssValue("color");
        String hexcolor = Color.fromString(rgbacolor).asHex();
        String expected_color = "#e4434b";
        soft.assertTrue(hexcolor.contains(expected_color), "wrong color");

        soft.assertAll();


    }
}
