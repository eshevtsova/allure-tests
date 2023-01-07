package simbirsoft.eshevtsova.alluretests;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {

    @Step("Открыть главную страницу GitHub")
    public void openMainPage() {
        open("https://github.com/");
    }

    @Step("В поле Search GitHub ввести критерий поиска {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").setValue(repository).submit();
    }

    @Step("Перейти в репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Перейти в раздел Issues")
    public void openIssuesTab() {
        $(partialLinkText("Issues")).click();
        sleep(2500);
    }
}
