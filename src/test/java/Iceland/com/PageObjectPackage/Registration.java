package Iceland.com.PageObjectPackage;

import Iceland.com.BaseClassPackage.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registration extends DriverFactory {

    @FindBy(linkText = "Register")
    WebElement RegisterButton;
    public void registerButton(){
    RegisterButton.click();
    }

    @FindBy(id = "sticky-close")
    WebElement stickyClose;

    public void addClose(){
        stickyClose.click();
    }

    @FindBy(id = "dwfrm_profile_customer_title")
    WebElement selectTitle;
    @FindBy(id = "dwfrm_profile_customer_firstname")
    WebElement firstName;
    @FindBy(id = "dwfrm_profile_customer_lastname")
    WebElement lastName;
    @FindBy(id = "dwfrm_profile_address_phone")
    WebElement contactPhoneNumber;
    @FindBy(id = "postal-code-duplicate")
    WebElement enterPostCode;
    @FindBy(css = ".manual-edit.link")
    WebElement manualEnterPostCode;
    @FindBy(id = "dwfrm_profile_address_address1")
    WebElement firstLineAddress;
    @FindBy(id = "dwfrm_profile_address_address2")
    WebElement secondLineAddress;
    @FindBy(id = "dwfrm_profile_address_city")
    WebElement townCity;
    @FindBy(id = "dwfrm_profile_address_county")
    WebElement County;
    @FindBy(id = "dwfrm_profile_address_addressid")
    WebElement nameThisAddress;
    @FindBy(id = "dwfrm_profile_customer_email")
    WebElement emailAddress;
    @FindBy(id = "dwfrm_profile_login_password")
    WebElement password;
//    @FindBy(xpath = "//*[@id=\"bcOptions_1\"]")
//    WebElement noCard;
//    @FindBy(xpath = "//*[@id=\"RegistrationForm\"]/div[4]/div[2]/div[2]/div/div/label")
//    WebElement digitalBonusCardBox;
//    @FindBy(id = "dwfrm_profile_customer_addtoemaillist")
//    WebElement termsAndCondition;
    @FindBy(xpath = "")
    WebElement robertButton;
    @FindBy(xpath = "//button[@id='sendBtn']")
    WebElement createAccountButton;


    public void registerAccount() throws InterruptedException {
        Select sel = new Select(selectTitle);
        sel.selectByIndex(4);
        firstName.sendKeys("Mayur");
        lastName.sendKeys("patel");
        contactPhoneNumber.sendKeys("07311795657");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200);");
        manualEnterPostCode.click();
        firstLineAddress.sendKeys("103 Rainham Road");
        secondLineAddress.sendKeys("Rainham");
        townCity.sendKeys("Essex");
        County.sendKeys("Essex");
        nameThisAddress.sendKeys("Essex");
        enterPostCode.sendKeys("RM13 7QX");
        emailAddress.sendKeys("mkp802002@aol.com");
        password.sendKeys("Tester123");
        //noCard.click();
        js.executeScript("window.scrollBy(0,1200);");
       // digitalBonusCardBox.click();
        //termsAndCondition.click();
        driver.switchTo().frame(1);
        Thread.sleep(10000);
        //robertButton.click();
        createAccountButton.click();
    }
}
