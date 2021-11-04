package produtos.sampleapp_tricentis.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/produtos/features/sampleapp_tricentis/",
        glue={"produtos.sampleapp_tricentis.stepdefs"},
        plugin = { "intern.plugin.ListCucumberDesenv"},
        tags = {"@Tricentis"}

)

public class Run {
}