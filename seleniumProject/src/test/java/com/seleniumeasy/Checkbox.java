package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {
    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    By checkAll = By.xpath("//input[@value='Check All']");
    By UncheckAll = By.xpath("//input[@value='Uncheck All']");

    public Checkbox(WebDriver driver){
        this.driver = driver;
    }


    public  void checkBoxClick(){
        driver.findElement(By.id("isAgeSelected")).click();
    }

    public void checkBoxButtonClick(){
        driver.findElement(checkAll).click();
        driver.findElement(UncheckAll).click();
        driver.findElement(checkAll).click();

    }

    public void assertion(){
        Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
    }
}
