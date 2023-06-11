package E2E.tests;

import E2E.pages.SignInPage;
//import E2E.pages.guest.SearchPage;
import E2E.pages.guest.HederPage;
import E2E.pages.helpers.CourseHelper;
import E2E.pages.student.*;
import E2E.pages.teacher.TeacherDirectoryPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    //final static String BASE_URI = "https://jere237.softr.app/";
    final String BASE_URI = PropertiesLoader.loadProperties("url");
    final SelenideElement scroll = $x(" //*[@id=\"home-footer\"]/section/div/div[3]/div[1]/small");

    @BeforeMethod
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.browserSize = "1920x1080";
        Configuration.browserCapabilities = new ChromeOptions().addArguments("-remote-allow-origins=*");
        open(BASE_URI);

    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }

    @Step("Scroll page to element 2023NoCode Проскролить страницу до элемента 2023NoCode")
    public void scrollPageToElement2023NoCode() {
        scroll.scrollIntoView(false);
    }

    //TODO Возможно это нужно вынести на какую-то отдельную страницу
    public SignInPage signInPage = new SignInPage();
    // public SearchPage guestPage = new SearchPage();
    public HederPage hederPage = new HederPage();
    //public CourseHelper courseHelper = new CourseHelper();
    public StudetnDirectoryPage studentDirectoryPage = new StudetnDirectoryPage();
    public StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    public StudentHomePage studentHomePage = new StudentHomePage();
    public StudetnDirectoryPage studetnDirectoryPage = new StudetnDirectoryPage();
    public StudentCourseList studentCourseList = new StudentCourseList();
    public StudentGrowthMarketingCourseDetails studentGrowthMarketingCourseDetails = new StudentGrowthMarketingCourseDetails();

    // public TeacherDirectoryPage teacherDirectoryPage = new TeacherDirectoryPage();


/*    public void searchCourse(String courseName) throws InterruptedException {
        //String courseName = "Growth Marketing";
        studentCourseList.fillFieldSearch(courseName);
        studentCourseList.searchResultDisplayExactData(courseName);
        studentCourseList.goToCourseFromSearchResult(courseName);
        studentGrowthMarketingCourseDetails.displayGrowthMarketingTitleCourse(courseName);

    }*/


}

