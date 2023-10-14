package Iceland.com.StepDefinationPackage;

import Iceland.com.PageObjectPackage.Registration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {

    Registration obj = new Registration();

    @When("user click on the Register Button")
    public void user_click_on_the_register_button() {
        obj.registerButton();
    }

    @When("user closed the advertise window")
    public void user_closed_the_advertise_window() {
        obj.addClose();
    }

    @When("user give fill up all related details")
    public void user_give_fill_up_all_related_details() throws InterruptedException {
        obj.registerAccount();
    }

    @Then("user click on create an account")
    public void user_click_on_create_an_account() {

    }

}
