package co.com.devco.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/petbookperro.feature",
		glue = {"co.com.devco.stepdefinitions"}
)
public class PetbookPerroRunner {

}

