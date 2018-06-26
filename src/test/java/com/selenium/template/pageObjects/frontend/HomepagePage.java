package com.selenium.template.pageObjects.frontend;

import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepagePage extends PageBase{

    public HomepagePage(WebDriver passedDriver) {
        super(passedDriver);
    }

    // ---------------------------------------------------------------------------- Locators

    @FindBy(xpath = "//div[@class='col-md-4 text-xs-center text-md-left text-nowrap']//h1")
    private WebElement pageTitle;

    // ---------------------------------------------------------------------------- Methods

    public String getPageTitle(){
        return  pageTitle.getText();
    }
}