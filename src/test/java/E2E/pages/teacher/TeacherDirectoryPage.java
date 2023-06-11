package E2E.pages.teacher;

import E2E.tests.BaseTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class TeacherDirectoryPage extends BaseTest {

    private SelenideElement addACourseButton = $x("(//span[normalize-space()='Add a course'])[1]");
    private SelenideElement fieldSearchOnTeacherDirectory = $x("//*[@id=\":r0:\"]");
    private SelenideElement scroll = $x(" //*[@id=\"home-footer\"]/section/div/div[3]/div[1]/small");
    private SelenideElement coursesButton = $x("//*[@id=\"home_header4\"]/header/div/div/div[1]/a[2]/span");
    private SelenideElement professorSpotlightTittle = $x("(//span[normalize-space()='Professor spotlight'])[1]");
    private SelenideElement studentAvatar = $x("//*[@id=\"home_header4\"]/header/div/div/div[2]/button/div/img");
    private SelenideElement signOutStudentButton = $x("(//a[@role='menuitem'])[2]");
    private SelenideElement professorDirectoryButton = $x("(//span[normalize-space()='Professors'])[1]");
    private SelenideElement coursesLIstButton = $x("//*[@id=\"home_header4\"]/header/div/div/div[1]/div/div/div/a");

    public void displayAddACourseButton() throws InterruptedException {
        addACourseButton.shouldBe(visible, Duration.ofSeconds(10));
        Thread.sleep(1000);
    }

    public void fillFieldSearchOnTeacherDirectory(String desiredValue) {
        fieldSearchOnTeacherDirectory.click();
        fieldSearchOnTeacherDirectory.shouldBe(visible, Duration.ofSeconds(10));
        fieldSearchOnTeacherDirectory.setValue(desiredValue);
        fieldSearchOnTeacherDirectory.shouldBe(visible, Duration.ofSeconds(10));
        scroll.scrollIntoView(false);
    }

/* public void searchResultDisplayExactData(String searchedStudentName) {
        searchResultOnStudentDirectoryFullName.shouldHave(Condition.text(searchedStudentName));
    }*/

}
