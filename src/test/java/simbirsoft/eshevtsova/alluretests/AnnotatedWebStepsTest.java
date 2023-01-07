package simbirsoft.eshevtsova.alluretests;

import org.junit.jupiter.api.Test;

public class AnnotatedWebStepsTest {
    private static final String REPOSITORY = "eroshenkoam/allure-example";

    @Test
    public void shouldSeeIssueInRepository() {

        WebSteps webSteps = new WebSteps();

        webSteps.openMainPage();
        webSteps.searchForRepository(REPOSITORY);
        webSteps.goToRepository(REPOSITORY);
        webSteps.openIssuesTab();
    }
}
