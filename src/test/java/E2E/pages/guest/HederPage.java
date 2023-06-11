package E2E.pages.guest;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class HederPage {
    private SelenideElement studentDirectoryButton = $x("//*[@id=\"home_header4\"]/header/div/div/div[1]/a[4]/span");
    private SelenideElement coursesButton = $x("//*[@id=\"home_header4\"]/header/div/div/div[1]/a[2]/span");
    private SelenideElement professorDirectoryButton = $x("(//span[normalize-space()='Professors'])[1]");
    private SelenideElement coursesLIstButton = $x("(//*[@id=\"home_header4\"]/header/div/div/div[1]/div/div/div/a/span[1]");

    public void displayStudentDirectoryButton() {
        studentDirectoryButton.shouldBe(visible, Duration.ofSeconds(10));
    }

    public void displayProfessorDirectoryButton() {
        professorDirectoryButton.shouldBe(visible, Duration.ofSeconds(10));

    }

    public void clickStudentDirectoryButton() {
        studentDirectoryButton.click();
        studentDirectoryButton.shouldBe(visible, Duration.ofSeconds(10));
    }

    public void clickProfessorDirectoryButton() {
        professorDirectoryButton.click();
        professorDirectoryButton.shouldBe(visible, Duration.ofSeconds(10));
    }

    public void clickCoursesButton() {
        coursesButton.click();
        coursesButton.shouldBe(visible, Duration.ofSeconds(10));
    }


}
