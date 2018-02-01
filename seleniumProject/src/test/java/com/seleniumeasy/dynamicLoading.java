package com.seleniumeasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dynamicLoading {

    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
    }

    public dynamicLoading(WebDriver driver)
    {
        this.driver = driver;
    }


    public void loadingData()
    {
        driver.findElement(By.xpath("//button[@id='save' and @class='btn btn-default']")).click();
    }
























}
