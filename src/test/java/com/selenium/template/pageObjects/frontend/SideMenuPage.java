package com.selenium.template.pageObjects.frontend;


import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class SideMenuPage extends PageBase {

    public SideMenuPage(WebDriver passedDriver) {
        super(passedDriver);
    }

    // ---------------------------------------------------------------------------- Locators

    @FindBy(xpath = "//nav[@id='px-demo-nav']//button[@type='button']")
    private WebElement minMaxMenuBtn;

    //---------------------------------------------------------------------------- Methods

    public void clickSideMenuButton(String sideBtnName){
        WebElement btn  = driver.findElement(By.xpath("//span[contains(text(),'" + sideBtnName + "')]"));
        CommonTask.clickElement(driver,btn,sideBtnName);
    }

    public WebElement checkPageHeader (String pageTitle){
      return driver.findElement(By.xpath("//div[@class='page-header']//h1[contains(text(),'" + pageTitle + "')]"));
    }

    public WebElement checkDisplayedGadgets(String tableName){
        return driver.findElement(By.xpath("//a[contains(text(),'" + tableName + "')]"));
    }
}