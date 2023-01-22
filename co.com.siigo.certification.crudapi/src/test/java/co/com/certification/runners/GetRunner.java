package co.com.certification.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features/get.feature",
        glue = {"co.com.certification.stepdefinitions.hook",
                "co.com.certification.stepdefinitions"
        }
)
public class GetRunner {
}
