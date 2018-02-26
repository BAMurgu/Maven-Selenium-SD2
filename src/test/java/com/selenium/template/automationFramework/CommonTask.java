package com.selenium.template.automationFramework;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CommonTask {

    /**
     *
     * @param element - locator (WebElement)
     * @param elementName - element name
     */
    public static void clearElement(WebElement element, String elementName) {
        Log4Test.info("- clearing field : " + elementName);
        try {
            element.clear();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }

    }

    /**
     *
     * @param driver - driver instance
     * @param element - locator (WebElement)
     * @param elementName - element name
     */
    public static void moveToElement(WebDriver driver, WebElement element, String elementName) {
        Log4Test.info("- moving to element : " + elementName);
        try {
            Actions action = new Actions(driver);
            action.moveToElement(element).build().perform();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }
    }

    /**
     *
     * @param element - locator (WebElement)
     * @param text - text to be sent to element
     * @param elementName - element name
     */
    public static void sendKeys(WebElement element, String text, String elementName) {
        Log4Test.info("- sending keys : '" + text + "' : to " + elementName);
        try {
            clearElement(element, elementName);
            element.sendKeys(text);
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }

   }

    /**
     *
     * @param driver - driver instance
     * @param element - locator (WebElement)
     * @param elementName - element name
     */
    public static void clickElement(WebDriver driver, WebElement element, String elementName) {
        Waiting.elementToBeClickable(driver, element, elementName);
        moveToElement(driver, element, elementName);
        Log4Test.info("- clicking element : " + elementName);
        try {
            element.click();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }
    }
}
