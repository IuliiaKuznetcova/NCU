/*
package E2E.tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class QuestionTest extends BaseTest{
    //private ElementsCollection printCourseInformationWidget = $$(By.className("MuiGrid-container")).get(0).$$(By.className("sw-font-size-xl"));

    private ElementsCollection printCourseInformationWidget = $$(By.className("MuiGrid-container")).get(1).$$(By.className("item-container-8"));
    private ElementsCollection dysplayngCourseInformationWidget = $$(By.className("MuiGrid-container"));

    @Step("Dysplay course information  Отображение информации об учителях курса")
    public void printInformationAboutCourseTiecher() {

        List<String> professors = new ArrayList<>();
        //распечатать содержимое блока преподавателя
        for(SelenideElement element : printCourseInformationWidget) {
            professors.add(element.getAttribute("professor"));
        }

        for (int i = 0; i <professors.size() ; i++) {
            String listProfessors = professors.get(i);
            System.out.println(listProfessors);
        }
    }
*/
/*    @Test
    public void dysplaingSearchForTiecherInTheCourseGrowthMarketing() {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        studentCourseList.fillFieldSearch("Growth Marketing");
        studentCourseList.searchResultDisplayExactData("Growth Marketing");
        studentCourseList.goToCourseFromSearchResult();
        studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse("Growth Marketing");
        //dysplayngInformationAboutCourseTiecher();
    }*//*


    @Step("Dysplay course information  Отображение информации об учителях курса")
    public void dysplayngInformationAboutCourseTiecher() {
        //вытащить из коллекции содержимое блока преподаватели
        dysplayngCourseInformationWidget.get(0).$(By.className("sw-font-size-xl")).shouldHave(text("Heading3"));
        //dysplayngCourseInformationWidget.get(1).$(By.className("item-container-8")).shouldHave(text("Heading3"));
        //dysplayngCourseInformationWidget.get(0).$$(By.className("sw-font-size-xl")).get(0).shouldHave(text("Heading3"));
    }

    //__________________________________________
    @Test
    public void printSearchForTiecherInTheCourseGrowthMarketing() {
        signInPage.loginMalik();
        studentHomePage.goToCoursesPage();
        studentCourseList.fillFieldSearch("Growth Marketing");
        studentCourseList.searchResultDisplayExactData("Growth Marketing");
        studentCourseList.goToCourseFromSearchResult();
        studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse("Growth Marketing");
        printInformationAboutCourseTiecher();
    }



}
*/
