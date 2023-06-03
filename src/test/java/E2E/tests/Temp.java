package E2E.tests;

import E2E.tests.BaseTest;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class Temp extends BaseTest {

    //Из класса StudentCourseList
    private SelenideElement growthMarketingCourseOnthePageScope = $x("//*[@id=\"course-list\"]/section/div/div/div[2]/div/div/div[1]/div/div/div[8]/div/div[1]/a");
    private SelenideElement сomputerScienceCourseOnthePageScope = $x("//*[@id=\"course-list\"]/section/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/a");
    private SelenideElement сomputerScienceTitle = $x("(//div)[291]");
    private SelenideElement growthMarketingTitle = $x("(//div)[100]");
    private SelenideElement growthMarketingCourseDescriptionOnTheCourseList = $x("(//div)[293]");
    private SelenideElement сomputerScienceDescriptionOnTheCourseList = $x("(//div)[103]");
    private SelenideElement professorBlockOnMarketingCourse = $x("(//div)[296]");
    private SelenideElement professorBlockOnComputerScienceCourse = $x("(//div)[103]");
    private SelenideElement professorMarieCurieOnProfessorBlockOnGrowthMarketing = $x("(//span)[71]");
    private SelenideElement professorRoxanneOnProfessorBlockOnComputerScience = $x("(//span)[49]");
    private SelenideElement professorMarieCurieOnProfessorBlockOnComputerScience = $x("(//span)[41]");

        @Step("ShouldBe element on Growth Marketing course on course list Отображение элементов курса Growth Marketing на странице Сourse list")
    public void shouldBeElementOnGrowthMarketingCourse(){
        growthMarketingCourseOnthePageScope.shouldBe(visible, Duration.ofSeconds(10));
        сomputerScienceTitle.shouldBe(visible, Duration.ofSeconds(10));
        growthMarketingCourseDescriptionOnTheCourseList.shouldBe(visible, Duration.ofSeconds(10));
        professorBlockOnMarketingCourse.shouldBe(visible, Duration.ofSeconds(10));
        professorMarieCurieOnProfessorBlockOnGrowthMarketing.shouldBe(visible, Duration.ofSeconds(10));
    }

    @Step("ShouldBe element on Computer Science on course list Отображение элементов курса Growth Marketing на странице Computer Science")
    public void shouldBeElementOnComputerScienceCourse(){
        сomputerScienceCourseOnthePageScope.shouldBe(visible, Duration.ofSeconds(10));
        growthMarketingTitle.shouldBe(visible, Duration.ofSeconds(10));
        сomputerScienceDescriptionOnTheCourseList.shouldBe(visible, Duration.ofSeconds(10));
        professorBlockOnComputerScienceCourse.shouldBe(visible, Duration.ofSeconds(10));
        professorRoxanneOnProfessorBlockOnComputerScience.shouldBe(visible, Duration.ofSeconds(10));
        professorMarieCurieOnProfessorBlockOnComputerScience.shouldBe(visible, Duration.ofSeconds(10));
    }

   /* @Test
    public void checkElemenOnCourseList() {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        studentCourseList.shouldBeElementOnComputerScienceCourse();
        studentCourseList.shouldBeElementOnGrowthMarketingCourse();

    }*/


}
