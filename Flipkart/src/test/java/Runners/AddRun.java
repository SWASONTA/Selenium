package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"featureFiles"},
glue= {"Steps"}, tags="@AddProduct")
public class AddRun extends AbstractTestNGCucumberTests{

}
