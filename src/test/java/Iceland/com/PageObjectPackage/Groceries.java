package Iceland.com.PageObjectPackage;

import Iceland.com.BaseClassPackage.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class Groceries extends DriverFactory {

    @FindBy(css = ".fas.fa-angle-down.nav-down-arrow.px-2")
    WebElement Groceries;

    public void groceriesButton() {
        Groceries.click();
    }

    @FindBy(id = "INEVHAL_nav_link")
    WebElement Halloween;

    public void halloweenButton() {
        Halloween.click();
    }

    @FindBy(id = "sticky-close")
    WebElement StickerClose;
    @FindBy(css = ".product-name")
    List<WebElement> HalloweenProducts;

    public void halloweenProductSelect() throws InterruptedException {
        Thread.sleep(200);
        StickerClose.click();
        for (WebElement HalloweenProduct : HalloweenProducts) {
            System.out.println(HalloweenProduct.getText());
            if (HalloweenProduct.getText().equalsIgnoreCase("MAOAM Stripes 140g")) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,2200);");
                HalloweenProduct.click();
                break;
            }
        }
    }

    @FindBy(css = ".product-qty-a2c")
    WebElement AddToBasket;

    public void addToBasket() {
        AddToBasket.click();
    }

    @FindBy(id = "dropdown-postcode-input")
    WebElement PostCode;
    @FindBy(css = ".btn.btn-primary")
    WebElement checkPostcodeButton;
    @FindBy(css = ".continue-browsing-button.btn.btn-outline-secondary.mr-2")
    WebElement continueButton;
    @FindBy(linkText = "Create an Account")
    WebElement createAccount;
    public void postCode(){
        PostCode.sendKeys("RM13 7QX");
        checkPostcodeButton.click();
        createAccount.click();
    }
}
