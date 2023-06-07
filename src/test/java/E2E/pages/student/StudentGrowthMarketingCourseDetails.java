package E2E.pages.student;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class StudentGrowthMarketingCourseDetails {
    private SelenideElement growthMarketingTitleCourse = $x("//h3[normalize-space()='Growth Marketing']");
    private SelenideElement uploadCourseMaterialButton = $x("(//button[normalize-space()='Upload'])[1]");
    //private ElementsCollection courseInformationWidget = $$(By.className("//*[@id=\"course-details\"]/section/div/div/div/div/div/div[2]/div/div/div[1]"));
    //TODO Нижний путь отрабатывает
    //private ElementsCollection courseInformationWidget = $$(By.className("MuiGrid-container"));
    private ElementsCollection courseInformationWidget = $$(By.className("MuiGrid-container")).get(1).$$(By.className("sw-font-size-xl"));


    public void displayGrowthMarketingTitleCourse(String searchInput) {
        growthMarketingTitleCourse.shouldHave(text(searchInput));
        growthMarketingTitleCourse.shouldBe(visible, Duration.ofSeconds(10));
    }
    //как тут написать метод, который будет подставлять локатор и название,
    //чтобы не прописывать отдельно метод на видимость каждого элемента

    public void existsUploadCourseMaterialButton(String searchInput) {
        uploadCourseMaterialButton.shouldHave(text(searchInput));
    }

    public void onExistsUploadCourseMaterialButton(String value) {
        uploadCourseMaterialButton.shouldNotBe(Condition.visible);
    }

    @Step("Dysplay course information  Отображение информации об учителях курса")
    public void dysplayngInformationAboutCourseTiecher() {
        //вытащить из коллекции содержимое блока преподаватели
        courseInformationWidget.get(1).$(By.className("sw-font-size-xl")).shouldHave(text("Heading3"));



        //$$(By.className("//*[@id=\"course-details\"]/section/div/div/div/div/div/div[2]/div/div/div[1]")).first().shouldHave(text("\"Heading3\""));
        //courseInformationWidget.first().shouldHave(text("Heading3"));
        //$$(By.className("MuiGrid-container")).get(1).$(By.className("sw-font-size-xl")).shouldHave(text("Heading3"));

//TODO в courseInformationWidget указать локатор, указанный над этой строчкой


    }

    @Step("Dysplay course information  Отображение информации об учителях курса")
    public void printInformationAboutCourseTiecher() {
        //вытащить из коллекции содержимое блока преподаватели
        //courseInformationWidget.get(1).$(By.className("sw-font-size-xl")).shouldHave(text("Heading3"));
        //$$(By.className("//*[@id=\"course-details\"]/section/div/div/div/div/div/div[2]/div/div/div[1]")).first().shouldHave(text("\"Heading3\""));
        //courseInformationWidget.first().shouldHave(text("Heading3"));
        //$$(By.className("MuiGrid-container")).get(1).$(By.className("sw-font-size-xl")).shouldHave(text("Heading3"));

//TODO в courseInformationWidget указать локатор, указанный над этой строчкой


        List<String> professors = new ArrayList<>();

        for(SelenideElement element : courseInformationWidget) {
            professors.add(element.getAttribute("professor"));
        }
        System.out.println(professors);
       /* for (int i = 0; i <professors.size() ; i++) {
            String listProfessors = professors.get(i);
           // System.out.println(listProfessors);

        }*/
    }
}
