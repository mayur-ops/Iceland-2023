package Iceland.com.StepDefinationPackage;

import Iceland.com.PageObjectPackage.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    Login obj = new Login();

    @When("user click on the login button")
    public void user_click_on_the_login_button() {
        obj.loginButton();
    }

    @When("user provide email address {string}")
    public void user_provide_email_address(String Email) {
        obj.email(Email);
    }

    @When("user provide password {string}")
    public void user_provide_password(String Password) {
        obj.password(Password);
    }

    @Then("user click on sign in securely")
    public void user_click_on_sign_in_securely() throws InterruptedException {
        obj.signInSecurely();
    }

}
