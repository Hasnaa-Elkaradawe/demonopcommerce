package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement login_Page() {

        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public void enter_email_and_password(String email, String password) {
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
    }

    public WebElement login_btn() {
        return Hooks.driver.findElement(By.xpath
                ("//button[@class=\"button-1 login-button\"]"));
    }

    public WebElement success_alert() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"]"));
    }

    public WebElement failed_alert() {
        return Hooks.driver.findElement(By.className("message-error"));
    }


    public WebElement myAccount() {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
}




