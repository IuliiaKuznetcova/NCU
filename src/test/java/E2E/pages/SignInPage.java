package E2E.pages;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SignInPage {
    private SelenideElement signInButton = $x("//*[@id=\"home-header-non-logged-in\"]/header/div/div/div/div/a[1]");
    private SelenideElement emailField =  $(byAttribute("placeholder","Email"));
    private SelenideElement passwordField =  $(byAttribute("placeholder","Password"));
    private SelenideElement signInButtonInRegistrForm = $x("//*[@id=\"sw-sign-in-submit-btn\"]");
    private SelenideElement registrationForm = $x("//*[@id=\"signin\"]");


    public void clickSignInButton(){
        signInButton.click();
    }

    public void displayRegistrationForm() {
        registrationForm.shouldBe(visible, Duration.ofSeconds(10));
    }
    public void enterEmail(String emailValue){
        emailField.shouldBe(visible, Duration.ofSeconds(10));
        emailField.setValue(emailValue);
    }

    public void enterPassword(String passwordValue){
        passwordField.setValue(passwordValue);
    }

    public void clickSignInButtonInRegistrForm(){
        signInButtonInRegistrForm.click();
        signInButtonInRegistrForm.shouldBe(visible, Duration.ofSeconds(10));
    }



}
