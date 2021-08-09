import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(className = "large-5")
    private WebElement footerCopyright;

    @FindBy(css = "body > div.muse-bar.smooth-criminal > nav > ul > li.muse-login")
    private WebElement loginButton;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;

    public HomePage(WebDriver driver) {
        super();
    }

    public void clickCookiesButton() {
        this.acceptCookiesButton.click();
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public String readFooterCopyrightText() {
        return this.footerCopyright.getText();
    }
}
