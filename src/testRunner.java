import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.jnuit.Cucumber;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="features",glue={"stepdefinition"})
	public class testRunner {
	
	}
