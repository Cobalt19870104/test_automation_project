package automation.test.project.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

    public Scroll() {}

    public static void moveToElement(WebDriver driver, WebElement webElement){
        if (Availability.isElementDisplayed(driver, webElement)) {
        new Actions(driver).scrollToElement(webElement).perform();
        }
        else try {
            throw new Exception("Element is not available!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void moveToElement(WebDriver driver, By by){
        if (Availability.isElementDisplayed(driver, driver.findElement(by))) {
            new Actions(driver).scrollToElement(driver.findElement(by)).perform();
        }
        else try {
            throw new Exception("Element is not available!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
