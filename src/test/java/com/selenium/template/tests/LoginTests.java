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
public class LoginTests extends DriverBase {

    @Test(groups = "Test")
    @Description("Verify login page elements and then login")

    public void Login() throws Exception {

        WebDriver driver = getDriver();
        driver.get(TestData.BASE_URL);

        Assert.assertEquals(driver.getCurrentUrl(),TestData.BASE_URL + "accounts/login/?next=/");

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(loginPage.getTableTitle(),"Sign In to your Account");
        loginPage.login();

        Assert.assertEquals(driver.getCurrentUrl(),TestData.BASE_URL);

        HomepagePage homePagePage = new HomepagePage(driver);
        Assert.assertEquals(homePagePage.getPageTitle(),"Home");

    }

}

