package E2E.pages.student;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StudentDetailsPage {

    private SelenideElement studenFullName = $x("(//div[@class='MuiBox-root css-blhqza'])[1]");

    public void displayStudenFullNameExactData() {
        studenFullName.shouldHave(Condition.text("Iuliia Kuz"));
    }

    public void displayStudenFullNameRandomData(String searchInput) {
        studenFullName.shouldHave(Condition.text(searchInput));
    }

}
