package com.selenium.template.pageObjects.frontend;

import com.selenium.template.pageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomepagePage extends PageBase{

    public HomepagePage(WebDriver passedDriver) {
        super(passedDriver);
    }

    // ---------------------------------------------------------------------------- Locators

    @FindBy(xpath = "//div[@class='col-md-4 text-xs-center text-md-left text-nowrap']//h1")
    private WebElement pageTitle;

    @FindBy(css = "#px-demo-nav > div > ul > li> a > span")
    private List<WebElement> sideBarList;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li")
    private List<WebElement> topMenuList;

    // ---------------------------------------------------------------------------- Methods

    public List<String> getSideBarMenuLabel(){

        List<String> sideBarMenuLabelList = new ArrayList<>();

        for (WebElement webElement : sideBarList){
            sideBarMenuLabelList.add(webElement.getText());
        }

        return sideBarMenuLabelList;
    }

    public List<String> getTopMenuLabel(){

        List<String> topMenuLabelList = new ArrayList<>();

        for (WebElement webElement : topMenuList){
            topMenuLabelList.add(webElement.getText());
        }

        return topMenuLabelList;
    }

    public String getPageTitle(){
        return  pageTitle.getText();
    }
}