package automation.test.project.pageObject;

import automation.test.project.utils.Scroll;
import automation.test.project.utils.TapAndClick;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage extends PageObject{

    @FindBy(xpath = "//a[@href='https://www.selenium.dev/']/h3")
    WebElement seleniumClick;

    @FindBy(xpath = "//a[contains(@class,'selenium-ide')]")
    WebElement seleniumIde;

    public SeleniumPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickSeleniumClick() {
        TapAndClick.clickElement(driver, seleniumClick);
    }

    public void scrollToSeleniumIde() {
        Scroll.moveToElement(driver, seleniumIde);
    }

    public void clickSeleniumIde() {
        TapAndClick.clickElement(driver, seleniumIde);
    }
}
