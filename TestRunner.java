package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\kakad\\IdeaProjects\\PracticeLeaning\\" +
                "CucumberBddFamework\\src\\test\\java\\feature\\Register.feature",
                glue = {"stepdefinition"}
)

public class TestRunner {
}
