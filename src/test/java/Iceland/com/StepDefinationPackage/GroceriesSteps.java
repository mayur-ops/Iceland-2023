package Iceland.com.StepDefinationPackage;

import Iceland.com.PageObjectPackage.Groceries;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GroceriesSteps {

    Groceries obj = new Groceries();

    @When("user click on groceries button")
    public void user_click_on_groceries_button() {
        obj.groceriesButton();
    }

    @When("user click on halloween and Bonfire product")
    public void user_click_on_halloween_and_bonfire_product() {
        obj.halloweenButton();
    }

    @When("user select the Maoam sweets")
    public void user_select_the_maoam_sweets() throws InterruptedException {
        obj.halloweenProductSelect();
    }

    @When("user add in to basket")
    public void user_add_in_to_basket() {
obj.addToBasket();
    }

    @And("user give their post code and continue")
    public void userGiveTheirPostCodeAndContinue() {
        obj.postCode();
    }


    @And("user create an account")
    public void userCreateAnAccount() {

    }

    @When("user add quantity")
    public void user_add_quantity() {
    }

    @When("user click on checkout")
    public void user_click_on_checkout() {

    }

    @Then("user is on basket window")
    public void user_is_on_basket_window() {

    }

    @Then("user Delete the item")
    public void user_delete_the_item() {

    }

    @Then("user Basket empty and close")
    public void user_basket_empty_and_close() {

    }


}
