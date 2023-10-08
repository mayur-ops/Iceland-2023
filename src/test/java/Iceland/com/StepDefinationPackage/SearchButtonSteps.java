package Iceland.com.StepDefinationPackage;

import Iceland.com.PageObjectPackage.SearchButton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchButtonSteps {

    SearchButton searchButton = new SearchButton();

    @Given("user is on iceland homepage")
    public void user_is_on_iceland_homepage() {
        searchButton.icelandHomePage();
    }

    @When("user search the item food")
    public void user_search_the_item_food() {
        searchButton.searchButton();
    }

    @Then("user should able see all related items")
    public void user_should_able_see_all_related_items() {
        searchButton.searchResult();
    }
}
