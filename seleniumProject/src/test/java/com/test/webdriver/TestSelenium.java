package com.test.webdriver;

import com.seleniumeasy.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.seleniumeasy.Checkbox;

public class TestSelenium {

    public WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","C:/Selenium/geckodriver.exe");
        driver = new FirefoxDriver();
    }


    @Test
    public void test1()
    {
        basicForm object = new basicForm(driver);

        object.getTest();
        object.textBoxClick("TESTING");
        object.totalAB("20","31");
        object.assertion();
        driver.quit();
    }

    @Test
    public void test2()
    {
        Checkbox object = new Checkbox(driver);

        object.getTest();
        object.checkBoxClick();
        object.checkBoxButtonClick();
        object.assertion();
        driver.quit();

    }

    @Test
    public void test3(){
        Radiobutton object = new Radiobutton(driver);

        object.getTest();
        object.singleRadioButton();
        object.groupRadioButton();
        object.assertion();
        driver.quit();
    }

    @Test
    public void test4(){
        downloadFile object = new downloadFile(driver);

        object.getTest();
        object.txtDownload("DOWNLOAD SELENIUM TEST");
        driver.quit();
    }

    @Test
    public void test5(){
        AjaxForm object = new AjaxForm(driver);

        object.getTest();
        object.submitForm();
        object.assertion();
        driver.quit();

    }


    @Test
    public void test6()
    {
        InputForm object = new InputForm(driver);

        object.getTest();
        object.fillForm();
        driver.quit();
    }

    @Test
    public void test7()
    {
        dynamicLoading object = new dynamicLoading(driver);
        object.getTest();

        for(int i = 0; i <=15;i++)
        {
            object.loadingData();
        }

        driver.quit();
    }

    @Test
    public void test8()
    {
        JQueryDownloadDialog object = new JQueryDownloadDialog(driver);

        object.getTest();
        object.startDownload();
        object.assertion();
        object.close();
        driver.quit();
    }

    @Test
    public void test9()
    {
        dataSearchFilter object = new dataSearchFilter(driver);

        object.getTest();
        object.filterButton();
        object.assertion();
        driver.quit();
    }

    @Test
    public void test10()
    {
        tableRecordsFilter object = new tableRecordsFilter(driver);

        object.getTest();
        object.filterRecords();
        driver.quit();
    }

}
