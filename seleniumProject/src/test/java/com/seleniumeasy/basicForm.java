package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basicForm {

    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    By textBoxMessage = By.xpath("//input[@id='user-message']");
    By showMessage = By.xpath("//button[@onclick='showInput();']");
    By enterA = By.xpath("//input[@id='sum1']");
    By enterB = By.xpath("//input[@id='sum2']");
    By getTotal = By.xpath("//button[@onclick='return total()']");


    public basicForm(WebDriver driver)
    {
        this.driver = driver;
    }



    public void textBoxClick(String text)
    {

        driver.findElement(textBoxMessage).click();
        driver.findElement(textBoxMessage).clear();
        driver.findElement(textBoxMessage).sendKeys(text);
        driver.findElement(showMessage).click();

    }

    public void totalAB(String a, String b)
    {

        driver.findElement(enterA).click();
        driver.findElement(enterA).clear();
        driver.findElement(enterA).sendKeys(a);


        driver.findElement(enterB).click();
        driver.findElement(enterB).clear();
        driver.findElement(enterB).sendKeys(b);

        driver.findElement(getTotal).click();

    }

    public void assertion(){
        Assert.assertTrue(driver.getPageSource().contains("51"));
        Assert.assertTrue(driver.getPageSource().contains("TESTING"));
    }
}
