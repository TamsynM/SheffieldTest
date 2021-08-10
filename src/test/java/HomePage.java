import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends PageObject{

    @FindBy(css = "body > div.dialog-off-canvas-main-canvas > div > footer > div.bottom-bar.panel > div > div.large-5.columns.copyright")
    private WebElement footerCopyright;

    @FindBy(css = "body > div.muse-bar.smooth-criminal > nav > ul > li.muse-login")
    private WebElement loginButton;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void clickCookiesButton() {
        this.acceptCookiesButton.click();
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public String readFooterCopyrightText() {
        return footerCopyright.getText();
    }
}
