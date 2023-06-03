package E2E.pages.student;

import E2E.pages.gast.HederPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;


public class StudentHomePage {
    private SelenideElement professorSpotlightTittle = $x("(//span[normalize-space()='Professor spotlight'])[1]");
    private SelenideElement studentAvatar = $x("//*[@id=\"home_header4\"]/header/div/div/div[2]/button/div/img");
    private SelenideElement signOutStudentButton = $x("(//a[@role='menuitem'])[2]");
    private SelenideElement coursesButton = $x("//*[@id=\"home_header4\"]/header/div/div/div[1]/a[2]/span");
    private SelenideElement coursesLIstButton = $x("//*[@id=\"home_header4\"]/header/div/div/div[1]/div/div/div/a/span[1]");
    HederPage hederPage = new HederPage();

    @Step("Display title professor Spotlight отображение заголовка")
    public void displayTitleProfessorSpotlight() {
        professorSpotlightTittle.shouldHave(Condition.text("Professor spotlight"));
    }

    @Step("Check Sign Out Student  Проверка того, что студент разлогинился")
    public void checkSignOutStudent() {
        studentAvatar.click();
        studentAvatar.shouldBe(visible, Duration.ofSeconds(10));
        signOutStudentButton.click();
        hederPage.displayStudentDirectoryButton();
    }

    @Step("Go to Courses Page  Переход к странице Courses")
    public void goToCoursesPage() {
        coursesButton.click();
        coursesLIstButton.click();
        //coursesLIstButton.shouldBe(visible, Duration.ofSeconds(10));


    }
}
