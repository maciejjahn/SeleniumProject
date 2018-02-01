package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tableRecordsFilter {

    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/table-records-filter-demo.html");
    }

    public tableRecordsFilter(WebDriver driver){
        this.driver = driver;
    }


    public void filterRecords(){
        driver.findElement(By.xpath("//button[@data-target='pendiente']")).click();
        Assert.assertTrue(driver.getPageSource().contains("(Green)"));


        driver.findElement(By.xpath("//button[@data-target='all']")).click();


    }
}
