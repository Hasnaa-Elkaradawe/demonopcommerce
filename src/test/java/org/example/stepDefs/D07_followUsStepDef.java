package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_followUs;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P07_followUs follow = new P07_followUs();

    @When("user opens facebook link")
    public void click_on_social_media() throws InterruptedException {
        follow.facebookLink().click();
        Thread.sleep(2000);
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(1));
        Thread.sleep(2000);

    }


    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {

        follow.twitterLink().click();
        Thread.sleep(2000);
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(1));
        Thread.sleep(2000);

    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        follow.rssLink().click();
        Thread.sleep(2000);
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(0));
        Thread.sleep(2000);

    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        follow.youtubeLink().click();
        Thread.sleep(2000);
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(1));
        Thread.sleep(2000);

    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String expected_url) {

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), expected_url);


    }


}

