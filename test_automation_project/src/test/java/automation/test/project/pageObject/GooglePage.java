package automation.test.project.pageObject;

import automation.test.project.utils.GetAndFill;
import automation.test.project.utils.TapAndClick;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends PageObject{

    @FindBy(
            xpath = "//textarea[@id='APjFqb']")
    WebElement googleTextBox;

    @FindBy(
            xpath = "//div[@class='QS5gu sy4vM' and contains (text(),'elfogad')]"
    )
    WebElement googleCookieAccept;

    @FindBy(
            xpath = "//div[@class='aajZCb']//input[@class='gNO89b']"
    )
    WebElement googleSearchButton;

    public GooglePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickGoogleCookieAccept() {
        TapAndClick.clickElement(driver, googleCookieAccept);
    }

    public void clickGoogleTextBox() {
        TapAndClick.clickElement(driver, googleTextBox);
    }

    public void fillGoogleTextBox(String text) {
        GetAndFill.fillText(driver, googleTextBox, text);
    }

    public void clickGoogleSearchButton() {
        TapAndClick.clickElement(driver, googleSearchButton);
    }
}
