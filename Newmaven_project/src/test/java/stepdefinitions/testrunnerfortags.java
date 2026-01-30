package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/featurewithtags/featuretags.feature",glue= {"stepdefinitions"},tags="@run")
		
public class testrunnerfortags extends AbstractTestNGCucumberTests {
	

}
