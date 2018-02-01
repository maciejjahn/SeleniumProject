package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dataSearchFilter {

    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");
    }

    public dataSearchFilter(WebDriver driver){
        this.driver = driver;
    }


    public void filterButton(){
        driver.findElement(By.xpath("//input[@id='task-table-filter']")).sendKeys("SEO tags");

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-filter']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("larrypt");

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void assertion(){
        Assert.assertTrue(driver.getPageSource().contains("Brigade"));
    }
}
