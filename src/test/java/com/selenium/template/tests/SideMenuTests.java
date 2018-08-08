package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.frontend.SideMenuPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SideMenuTests extends DriverBase {

    @Test(groups = "Test")
    @Description("Verify Server Side Menu Button ")

    public void SideMenuServer() throws Exception{

        CommonTask.generalLogin();

        SideMenuPage sideMenuPage = new SideMenuPage(getDriver());
        sideMenuPage.clickSideMenuButton("Server");

        Assert.assertEquals(getDriver().getCurrentUrl(), TestData.SERVER_URL);
        Assert.assertTrue(sideMenuPage.checkPageHeader("System Dashboard").isDisplayed());

        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("Logged in Users").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("Server Status").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("Application Server Information").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("Active Python Packages").isDisplayed());

    }

    @Test(groups = "Test")
    @Description("Verify Dashboard Side Menu Button")

    public void SideMenuDashboard() throws Exception{

        CommonTask.generalLogin();

        SideMenuPage sideMenuPage = new SideMenuPage(getDriver());
        sideMenuPage.clickSideMenuButton("Dashboard");

        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.DASHBOARD_URL);
        Assert.assertTrue(sideMenuPage.checkPageHeader("Dashboard").isDisplayed());

        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("Device daily registrations").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("Current count of Online/Offline devices").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("Latest Devices Added").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("Latest Users Added").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("BRA7205_WiFi_Tstat").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("BRA7300_WiFi_Tstat").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("BRA7305_WiFi_Tstat").isDisplayed());
        Assert.assertTrue(sideMenuPage.checkDisplayedGadgets("BRA7321_WiFi_Tstat").isDisplayed());

    }

}