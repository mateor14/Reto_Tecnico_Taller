package co.sqasa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features/calendarioJQuery.feature",
        glue = {"co/sqasa/stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class CalendarioRunner {


}
