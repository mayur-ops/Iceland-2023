package Iceland.com.PageObjectPackage;

import Iceland.com.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchButton extends DriverFactory {

    public void icelandHomePage(){
        String icelandHomePageURL = driver.getCurrentUrl();
        System.out.println(icelandHomePageURL);
        Assert.assertEquals(icelandHomePageURL,"https://www.iceland.co.uk/");
    }

    @FindBy(id = "header-search")
    WebElement searchButtonBox;

    public void searchButton(){
        searchButtonBox.sendKeys("food");
        searchButtonBox.sendKeys(Keys.ENTER);
    }

    public void searchResult(){
        String actualResultURL = driver.getCurrentUrl();
        System.out.println(actualResultURL);
        Assert.assertEquals(actualResultURL, "https://www.iceland.co.uk/search?q=food");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertThat(actualTitle, Matchers.equalToIgnoringCase("Search Results for food | Iceland Foods"));
    }
}
