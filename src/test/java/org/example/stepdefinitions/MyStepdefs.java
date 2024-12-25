package org.example.stepdefinitions;

import forms.LoginForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.baseUtils.BaseUtils;

public class MyStepdefs extends BaseUtils {
    LoginForm loginForm = new LoginForm();

    @Given("user launched on Swag Labs")
    public void user_launched_on_swag_labs() {
        initializePageObjects(loginForm); // Initialize PageFactory elements
        System.out.println("Launched Swag Labs");
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String user_name, String password) {
        loginForm.USER_NAME.sendKeys(user_name);
    }
}
