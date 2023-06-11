/*
package E2E.temp;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TempStudentGrowthMarketingCourseDetails {

    private SelenideElement growthMarketingTitleCourse = $x("//h3[normalize-space()='Growth Marketing']");
    private SelenideElement uploadCourseMaterialButton = $x("(//button[normalize-space()='Upload'])[1]");
    private SelenideElement aboutThisCourse = $(byText("About this course"));
    private ElementsCollection courseInformationWidget = $$(By.className("//*[@id=\"course-details\"]/section/div/div/div/div/div/div[2]/div[1]/div/div"));
    private SelenideElement tyknut = $x("(//a)[8]");

    public void tyknutTut() throws InterruptedException {
        tyknut.click();
        Thread.sleep(1000);
    }

    private ElementsCollection tablizaKursa = $$("//*[@id=\"course-details\"]/section/div/div/div/div/div/div[2]");
    //private ElementsCollection courseInformationWidget = $$(By.className("MuiGrid-container"));
    //private ElementsCollection courseInformationWidget = $$(By.className("MuiGrid-container")).get(1).$$(By.className("sw-font-size-xl"));
    //private ElementsCollection courseInformationWidget = $$(By.className("MuiGrid-container")).get(0).$$(By.className("sw-font-size-xl"));
    // private ElementsCollection courseInformationWidgetAA = $$(By.className("MuiGrid-container")).get(0).$(By.className("sw-font-size-xl")).get(0);
    // courseInformationWidget.get(0).$$(By.className("sw-font-size-xl")).get(0);

    @Step("Dysplay course information  Отображение информации об учителях курса")
    public void dysplayngInformationAboutCourseTiecher() {
        //tablizaKursa.get(1).shouldNotBe(Condition.visible);
        //вытащить из коллекции содержимое блока преподаватели
        courseInformationWidget.get(1).shouldHave(text("Heading3"));
        //courseInformationWidget.first().shouldHave(text("Heading3"));
        //courseInformationWidget.get(0).$(By.className("sw-font-size-xl")).shouldHave(text("Heading3"));
        //$(By.className("//*[@id=\"course-details\"]/section/div/div/div/div/div/div[2]/div[1]/div/div")).should(text("text(\"Heading3\")"));
        //$(By.className("//body/div[@class='content']/div[@id='course-details']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).should(text("text(\"Heading3\")"));
        //$$(By.className("//*[@id=\"course-details\"]/section/div/div/div/div/div/div[2]/div/div/div[1]")).first().shouldHave(text("\"Heading3\""));
        //$$(By.className("MuiGrid-container")).get(1).$(By.className("sw-font-size-xl")).shouldHave(text("Heading3"));
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

        for (SelenideElement element : courseInformationWidget) {
            professors.add(element.getAttribute("professor"));
        }
        System.out.println(professors);
        for (int i = 0; i < professors.size(); i++) {
            String listProfessors = professors.get(i);
            System.out.println(listProfessors);
        }
    }

    public void displayGrowthMarketingTitleCourse(String courseName) throws InterruptedException {
        growthMarketingTitleCourse.shouldHave(text(courseName));
        growthMarketingTitleCourse.shouldBe(visible, Duration.ofSeconds(10));
        Thread.sleep(1000);
    }


    public void existsUploadCourseMaterialButton(String searchInput) {
        uploadCourseMaterialButton.shouldHave(text(searchInput));
    }

    public void onExistsUploadCourseMaterialButton(String value) {
        uploadCourseMaterialButton.shouldNotBe(Condition.visible);
    }


    public void aboutThisCourse() {
        aboutThisCourse.should(exist);
    }
}


*/
