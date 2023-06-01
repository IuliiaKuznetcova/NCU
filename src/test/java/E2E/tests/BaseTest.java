package E2E.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest{


    final static String BASE_URI = "https://jere237.softr.app/";
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
}
