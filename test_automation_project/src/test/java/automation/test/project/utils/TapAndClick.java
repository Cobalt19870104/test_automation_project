package automation.test.project.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TapAndClick {

    public TapAndClick() {}

    public static void clickElement(WebDriver driver, WebElement webElement) {
        try {
            Waits.getFluentWait(driver).until(ExpectedConditions.elementToBeClickable(webElement)).click();
                    }
        catch (ElementClickInterceptedException e) {
            Scroll.moveToElement(driver, webElement);
            Waits.getFluentWait(driver).until(ExpectedConditions.elementToBeClickable(webElement)).click();
        }
    }

    public static void clickElement(WebDriver driver, By by) {
        try {
            Waits.getFluentWait(driver).until(ExpectedConditions.elementToBeClickable(by)).click();
        }
        catch (ElementClickInterceptedException e) {
            Scroll.moveToElement(driver, by);
            Waits.getFluentWait(driver).until(ExpectedConditions.elementToBeClickable(by)).click();
        }
    }
}
