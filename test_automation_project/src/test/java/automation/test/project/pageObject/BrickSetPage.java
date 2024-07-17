package automation.test.project.pageObject;

import automation.test.project.utils.TapAndClick;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrickSetPage extends PageObject {

@FindBy(
        xpath = "//div[@aria-label='Close ad']")
    WebElement closeAdButton;

@FindBy(
        xpath = "//a[@href='/browse']")
    WebElement browseButton;

@FindBy(xpath = "//div[@class='tF2Cxc']//a[@href='https://brickset.com/']")
    WebElement brickSetClick;

public BrickSetPage(WebDriver driver) {
    super (driver);
            PageFactory.initElements(driver, this);
}

public void clickCloseAdButton() {
    TapAndClick.clickElement(driver, closeAdButton);
}

public void clickBrowseButton() {
    TapAndClick.clickElement(driver, browseButton);
}

public void clickBrickSetClick() {
    TapAndClick.clickElement(driver, brickSetClick);
}

}
