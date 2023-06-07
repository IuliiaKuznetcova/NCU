package E2E.tests;

import E2E.pages.SignInPage;
import E2E.pages.guest.HederPage;
import E2E.pages.student.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest{

        //final static String BASE_URI = "https://jere237.softr.app/";
        final String BASE_URI = PropertiesLoader.loadProperties("url");
    final SelenideElement scroll = $x(" //*[@id=\"home-footer\"]/section/div/div[3]/div[1]/small");
        @BeforeMethod
        public void setUp(){
            SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
            Configuration.browserSize = "1920x1080";
            Configuration.browserCapabilities = new ChromeOptions().addArguments("-remote-allow-origins=*");
            open(BASE_URI);

        }
        @AfterMethod
        public void tearDown(){
            closeWebDriver();
        }


        //TODO Возможно это нужно вынести на какую-то отдельную страницу
        public SignInPage signInPage = new SignInPage();
    public HederPage hederPage = new HederPage();
    public StudetnDirectoryPage studentDirectoryPage = new StudetnDirectoryPage();
    public StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    public StudentHomePage studentHomePage = new StudentHomePage();
    public StudetnDirectoryPage studetnDirectoryPage = new StudetnDirectoryPage();
    public StudentCourseList studentCourseList = new StudentCourseList();
    public StudentGrowthMarketingCourseDetails studentGrowthMarketingCourseDetails = new StudentGrowthMarketingCourseDetails();

    }

