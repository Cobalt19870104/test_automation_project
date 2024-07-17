package automation.test.project.utils;

import org.junit.platform.commons.function.Try;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GetAndFill {

    public GetAndFill() {}

    public static void fillText(WebDriver driver, WebElement webElement, String text) {
        try {
            Waits.getFluentWait(driver).until(ExpectedConditions.elementToBeClickable(webElement)).sendKeys(text);
        }
        catch (RuntimeException e) {
            throw new RuntimeException("Element is not available!", e);
        }
    }
}
