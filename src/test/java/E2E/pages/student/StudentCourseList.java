package E2E.pages.student;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;


public class StudentCourseList {
    private SelenideElement ourCourseTitle = $x("//*[@id=\"course-list-heading\"]/section/div/div/div/h1");

    private SelenideElement growthMarketingCourseButton = $x("//*[@id=\"course-list\"]/section/div/div/div[2]/div/div/div[1]/div/div/div[8]/div/div[1]/a");
    private SelenideElement fieldSearchOnCourseList = $x("//*[@id=\":r0:\"]");
    private SelenideElement searchResultOnCourseList = $x("//*[@id=\"course-list\"]/section/div/div/div[2]");

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


    @Step("Display our courses title")
    public void displayOurCoursesTitle() {
        ourCourseTitle.shouldBe(Condition.text("Our courses"));
    }

    @Step("Go to Growth Marketing course")
    public void goToGrowthMarketingCourse() {
        growthMarketingCourseButton.shouldBe(visible, Duration.ofSeconds(10));
        growthMarketingCourseButton.click();
    }

    @Step("Fill field search on course list")
    public void fillFieldSearchOnCourseList(String desiredValue) {
        fieldSearchOnCourseList.click();
        fieldSearchOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
        fieldSearchOnCourseList.setValue(desiredValue);
        fieldSearchOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
        // scroll.scrollIntoView(false);
    }


    @Step("ShouldBe element on Growth Marketing course on course list")
    public void shouldBeElementOnGrowthMarketingCourse(){
        growthMarketingCourseOnthePageScope.shouldBe(visible, Duration.ofSeconds(10));
        сomputerScienceTitle.shouldBe(visible, Duration.ofSeconds(10));
        growthMarketingCourseDescriptionOnTheCourseList.shouldBe(visible, Duration.ofSeconds(10));
        professorBlockOnMarketingCourse.shouldBe(visible, Duration.ofSeconds(10));
        professorMarieCurieOnProfessorBlockOnGrowthMarketing.shouldBe(visible, Duration.ofSeconds(10));
    }

    @Step("ShouldBe element on Computer Science on course list")
    public void shouldBeElementOnComputerScienceCourse(){
        сomputerScienceCourseOnthePageScope.shouldBe(visible, Duration.ofSeconds(10));
        growthMarketingTitle.shouldBe(visible, Duration.ofSeconds(10));
        сomputerScienceDescriptionOnTheCourseList.shouldBe(visible, Duration.ofSeconds(10));
        professorBlockOnComputerScienceCourse.shouldBe(visible, Duration.ofSeconds(10));
        professorRoxanneOnProfessorBlockOnComputerScience.shouldBe(visible, Duration.ofSeconds(10));
        professorMarieCurieOnProfessorBlockOnComputerScience.shouldBe(visible, Duration.ofSeconds(10));
    }

    @Step("Fill field search on course list")
    public void fillFieldSearch(String courseName) {
        fieldSearchOnCourseList.click();
        fieldSearchOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
        fieldSearchOnCourseList.setValue(courseName);
        fieldSearchOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
       }

    @Step("Search result on course list")
    public void searchResultDisplayExactData(String courseName) {
        searchResultOnCourseList.shouldHave(Condition.text(courseName));
    }

    @Step("Go to a course from a search result")
    public void goToCourseFromSearchResult() {
        searchResultOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
        searchResultOnCourseList.click();
    }

}
