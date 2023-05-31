package E2E.pages.student;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class StudentCoursrList {

    private SelenideElement ourCourseTitle = $x("//*[@id=\"course-list-heading\"]/section/div/div/div/h1");

    private SelenideElement growthMarketingCourseButton = $x("//*[@id=\"course-list\"]/section/div/div/div[2]/div/div/div[1]/div/div/div[8]/div/div[1]/a");
    public void displayOurCourseTitle() {
        ourCourseTitle.shouldBe(Condition.text("Our courses"));
    }

    public void goToGrowthMarketingCourse() {
        growthMarketingCourseButton.shouldBe(visible, Duration.ofSeconds(10));
        growthMarketingCourseButton.click();

    }
}
