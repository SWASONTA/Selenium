package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"featureFiles"},
glue= {"Steps"}, tags="@Remove")
public class RemRun extends AbstractTestNGCucumberTests{

}
