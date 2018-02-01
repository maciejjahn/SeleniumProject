package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JQueryDownloadDialog {

    WebDriver driver;

    public JQueryDownloadDialog(WebDriver driver){
        this.driver = driver;
    }

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
    }

    public void startDownload(){
        driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
        try{
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void assertion(){
        Assert.assertTrue(driver.getPageSource().contains("Complete!"));
    }

    public void close(){
        driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset'] ")).click();
    }

}
