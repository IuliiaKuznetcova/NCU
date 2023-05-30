package E2E.pages.student;

import E2E.pages.gast.HederPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class StudentHomePage {
    private SelenideElement titleProfessorSpotlight = $x("(//span[normalize-space()='Professor spotlight'])[1]");
    private SelenideElement studentAvatar = $x("//*[@id=\"home_header4\"]/header/div/div/div[2]/button/div/img");
    private SelenideElement buttonSignOutStudent = $x("(//a[@role='menuitem'])[2]");
    HederPage hederPage = new HederPage();


    public void displayTitleProfessorSpotlight() {
        titleProfessorSpotlight.shouldHave(Condition.text("Professor spotlight"));
    }

    public void signOutStudent() {
        studentAvatar.click();
        studentAvatar.shouldBe(visible, Duration.ofSeconds(10));
        buttonSignOutStudent.click();
        hederPage.displayStudentDirectoryButton();


    }
}
