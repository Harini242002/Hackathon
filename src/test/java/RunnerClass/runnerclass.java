package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		   features={".//Feature/1travel.feature",".//Feature/2car.feature",".//Feature/3health.feature"},
		   glue = "stepDefinition" ,
		  
		   plugin= {"pretty","html:reports/myreport.html", 
				   "rerun:target/rerun.txt",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		   tags="@sanity or @regression"
		   )

public class runnerclass {
	
	
}
