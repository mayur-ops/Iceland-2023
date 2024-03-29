package Iceland.com.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

   public static WebDriver driver;

   public DriverFactory (){ PageFactory.initElements(driver, this); }

   public void openBrowser(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       driver.get("https://www.iceland.co.uk/");
       driver.manage().window().maximize();
       driver.findElement(By.cssSelector(".accept-policy")).click();
   }

   public void closeBrowser(){
       //driver.quit();
   }
}
