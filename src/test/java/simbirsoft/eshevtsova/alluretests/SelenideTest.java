package simbirsoft.eshevtsova.alluretests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {

    @Test
    public void testRepositoryIssue(){

        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/");
        $(".header-search-input").click();
        $(".header-search-input").setValue("eroshenkoam/allure-example").submit();
        $(linkText("eroshenkoam/allure-example")).click();
        $(partialLinkText("Issues")).click();
        sleep(2500);
    }
}
