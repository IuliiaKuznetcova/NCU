package E2E.pages;

import E2E.tests.BaseTest;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class SignInPage {
    private SelenideElement signInButton = $x("//*[@id=\"home-header-non-logged-in\"]/header/div/div/div/div/a[1]");
    private SelenideElement emailField = $(byAttribute("placeholder", "Email"));
    private SelenideElement passwordField = $(byAttribute("placeholder", "Password"));
    private SelenideElement signInButtonInRegistrForm = $x("//*[@id=\"sw-sign-in-submit-btn\"]");
    private SelenideElement registrationForm = $x("//*[@id=\"signin\"]");

    @Step("Click the button Sign In on the HomePage Нажатие кнопки Sign In на главной странице")
    public void clickSignInButton() {
        signInButton.click();
    }

    @Step("Display Registration Form  Отображение формы регистрации")
    public void displayRegistrationForm() {
        registrationForm.shouldBe(visible, Duration.ofSeconds(10));
    }

    @Step("Enter Email Введение эмейла")
    public void enterEmail(String emailValue) {
        emailField
                .shouldBe(visible, Duration.ofSeconds(10))
                .setValue(emailValue);
   }

    @Step("Enter Password Введение пароля")
    public void enterPassword(String passwordValue) {
        passwordField.setValue(passwordValue);
    }

    @Step("Click the button Sign In in the Registry Form Нажатие кнопки Sign In в форме регистрации")
    public void clickSignInButtonInRegistrForm() {
        signInButtonInRegistrForm.click();
        signInButtonInRegistrForm.shouldBe(visible, Duration.ofSeconds(10));
    }

     @Step("Login action with enter email, password and click Sign In Button Авторизация с введением емейла, пароля и нажатием кнопки Sign In")
    public void loginAction(String emailValue, String passwordValue) {
        registrationForm.shouldBe(visible, Duration.ofSeconds(10));
        emailField.shouldBe(visible, Duration.ofSeconds(10));
        emailField.setValue(emailValue);
        passwordField.setValue(passwordValue);
        signInButtonInRegistrForm.click();
        signInButtonInRegistrForm.shouldBe(visible, Duration.ofSeconds(10));
    }


    @Step("Login Malik авторазиция Малика")
    public void loginMalik() {
        signInButton.click();
        registrationForm.shouldBe(visible, Duration.ofSeconds(10));
        emailField.shouldBe(visible, Duration.ofSeconds(10));
        emailField.setValue("malik@example.com");
        passwordField.setValue("123456");
        signInButtonInRegistrForm.click();
        signInButtonInRegistrForm.shouldBe(visible, Duration.ofSeconds(10));
    }


}
