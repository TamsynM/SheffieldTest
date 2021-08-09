import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private final String USERNAME_INPUT = "tester";
    private final String PASSWORD_INPUT = "password";

    @FindBy(id = "username")
    private WebElement usernameEntry;

    @FindBy(id = "password")
    private WebElement passwordEntry;

    @FindBy(css = "#fm1 > input.btn.btn-block.btn-submit.button.button--primary")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super();
    }

    public void enterUsername() {
        this.usernameEntry.sendKeys(USERNAME_INPUT);
    }

    public void enterPassword() {
        this.passwordEntry.sendKeys(PASSWORD_INPUT);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }
}
