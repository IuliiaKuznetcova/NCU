package E2E.pages.student;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class StudentCourseList {
    private SelenideElement ourCourseTitle = $x("//*[@id=\"course-list-heading\"]/section/div/div/div/h1");
    private SelenideElement growthMarketingCourseButton = $x("//*[@id=\"course-list\"]/section/div/div/div[2]/div/div/div[1]/div/div/div[8]/div/div[1]/a");
    private SelenideElement fieldSearchOnCourseList = $x("//*[@id=\":r0:\"]");
    private SelenideElement searchResultOnCourseList = $x("//*[@id=\"course-list\"]/section/div/div/div[2]");
    //private SelenideElement growthMarketingCourseSearchResult = $x("//*[@id=\"course-list\"]/section/div/div/div[2]/div/div/div/div/div/div/div/div[1]/a");
    //private SelenideElement growthMarketingCourseSearchResult = $x("//*[@id=\"course-list\"]/section/div/div/div[2]/div/div/div/div/div/div");
    private ElementsCollection courseBlockOnCourseListWidget = $$(By.className("vertical-list-item"));

    public void checkFirstWidgetTitle() {
        courseBlockOnCourseListWidget.get(1).$(By.className("MuiChip-root")).shouldHave(text("Marie"));
    }

    public void checkFirstWidgetTitle1() {
        //текстовый блок
        //courseBlockonCourseListWidget.get(1).$(By.className("additional-elements-wrapper")).shouldHave(text("Mar"));
        //Название курсов
        //courseBlockonCourseListWidget.get(1).$(By.className("additional-elements-wrapper")).$(By.className("MuiBox-root")).shouldHave(text("Computer"));
        //описание курса
        //courseBlockonCourseListWidget.get(1).$(By.className("additional-elements-wrapper")).$(By.className("sw-font-size-s")).shouldHave(text("sys"));
        //блок преподавателей
        //courseBlockonCourseListWidget.get(1).$(By.className("additional-elements-wrapper")).$(By.className("css-1vykty2")).shouldHave(text("John"));
        /*courseBlockonCourseListWidget.get(1).$(By.className("additional-elements-wrapper")).$(By.className("css-1vykty2")).shouldHave(text("Rox"));

        courseBlockonCourseListWidget.find((By.className("additional-elements-wrapper")).$((By.className("css-1vykty2"));
        courseBlockonCourseListWidget.find((By.className("additional-elements-wrapper")).findall((By.className("css-1vykty2"));
        courseBlockonCourseListWidget.filterBy((By.className("additional-elements-wrapper")).findall((By.className("css-1vykty2"));*/

        String titleCours = courseBlockOnCourseListWidget.get(1).$(By.className("additional-elements-wrapper")).$(By.className("css-1vykty2")).getText();
        System.out.println(titleCours);
    }

    //TODO Нужно достать массив из course-details class StudentGrowthMarketingCourseDetails

    public void checkAllWidgetTitle(String[] titleName) {
        Map<Integer, String> expectedNames = new HashMap<>();
        for (int i = 0; i < titleName.length; i++) {
            expectedNames.put(i, titleName[i]);
        }
        for (Map.Entry<Integer, String> entry : expectedNames.entrySet()) {
            int widgetIndex = entry.getKey();
            String expectedName = entry.getValue();
            //courseBlockonCourseListWidget.get(widgetIndex).$(By.className("MuiChip-root")).shouldHave(text(expectedName));
            courseBlockOnCourseListWidget.get(widgetIndex).
                    $(By.className("additional-elements-wrapper")).
                    $(By.className("css-1vykty2")).shouldHave(text(expectedName));
        }
    }

    @Step("Display our courses title Отображение названия Our courses")
    public void displayOurCoursesTitle() {
        ourCourseTitle.shouldBe(Condition.text("Our courses"));
    }

    @Step("Go to Growth Marketing course  Переход к курсу Growth Marketing")
    public void goToGrowthMarketingCourse() {
        growthMarketingCourseButton.shouldBe(visible, Duration.ofSeconds(10));
        growthMarketingCourseButton.click();
    }

    @Step("Fill field search on course list Page Заполнение поля поиска на странице Course list")
    public void fillFieldSearchOnCourseList(String desiredValue) {
        fieldSearchOnCourseList.click();
        fieldSearchOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
        fieldSearchOnCourseList.setValue(desiredValue);
        fieldSearchOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
        // scroll.scrollIntoView(false);
    }

    @Step("Fill field search on course list Page  Заполнение поля поиска на странице Сourse list\"")
    public void fillFieldSearch(String courseName) {
        fieldSearchOnCourseList.click();
        fieldSearchOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
        fieldSearchOnCourseList.setValue(courseName);
        fieldSearchOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
    }

    @Step("Search result on course list page  Результат поиска на странице Сourse list")
    public void searchResultDisplayExactData(String courseName) {
        searchResultOnCourseList.shouldHave(Condition.text(courseName));
    }

    @Step("Go to a course from a search result  Переход к курсу из результата поиска")
    public void goToCourseFromSearchResult(String courseName) {
        searchResultOnCourseList.shouldBe(visible, Duration.ofSeconds(10));
        searchResultOnCourseList.shouldHave(Condition.text(courseName));

    }

}
