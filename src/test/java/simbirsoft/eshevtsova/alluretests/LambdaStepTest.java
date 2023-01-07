package simbirsoft.eshevtsova.alluretests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaStepTest {
    private static final String REPOSITORY = "eroshenkoam/allure-example";

    @Test
    public void testLambdaRepositoryIssue() {

        step("Открыть главную страницу GitHub", () ->
                open("https://github.com/"));

        step("В поле Search GitHub ввести критерий поиска " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").setValue(REPOSITORY).submit();
        });

        step("Перейти в репозиторий " + REPOSITORY, () ->
                $(linkText(REPOSITORY)).click());

        step("Перейти в раздел Issues", () -> {
            $(partialLinkText("Issues")).click();
            sleep(2500);
        });
    }
}
