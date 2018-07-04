package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import com.selenium.template.pageObjects.frontend.HomepagePage;
import com.selenium.template.pageObjects.frontend.LoginPage;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.template.automationFramework.TestData;


@Epic("Login")
@Feature("Login actions")
public class HomepageTests extends DriverBase{

    @Test(groups = "Test")
    @Description("Verify sidebar menu elements")

    public void Sidebar() throws Exception {

        WebDriver driver = getDriver();
        driver.get(TestData.BASE_URL);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        HomepagePage homepagePage = new HomepagePage(driver);
        Assert.assertEquals(homepagePage.getSideBarMenuLabel(),TestData.SIDE_MENU);
    }


    @Test(groups = "Test")
    @Description("Verify top menu elements")

    public void TopMenu() throws Exception {

        WebDriver driver = getDriver();
        driver.get(TestData.BASE_URL);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

        HomepagePage homepagePage = new HomepagePage(driver);
        Assert.assertEquals(homepagePage.getTopMenuLabel(),TestData.TOP_MENU);

    }
}
