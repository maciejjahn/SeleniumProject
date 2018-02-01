package com.seleniumeasy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class downloadFile {

    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
    }

    public downloadFile(WebDriver driver){
        this.driver = driver;
    }




    public void txtDownload(String txt)
    {


        driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys(txt);
        driver.findElement(By.xpath("//button[@id='create']")).click();
        driver.findElement(By.xpath("//a[@id='link-to-download']")).click();




    }

}
