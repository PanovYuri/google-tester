import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import org.junit.Test;
import org.openqa.selenium.By;

public class GoogleTest {

    @Test
    public void userCanSearchKeywordWithGoogle() {
        System.setProperty("webdriver.chrome.driver", "/home/panov/chromedriver");
        Selenide.open("https://yandex.ru");
        $(By.name("text")).setValue("selenide").pressEnter();
        $$(".organic__url-text").shouldHave(CollectionCondition.size(12));
        $(".organic__url-text").shouldHave(Condition.text("Selenide: лаконичные и стабильные UI тесты на Java"));

    }
}
