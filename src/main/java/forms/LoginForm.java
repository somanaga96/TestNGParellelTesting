package forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm {
    @FindBy(id = LoginFormObjects.USER_NAME)
    public WebElement USER_NAME;
}
