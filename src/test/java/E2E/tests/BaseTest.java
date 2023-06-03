package E2E.tests;

import E2E.pages.SignInPage;
import E2E.pages.gast.HederPage;
import E2E.pages.student.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.PropertiesLoader;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest{


    //final static String BASE_URI = "https://jere237.softr.app/";
    final String BASE_URI = PropertiesLoader.loadProperties("url");
    private String emailMalik = PropertiesLoader.loadProperties("emailMalik");
    private String passwordMalik = PropertiesLoader.loadProperties("passwordMalik");
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
    SignInPage signInPage = new SignInPage();
    HederPage hederPage = new HederPage();
    StudetnDirectoryPage studentDirectoryPage = new StudetnDirectoryPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    StudentHomePage studentHomePage = new StudentHomePage();
    StudetnDirectoryPage studetnDirectoryPage = new StudetnDirectoryPage();
    StudentCourseList studentCourseList = new StudentCourseList();
    StudentGrowthMarketingCourseDetails studentGrowthMarketingCourseDetails = new StudentGrowthMarketingCourseDetails();

    }
