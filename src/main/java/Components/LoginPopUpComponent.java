package Components;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPopUpComponent {
    private SelenideElement useEmailButton;
    private SelenideElement inputEmailField;
    private SelenideElement continueButton;
    private SelenideElement inputPasswordField;
    private SelenideElement loginButton;

    public LoginPopUpComponent() {
        this.useEmailButton = $x("//div/div[3]/div/div[4]/button");
        this.inputEmailField = $x("//*[@id='email-login-email']");
        this.continueButton = $x("//div/form/div[3]/button");
        this.inputPasswordField = $x("//*[@id='email-signup-password']");
        this.loginButton = $x("//div/div/form/div[3]/button");
    }

    @Step("Click use email button")
    public LoginPopUpComponent clickUseEmailButton() {
        useEmailButton.click();
        return this;
    }

    @Step("Input Email")
    public LoginPopUpComponent inputEmail (String valideEmail) {
        inputEmailField.sendKeys(valideEmail);
        new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(10))
                .until(webdriver -> webdriver.findElement(By.xpath("//*[@id='email-login-email']"))
                        .isDisplayed());
        return this;
    }

    @Step("Click continue button")
     public LoginPopUpComponent clickContinueButton() {
        continueButton.click();
        return this;
     }

     @Step("Input password")
    public LoginPopUpComponent inputPassword (String validePassword) {
        inputPasswordField.sendKeys(validePassword);
        return this;
    }

    @Step("Click Увійти button")
    public HeaderComponent clickLoginButton() {
        loginButton.click();
        return new HeaderComponent();
    }
}
