package Iceland.com.PageObjectPackage;

import Iceland.com.BaseClassPackage.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends DriverFactory {

    @FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement LoginButton;

    public void loginButton() {
        LoginButton.click();
    }

    @FindBy(id = "dwfrm_login_username")
    WebElement EmailAddress;

    public void email(String Email) {
        EmailAddress.sendKeys(Email);
    }

    @FindBy(id = "dwfrm_login_password")
    WebElement password;

    public void password(String Password) {
        password.sendKeys(Password);
    }

    @FindBy(css = ".form-row.form-row-button")
    WebElement signInSecurely;
    public void signInSecurely() throws InterruptedException {
        Thread.sleep(200);
        signInSecurely.click();
    }
}
