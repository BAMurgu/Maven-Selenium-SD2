package com.selenium.template.tests;

import com.selenium.template.DriverBase;
import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.pageObjects.frontend.TopMenuPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.template.automationFramework.TestData;


public class TopMenuTests extends DriverBase {

    @Test(groups = "Test")
    @Description("Expand/Minimize Side Menu")

    public void SideMenuMinMax() throws Exception{

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickMinMaxMenuBtnCLASS();
        topMenuPage.clickMinMaxMenuBtnCLASS();

    }


    @Test(groups = "Test")
    @Description("Cloudmatix Logo")

    public void CloudmatixLogo() throws Exception {

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickCloudmatixLogo();

        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.CLOUDMATIX_URL);

    }

    @Test(groups = "Test")
    @Description("Home Button")

    public void HomeButton() throws Exception {

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickHomeBtn();

        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.BASE_URL);
    }

    @Test (groups = "Test")
    @Description("Events Button")

    public void EventsButton() throws Exception{

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickEventsBtn();

        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.EVENTS_URL);
    }

    @Test (groups = "Test")
    @Description("Admin Button")

    public void AdminButton() throws Exception{

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickAdminBtn();

        CommonTask.switchWindow();
        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.ADMIN_URL);
    }

    @Test (groups = "Test")
    @Description("Api Button")

    public void ApiButton() throws Exception{

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickApiBtn();

        CommonTask.switchWindow();
        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.API_URL);
    }

    @Test (groups = "Test")
    @Description("Docs Button")

    public void DocsButton() throws Exception{

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickDocsButton();

        CommonTask.switchWindow();
        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.DOCS_URL);
    }

    @Test (groups = "Test")
    @Description("Alarms Button")

    public void AlarmsButton() throws Exception{

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.clickAlarmsButton();

        Assert.assertEquals(getDriver().getCurrentUrl(),TestData.ALARMS_URL);
    }

    @Test (groups = "Test")
    @Description("Search Field")

    public void SearchField() throws Exception{

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());
        topMenuPage.srchField();
    }

    @Test (groups = "Test")
    @Description ("Profile Button")

    public void ProfileButtonChecks() throws Exception{

        CommonTask.generalLogin();

        TopMenuPage topMenuPage = new TopMenuPage(getDriver());

        topMenuPage.checkAvatarIcon();
        topMenuPage.clickProfileDropdown();
        topMenuPage.checkProfileButton();
        topMenuPage.checkSettingsButton();
        topMenuPage.checkLogoutButton();

    }
}