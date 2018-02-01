package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AjaxForm {
    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
    }


    public AjaxForm(WebDriver driver) {
        this.driver = driver;
    }


    public void submitForm() {
        driver.findElement(By.id("title")).sendKeys("Name");

        driver.findElement(By.id("description")).sendKeys("Comment");

        driver.findElement(By.id("btn-submit")).click();
    }

    public void assertion(){
        Assert.assertTrue(driver.getPageSource().contains("Form submited Successfully!"));
    }
}
