package E2E.pages.student;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
public class StudentGrowthMarketingCourseDetails {

    private SelenideElement growthMarketingTitleCourse = $x("//h3[normalize-space()='Growth Marketing']");

    private SelenideElement uploadCourseMaterialButton = $x("(//button[normalize-space()='Upload'])[1]");

    public void displayGrowthMarketingTitleCourse(String searchInput) {
        growthMarketingTitleCourse.shouldHave(Condition.text(searchInput));
    }

    //как тут написать метод, который будет подставлять локатор и название,
    //чтобы не прописывать отдельно метод на видимость каждого элемента

    public void existsUploadCourseMaterialButton(String searchInput) {
        uploadCourseMaterialButton.shouldHave(Condition.text(searchInput));
    }

    public void onExistsUploadCourseMaterialButton(String value) {
        uploadCourseMaterialButton.shouldNotBe(Condition.visible);
    }



}
