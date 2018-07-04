package com.selenium.template.pageObjects.frontend;

import com.selenium.template.automationFramework.CommonTask;
import com.selenium.template.automationFramework.TestData;
import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver passedDriver) {
        super(passedDriver);
    }

    // ---------------------------------------------------------------------------- Locators

    @FindBy(xpath = "//input[@id='id_login']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='id_password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement signInBtn;

    @FindBy (xpath = "/html/body/div[2]/table/tbody/tr[1]/td/h2")
    private WebElement pageTitle;


    // ---------------------------------------------------------------------------- Methods

    public String getTableTitle(){
        return pageTitle.getText();
    }

    public void login(){
        CommonTask.sendKeys(username, TestData.USERNAME,"Username Input Field");
        CommonTask.sendKeys(password, TestData.PASSWORD,"Password Input Field");
        CommonTask.clickElement(driver, signInBtn,"Sign In Button");
    }
}
