package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\resources\\taggedFeature",
		glue= {"stepDefs"},
		monochrome=true,
		tags="@PhaseTwo"
		
		)
public class TaggedRunnr extends AbstractTestNGCucumberTests{
	

}
