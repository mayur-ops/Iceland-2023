package Iceland.com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/Resources/IcelandHomePage.feature", tags = "@SearchButton")

public class RunCukeTest {

}

