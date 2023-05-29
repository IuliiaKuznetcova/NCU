package E2E.pages.student;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Value;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class StudetnDirectoryPage {

    //private SelenideElement welcomeTextOnStudentPage = $(byText("Welcome"));
    private SelenideElement welcomeTextOnStudentPage = $x("//h1[normalize-space()='Welcome to our']");
    private SelenideElement fieldSearch = $x("//*[@id=\":r0:\"]");

    //private SelenideElement searchResultInStudentDirectory = $(byCssSelector(".field-student-directory-0-heading3-_i7tulsj9u.MuiBox-root.css-blhqza"));
    //private SelenideElement searchResultInStudentDirectory = $(byCssSelector("field-student-directory-0-heading3-_i7tulsj9u MuiBox-root css-blhqza"));
    private SelenideElement searchResultInStudentDirectoryFullName = $x("//*[@id=\"student-directory\"]/section/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div");
    private SelenideElement searchResultInStudentDirectoryEmail = $x("(//p[@class='sw-font-size-m sw-text-color-0146b1 sw-font-family-default sw-font-weight-normal sw-text-align-left sw-letter-spacing-normal sw-padding-top-6xs sw-padding-bottom-6xs sw-padding-left-none sw-padding-right-none '])[1]");
        //    private SelenideElement searchResultInStudentDirectory = $x("(//h3[@class='sw-font-size-3xl sw-text-color-0A0A0A sw-font-family-default sw-font-weight-semibold sw-text-align-left sw-letter-spacing-normal sw-padding-top-3xs sw-padding-bottom-6xs sw-padding-left-none sw-padding-right-none '])[1]");

    private SelenideElement scroll = $x(" //*[@id=\"home-footer\"]/section/div/div[3]/div[1]/small");

    private SelenideElement viewProfileButton = $x("(//a[normalize-space()='View profile'])[1]");

    public void displayWelcomeTextOnStudentPage() {
        welcomeTextOnStudentPage.shouldBe(visible, Duration.ofSeconds(10));
        //welcomeTextOnStudentPage.shouldBe(value("Welcome"));
    }

    public void fillFieldSearch(String desiredValue) {
        fieldSearch.click();
        fieldSearch.shouldBe(visible, Duration.ofSeconds(10));
        fieldSearch.setValue(desiredValue);
        fieldSearch.shouldBe(visible, Duration.ofSeconds(10));
        scroll.scrollIntoView(false);
    }

    public void searchResultDisplayExactData() {
        searchResultInStudentDirectoryFullName.shouldHave(Condition.text("Iuliia Kuz"));
    }

  /*  public void searchResultDisplayRandomData() {
             searchResultInStudentDirectoryFullName.shouldHave(exactValue());
    }*/

    public void viewProfileButton() {
        viewProfileButton.click();
    }
}
