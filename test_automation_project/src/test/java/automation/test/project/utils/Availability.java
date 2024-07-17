package automation.test.project.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Availability {

    public Availability() {}

    public static boolean isElementDisplayed(WebDriver driver, WebElement webElement) {
        try {
            return Waits.getFluentWait(driver).until(ExpectedConditions.visibilityOf(webElement)).isDisplayed();
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean isElementDisplayed(WebDriver driver, By by) {
        try {
            return Waits.getFluentWait(driver).until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }
}
