package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags="",
features="src/test/features/sprint1/HormigaAdminCRA.feature",
glue="useCases",
publish=true,
plugin= {"pretty", "html:target/RapportDeTestHormigaCRACreateAdmin.html", "json:target/RapportDeTestHormigaCRACreateAdmin"}, 
monochrome=true,
snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
)


public class Runner {

}
