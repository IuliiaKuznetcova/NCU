package E2E.pages.guest;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;


public class HederPage {

    private SelenideElement studentDirectoryButton = $x("//*[@id=\"home_header4\"]/header/div/div/div[1]/a[4]/span");

    public void displayStudentDirectoryButton() {
        studentDirectoryButton.shouldBe(visible, Duration.ofSeconds(10));
    }

    public void clickStudentDirectoryButton(){
        studentDirectoryButton.click();
        studentDirectoryButton.shouldBe(visible, Duration.ofSeconds(10));
    }

}
