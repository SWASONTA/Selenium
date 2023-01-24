package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"featureFiles"},
glue= {"Steps"}, tags="@search")
public class SearchRun extends AbstractTestNGCucumberTests{

}
