package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.pageObjects.frontend.HomepagePage;
import com.selenium.template.pageObjects.frontend.LoginPage;
import com.selenium.template.pageObjects.frontend.TopMenuPage;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.template.automationFramework.TestData;




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

    @Test (groups = "Test")
    @Description("Logout Test")

    public void Logout() throws Exception {

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickProfileDropdown();
        topMenuPage.clickLogoutButton();

        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.LOGOUT_URL);

        topMenuPage.clickSignOutButton();

        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.LOGOUT2_URL);
    }

}

