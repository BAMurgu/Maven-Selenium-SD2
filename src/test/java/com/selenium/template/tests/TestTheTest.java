package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TestTheTest extends DriverBase {

    @Test(groups = "Test")
    public void Test_01() throws Exception {

        WebDriver driver = getDriver();
        driver.get("https://www.google.ro/");
        driver.findElement(By.id("lst-ib")).sendKeys("sometjhing");

        Assert.assertTrue(false);
    }






}


