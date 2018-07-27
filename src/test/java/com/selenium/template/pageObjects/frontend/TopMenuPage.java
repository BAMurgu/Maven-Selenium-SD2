package com.selenium.template.pageObjects.frontend;

import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.Log4Test;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class TopMenuPage extends PageBase {

    public TopMenuPage(WebDriver passedDriver) {
        super(passedDriver);
    }

    // ---------------------------------------------------------------------------- Locators

    @FindBy(xpath = "//nav[@id='px-demo-nav']//button[@type='button']")
    private WebElement minMaxMenuBtn;

    @FindBy(xpath = "//nav[@id='px-demo-nav']")
    private WebElement sideBar;

    @FindBy (xpath = "//a[@class='navbar-brand px-demo-brand']")
    private WebElement cloudmatixLogo;

    @FindBy (xpath = "//a[contains(text(),'Home')]")
    private WebElement homeButton;

    @FindBy (xpath = "//a[contains(text(),'Events')]")
    private  WebElement eventsButton;

    @FindBy (xpath = "//a[contains(text(),'Admin')]")
    private WebElement adminButton;

    @FindBy (xpath = "//a[contains(text(),'API')]")
    private WebElement apiButton;

    @FindBy (xpath = "//a[contains(text(),'Docs')]")
    private WebElement docsButton;

    @FindBy (xpath = "//a[contains(text(),'Alarms')]")
    private WebElement alarmsButton;

    @FindBy (xpath = "//input[@placeholder='Search']")
    private WebElement searchField;

    @FindBy (xpath = "//a[@class='dropdown-toggle']")
    private WebElement profileDropdown;

    @FindBy (xpath = "//a[@class='dropdown-toggle']//img[@class='gravatar']")
    private  WebElement avatarIcon;

    @FindBy (xpath = "//a[@href='/profile/']")
    private WebElement profileButton;

    @FindBy (xpath = "//a[contains(text(),'Settings')]")
    private WebElement profileSettingsButton;

    @FindBy (xpath = "//a[contains(text(),'Log Out')]")
    private WebElement logoutButton;

    @FindBy (xpath = "//button[@type='submit']")
    private WebElement signOutButton;

    //---------------------------------------------------------------------------- Methods

    public void checkAvatarIcon(){

        String avatarSrc = avatarIcon.getAttribute("src");

        if ( avatarSrc.length() > 0 ) {

            Log4Test.info("- " + avatarSrc);
            Log4Test.info("- Avatar icon is present");

        }   else {

            Assert.fail(Log4Test.info("- Avatar icon is missing"));

        }
    }

    public void checkProfileButton(){
        profileButton.isDisplayed();
    }

    public void checkSettingsButton(){
        profileSettingsButton.isDisplayed();
    }

    public void checkLogoutButton(){
        logoutButton.isDisplayed();
    }

    public void clickLogoutButton(){
        CommonTask.clickElement(driver,logoutButton,"Logout Button");
    }

    public void clickSignOutButton(){
        CommonTask.clickElement(driver,signOutButton,"Sign Out Button");
    }

    public void clickProfileDropdown(){
        CommonTask.clickElement(driver,profileDropdown,"Profile Dropdown");
    }

    public void srchField(){
        searchField.isDisplayed();
    }

    public void clickAlarmsButton(){
        CommonTask.clickElement(driver,alarmsButton,"Alarms Button");
    }

    public void clickDocsButton(){
        CommonTask.clickElement(driver,docsButton,"Docs Button");
    }

    public void clickApiBtn(){
        CommonTask.clickElement(driver,apiButton,"Api Button");
    }

    public void clickEventsBtn(){
        CommonTask.clickElement(driver,eventsButton,"Events Button");
    }

    public void clickAdminBtn(){
        CommonTask.clickElement(driver,adminButton,"Events Button");
    }

    public void clickHomeBtn(){
        CommonTask.clickElement(driver,homeButton,"Home Button");
    }

    public void clickCloudmatixLogo(){
        CommonTask.clickElement(driver,cloudmatixLogo,"Cloudmatix Logo");
    }


//    ------- Alternative way with css -------

//    public void clickMinMaxMenuBtn(){
//
//        if ( driver.findElement(By.cssSelector("nav#px-demo-nav.px-nav.px-nav-left.px-nav-animate")) != null) {
//
//            Log4Test.info("Side Menu is expanded");
//            CommonTask.clickElement(driver,minMaxMenuBtn,"Min/Max Button");
//            Log4Test.info("Side Menu has been minimized");
//
//        } else if ( driver.findElement(By.cssSelector("nav#px-demo-nav.px-nav.px-nav-left.px-nav-animate.px-nav-collapse]")) != null ){
//
//            Log4Test.info("Side Menu is minimized");
//            CommonTask.clickElement(driver,minMaxMenuBtn,"Min/Max Button");
//            Log4Test.info("Side Menu has been expanded");
//
//        } else {
//
//            Assert.fail(Log4Test.info("Side Menu is missing"));
//        }
//    }

    public void clickMinMaxMenuBtnCLASS() {

        if ( sideBar.isDisplayed() ) {

            boolean collapseClass = sideBar.getAttribute("class").contains("px-nav-collapse");

            if ( collapseClass ) {

                Log4Test.info("- Side Menu is minimized");
                CommonTask.clickElement(driver, minMaxMenuBtn, "Min/Max Button");
                Log4Test.info("- Side Menu has been expanded");

            } else {

                Log4Test.info("- Side Menu is expanded");
                CommonTask.clickElement(driver, minMaxMenuBtn, "Min/Max Button");
                Log4Test.info("- Side Menu has been minimized");

            }

        } else {

            Assert.fail(Log4Test.info("- Side Menu is missing"));

        }
    }
}