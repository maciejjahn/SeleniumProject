package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Radiobutton {
    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
    }

    By femaleButton = By.xpath("//input[@value='Female' and @name='optradio']");
    By checkButton = By.xpath("//button[@id='buttoncheck']");



    By maleRadioButton =  By.xpath("//input[@value='Male' and @name='gender']");
    By ageRadioButton =  By.xpath("//input[@value='5 - 15']");



    public Radiobutton(WebDriver driver)
    {
        this.driver = driver;
    }



    public void singleRadioButton() {

        driver.findElement(femaleButton).click();
        driver.findElement(checkButton).click();


    }

    public void groupRadioButton(){

        driver.findElement(maleRadioButton).click();
        driver.findElement(ageRadioButton).click();
        driver.findElement(By.xpath("//button[@onclick='getValues();' and @type='button']")).click();

    }

    public void assertion(){
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));
        Assert.assertFalse(driver.getPageSource().contains("Radio button 'Male' is checked"));

        Assert.assertTrue(driver.getPageSource().contains("Sex : Male"));
        Assert.assertTrue(driver.getPageSource().contains("Age group: 5 - 15"));
    }

}
