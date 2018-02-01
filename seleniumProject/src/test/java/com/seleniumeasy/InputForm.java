package com.seleniumeasy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputForm {

    WebDriver driver;

    public void getTest(){
        driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
    }

    public InputForm(WebDriver driver){
        this.driver = driver;
    }


    public void fillForm(){
        WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
        name.sendKeys("Maciej");


        WebElement surname = driver.findElement(By.xpath("//input[@name='last_name']"));
        surname.sendKeys("Jahn");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("abcd@gmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("(515)115-1487");

        WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys("Brzydka");

        WebElement city =  driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Lodz");

        driver.findElement(By.name("state")).click();
        driver.findElement(By.xpath("//option[text()='Ohio']")).click();

        WebElement zip = driver.findElement(By.xpath("//input[@name='zip']"));
        zip.sendKeys("1234");

        WebElement website = driver.findElement(By.xpath("//input[@name='website']"));
        website.sendKeys("www.abcd.com");

        driver.findElement(By.xpath("//input[@value='yes']")).click();

        WebElement comment = driver.findElement(By.xpath("//textarea[@name='comment']"));
        comment.sendKeys("Test Selenium");

        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();





        Assert.assertEquals(name.getAttribute("value"), "Maciej");
        Assert.assertEquals(surname.getAttribute("value"), "Jahn");
        Assert.assertEquals(email.getAttribute("value"), "abcd@gmail.com");
        Assert.assertEquals(phone.getAttribute("value"), "(515)115-1487");
        Assert.assertEquals(address.getAttribute("value"),"Brzydka");
        Assert.assertEquals(city.getAttribute("value"),"Lodz");
        Assert.assertEquals(zip.getAttribute("value"),"1234");
        Assert.assertEquals(website.getAttribute("value"),"www.abcd.com");
        Assert.assertEquals(comment.getAttribute("value"),"Test Selenium");




    }


}
